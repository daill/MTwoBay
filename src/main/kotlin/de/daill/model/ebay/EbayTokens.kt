package de.daill.model.ebay

import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "ebayTokens")
class EbayTokens: EbayEnvironmentalInterface<EbayTokenValues> {
    var sandbox: EbayTokenValues = EbayTokenValues()
    var production: EbayTokenValues = EbayTokenValues()

    override fun byEnvironment(environment: EbayEnvironments): EbayTokenValues {
        if (environment == EbayEnvironments.PRODUCTION) {
            return production
        }
        return sandbox
    }


}