package de.daill.services.ebay

import de.daill.model.ebay.EbayProperties
import de.daill.model.ebay.EbayTokens
import org.springframework.data.repository.CrudRepository

interface EbayTokenRepository: CrudRepository<EbayTokens, String>{
}