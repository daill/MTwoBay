package de.daill.api.magento

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import de.daill.BigDecimalAdapter
import de.daill.model.magento.CatalogDataProductAttributeInterface
import de.daill.model.magento.CatalogDataProductSearchResultsInterface
import de.daill.model.magento.FrameworkAttributeInterface
import de.daill.services.magento.MagentoApiClient
import de.daill.services.magento.MagentoMoshiAttributeAdapter
import de.daill.services.magento.MagentoPropertiesRepository
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Request
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.net.URLDecoder


@Service
class MagentoAttributeApi {

    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoClient: MagentoApiClient

    @Autowired
    lateinit var propertyRepository: MagentoPropertiesRepository

    fun getAttributeDetails(attribute: String): CatalogDataProductAttributeInterface? {
        var apiResource = "rest/V1/products/attributes/$attribute"
        val url =  URLDecoder.decode(magentoClient.magentoProperties.storeBaseUrl!!, "UTF-8") + apiResource

        var moshi = Moshi.Builder().add(BigDecimalAdapter).build()

        val queryUrl = url.toHttpUrl().newBuilder()
        val queryParams = mutableMapOf<String, String>()

        var request = Request.Builder().url(queryUrl.build())
        request.addHeader("Authorization", magentoClient.buildAuthParam("GET", url, queryParams))
        request.get()

        var response = magentoClient.sendRequest(request.build())
        var body = response.body?.string()
        LOG.debug("body read: ${body}")

        return moshi.adapter(CatalogDataProductAttributeInterface::class.java).fromJson(body)

    }

}