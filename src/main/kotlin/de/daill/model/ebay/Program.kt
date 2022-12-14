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
package de.daill.model.ebay


import com.squareup.moshi.Json

/**
 * A seller program in to which a seller can opt-in.
 * @param programType A seller program in to which a seller can opt-in. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ProgramTypeEnum'>eBay API documentation</a>
 */

data class Program (
    /* A seller program in to which a seller can opt-in. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ProgramTypeEnum'>eBay API documentation</a> */
    @Json(name = "programType")
    val programType: kotlin.String? = null
)

