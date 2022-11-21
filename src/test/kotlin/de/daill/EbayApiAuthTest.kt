package de.daill

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import org.junit.jupiter.api.Test
import org.springframework.util.ResourceUtils

class EbayApiAuthTest {
    @Test
    fun deserializeTokenResponse() {
        var resourceFile = ResourceUtils.getFile("classpath:ebayAuth.json");
        var json = resourceFile.readText(Charsets.UTF_8)
        var moshi = Moshi.Builder().build()
        var adapter: JsonAdapter<Map<String, String>> = moshi.adapter(Types.newParameterizedType(Map::class.java, String::class.java, String::class.java))
        var parsed: Map<String, String>? = adapter.fromJson(json)
        assert(value = parsed?.values?.isNotEmpty() == true)
    }
}