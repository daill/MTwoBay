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
 * This type is use by the base response payload of the <strong>bulkUpdatePriceQuantity</strong> call. The <strong>bulkUpdatePriceQuantity</strong> call response will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items.
 * @param responses This container will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items.
 */

data class BulkPriceQuantityResponse (
    /* This container will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items. */
    @Json(name = "responses")
    val responses: kotlin.collections.List<PriceQuantityResponse>? = null
)
