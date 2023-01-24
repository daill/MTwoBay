package de.daill.services.ebay

import de.daill.model.ebay.EbayEnvironmentalInterface
import de.daill.model.ebay.EbayEnvironments
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
@PropertySource("classpath:ebay.properties")
@ConfigurationProperties(prefix = "api")

class EbayProperties: EbayEnvironmentalInterface<EbayPropertyValues> {
    var production: EbayPropertyValues = EbayPropertyValues()
    var sandbox: EbayPropertyValues = EbayPropertyValues()
    lateinit var currentEnvironment: EbayEnvironments

    override fun byEnvironment(environment: EbayEnvironments): EbayPropertyValues {
        if (environment == EbayEnvironments.PRODUCTION) {
            return production
        }
        return sandbox
    }


}
