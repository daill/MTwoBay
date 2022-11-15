package de.daill

import com.squareup.moshi.Moshi
import de.daill.model.magento.CatalogDataProductSearchResultsInterface
import de.daill.model.magento.FrameworkAttributeInterface
import de.daill.services.magento.MagentoMoshiAttributeAdapter
import org.junit.jupiter.api.Test
import org.springframework.util.ResourceUtils
import de.daill.BigDecimalAdapter

class MagentoApiProductsTests {

    @Test
    fun testProductsSearchJsonTest() {
        var resourceFile = ResourceUtils.getFile("classpath:products.json");
        var json = resourceFile.readText(Charsets.UTF_8)


        var moshi = Moshi.Builder().add(BigDecimalAdapter).add(FrameworkAttributeInterface::class.java, MagentoMoshiAttributeAdapter()).build()

        var result = moshi.adapter(CatalogDataProductSearchResultsInterface::class.java).fromJson(json)
        assert(value = result?.totalCount != 0)
    }
}