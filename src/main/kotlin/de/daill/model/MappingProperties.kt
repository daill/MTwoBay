package de.daill.model

import de.daill.model.ebay.EbayEnvironments
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@PropertySource("classpath:mappings.properties")
@ConfigurationProperties(prefix = "mappings")
class MappingProperties {
    var production: MappingPropertyValues = MappingPropertyValues()
    var sandbox: MappingPropertyValues = MappingPropertyValues()


    fun byEnvironment(environment: EbayEnvironments): MappingPropertyValues {
        if (environment == EbayEnvironments.PRODUCTION) {
            return production
        }
        return sandbox
    }
}