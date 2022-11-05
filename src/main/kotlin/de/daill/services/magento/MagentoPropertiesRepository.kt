package de.daill.services.magento

import de.daill.model.magento.MagentoProperties
import org.springframework.data.repository.CrudRepository


interface MagentoPropertiesRepository : CrudRepository<MagentoProperties, String> {
}