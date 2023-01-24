package de.daill.services

import de.daill.api.ebay.EbayCategoryTreeApi
import de.daill.api.ebay.EbayInventoryItemApi
import de.daill.api.magento.MagentoAttributeApi
import de.daill.api.magento.MagentoProductsApi
import de.daill.model.ebay.*
import de.daill.model.magento.CatalogDataProductQueryFilterParam
import de.daill.model.magento.EavDataAttributeOptionInterface
import de.daill.model.magento.MagentoSyncStatus
import de.daill.services.ebay.EbayProperties
import de.daill.services.magento.MagentoProductsRepository
import de.daill.services.magento.MagentoSyncRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class SyncTask {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentProductsApi: MagentoProductsApi

    @Autowired
    lateinit var magentoProductsRepository: MagentoProductsRepository

    @Autowired
    lateinit var magentoAttributeApi: MagentoAttributeApi

    @Autowired
    lateinit var magentoProductsSyncRepository: MagentoSyncRepository

    @Autowired
    lateinit var ebayInventoryItemApi: EbayInventoryItemApi

    @Autowired
    lateinit var ebayCategoryTreeApi: EbayCategoryTreeApi

    @Autowired
    lateinit var magentoMappingProperties: MappingProperties

    @Autowired
    lateinit var ebayProperties: EbayProperties

    //@Scheduled(initialDelay = 2000, fixedDelayString = "PT30M" )
    fun process() {
        var baugruppen = magentoAttributeApi.getAttributeDetails("baugruppe")
        var models = magentoAttributeApi.getAttributeDetails("modell")
        var conditions = magentoAttributeApi.getAttributeDetails("zustand")

        ebayInventoryItemApi.environment = ebayProperties.currentEnvironment

        // get last sync status

        var lastSync = magentoProductsSyncRepository.findTopByOrderByLastSyncDateDesc()
        LOG.debug(lastSync.toString())

        if (lastSync == null) {
            lastSync = MagentoSyncStatus()
            lastSync.lastSyncDate = LocalDateTime.now().minusMonths(24)
        }
        // fetch all products with ebay flag

        // TODO: need to restrict the amount of items

        var params = listOf(
            CatalogDataProductQueryFilterParam(conditionType = "eq", field = "ebay_listing", value = "1"),
            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "created_at", value = lastSync.lastSyncDate.toString(), group = 1),
            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "updated_at", value = lastSync.lastSyncDate.toString(), group = 2)
            //CatalogDataProductQueryPageSizeParam(pageSize = 10)
        )
        var products = magentProductsApi.getProducts(params)
        LOG.debug(products.toString())

        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        products?.items?.forEach {

            if (LocalDateTime.parse(it.createdAt, formatter).isAfter(lastSync.lastSyncDate)) {
                var baugruppe = ""
                var description = ""
                var manufacturer = ""
                var model = ""
                var price = it.price.toString()
                var image = ""
                var condition = ""
                it.customAttributes.forEach {attr ->
                    when (attr.attributeCode) {
                        "baugruppe" -> baugruppe = baugruppen?.options?.find { opt -> opt.value == attr.value.first() }?.label.toString()
                        "modell" -> model = models?.options?.find { opt -> opt.value == attr.value.first() }?.label.toString()
                        "image" -> image = attr.value.first().toString()
                        "zustand" -> condition = conditions?.options?.find { opt -> opt.value == attr.value.first()}?.label.toString()
                    }
                }
                // new product so not yet seen
                // weight is pretty obvious
                // need to chose shipping terms
                var weight = Weight(value = BigDecimal(1.0), unit = "KILOGRAM")
                var packageWeightAndSize = PackageWeightAndSize(weight = weight)

                var aspects = mapOf("Hersteller" to listOf("asd"), "Model" to listOf("Roller"), "Artikelnummer" to listOf("Blubb"))
                var images = listOf("https://schraubermarkt.com/media/catalog/product/d/s/dsc04511.jpg")
                var product = Product(title = it.name, aspects = aspects, imageUrls = images)
                // need to get the manufacturer and categories to determine aspects

                var inventoryItem = InventoryItem(condition = "NEW", packageWeightAndSize = packageWeightAndSize, product = product)

                ebayInventoryItemApi.createOrReplaceInventoryItem("de-DE", sku = it.sku, inventoryItem)

            } else if  (LocalDateTime.parse(it.updatedAt, formatter).isAfter(lastSync.lastSyncDate)) {
                // updated item, get the one from the local database to build the delta
            }

        }

        //productsRepository.saveAll(products?.items)

        // sync with products in internal database


        // create delta set
        // update ebay products
    }

    fun getFulfillment(weight: Int) {
        var evnProps = magentoMappingProperties.byEnvironment(ebayProperties.currentEnvironment)
        when(weight) {
            in 0..evnProps.weightSmall as Int -> evnProps.fulfillmentSmall
            in evnProps.weightSmall as Int ..evnProps.weightMiddle as Int -> evnProps.fulfillmentMiddle
            in evnProps.weightMiddle as Int ..evnProps.weightNormal as Int -> evnProps.fulfillmentNormal
        }
    }

}