package de.daill

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import de.daill.model.ebay.*
import de.daill.services.ebay.Serializer
import org.junit.jupiter.api.Test
import org.springframework.util.ResourceUtils
import java.math.BigDecimal

class EbayInventoryTest {

    @Test
    fun inventoryItemsTest() {
        var resourceFile = ResourceUtils.getFile("classpath:ebayInventoryItems.json");
        var json = resourceFile.readText(Charsets.UTF_8)
        var moshi = Serializer.moshi
        var result = moshi.adapter(InventoryItems::class.java).fromJson(json)
        assert(value = result?.inventoryItems?.isEmpty() == false)

    }

    @Test
    fun inventoryItemCreate() {
        var weight = Weight(value = BigDecimal(0.0), unit = "KILOGRAM")
        var packageWeightAndSize = PackageWeightAndSize(weight = weight)
        var aspects = mapOf("Herstellernummer" to listOf("AT1000"), "Kraftradtyp" to listOf("Roller"))
        var images = listOf("https://schraubermarkt.com/media/catalog/product/d/s/dsc04511.jpg")
        var product = Product(title = "TEST ITEM", aspects = aspects, imageUrls = images)
        var item = InventoryItem(condition = "NEW", product = product, packageWeightAndSize = packageWeightAndSize)
    }
}