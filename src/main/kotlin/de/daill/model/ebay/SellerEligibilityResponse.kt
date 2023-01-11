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
 * A type that is used to provide the seller's eligibility status for an eBay advertising program.
 * @param programType The eBay advertising program for which a seller may be eligible. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum'>eBay API documentation</a>
 * @param reason The reason why a seller is ineligible for the specified eBay advertising program.<br /><br />This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum'>eBay API documentation</a>
 * @param status The seller elibibilty status for the specified eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum'>eBay API documentation</a>
 */

data class SellerEligibilityResponse (
    /* The eBay advertising program for which a seller may be eligible. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum'>eBay API documentation</a> */
    @Json(name = "programType")
    val programType: kotlin.String? = null,
    /* The reason why a seller is ineligible for the specified eBay advertising program.<br /><br />This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum'>eBay API documentation</a> */
    @Json(name = "reason")
    val reason: kotlin.String? = null,
    /* The seller elibibilty status for the specified eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum'>eBay API documentation</a> */
    @Json(name = "status")
    val status: kotlin.String? = null
)
