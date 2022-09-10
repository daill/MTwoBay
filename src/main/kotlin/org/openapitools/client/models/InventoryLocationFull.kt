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

import org.openapitools.client.models.LocationDetails
import org.openapitools.client.models.OperatingHours
import org.openapitools.client.models.SpecialHours

import com.squareup.moshi.Json

/**
 * This type is used by the <strong>createInventoryLocation</strong> call to provide details on the inventory location, including the location's name, physical address, operating hours, special hours, phone number and other details of an inventory location.
 * @param location 
 * @param locationAdditionalInformation This text field is used by the merchant to provide additional information about an inventory location. <br><br><b>Max length</b>: 256
 * @param locationInstructions This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant's profile (if available). <br><br>
 * @param locationTypes This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store or a warehouse, but in some cases, an inventory location may be both. <br><br> If this container is omitted, the location type of the inventory location will default to <code>WAREHOUSE</code>. See <a href=\"/api-docs/sell/inventory/types/api:StoreTypeEnum\">StoreTypeEnum</a> for the supported values.<br/><br/><b>Default</b>: WAREHOUSE
 * @param locationWebUrl This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. <br><br><b>Max length</b>: 512
 * @param merchantLocationStatus This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful <strong>createInventoryLocation</strong> call will automatically enable the inventory location. A merchant may want to create a new inventory location but leave it as disabled if the inventory location is not yet ready for active inventory. Once the inventory location is ready, the merchant can use the <strong>enableInventoryLocation</strong> call to enable an inventory location that is in a disabled state. See <a href=\"/api-docs/sell/inventory/types/api:StatusEnum\">StatusEnum</a> for the supported values.  <br/><br/><b>Default</b>: ENABLED For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum'>eBay API documentation</a>
 * @param name The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse inventory locations. For store inventory locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a <strong>createInventoryLocation</strong> call, it becomes required for an <strong>updateInventoryLocation</strong> call.<br/><br/><b>Max length</b>: 1000
 * @param operatingHours Although not technically required, this container is highly recommended to be used to specify operating hours for a store inventory location. This container is used to express the regular operating hours for a store location during each day of the week. A <strong>dayOfWeekEnum</strong> field and an <strong>intervals</strong> container will be needed for each day of the week that the store location is open.
 * @param phone Although not technically required, this field is highly recommended to be used to specify the phone number for a store inventory location. <br><br><b>Max length</b>: 36
 * @param specialHours This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week.
 */

data class InventoryLocationFull (
    @Json(name = "location")
    val location: LocationDetails? = null,
    /* This text field is used by the merchant to provide additional information about an inventory location. <br><br><b>Max length</b>: 256 */
    @Json(name = "locationAdditionalInformation")
    val locationAdditionalInformation: kotlin.String? = null,
    /* This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant's profile (if available). <br><br> */
    @Json(name = "locationInstructions")
    val locationInstructions: kotlin.String? = null,
    /* This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store or a warehouse, but in some cases, an inventory location may be both. <br><br> If this container is omitted, the location type of the inventory location will default to <code>WAREHOUSE</code>. See <a href=\"/api-docs/sell/inventory/types/api:StoreTypeEnum\">StoreTypeEnum</a> for the supported values.<br/><br/><b>Default</b>: WAREHOUSE */
    @Json(name = "locationTypes")
    val locationTypes: kotlin.collections.List<kotlin.String>? = null,
    /* This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. <br><br><b>Max length</b>: 512 */
    @Json(name = "locationWebUrl")
    val locationWebUrl: kotlin.String? = null,
    /* This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful <strong>createInventoryLocation</strong> call will automatically enable the inventory location. A merchant may want to create a new inventory location but leave it as disabled if the inventory location is not yet ready for active inventory. Once the inventory location is ready, the merchant can use the <strong>enableInventoryLocation</strong> call to enable an inventory location that is in a disabled state. See <a href=\"/api-docs/sell/inventory/types/api:StatusEnum\">StatusEnum</a> for the supported values.  <br/><br/><b>Default</b>: ENABLED For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum'>eBay API documentation</a> */
    @Json(name = "merchantLocationStatus")
    val merchantLocationStatus: kotlin.String? = null,
    /* The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse inventory locations. For store inventory locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a <strong>createInventoryLocation</strong> call, it becomes required for an <strong>updateInventoryLocation</strong> call.<br/><br/><b>Max length</b>: 1000 */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Although not technically required, this container is highly recommended to be used to specify operating hours for a store inventory location. This container is used to express the regular operating hours for a store location during each day of the week. A <strong>dayOfWeekEnum</strong> field and an <strong>intervals</strong> container will be needed for each day of the week that the store location is open. */
    @Json(name = "operatingHours")
    val operatingHours: kotlin.collections.List<OperatingHours>? = null,
    /* Although not technically required, this field is highly recommended to be used to specify the phone number for a store inventory location. <br><br><b>Max length</b>: 36 */
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    /* This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week. */
    @Json(name = "specialHours")
    val specialHours: kotlin.collections.List<SpecialHours>? = null
)

