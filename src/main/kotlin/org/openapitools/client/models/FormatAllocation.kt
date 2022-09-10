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


import com.squareup.moshi.Json

/**
 * This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
 * @param auction This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.
 * @param fixedPrice This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.
 */

data class FormatAllocation (
    /* This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU. */
    @Json(name = "auction")
    val auction: kotlin.Int? = null,
    /* This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU. */
    @Json(name = "fixedPrice")
    val fixedPrice: kotlin.Int? = null
)

