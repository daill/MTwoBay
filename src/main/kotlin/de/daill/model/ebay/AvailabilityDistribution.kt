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
 * This type is used to set the available quantity of the inventory item at one or more warehouse locations.
 * @param fulfillmentTime 
 * @param merchantLocationKey The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item.
 * @param quantity The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required.
 */

data class AvailabilityDistribution (
    @Json(name = "fulfillmentTime")
    val fulfillmentTime: TimeDuration? = null,
    /* The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item. */
    @Json(name = "merchantLocationKey")
    val merchantLocationKey: kotlin.String? = null,
    /* The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null
)

