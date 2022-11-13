package de.daill.services.magento

import de.daill.model.magento.CatalogDataProductInterface
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface MagentoProductsRepository: CrudRepository<CatalogDataProductInterface, String> {
    abstract fun findByCreatedAtGreaterThanOrUpdatedAtGreaterThan(created: LocalDateTime, updated: LocalDateTime)
}