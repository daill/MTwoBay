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
 * This type contains a valid value for an aspect, along with any constraints on the occurrence of that value.
 * @param localizedValue The localized value of this aspect.<br /><br />          <span class=\"tablenote\"> <strong>Note:</strong> This value is always localized for the specified marketplace. </span>
 * @param valueConstraints <i>Not returned if</i> the value of the <b>localizedValue</b> field can always be selected for this aspect of the specified category.<br /><br />Contains a list of the dependencies that identify when the value of the <b>localizedValue</b> field is available for the current aspect. Each dependency specifies the values of another aspect of the same category (a <i>control</i> aspect), for which the current value of the current aspect can also be selected by the seller. <br /><br />          <b>Example:</b> A shirt is available in three sizes and three colors, but only the Small and Medium sizes come in Green. Thus for the Color aspect, the value Green is constrained by its dependency on Size (the control aspect). Only when the Size aspect value is Small or Medium, can the Color aspect value of Green be selected by the seller.
 */

data class AspectValue (
    /* The localized value of this aspect.<br /><br />          <span class=\"tablenote\"> <strong>Note:</strong> This value is always localized for the specified marketplace. </span> */
    @Json(name = "localizedValue")
    val localizedValue: kotlin.String? = null,
    /* <i>Not returned if</i> the value of the <b>localizedValue</b> field can always be selected for this aspect of the specified category.<br /><br />Contains a list of the dependencies that identify when the value of the <b>localizedValue</b> field is available for the current aspect. Each dependency specifies the values of another aspect of the same category (a <i>control</i> aspect), for which the current value of the current aspect can also be selected by the seller. <br /><br />          <b>Example:</b> A shirt is available in three sizes and three colors, but only the Small and Medium sizes come in Green. Thus for the Color aspect, the value Green is constrained by its dependency on Size (the control aspect). Only when the Size aspect value is Small or Medium, can the Color aspect value of Green be selected by the seller. */
    @Json(name = "valueConstraints")
    val valueConstraints: kotlin.collections.List<ValueConstraint>? = null
)

