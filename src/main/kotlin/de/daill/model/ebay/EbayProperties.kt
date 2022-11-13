package de.daill.model.ebay

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.data.mongodb.core.mapping.Document


@Configuration
@PropertySource("classpath:ebay.properties")
@ConfigurationProperties(prefix = "api")
@Document(collection = "ebayProperties")
class EbayProperties() {
    var production: EbayPropertiesValues = EbayPropertiesValues()
    var sandbox: EbayPropertiesValues = EbayPropertiesValues()

}




