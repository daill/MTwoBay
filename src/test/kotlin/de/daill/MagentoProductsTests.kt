package de.daill

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import de.daill.model.magento.CatalogDataProductSearchResultsInterface
import de.daill.model.magento.FrameworkAttributeInterface
import de.daill.services.magento.MagentoGsonAttributeDeserializer
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.springframework.util.ResourceUtils

class MagentoProductsTests {

    @Test
    fun testProductsSearchJsonTest() {
        var resourceFile = ResourceUtils.getFile("classpath:products.json");
        var json = resourceFile.readText(Charsets.UTF_8)
        var gson = GsonBuilder().registerTypeAdapter(FrameworkAttributeInterface::class.java, MagentoGsonAttributeDeserializer()).create()
        var result = gson.fromJson(json, CatalogDataProductSearchResultsInterface::class.java)
        assert(value = result.totalCount != 0)
    }
}