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
package de.daill.ebay.models

import com.squareup.moshi.Json

/**
 * This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant's physical stores.<br /><br />In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
 * @param pickupAtLocationAvailability This container consists of an array of one or more of the merchant's physical stores where the inventory item is available for in-store pickup.<br /><br />The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container.
 * @param shipToLocationAvailability 
 */

data class AvailabilityWithAll (
    /* This container consists of an array of one or more of the merchant's physical stores where the inventory item is available for in-store pickup.<br /><br />The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container. */
    @Json(name = "pickupAtLocationAvailability")
    val pickupAtLocationAvailability: kotlin.collections.List<de.daill.ebay.models.PickupAtLocationAvailability>? = null,
    @Json(name = "shipToLocationAvailability")
    val shipToLocationAvailability: de.daill.ebay.models.ShipToLocationAvailabilityWithAll? = null
)
