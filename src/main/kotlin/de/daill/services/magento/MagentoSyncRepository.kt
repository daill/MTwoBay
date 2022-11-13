package de.daill.services.magento

import de.daill.model.magento.MagentoSyncStatus
import org.springframework.data.repository.CrudRepository

interface MagentoSyncRepository: CrudRepository<MagentoSyncStatus, String> {
    abstract fun findTopByOrderByLastSyncDateDesc(): MagentoSyncStatus?

}