package de.daill.services

import de.daill.magento.auth.MagentoProperties
import org.springframework.data.repository.CrudRepository


interface MagentoPropertiesRepository : CrudRepository<MagentoProperties, String> {
}