package de.daill.services.mtwobay

import de.daill.model.magento.MagentoSyncStatus
import org.springframework.data.repository.CrudRepository

interface MTwoBaySyncRepository: CrudRepository<MagentoSyncStatus, String> {
    abstract fun findTopByOrderByLastSyncDateDesc(): MagentoSyncStatus?
}