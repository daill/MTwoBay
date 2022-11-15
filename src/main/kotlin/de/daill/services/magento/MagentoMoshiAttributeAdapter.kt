package de.daill.services.magento

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.ToJson
import de.daill.model.magento.FrameworkAttributeInterface
import org.slf4j.LoggerFactory
import com.squareup.moshi.JsonAdapter

class MagentoMoshiAttributeAdapter: JsonAdapter<FrameworkAttributeInterface>() {

    val LOG = LoggerFactory.getLogger(this::class.java)


    override fun fromJson(reader: JsonReader): FrameworkAttributeInterface? {
        var resultAttribute = FrameworkAttributeInterface()
        reader.beginObject()
        if (reader.nextName() == "attribute_code") {
            resultAttribute.attributeCode = reader.nextString()
        }
        if (reader.nextName() == "value") {
            if (reader.peek() ==)
        }
            LOG.debug()
        reader.endObject()


        return FrameworkAttributeInterface()
    }


    override fun toJson(writer: JsonWriter, value: FrameworkAttributeInterface?) {
    }
}