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
 * This type is used by the base request of the <strong>bulkPublishOffer</strong> method, which is used to publish up to 25 different offers.
 * @param requests This container is used to pass in an array of offers to publish. Up to 25 offers can be published with one <strong>bulkPublishOffer</strong> method.
 */

data class BulkOffer (
    /* This container is used to pass in an array of offers to publish. Up to 25 offers can be published with one <strong>bulkPublishOffer</strong> method. */
    @Json(name = "requests")
    val requests: kotlin.collections.List<OfferKeyWithId>? = null
)

