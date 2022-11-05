package de.daill.services

import de.daill.api.magento.MagentoProductsApi
import de.daill.model.magento.CatalogDataProductQueryFilterParam
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class SyncTask {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var productsApi: MagentoProductsApi

    //@Scheduled(initialDelay = 2000, fixedDelayString = "PT30M" )
    fun process() {

        // fetch all products with ebay flag

        // need to restrict the amount of items
        var params = listOf(
            CatalogDataProductQueryFilterParam(conditionType = "eq", field = "ebay_listing", value = "1")
            //CatalogDataProductQueryPageSizeParam(pageSize = 10)
        )
        var products = productsApi.getProducts(params)
        LOG.debug(products.toString())

        // sync with products in internal database


        // create delta set
        // update ebay products

    }
}