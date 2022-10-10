package de.daill.magento.auth

import org.slf4j.LoggerFactory

class ApiTools {

    companion object {
        val LOG = LoggerFactory.getLogger(this::class.java)
        fun parseMagentoParams(body: String, magentoClient: MagentoApiClient) {
            var bodyStrings = body.split("&").map { it.split("=") }
            LOG.debug("POST " + bodyStrings)

            bodyStrings.forEach {
                if (it[0] == "oauth_consumer_key") {
                    magentoClient.magentoProperties.consumerKey = it[1]
                } else if (it[0] == "oauth_consumer_secret") {
                    magentoClient.magentoProperties.consumerSecret = it[1]
                } else if (it[0] == "oauth_verifier") {
                    magentoClient.magentoProperties.verifier = it[1]
                } else if (it[0] == "store_base_url") {
                    magentoClient.magentoProperties.storeBaseUrl = it[1]
                } else if (it[0] == "oauth_token") {
                    magentoClient.magentoProperties.token = it[1]
                } else if (it[0] == "oauth_token_secret") {
                    magentoClient.magentoProperties.tokenSecret = it[1]
                }
            }
        }
    }
}