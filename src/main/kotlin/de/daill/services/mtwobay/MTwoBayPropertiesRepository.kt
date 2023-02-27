package de.daill.services.mtwobay

import de.daill.model.magento.MagentoProperties
import org.springframework.data.repository.CrudRepository


interface MTwoBayPropertiesRepository : CrudRepository<MagentoProperties, String> {
}