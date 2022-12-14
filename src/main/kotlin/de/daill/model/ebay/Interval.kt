/**
* Inventory API
* The Inventory API is used to create and manage inventory, and then to publish and manage this inventory on an eBay marketplace. There are also methods in this API that will convert eligible, active eBay listings into the Inventory API model.
*
* The version of the OpenAPI document: 1.16.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package de.daill.model.ebay


import com.squareup.moshi.Json

/**
 * This type is used by the <strong>intervals</strong> container to define the opening and closing times of a store's working day. Local time (in Military format) is used, with the following format: <code>hh:mm:ss</code>.
 * @param close The <strong>close</strong> value is actually the time that the store closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the <strong>close</strong> time would look like the following: <code>20:00:00</code>. This field is conditionally required if the <strong>intervals</strong> container is used to specify working hours or special hours for a store. <br><br>This field is returned if set for the store location.
 * @param open The <strong>open</strong> value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the <strong>close</strong> time would look like the following: <code>09:00:00</code>. This field is conditionally required if the <strong>intervals</strong> container is used to specify working hours or special hours for a store. <br><br>This field is returned if set for the store location.
 */

data class Interval (
    /* The <strong>close</strong> value is actually the time that the store closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the <strong>close</strong> time would look like the following: <code>20:00:00</code>. This field is conditionally required if the <strong>intervals</strong> container is used to specify working hours or special hours for a store. <br><br>This field is returned if set for the store location. */
    @Json(name = "close")
    val close: kotlin.String? = null,
    /* The <strong>open</strong> value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the <strong>close</strong> time would look like the following: <code>09:00:00</code>. This field is conditionally required if the <strong>intervals</strong> container is used to specify working hours or special hours for a store. <br><br>This field is returned if set for the store location. */
    @Json(name = "open")
    val open: kotlin.String? = null
)

