package de.daill.services.mtwobay

import de.daill.model.ebay.EbayEnvironments
import de.daill.model.ebay.EbayOfferDetailsWithAll
import de.daill.model.ebay.EbayOfferDetailsWithKeys
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.CrudRepository

interface MTwoBayOfferRepository: MongoRepository<EbayOfferDetailsWithAll, String> {
    abstract fun findBySku(sku: String) : EbayOfferDetailsWithAll?
    abstract fun findByOfferId(offerId: String) : EbayOfferDetailsWithAll
}