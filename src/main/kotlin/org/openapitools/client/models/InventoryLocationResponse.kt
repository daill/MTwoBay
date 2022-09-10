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
package org.openapitools.client.models

import org.openapitools.client.models.Location
import org.openapitools.client.models.OperatingHours
import org.openapitools.client.models.SpecialHours

import com.squareup.moshi.Json

/**
 * This type is used by the base response of the <strong>getInventoryLocation</strong> and <strong>getInventoryLocations</strong> calls. These responses provide details about inventory location(s) defined for the merchant's account.
 * @param location 
 * @param locationAdditionalInformation This text field provides additional information about an inventory location. This field is returned if it is set for the inventory location. <br><br><b>Max length</b>: 256
 * @param locationInstructions This text field is used by the merchant to provide special pickup instructions for the store location. This field can help create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field was not set up through a <strong>createInventoryLocation</strong> or a <strong>updateInventoryLocation</strong> call, eBay will use the default pickup instructions contained in the merchant's profile.<br><br><b>Max length</b>: 1000
 * @param locationTypes This container defines the function of the inventory location. Typically, an inventory location will serve as a store or a warehouse, but in some cases, an inventory location may be both. <br><br>The location type of an inventory location defaults to <code>WAREHOUSE</code> if a location type is not specified when a merchant creates an inventory location.
 * @param locationWebUrl This text field shows the  Website address (URL) associated with the inventory location. This field is returned if defined for the inventory location. <br><br><b>Max length</b>: 512
 * @param merchantLocationKey The unique identifier of the inventory location. This identifier is set up by the merchant when the inventory location is first created with the <strong>createInventoryLocation</strong> call. Once this value is set for an inventory location, it cannot be modified. <br><br><b>Max length</b>: 36
 * @param merchantLocationStatus This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). The merchant can use the <strong>enableInventoryLocation</strong> call to enable an inventory location in disabled status, or the <strong>disableInventoryLocation</strong> call to disable an inventory location in enabled status. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum'>eBay API documentation</a>
 * @param name The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. For store inventory locations, this field is not required for the <strong>createInventoryLocation</strong> call, but a store inventory location must have a defined <strong>name</strong> value before an In-Store Pickup and Click and Collect enabled offer is published. So, if the seller omits this field in the <strong>createInventoryLocation</strong> call, it will have to be added later through a <strong>updateInventoryLocation</strong> call. <br><br><b>Max length</b>: 1000
 * @param operatingHours This container shows the regular operating hours for a store location during the days of the week. A <strong>dayOfWeekEnum</strong> field and an <strong>intervals</strong> container is shown for each day of the week that the store location is open.
 * @param phone The phone number for an inventory location. This field will typically only be set and returned for store locations. <br><br><b>Max length</b>: 36
 * @param specialHours This container shows the special operating hours for a store location on a specific date or dates.
 */

data class InventoryLocationResponse (
    @Json(name = "location")
    val location: Location? = null,
    /* This text field provides additional information about an inventory location. This field is returned if it is set for the inventory location. <br><br><b>Max length</b>: 256 */
    @Json(name = "locationAdditionalInformation")
    val locationAdditionalInformation: kotlin.String? = null,
    /* This text field is used by the merchant to provide special pickup instructions for the store location. This field can help create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field was not set up through a <strong>createInventoryLocation</strong> or a <strong>updateInventoryLocation</strong> call, eBay will use the default pickup instructions contained in the merchant's profile.<br><br><b>Max length</b>: 1000 */
    @Json(name = "locationInstructions")
    val locationInstructions: kotlin.String? = null,
    /* This container defines the function of the inventory location. Typically, an inventory location will serve as a store or a warehouse, but in some cases, an inventory location may be both. <br><br>The location type of an inventory location defaults to <code>WAREHOUSE</code> if a location type is not specified when a merchant creates an inventory location. */
    @Json(name = "locationTypes")
    val locationTypes: kotlin.collections.List<kotlin.String>? = null,
    /* This text field shows the  Website address (URL) associated with the inventory location. This field is returned if defined for the inventory location. <br><br><b>Max length</b>: 512 */
    @Json(name = "locationWebUrl")
    val locationWebUrl: kotlin.String? = null,
    /* The unique identifier of the inventory location. This identifier is set up by the merchant when the inventory location is first created with the <strong>createInventoryLocation</strong> call. Once this value is set for an inventory location, it cannot be modified. <br><br><b>Max length</b>: 36 */
    @Json(name = "merchantLocationKey")
    val merchantLocationKey: kotlin.String? = null,
    /* This field indicates whether the inventory location is enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). The merchant can use the <strong>enableInventoryLocation</strong> call to enable an inventory location in disabled status, or the <strong>disableInventoryLocation</strong> call to disable an inventory location in enabled status. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum'>eBay API documentation</a> */
    @Json(name = "merchantLocationStatus")
    val merchantLocationStatus: kotlin.String? = null,
    /* The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. For store inventory locations, this field is not required for the <strong>createInventoryLocation</strong> call, but a store inventory location must have a defined <strong>name</strong> value before an In-Store Pickup and Click and Collect enabled offer is published. So, if the seller omits this field in the <strong>createInventoryLocation</strong> call, it will have to be added later through a <strong>updateInventoryLocation</strong> call. <br><br><b>Max length</b>: 1000 */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* This container shows the regular operating hours for a store location during the days of the week. A <strong>dayOfWeekEnum</strong> field and an <strong>intervals</strong> container is shown for each day of the week that the store location is open. */
    @Json(name = "operatingHours")
    val operatingHours: kotlin.collections.List<OperatingHours>? = null,
    /* The phone number for an inventory location. This field will typically only be set and returned for store locations. <br><br><b>Max length</b>: 36 */
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    /* This container shows the special operating hours for a store location on a specific date or dates. */
    @Json(name = "specialHours")
    val specialHours: kotlin.collections.List<SpecialHours>? = null
)

