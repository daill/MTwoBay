package de.daill.api.magento

import com.squareup.moshi.Moshi
import de.daill.BigDecimalAdapter
import de.daill.model.magento.*
import de.daill.services.magento.MagentoApiClient
import de.daill.services.magento.MagentoMoshiAttributeAdapter
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.Charset

@Service
class MagentoProductsApi {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoClient: MagentoApiClient


    /*
     * We have to use "all" to update the attribute for each storefront
     */
    fun putProduct(sku: String, productJson: String) {
        var apiResource = "rest/all/V1/products/${URLEncoder.encode(sku, Charset.defaultCharset())}"
        val url =  URLDecoder.decode(magentoClient.magentoProperties.storeBaseUrl!!, "UTF-8") + apiResource

        val queryUrl = url.toHttpUrl().newBuilder()
        val queryParams = mutableMapOf<String, String>()

        LOG.debug("url to call:  ${queryUrl.build()}")

        var request = Request.Builder().url(queryUrl.build())
        request.addHeader("Authorization", magentoClient.buildAuthParam("PUT", url, queryParams))
        request.addHeader("Content-Type", "application/json")
        var postBody = "{\"product\": ${productJson}, \"saveOptions\": true }"
        request.put(postBody.toRequestBody())

        var response = magentoClient.sendRequest(request.build())
        var body = response.body?.string()
        LOG.debug("response: ${response.code} body read: $body")

        return
    }

    fun getStockItem(productSKU: String): CatalogInventoryDataStockItemInterface? {
        var apiResource = "rest/all/V1/stockItems/${URLEncoder.encode(productSKU, Charset.defaultCharset())}"
        val url =  URLDecoder.decode(magentoClient.magentoProperties.storeBaseUrl!!, "UTF-8") + apiResource

        var moshi = Moshi.Builder().add(BigDecimalAdapter).build()

        val queryUrl = url.toHttpUrl().newBuilder()
        val queryParams = mutableMapOf<String, String>()

        LOG.debug("url to call:  ${queryUrl.build()}")

        var request = Request.Builder().url(queryUrl.build())
        request.addHeader("Authorization", magentoClient.buildAuthParam("GET", url, queryParams))
        request.get()

        var response = magentoClient.sendRequest(request.build())
        var body = response.body?.string()
        LOG.debug("body read: ${body}")

        return moshi.adapter(CatalogInventoryDataStockItemInterface::class.java).fromJson(body)
    }

    /**
     * searches: https://developer.adobe.com/commerce/webapi/rest/use-rest/performing-searches/
     * custom attributes needs extensions https://community.magento.com/t5/Magento-2-x-Programming/how-to-get-custom-attributes-in-rest-search-api/td-p/488423
     *
     * searchCriteria[currentPage]
     * searchCriteria[filterGroups][0][filters][0][conditionType]
     * searchCriteria[filterGroups][0][filters][0][field]
     * searchCriteria[filterGroups][0][filters][0][value]
     * searchCriteria[pageSize]
     * searchCriteria[sortOrders][0][direction]
     * searchCriteria[sortOrders][0][field]
     *
     */
    fun getProducts(params: List<Any>): CatalogDataProductSearchResultsInterface? {
        var apiResource = "rest/all/V1/products"
        val url =  URLDecoder.decode(magentoClient.magentoProperties.storeBaseUrl!!, "UTF-8") + apiResource

        var moshi = Moshi.Builder().add(BigDecimalAdapter).add(FrameworkAttributeInterface::class.java, MagentoMoshiAttributeAdapter()).build()

        val queryUrl = url.toHttpUrl().newBuilder()
        val queryParams = mutableMapOf<String, String>()
        params.forEach{
            when (it) {
                is CatalogDataProductQueryFilterParam -> {
                    // filter
                    queryUrl.addQueryParameter(it.conditionParam, it.conditionType)
                    queryParams[it.conditionParam] = it.conditionType
                    queryUrl.addQueryParameter(it.valueParam, it.value)
                    queryParams[it.valueParam] = it.value
                    queryUrl.addQueryParameter(it.fieldParam, it.field)
                    queryParams[it.fieldParam] = it.field
                }

                is CatalogDataProductQueryOrderParam -> {
                    // sortOrder
                    queryUrl.addQueryParameter(it.directionParam, it.direction)
                    queryParams[it.directionParam] = it.direction
                    queryUrl.addQueryParameter(it.fieldParam, it.field)
                    queryParams[it.fieldParam] = it.field
                }

                is CatalogDataProductQueryPageSizeParam -> {
                    queryUrl.addQueryParameter(it.pageSizeParam, it.pageSize.toString())
                    queryParams[it.pageSizeParam] = it.pageSize.toString()
                }

                is CatalogDataProductQueryCurrentPageParam -> {
                    queryUrl.addQueryParameter(it.currentPageParam, it.currentPage.toString())
                    queryParams[it.currentPageParam] = it.currentPage.toString()
                }
            }
        }
        LOG.debug("url to call:  ${queryUrl.build()}")

        var request = Request.Builder().url(queryUrl.build())
        request.addHeader("Authorization", magentoClient.buildAuthParam("GET", url, queryParams))
        request.get()

        var response = magentoClient.sendRequest(request.build())
        var body = response.body?.string()
        LOG.debug("body read: ${body}")

        return moshi.adapter(CatalogDataProductSearchResultsInterface::class.java).fromJson(body)

    }
}