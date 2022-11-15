package de.daill.services

import de.daill.api.magento.MagentoProductsApi
import de.daill.model.magento.CatalogDataProductInterface
import de.daill.model.magento.CatalogDataProductQueryFilterParam
import de.daill.model.magento.MagentoSyncStatus
import de.daill.services.magento.MagentoProductsRepository
import de.daill.services.magento.MagentoSyncRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
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

        // need to restrict the amount of items

        var params = listOf(
            CatalogDataProductQueryFilterParam(conditionType = "eq", field = "ebay_listing", value = "1"),
            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "created_at", value = lastSync.lastSyncDate.toString(), group = 1),
            CatalogDataProductQueryFilterParam(conditionType = "gteq", field = "updated_at", value = lastSync.lastSyncDate.toString(), group = 2)
            //CatalogDataProductQueryPageSizeParam(pageSize = 10)
        )
        var products = productsApi.getProducts(params)
        LOG.debug(products.toString())

        products?.items?.forEach {
            if (LocalDateTime.parse(it.createdAt).isAfter(lastSync.lastSyncDate)) {
                // new product so not yet seen
                

            } else if  (LocalDateTime.parse(it.updatedAt).isAfter(lastSync.lastSyncDate)) {
                // updated item, get the one from the local database to build the delta
            }

        }

        //productsRepository.saveAll(products?.items)

        // sync with products in internal database


        // create delta set
        // update ebay products
    }


}