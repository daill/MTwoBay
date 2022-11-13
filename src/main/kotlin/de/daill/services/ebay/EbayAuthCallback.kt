package de.daill.services.ebay

import com.ebay.api.client.auth.oauth2.CredentialUtil
import com.ebay.api.client.auth.oauth2.OAuth2Api
import com.ebay.api.client.auth.oauth2.model.Environment
import de.daill.api.ebay.EbayInventoryItemApi
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

    @GetMapping("/success")
    fun callback(request: HttpServletRequest): String {
        LOG.debug(request.getParameter("code"))
        applicationEventPublisher?.publishEvent(EbayAuthEvent(this, request.getParameter("code")))
        return "<script>window.close();</script>"
    }


    fun exchangeToken(authEvent: EbayAuthEvent) {
        val oauth2Api = OAuth2Api()
        CredentialUtil.load(File("src/main/resources/ebay.properties").inputStream())
        LOG.debug(authEvent.getCode())
        val oauth2Response = oauth2Api.exchangeCodeForAccessToken(Environment.PRODUCTION, authEvent.getCode())
        LOG.debug(oauth2Response.toString())
        if (oauth2Response.refreshToken.isPresent) {
            LOG.debug(oauth2Response.refreshToken.get().toString())
        }
        if (oauth2Response.accessToken.isPresent) {
            LOG.debug(oauth2Response.accessToken.get().toString())
        }
        //var client = EbayInventoryItemApi(token = oauth2Response.accessToken.get().token.toString())

        //LOG.debug(client.getInventoryItems("100", "0").size.toString())
    }

    override fun onApplicationEvent(event: EbayAuthEvent) {
        exchangeToken(event)
    }

}