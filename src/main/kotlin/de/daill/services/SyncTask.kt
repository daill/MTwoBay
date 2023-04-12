package de.daill.services

import de.daill.api.ebay.EbayCategoryTreeApi
import de.daill.api.ebay.EbayInventoryItemApi
import de.daill.api.ebay.EbayOfferApi
import de.daill.api.magento.MagentoAttributeApi
import de.daill.api.magento.MagentoProductsApi
import de.daill.model.MappingProperties
import de.daill.model.ebay.*
import de.daill.model.magento.*
import de.daill.services.ebay.ClientException
import de.daill.services.ebay.EbayProperties
import de.daill.services.mtwobay.MTwoBayOfferRepository
import de.daill.services.mtwobay.MTwoBayProductsRepository
import de.daill.services.mtwobay.MTwoBayPropertiesRepository
import de.daill.services.mtwobay.MTwoBaySyncRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.net.URLDecoder
import java.nio.charset.Charset
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Service
class SyncTask {


    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoProductsApi: MagentoProductsApi

    @Autowired
    lateinit var magentoProductsRepository: MTwoBayProductsRepository

    @Autowired
    lateinit var magentoAttributeApi: MagentoAttributeApi

    @Autowired
    lateinit var mTwoBaySyncRepository: MTwoBaySyncRepository

    @Autowired
    lateinit var ebayInventoryItemApi: EbayInventoryItemApi

    @Autowired
    lateinit var ebayCategoryTreeApi: EbayCategoryTreeApi

    @Autowired
    lateinit var magentoMappingProperties: MappingProperties

    @Autowired
    lateinit var ebayProperties: EbayProperties

    @Autowired
    lateinit var ebayOfferApi: EbayOfferApi

    @Autowired
    lateinit var magentoRepository: MTwoBayPropertiesRepository

    @Autowired
    lateinit var mTwoBayGeneratedOfferRepository: MTwoBayOfferRepository



    @Scheduled(initialDelay = 2000, fixedDelayString = "PT30M" )
    fun process() {

        ebayInventoryItemApi.environment = ebayProperties.currentEnvironment

        // get last sync status

        var lastSync = mTwoBaySyncRepository.findTopByOrderByLastSyncDateDesc()
        LOG.debug(lastSync.toString())

        // initial sync
        if (lastSync == null) {
            lastSync = MagentoSyncStatus()
            lastSync.lastSyncDate = LocalDateTime.now(ZoneOffset.UTC).minusMonths(36)
        }
        // fetch all products with ebay flag

        // TODO: need to restrict the amount of items

        var params = listOf(
            CatalogDataProductQueryFilterParam(conditionType = "eq", field = "ebay_listing", value = "1"),
            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "qty", value = "1", group = 3),
//            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "created_at", value = lastSync.lastSyncDate.toString(), group = 1),
//            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "updated_at", value = lastSync.lastSyncDate.toString(), group = 2)
            //CatalogDataProductQueryPageSizeParam(pageSize = 10)
        )
        var products = magentoProductsApi.getProducts(params)
//        LOG.debug(products.toString())
        var syncedEntries = mTwoBayGeneratedOfferRepository.findAll()


        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        products?.items?.forEach {item ->

            var updated = (LocalDateTime.parse(item.updatedAt, formatter).isAfter(lastSync.lastSyncDate))
            var created = (LocalDateTime.parse(item.createdAt, formatter).isAfter(lastSync.lastSyncDate))


            if (created || updated) {
                var stockItem = magentoProductsApi.getStockItem(item.sku)
                LOG.info("processing item with sku ${item.sku}")
                processInventoryItem(item, stockItem)
//                var id = processOfferItem(item, stockItem, updated)
//                id?.let { value ->
//                    publishOffer(value)
//                }
            }

            syncedEntries.removeIf{ it -> it.sku == item.sku }


        }
        // reflect flag revoke
        syncedEntries.forEach { item ->
            try {
                item.offerId?.let { id -> ebayOfferApi.deleteOffer(id) }
            } catch (e: ClientException) {
                LOG.error("Could not delete offer with id ${item.offerId}: ${e.cause?.message}")
            }
            try {

                item.sku?.let { sku ->
                    ebayInventoryItemApi.deleteInventoryItem(sku);
                }
            } catch (e: ClientException) {
                LOG.error("Could not delete inventory item with sku ${item.sku}: ${e.cause?.message}")
            }
            mTwoBayGeneratedOfferRepository.deleteById(item.sku!!)
        }

