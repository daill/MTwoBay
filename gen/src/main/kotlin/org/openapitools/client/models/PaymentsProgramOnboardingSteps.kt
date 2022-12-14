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
 * The payments program onboarding steps, status, and link.
 * @param name The name of the step in the steps array. Over time, these names are subject to change as processes change. The output sample contains example step names. Review an actual call response for updated step names. 
 * @param status This enumeration value indicates the status of the associated step. <p> <span class=\"tablenote\"><strong>Note:</strong> Only one step can be <code>IN_PROGRESS</code> at a time.</span></p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStepStatus'>eBay API documentation</a>
 * @param webUrl This URL provides access to the <code>IN_PROGRESS</code> step.
 */

data class PaymentsProgramOnboardingSteps (
    /* The name of the step in the steps array. Over time, these names are subject to change as processes change. The output sample contains example step names. Review an actual call response for updated step names.  */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* This enumeration value indicates the status of the associated step. <p> <span class=\"tablenote\"><strong>Note:</strong> Only one step can be <code>IN_PROGRESS</code> at a time.</span></p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStepStatus'>eBay API documentation</a> */
    @Json(name = "status")
    val status: kotlin.String? = null,
    /* This URL provides access to the <code>IN_PROGRESS</code> step. */
    @Json(name = "webUrl")
    val webUrl: kotlin.String? = null
)

