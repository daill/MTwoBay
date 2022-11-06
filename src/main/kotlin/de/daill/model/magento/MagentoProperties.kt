package de.daill.model.magento

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
open class MagentoProperties {

    @Id
    open var id: String? = null

    open var consumerKey = ""
    open var consumerSecret = ""
    open var token = ""
    open var tokenSecret = ""
    open var verifier = ""
    open var storeBaseUrl = ""
    open var callbackUrl = ""


}