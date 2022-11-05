package de.daill.services.magento

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import de.daill.model.magento.FrameworkAttributeInterface
import org.slf4j.LoggerFactory
import java.lang.reflect.Type

class MagentoGsonAttributeDeserializer: JsonDeserializer<FrameworkAttributeInterface> {
    val LOG = LoggerFactory.getLogger(this::class.java)
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ):FrameworkAttributeInterface {
        var attributeInterface =  FrameworkAttributeInterface()
        var jsonObject = json?.asJsonObject!!

        attributeInterface.attributeCode = jsonObject["attribute_code"].asString
        if (jsonObject["value"].isJsonArray) {
            jsonObject["value"].asJsonArray.forEach { attributeInterface.value.add(it.asString) }
        } else if (jsonObject["value"].isJsonPrimitive) {
            attributeInterface.value.add(jsonObject["value"].asString)
        }

        return attributeInterface
    }
}