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
 * This type defines the fields for a seller's international return policy. Sellers have the ability to set separate domestic and international return policies, but if an international return policy is not set, the same return policy settings specified for the domestic return policy are also used for returns for international buyers. 
 * @param returnMethod This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
 * @param returnPeriod 
 * @param returnsAccepted If set to <code>true</code>, the seller accepts international returns. If set to <code>false</code>, the seller does not accept international returns.  <br/><br/>This field is conditionally required if the seller chooses to have a separate international return policy.
 * @param returnShippingCostPayer This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for 'significantly not as described' (SNAD) issues.  <br/><br/>This field is conditionally required if the <b>internationalOverride.returnsAccepted</b> field is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
 */

data class InternationalReturnOverrideType (
    /* This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a> */
    @Json(name = "returnMethod")
    val returnMethod: kotlin.String? = null,
    @Json(name = "returnPeriod")
    val returnPeriod: TimeDuration? = null,
    /* If set to <code>true</code>, the seller accepts international returns. If set to <code>false</code>, the seller does not accept international returns.  <br/><br/>This field is conditionally required if the seller chooses to have a separate international return policy. */
    @Json(name = "returnsAccepted")
    val returnsAccepted: kotlin.Boolean? = null,
    /* This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for 'significantly not as described' (SNAD) issues.  <br/><br/>This field is conditionally required if the <b>internationalOverride.returnsAccepted</b> field is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a> */
    @Json(name = "returnShippingCostPayer")
    val returnShippingCostPayer: kotlin.String? = null
)
