package de.daill.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class MappingPropertyValues {
    lateinit var fulfillmentSmall: String
    lateinit var fulfillmentMiddle: String
    lateinit var fulfillmentNormal: String

    lateinit var weightSmall: String
    lateinit var weightMiddle: String
    lateinit var weightNormal: String

    // assembly group to category

    lateinit var categories: HashMap<String, String>
}