        lastSync.lastSyncDate = LocalDateTime.now(ZoneOffset.UTC)
        mTwoBaySyncRepository.save(lastSync)

    }

    fun publishOffer(offerId: String) {
        var response = ebayOfferApi.publishOffer(offerId)

        response.warnings?.forEach { LOG.error("error while publishing offerId $offerId: ${it.errorId} - ${it.message}") }
    }

    fun processOfferItem(
        item: CatalogDataProductInterface,
        stockItem: CatalogInventoryDataStockItemInterface?,
        update: Boolean
    ): String? {
        var generatedOffer = mTwoBayGeneratedOfferRepository.findBySku(item.sku) ?: EbayOfferDetailsWithAll()


        var mappings = magentoMappingProperties.byEnvironment(ebayProperties.currentEnvironment)

        var priceAmount = Amount(currency = mappings.currency, value = item.price.toString())
        var pricingSummary = PricingSummary(price = priceAmount)

        var listingPolicies = ListingPolicies(
            fulfillmentPolicyId = getFulfillment(item.weight.toInt()),
            paymentPolicyId = mappings.paymentPolicy,
            returnPolicyId = mappings.returnPolicy
        )

        var tax = Tax(
           applyTax = false
        )

        with(generatedOffer) {
            sku = item.sku
            availableQuantity = stockItem?.qty?.toInt()
            categoryId = mappings.categories[item.customAttributes.find { attr -> attr.attributeCode == "baugruppe" }?.value?.first()]
            marketplaceId = mappings.marketPlace
            format = mappings.format
            this.pricingSummary = pricingSummary
            this.listingPolicies = listingPolicies
            merchantLocationKey = mappings.merchantLocationKey
            this.tax = tax
            listingDescription = item.customAttributes.find { attr -> attr.attributeCode == "description" }?.value?.first().toString()
        }



            val offerResponse: OfferResponse = when (update) {
                true -> {
                    lateinit var response: OfferResponse
                    try {
                        response = ebayOfferApi.createOffer(contentLanguage = "de-DE", generatedOffer)
                    } catch(e: ClientException) {
                        LOG.error("adding offer failed: ${e.message} ${e.cause}")
                        var existing = ebayOfferApi.getOffers(format = null, sku = item.sku, limit = null, marketplaceId = "EBAY_DE", offset = null)
                        existing.offers?.let {
                            response = OfferResponse(offerId = it.first().offerId)
                        }
                    }
                    response
                }
                false -> {
                    try {
                        ebayOfferApi.updateOffer(contentLanguage = "de-DE", body = generatedOffer);
                    } catch(e: ClientException) {
                        LOG.error("updating offer failed: ${e.message} ${e.cause}")
                    }

                    OfferResponse(offerId = generatedOffer.offerId)
                }
            }


            LOG.debug("offer created with id ${offerResponse.offerId}")
            offerResponse.offerId?.let {

                // write back the order id into the table as value for attribute ebay_orderid
                item.customAttributes.add(FrameworkAttributeInterface().value("ebay_offerId", listOf("ebay_offerid")))
                var productJson =
                    "{ \"sku\": \"${item.sku}\", \"custom_attributes\": [{ \"attribute_code\": \"ebay_offerId\", \"value\": \"${offerResponse.offerId}\"}] }"
                magentoProductsApi.putProduct(item.sku, productJson)

                generatedOffer.offerId = offerResponse.offerId
                // save the generated offer to the database
                mTwoBayGeneratedOfferRepository.save(generatedOffer)
            }

            offerResponse.warnings?.forEach { LOG.error("error while adding/updating offer ${offerResponse.offerId}: ${it.errorId} - ${it.message}") }

            return offerResponse.offerId
    }

    fun processInventoryItem(item: CatalogDataProductInterface, stockItem: CatalogInventoryDataStockItemInterface?) {
        var baugruppen = magentoAttributeApi.getAttributeDetails("baugruppe")
        var models = magentoAttributeApi.getAttributeDetails("modell")
        var conditions = magentoAttributeApi.getAttributeDetails("zustand")
        var manufacturers = magentoAttributeApi.getAttributeDetails("manufacturer")
        var magentoProperties = magentoRepository.findAll().last()

        var baugruppe = ""
        var manufacturer = ""
        var model = ""
        var images: MutableList<String> = ArrayList<String>()
        var condition = ""

        item.mediaGalleryEntries.forEach {entry ->
            images.add("${URLDecoder.decode(magentoProperties.storeBaseUrl, Charset.defaultCharset())}/media/catalog/product${entry.file}")
        }
        item.customAttributes.forEach {attr ->
            when (attr.attributeCode) {
                "baugruppe" -> baugruppe = baugruppen?.options?.find { opt -> opt.value == attr.value.first() }?.label.toString()
                "modell" -> model = models?.options?.find { opt -> opt.value == attr.value.first() }?.label.toString()
                //"image" -> image = "${URLDecoder.decode(magentoProperties.storeBaseUrl, Charset.defaultCharset())}/media/catalog/product${attr.value.first().toString()}"
                "zustand" -> condition = conditions?.options?.find { opt -> opt.value == attr.value.first()}?.label.toString()
                "manufacturer" -> manufacturer = manufacturers?.options?.find { opt -> opt.value == attr.value.first() }?.label.toString()
            }
        }
        // new product so not yet seen
        // weight is pretty obvious
        // need to chose shipping terms
        var weight = Weight(value = BigDecimal(1.0), unit = "KILOGRAM")
        var packageWeightAndSize = PackageWeightAndSize(weight = weight)
        var aspects = mutableMapOf(
            "Artikelnummer" to listOf(item.id.toString()),
            "Zustand" to listOf(condition),
            "Herstellernummer" to listOf(item.id.toString()),
        )
        if (manufacturer.isNotBlank() && manufacturer.isNotEmpty()) {
            aspects.put("Hersteller", listOf(manufacturer))
        }
        if (model.isNotBlank() && model.isNotEmpty()) {
            aspects.put("Model", listOf(model))
        }
        var availability = Availability(shipToLocationAvailability = ShipToLocationAvailability(quantity = stockItem?.qty?.toInt()))
        var product = Product(title = item.name, aspects = aspects, imageUrls = images)
        // need to get the manufacturer and categories to determine aspects

        var inventoryItem = InventoryItem(condition = encodeCondition(condition), packageWeightAndSize = packageWeightAndSize, product = product, availability = availability)

        var response = ebayInventoryItemApi.createOrReplaceInventoryItem("de-DE", sku = item.sku, inventoryItem)

        if (response.warnings?.isNotEmpty() == true) {
            LOG.error("item ${item.sku} could not be created/updated: ${response.warnings?.joinToString { e -> e.message.toString() }}")
        }
    }

    fun encodeCondition(condition: String) : String {
        return when(condition) {
            "Gebraucht" -> "USED_EXCELLENT"
            "Neu" -> "NEW"
            else -> "NEW_OTHER"
        }
    }

    fun getFulfillment(weight: Int) : String{
        var evnProps = magentoMappingProperties.byEnvironment(ebayProperties.currentEnvironment)
        return when(weight) {
            in 0..evnProps.weightSmall.toInt()  -> evnProps.fulfillmentPolicySmall
            in evnProps.weightSmall.toInt() ..evnProps.weightMiddle.toInt()  -> evnProps.fulfillmentPolicyMiddle
            in evnProps.weightMiddle.toInt() ..evnProps.weightNormal.toInt() -> evnProps.fulfillmentPolicyNormal
            else -> ""
        }
    }

}