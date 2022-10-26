package de.daill.services.magento

import org.springframework.data.repository.CrudRepository


interface MagentoPropertiesRepository : CrudRepository<MagentoProperties, String> {
}