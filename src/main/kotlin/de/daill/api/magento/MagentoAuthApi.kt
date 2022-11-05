package de.daill.api.magento

import de.daill.services.magento.MagentoApiTools
import de.daill.services.magento.MagentoApiClient
import de.daill.services.magento.MagentoPropertiesRepository
import okhttp3.FormBody
import okhttp3.Request
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.net.URLDecoder
import java.time.Instant
import java.util.*

@Service
class MagentoAuthApi {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoClient: MagentoApiClient

    @Autowired
    lateinit var propertyRepository: MagentoPropertiesRepository


    /**
     * POST /oauth/token/access
     *
     * oauth_consumer_key
     * oauth_nonce
     * oauth_signature_method
     * oauth_signature
     * oauth_timestamp
     * oauth_version
     * oauth_token
     * oauth_verifier
     */
    fun getAccessToken() {
        var magentoProperties = magentoClient.magentoProperties
        val nonce = UUID.randomUUID().toString()
        val timestamp = Instant.now().epochSecond.toString()
        val url =  URLDecoder.decode(magentoProperties.storeBaseUrl, "UTF-8") + "oauth/token/access"
        val paramMap = mapOf(
            "oauth_consumer_key" to magentoProperties.consumerKey,
            "oauth_signature_method" to "HMAC-SHA256",
            "oauth_token" to magentoProperties.token,
            "oauth_timestamp" to timestamp,
            "oauth_nonce" to nonce,
            "oauth_version" to "1.0",
            "oauth_verifier" to magentoProperties.verifier,
            "oauth_callback" to magentoProperties.callbackUrl,
        )

        var paramString = magentoClient.buildParamString(paramMap)

        var request = Request.Builder().url(url)
        request.post(FormBody.Builder().build())
        paramString += ",oauth_signature=\"${java.net.URLEncoder.encode(magentoClient.createSignature("POST", url, paramMap = paramMap, consumerSecret = magentoProperties.consumerSecret, tokenSecret = magentoProperties.tokenSecret!!), "UTF-8")}\""

        request.addHeader("Authorization", "OAuth $paramString")
        LOG.debug("Authorization=OAuth $paramString")
        var response = magentoClient.sendRequest(request.build())
        var bodyString = response.body?.string().orEmpty()
        LOG.debug(bodyString)
        MagentoApiTools.parseMagentoParams(bodyString, magentoClient)
        propertyRepository.save(magentoClient.magentoProperties)
    }

    /**
     * POST /oauth/token/request
     *
     * oauth_consumer_key
     * oauth_signature_method
     * oauth_signature
     * oauth_nonce
     * oauth_timestamp
     * oauth_version
     *
     * response:
     * oauth_token
     * oauth_token_secret
     */
    fun getRequestToken() {
        var magentoProperties = magentoClient.magentoProperties
        val nonce = UUID.randomUUID().toString()
        val timestamp = Instant.now().epochSecond.toString()
        val url =  URLDecoder.decode(magentoProperties.storeBaseUrl, "UTF-8") + "oauth/token/request"
        val paramMap = mapOf(
            "oauth_consumer_key" to magentoProperties.consumerKey,
            "oauth_signature_method" to "HMAC-SHA256",
            "oauth_timestamp" to timestamp,
            "oauth_nonce" to nonce,
            "oauth_version" to "1.0",
            "oauth_callback" to magentoProperties.callbackUrl,
        )

        var request = Request.Builder().url(url)
        var paramString = magentoClient.buildParamString(paramMap)
        request.post(FormBody.Builder().build())
        paramString += ",oauth_signature=\"${java.net.URLEncoder.encode(magentoClient.createSignature("POST", url, paramMap = paramMap, consumerSecret = magentoProperties.consumerSecret, tokenSecret = ""), "UTF-8")}\""

        request.addHeader("Authorization", "OAuth $paramString")
        LOG.debug("Authorization=OAuth $paramString")
        var response = magentoClient.sendRequest(request.build())
        var bodyString = response.body?.string().orEmpty()
        MagentoApiTools.parseMagentoParams(bodyString, magentoClient)

        getAccessToken()

    }
}