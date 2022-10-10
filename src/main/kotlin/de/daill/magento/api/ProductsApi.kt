package de.daill.magento.api

import de.daill.magento.auth.MagentoApiClient
import okhttp3.FormBody
import okhttp3.Request
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.net.URLDecoder

@Service
class ProductsApi {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoClient: MagentoApiClient

    /**
     * searches: https://developer.adobe.com/commerce/webapi/rest/use-rest/performing-searches/
     * custom attributes needs extensions https://community.magento.com/t5/Magento-2-x-Programming/how-to-get-custom-attributes-in-rest-search-api/td-p/488423
     */
    fun getProducts() {
        var apiResource = "/rest/V1/products"
        val url =  URLDecoder.decode(magentoClient.magentoProperties.storeBaseUrl!!, "UTF-8") + apiResource

        var request = Request.Builder().url(url)
        request.post(FormBody.Builder().build())
        request.addHeader("Authorization", magentoClient.buildAuthParam(url))


        var response = magentoClient.sendRequest(request.build())
        LOG.debug(response.body?.string())



    }
}