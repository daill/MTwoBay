/**
* Account API
* The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
*
* The version of the OpenAPI document: v1.9.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.CompactCustomPolicyResponse

import com.squareup.moshi.Json

/**
 * 
 * @param customPolicies This array contains the custom policies that match the input criteria.
 * @param href <i>This field is for future use.</i>
 * @param limit <i>This field is for future use.</i>
 * @param next <i>This field is for future use.</i>
 * @param offset <i>This field is for future use.</i>
 * @param prev <i>This field is for future use.</i>
 * @param total <i>This field is for future use.</i>
 */

data class CustomPolicyResponse (
    /* This array contains the custom policies that match the input criteria. */
    @Json(name = "customPolicies")
    val customPolicies: kotlin.collections.List<CompactCustomPolicyResponse>? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "href")
    val href: kotlin.String? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "limit")
    val limit: kotlin.Int? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "next")
    val next: kotlin.String? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "offset")
    val offset: kotlin.Int? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "prev")
    val prev: kotlin.String? = null,
    /* <i>This field is for future use.</i> */
    @Json(name = "total")
    val total: kotlin.Int? = null
)
