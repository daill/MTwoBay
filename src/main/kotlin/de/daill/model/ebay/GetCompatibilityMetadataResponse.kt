/**
* Taxonomy API
* Use the Taxonomy API to discover the most appropriate eBay categories under which sellers can offer inventory items for sale, and the most likely categories under which buyers can browse or search for items to purchase. In addition, the Taxonomy API provides metadata about the required and recommended category aspects to include in listings, and also has two operations to retrieve parts compatibility information.
*
* The version of the OpenAPI document: v1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package de.daill.model.ebay

import com.squareup.moshi.Json

/**
 * This type is used by the base response of the <strong>getCompatibilityProperties</strong> method.
 * @param compatibilityProperties This container consists of an array of all compatible vehicle properties applicable to the specified eBay marketplace and eBay category ID.
 */

data class GetCompatibilityMetadataResponse (
    /* This container consists of an array of all compatible vehicle properties applicable to the specified eBay marketplace and eBay category ID. */
    @Json(name = "compatibilityProperties")
    val compatibilityProperties: kotlin.collections.List<CompatibilityProperty>? = null
)

