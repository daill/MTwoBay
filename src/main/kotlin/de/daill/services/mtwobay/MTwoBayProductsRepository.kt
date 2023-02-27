package de.daill.services.mtwobay

import de.daill.model.magento.CatalogDataProductInterface
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface MTwoBayProductsRepository: CrudRepository<CatalogDataProductInterface, String> {
    abstract fun findByCreatedAtGreaterThanOrUpdatedAtGreaterThan(created: LocalDateTime, updated: LocalDateTime)
}