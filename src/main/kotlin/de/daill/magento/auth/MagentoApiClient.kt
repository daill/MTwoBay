package de.daill.magento.auth

import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.internal.http2.Header
import okio.ByteString
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.net.URLDecoder
import java.net.URLEncoder
import java.time.Instant
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

@Service
class MagentoApiClient {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var magentoProperties: MagentoProperties

    fun buildParamString(paramMap: Map<String, String>) : String {
        var concatenatedParams = paramMap.entries.joinToString(separator = ",", transform =  { "${it.key}=\"${URLEncoder.encode(it.value, "UTF-8")}\""})

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

        var paramString = paramMap.toSortedMap().entries.joinToString(separator = "&", transform =  { "${it.key}=${URLEncoder.encode(it.value, "UTF-8")}" })

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

    fun buildAuthParam(url: String) : String {
        val nonce = UUID.randomUUID().toString()
        val timestamp = Instant.now().epochSecond.toString()

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

        var paramString = buildParamString(paramMap)

        paramString += ",oauth_signature=\"${URLEncoder.encode(createSignature("POST", "", paramMap = paramMap, consumerSecret = magentoProperties.consumerSecret, tokenSecret = magentoProperties.tokenSecret), "UTF-8")}\""

        LOG.debug("Authorization=OAuth $paramString")
        return "OAuth $paramString"
    }


    fun sendRequest(request: Request): Response {
        var client = OkHttpClient()
        try {
            return client.newCall(request).execute()
        } finally {

        }
    }
}