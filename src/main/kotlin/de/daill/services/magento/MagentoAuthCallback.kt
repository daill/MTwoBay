package de.daill.services.magento

import de.daill.api.magento.MagentoAuthApi
import de.daill.model.magento.MagentoProperties
import de.daill.services.mtwobay.MTwoBayPropertiesRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors
import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping("/api/auth")
class MagentoAuthCallback {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var propertiesRepository: MTwoBayPropertiesRepository

    @Autowired
    lateinit var authApi: MagentoAuthApi


    @GetMapping("/magento/success")
    fun magentoCallbackGet(request: HttpServletRequest): String {
        LOG.debug("GET " + request.getReader().lines().collect(Collectors.joining(System.lineSeparator())))

        return ""
    }

    /**
     * Just a mock login page
     */
    @GetMapping("/magento/login")
    fun magentoLoginGet(request: HttpServletRequest): String {
        LOG.debug("login endpoint called")
        LOG.debug(request.parameterMap.entries.joinToString { "${it.key} ${it.value}" })

        return "<script>window.close();</script>"
    }



    @PostMapping("/magento/success")
    fun magentoCallbackPost(request: HttpServletRequest) : String {
        var body = request.reader.lines().collect(Collectors.joining(System.lineSeparator()))

        propertiesRepository.deleteAll()
        authApi.magentoClient.magentoProperties = MagentoProperties()

        MagentoApiTools.parseMagentoParams(body, authApi.magentoClient)

        LOG.debug("try to exchange token")
        authApi.getRequestToken()

        return "verifier"
    }
}