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
 * This type is used by the <strong>compatibilityPropertyValues</strong> array that is returned in the <strong>getCompatibilityPropertyValues</strong> response. The <strong>compatibilityPropertyValues</strong> array contains all compatible vehicle property values that match the specified eBay marketplace, specified eBay category, and filters in the request. If the <strong>compatibility_property</strong> parameter value in the request is 'Trim', each value returned in each <strong>value</strong> field will be a different vehicle trim, applicable to any filters that are set in the <string>filter</string> query parameter of the request, and also based on the eBay marketplace and category specified in the call request.
 * @param value Each <strong>value</strong> field shows one applicable compatible vehicle property value. The values that are returned will depend on the specified eBay marketplace, specified eBay category, and filters in the request.
 */

data class CompatibilityPropertyValue (
    /* Each <strong>value</strong> field shows one applicable compatible vehicle property value. The values that are returned will depend on the specified eBay marketplace, specified eBay category, and filters in the request. */
    @Json(name = "value")
    val value: kotlin.String? = null
)

