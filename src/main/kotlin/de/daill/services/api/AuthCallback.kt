package de.daill.services.api

import de.daill.AuthEvent
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping("/api/auth")
class AuthCallback {
    @Autowired
    private val applicationEventPublisher: ApplicationEventPublisher? = null

    val LOG = LoggerFactory.getLogger(AuthCallback::class.java)

    @GetMapping("/success")
    fun callback(request: HttpServletRequest) {
        LOG.debug(request.getParameter("code"))
        applicationEventPublisher?.publishEvent(AuthEvent(this, request.getParameter("code")))
    }

    @GetMapping("/magento/success")
    fun magentoCallback(request: HttpServletRequest) {
        LOG.debug(request.getParameter("code"))
    }
}