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
 * This type contains an array of suggested category tree nodes that are considered by eBay to most closely correspond to the keywords provided in a query string, from a specified category tree.
 * @param categorySuggestions Contains details about one or more suggested categories that correspond to the provided keywords. The array of suggested categories is sorted in order of eBay's confidence of the relevance of each category (the first category is the most relevant).<br /><br /><span class=\"tablenote\"> <strong><span style=\"color:red\">Important:</span></strong> This call is not supported in the Sandbox environment. It will return a response payload in which the <b>categoryName</b> fields contain random or boilerplate text regardless of the query submitted. </span>
 * @param categoryTreeId The unique identifier of the eBay category tree from which suggestions are returned.
 * @param categoryTreeVersion The version of the category tree identified by <b>categoryTreeId</b>. It's a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
 */

data class CategorySuggestionResponse (
    /* Contains details about one or more suggested categories that correspond to the provided keywords. The array of suggested categories is sorted in order of eBay's confidence of the relevance of each category (the first category is the most relevant).<br /><br /><span class=\"tablenote\"> <strong><span style=\"color:red\">Important:</span></strong> This call is not supported in the Sandbox environment. It will return a response payload in which the <b>categoryName</b> fields contain random or boilerplate text regardless of the query submitted. </span> */
    @Json(name = "categorySuggestions")
    val categorySuggestions: kotlin.collections.List<CategorySuggestion>? = null,
    /* The unique identifier of the eBay category tree from which suggestions are returned. */
    @Json(name = "categoryTreeId")
    val categoryTreeId: kotlin.String? = null,
    /* The version of the category tree identified by <b>categoryTreeId</b>. It's a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls. */
    @Json(name = "categoryTreeVersion")
    val categoryTreeVersion: kotlin.String? = null
)
