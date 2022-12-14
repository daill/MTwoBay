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
 * This type is used to specify the total 'ship-to-home' quantity of the inventory item that will be available for purchase through one or more published offers.
 * @param availabilityDistributions This container is used to set the available quantity of the inventory item at one or more warehouse locations.<br><br> This container will be returned if available quantity is set for one or more inventory locations.
 * @param quantity This container is used to set the total 'ship-to-home' quantity of the inventory item that will be available for purchase through one or more published offers. This container is not immediately required, but 'ship-to-home' quantity must be set before an offer of the inventory item can be published.<br/><br/>If an existing inventory item is being updated, and the 'ship-to-home' quantity already exists for the inventory item record, this container should be included again, even if the value is not changing, or the available quantity data will be lost.
 */

data class ShipToLocationAvailability (
    /* This container is used to set the available quantity of the inventory item at one or more warehouse locations.<br><br> This container will be returned if available quantity is set for one or more inventory locations. */
    @Json(name = "availabilityDistributions")
    val availabilityDistributions: kotlin.collections.List<AvailabilityDistribution>? = null,
    /* This container is used to set the total 'ship-to-home' quantity of the inventory item that will be available for purchase through one or more published offers. This container is not immediately required, but 'ship-to-home' quantity must be set before an offer of the inventory item can be published.<br/><br/>If an existing inventory item is being updated, and the 'ship-to-home' quantity already exists for the inventory item record, this container should be included again, even if the value is not changing, or the available quantity data will be lost. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null
)

