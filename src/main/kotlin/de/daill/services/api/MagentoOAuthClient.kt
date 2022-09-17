package de.daill.services.api

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.time.Instant
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import javax.xml.crypto.dsig.SignatureMethod

class MagentoOAuthClient {
    val SIGNATURE_METHOD = "HMAC-SHA1"

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
    fun getRequestToken(consumerKey: String, consumerSecret: String, url: String) {
        val nonce = UUID.randomUUID().toString()
        val timestamp = Instant.now().epochSecond

        var request = Request.Builder().url(url)
        request.addHeader("oauth_consumer_key", consumerKey)
        request.addHeader("oauth_signature_method", SIGNATURE_METHOD)
        request.addHeader("oauth_signature", createSignature("POST", url, consumerSecret = "sda", tokenSecret = "sdlj"))
        request.addHeader("oauth_nonce", SIGNATURE_METHOD)
        request.addHeader("oauth_timestamp", SIGNATURE_METHOD)

    }

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
    fun createSignature(vararg args: String, consumerSecret: String, tokenSecret: String) : String {
        var concated = ""
        args.forEachIndexed { index, s ->
            concated.plus(s)
            if (index < args.size-1) {
                concated.plus("&")
            }
        }

        var sig = Mac.getInstance("HmacSHA256")
        var key = SecretKeySpec("".toByteArray(), "HmacSHA256")
        sig.init(key)
        return sig.doFinal(concated.toByteArray()).toString()
    }

    fun sendRequest(request: Request): Response {
        var client = OkHttpClient()
        try {
            return client.newCall(request).execute()
        } finally {

        }
    }
}