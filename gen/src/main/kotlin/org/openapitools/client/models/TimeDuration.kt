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


import com.squareup.moshi.Json

/**
 * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.<br/><br/>Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
 * @param unit These enum values represent the time measurement unit, such as <code>DAY</code>. A span of time is defined when you apply the value specified in the <b>value</b> field to the value specified for <b>unit</b>. <br/><br/>See <b>TimeDurationUnitEnum</b> for a complete list of possible time-measurement units. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:TimeDurationUnitEnum'>eBay API documentation</a>
 * @param value An integer that represents an amount of time, as measured by the time-measurement unit specified in the <b>unit</b> field.
 */

data class TimeDuration (
    /* These enum values represent the time measurement unit, such as <code>DAY</code>. A span of time is defined when you apply the value specified in the <b>value</b> field to the value specified for <b>unit</b>. <br/><br/>See <b>TimeDurationUnitEnum</b> for a complete list of possible time-measurement units. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:TimeDurationUnitEnum'>eBay API documentation</a> */
    @Json(name = "unit")
    val unit: kotlin.String? = null,
    /* An integer that represents an amount of time, as measured by the time-measurement unit specified in the <b>unit</b> field. */
    @Json(name = "value")
    val value: kotlin.Int? = null
)
