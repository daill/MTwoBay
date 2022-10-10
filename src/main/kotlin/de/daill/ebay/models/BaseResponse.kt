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
 * This is the base response of the <strong>createOrReplaceInventoryItem</strong>, <strong>createOrReplaceInventoryItemGroup</strong>,  and <strong>createOrReplaceProductCompatibility</strong>  calls. A response payload will only be returned for these three calls if one or more errors or warnings occur with the call.
 * @param warnings This container will be returned in a call response payload if one or more warnings or errors are triggered when an Inventory API call is made. This container will contain detailed information about the error or warning.
 */

data class BaseResponse (
    /* This container will be returned in a call response payload if one or more warnings or errors are triggered when an Inventory API call is made. This container will contain detailed information about the error or warning. */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<de.daill.ebay.models.Error>? = null
)
