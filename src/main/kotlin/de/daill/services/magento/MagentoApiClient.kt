package de.daill.services.magento

import de.daill.model.magento.MagentoProperties
import de.daill.services.mtwobay.MTwoBayPropertiesRepository
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okio.ByteString
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.IllegalStateException
import java.net.URLEncoder
import java.time.Instant
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

@Service
class MagentoApiClient {
    val LOG = LoggerFactory.getLogger(this::class.java)

    lateinit var magentoProperties: MagentoProperties

    var repository: MTwoBayPropertiesRepository

    @Autowired
    constructor(repository: MTwoBayPropertiesRepository) {
        this.repository = repository
        var props = repository.findAll()
        if (props.count() > 0) {
            magentoProperties = props.last()
        }
        if (!this::magentoProperties.isInitialized) {
            magentoProperties = MagentoProperties()
        }
    }


    fun buildParamString(paramMap: Map<String, String>) : String {
        var concatenatedParams = paramMap.entries.joinToString(separator = ",", transform =  { "${URLEncoder.encode(it.key, "UTF-8")}=\"${URLEncoder.encode(it.value, "UTF-8")}\""})

        LOG.debug("concatenated params $concatenatedParams")
        return concatenatedParams
    }

    /**
     * Signature for oauth requests consists of the following element concatenated by &
     * HTTP method
     * URL
     * oauth_nonce
     * oauth_signature_method
     * oauth_timestamp
     * oauth_version
     * oauth_consumer_key
     * oauth_token
     */
    fun createSignature(method: String, url: String, paramMap: Map<String, String>, consumerSecret: String, tokenSecret: String) : String {
        var signatureString = String()

        var paramString = paramMap.toSortedMap().entries.joinToString(separator = "&", transform =  { "${URLEncoder.encode(it.key, "UTF-8")}=${URLEncoder.encode(it.value, "UTF-8")}" })

        LOG.debug("concatenated params $paramString")

        signatureString += "$method&${URLEncoder.encode(url, "UTF-8")}&${URLEncoder.encode(paramString, "UTF-8")}"

        var sig = Mac.getInstance("HmacSHA256")
        LOG.debug("$consumerSecret&$tokenSecret")
        var key = SecretKeySpec(("$consumerSecret&$tokenSecret").toByteArray(Charsets.UTF_8), "HmacSHA256")

        sig.init(key)
        LOG.debug("concatenated sig string $signatureString")
        var signature = sig.doFinal(signatureString.toByteArray(Charsets.UTF_8))

        return ByteString.of(*signature).base64()
    }

    fun buildAuthParam(method: String, url: String, additionalParameters: Map<String, String> = emptyMap()) : String {
        val nonce = UUID.randomUUID().toString()
        val timestamp = Instant.now().epochSecond.toString()

        var paramMap = mapOf(
            "oauth_consumer_key" to magentoProperties.consumerKey,
            "oauth_signature_method" to "HMAC-SHA256",
            "oauth_token" to magentoProperties.token,
            "oauth_timestamp" to timestamp,
            "oauth_nonce" to nonce,
            "oauth_version" to "1.0",
            "oauth_verifier" to magentoProperties.verifier,
            "oauth_callback" to magentoProperties.callbackUrl,
        )

        paramMap += additionalParameters

        var paramString = buildParamString(paramMap)

        paramString += ",oauth_signature=\"${URLEncoder.encode(createSignature(method, url, paramMap = paramMap, consumerSecret = magentoProperties.consumerSecret, tokenSecret = magentoProperties.tokenSecret), "UTF-8")}\""

        LOG.debug("Authorization=OAuth $paramString")
        return "OAuth $paramString"
    }


    fun sendRequest(request: Request): Response {
        var client = OkHttpClient()
        return try {
            client.newCall(request).execute()
        } catch (e: IllegalStateException) {
            LOG.error("execution failed, empty response returned", e)
            Response.Builder().build()
        }
    }
}