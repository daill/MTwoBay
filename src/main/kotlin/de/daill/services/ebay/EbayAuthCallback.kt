package de.daill.services.ebay

import com.ebay.api.client.auth.oauth2.CredentialUtil
import com.ebay.api.client.auth.oauth2.OAuth2Api
import com.ebay.api.client.auth.oauth2.model.Environment
import de.daill.api.ebay.EbayInventoryItemApi
import de.daill.model.ebay.EbayEnvironments
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationListener
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/auth")
class EbayAuthCallback: ApplicationListener<EbayAuthEvent> {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private val applicationEventPublisher: ApplicationEventPublisher? = null

    @Autowired
    lateinit var apiClient: EbayApiClient

    @GetMapping("/success")
    fun callback(request: HttpServletRequest): String {
        LOG.debug(request.getParameter("code"))
        applicationEventPublisher?.publishEvent(EbayAuthEvent(this, request.getParameter("code")))
        return "<script>window.close();</script>"
    }

    override fun onApplicationEvent(event: EbayAuthEvent) {
        apiClient.environment = EbayEnvironments.SANDBOX
        apiClient.exchangeAccessToken(event.authCode.orEmpty())
    }

}