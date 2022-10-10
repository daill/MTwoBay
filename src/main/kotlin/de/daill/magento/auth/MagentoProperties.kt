package de.daill.magento.auth

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import java.util.*

@Component
@ConfigurationProperties("magento")
@PropertySource("file:conf/magento.properties")
class MagentoProperties {
    var consumerKey = ""
    var consumerSecret = ""
    var token = ""
    var tokenSecret = ""
    var verifier = ""
    var storeBaseUrl = ""
    var callbackUrl = ""

    fun writeToFile() {
        val f = File("conf/magento.properties")
        val out: OutputStream = FileOutputStream(f)
        var props = Properties()
        props.setProperty("magento.consumer-key", consumerKey)
        props.setProperty("magento.consumer-secret", consumerSecret)
        props.setProperty("magento.token-secret", tokenSecret)
        props.setProperty("magento.token", token)
        props.setProperty("magento.verifier", verifier)
        props.setProperty("magento.store-base-url", storeBaseUrl)
        props.setProperty("magento.callback-url", callbackUrl)
        props.store(out, "current magento props")
    }
}