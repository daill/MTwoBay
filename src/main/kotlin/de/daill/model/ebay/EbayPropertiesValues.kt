package de.daill.model.ebay

import org.springframework.context.annotation.Configuration

@Configuration
class EbayPropertiesValues() {
    lateinit var appId: String
    lateinit var certId: String
    lateinit var devId: String
    lateinit var redirectUri: String
    var accessToken: String = ""
    var refreshToken: String = ""
}
