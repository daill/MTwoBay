package de.daill.services

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@PropertySource("classpath:mappings.properties")
@ConfigurationProperties(prefix = "mappings")
class MappingProperties {
    var production: MappingPropertyValues = MappingPropertyValues()
    var sandbox: MappingPropertyValues = MappingPropertyValues()
}