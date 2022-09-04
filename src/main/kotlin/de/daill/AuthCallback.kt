package de.daill

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/auth")
class AuthCallback {
    val LOG = LoggerFactory.getLogger(AuthCallback::class.java)

    @GetMapping("/success")
    fun callback(request: HttpServletRequest) {
        LOG.debug(request.getParameter("code") + " " + request.getParameter("code"))
    }

}