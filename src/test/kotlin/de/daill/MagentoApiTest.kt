package de.daill

import de.daill.model.magento.MagentoProperties
import de.daill.services.magento.MagentoPropertiesRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MagentoApiTest {

    @Autowired
    lateinit var repository: MagentoPropertiesRepository


    @Test
    fun saveProperties() {
        var props = MagentoProperties()
        props.callbackUrl="asdasd"
        repository.save(props)
    }

    @Test
    fun loadProperties() {

    }

}