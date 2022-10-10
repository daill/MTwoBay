package de.daill

import de.daill.magento.auth.MagentoApiClient
import okhttp3.Request
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class MagentoApiTest {

    @Test
    fun testRequestToken() {
       var client = MagentoApiClient()
       client.getRequestToken()
    }

    @Test
    fun testAccessToken() {
        var request = Request.Builder().url("https://gla")

    }

}