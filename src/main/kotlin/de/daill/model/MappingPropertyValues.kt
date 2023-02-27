package de.daill.model

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class MappingPropertyValues {

    lateinit var fulfillmentPolicySmall: String
    lateinit var fulfillmentPolicyMiddle: String
    lateinit var fulfillmentPolicyNormal: String

    lateinit var returnPolicy: String
    lateinit var paymentPolicy: String
    lateinit var merchantLocationKey: String

    lateinit var weightSmall: String
    lateinit var weightMiddle: String
    lateinit var weightNormal: String

    lateinit var format: String
    lateinit var marketPlace: String
    lateinit var currency: String

    // assembly group to category

    lateinit var categories: HashMap<String, String>
}