package de.daill.model.magento

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
class MagentoSyncStatus {
    @Id
    var id: String? = null

    var lastSyncDate: LocalDateTime? = null

    override fun toString(): String {
        return "id: $id, lastSyncDate: $lastSyncDate"
    }
}