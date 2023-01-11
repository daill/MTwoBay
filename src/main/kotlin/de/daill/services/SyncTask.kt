package de.daill.services

import de.daill.api.ebay.EbayCategoryTreeApi
import de.daill.api.ebay.EbayInventoryItemApi
import de.daill.api.magento.MagentoProductsApi
import de.daill.model.ebay.*
import de.daill.model.magento.CatalogDataProductQueryFilterParam
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
    lateinit var productsApi: MagentoProductsApi

    @Autowired
    lateinit var productsRepository: MagentoProductsRepository

    @Autowired
    lateinit var productsSyncRepository: MagentoSyncRepository

    @Autowired
    lateinit var ebayInventoryItemApi: EbayInventoryItemApi

    @Autowired
    lateinit var ebayCategoryTreeApi: EbayCategoryTreeApi

    @Autowired
    lateinit var mappingProperties: MappingProperties

    @Autowired
    lateinit var ebayProperties: EbayProperties

    //@Scheduled(initialDelay = 2000, fixedDelayString = "PT30M" )
    fun process() {

        // get last sync status

        var lastSync = productsSyncRepository.findTopByOrderByLastSyncDateDesc()
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
        var products = productsApi.getProducts(params)
        LOG.debug(products.toString())

        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        products?.items?.forEach {

            if (LocalDateTime.parse(it.createdAt, formatter).isAfter(lastSync.lastSyncDate)) {

                // new product so not yet seen
                // weight is pretty obvious
                // need to chose shipping terms
                var inventoryItem = InventoryItem()
                var weight = Weight(value =it.weight, unit = "KILOGRAM")


                var packageWeightAndSize = PackageWeightAndSize(weight = weight)

                var aspects = mapOf("Herstellernummer" to listOf("AT1000"), "Kraftradtyp" to listOf("Roller"))
                var images = listOf("https://schraubermarkt.com/media/catalog/product/d/s/dsc04511.jpg")
                var product = Product(title = "TEST ITEM", aspects = aspects, imageUrls = images)
                // need to get the manufacturer and categories to determine aspects



            } else if  (LocalDateTime.parse(it.updatedAt, formatter).isAfter(lastSync.lastSyncDate)) {
                // updated item, get the one from the local database to build the delta
            }

        }



        ebayInventoryItemApi.environment = EbayEnvironments.SANDBOX
        var inv = ebayInventoryItemApi.getInventoryItems(limit="5", offset = null)



        var weight = Weight(value = BigDecimal(1.0), unit = "KILOGRAM")
        var packageWeightAndSize = PackageWeightAndSize(weight = weight)

        var aspects = mapOf("Herstellernummer" to listOf("AT1000"), "Kraftradtyp" to listOf("Roller"))
        var images = listOf("https://schraubermarkt.com/media/catalog/product/d/s/dsc04511.jpg")
        var product = Product(title = "TEST ITEM", aspects = aspects, imageUrls = images)

        var item = InventoryItem(condition = "NEW", product = product, packageWeightAndSize = packageWeightAndSize)
        ebayInventoryItemApi.createOrReplaceInventoryItem("de-DE", sku = "TESTSKU", item)


        //productsRepository.saveAll(products?.items)

        // sync with products in internal database


        // create delta set
        // update ebay products
    }

    fun getFulfillment(weight: Int) {
        when(weight) {
            in 0..mappingProperties.production.weightSmall as Int -> mappingProperties.production.fulfillmentSmall
            in mappingProperties.production.weightSmall as Int ..mappingProperties.production.weightMiddle as Int -> mappingProperties.production.fulfillmentMiddle
            in mappingProperties.production.weightMiddle as Int ..mappingProperties.production.weightNormal as Int -> mappingProperties.production.fulfillmentNormal
        }
    }

}