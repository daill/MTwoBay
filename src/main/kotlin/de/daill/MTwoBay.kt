/*
 * Copyright 2021 Christian Kramer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files
 *  (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge,
 *  publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 *  so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.daill

import com.ebay.api.client.auth.oauth2.CredentialUtil
import com.ebay.api.client.auth.oauth2.OAuth2Api
import com.ebay.api.client.auth.oauth2.model.AccessToken
import com.ebay.api.client.auth.oauth2.model.Environment
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*


@SpringBootApplication
class MTwoBay: ApplicationRunner{
    val LOG = LoggerFactory.getLogger(MTwoBay::class.java)

    @Autowired
    lateinit var props: AppProperties

    override fun run(args: ApplicationArguments?) {
        LOG.info("server starting")
        getToken()


    }

    fun getToken() {
        val SCOPE_LIST_SANDBOX: List<String> = arrayOf("https://api.ebay.com/oauth/api_scope", "https://api.ebay.com/oauth/api_scope/buy.item.feed").toList()
        val SCOPE_LIST_PRODUCTION: List<String> = arrayOf("https://api.ebay.com/oauth/api_scope").toList()
        val INVALID_SCOPE_LIST: List<String> = arrayOf("https://api.ebay.com/oauthxxx").toList()
        val ERROR_INVALID_SCOPE = "\"error\":\"invalid_scope\""

        CredentialUtil.load()
        val oauth2Api = OAuth2Api()
        val oauth2Response = oauth2Api.getApplicationToken(Environment.SANDBOX, SCOPE_LIST_SANDBOX)
        val applicationToken: Optional<AccessToken> = oauth2Response.accessToken
        LOG.debug(applicationToken.get().toString())
    }



}

