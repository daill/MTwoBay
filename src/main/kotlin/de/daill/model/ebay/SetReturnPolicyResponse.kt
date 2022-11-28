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

import org.openapitools.client.models.CategoryType
import org.openapitools.client.models.Error
import org.openapitools.client.models.InternationalReturnOverrideType
import org.openapitools.client.models.TimeDuration

import com.squareup.moshi.Json

/**
 * Complex type that that gets populated with a response containing a return policy.
 * @param categoryTypes This field always returns <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies, since return business policies are not applicable to motor vehicle listings.
 * @param description A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250
 * @param extendedHolidayReturnsOffered <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. This field should no longer be returned.</p> 
 * @param internationalOverride 
 * @param marketplaceId The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
 * @param name A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
 * @param refundMethod If a seller indicates that they will accept buyer returns, this value will be <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>
 * @param restockingFeePercentage <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns.</p>
 * @param returnInstructions This text-based field provides more details on seller-specified return instructions. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)
 * @param returnMethod This field will be returned if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
 * @param returnPeriod 
 * @param returnPolicyId A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
 * @param returnsAccepted If set to <code>true</code>, the seller accepts returns. If set to <code>false</code>, this field indicates that the seller does not accept returns.
 * @param returnShippingCostPayer This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This container will be returned unless the business policy states that the seller does not accept returns. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
 * @param warnings An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
 */

data class SetReturnPolicyResponse (
    /* This field always returns <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies, since return business policies are not applicable to motor vehicle listings. */
    @Json(name = "categoryTypes")
    val categoryTypes: kotlin.collections.List<CategoryType>? = null,
    /* A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250 */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. This field should no longer be returned.</p>  */
    @Json(name = "extendedHolidayReturnsOffered")
    val extendedHolidayReturnsOffered: kotlin.Boolean? = null,
    @Json(name = "internationalOverride")
    val internationalOverride: InternationalReturnOverrideType? = null,
    /* The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a> */
    @Json(name = "marketplaceId")
    val marketplaceId: kotlin.String? = null,
    /* A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64 */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* If a seller indicates that they will accept buyer returns, this value will be <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a> */
    @Json(name = "refundMethod")
    val refundMethod: kotlin.String? = null,
    /* <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns.</p> */
    @Json(name = "restockingFeePercentage")
    val restockingFeePercentage: kotlin.String? = null,
    /* This text-based field provides more details on seller-specified return instructions. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE) */
    @Json(name = "returnInstructions")
    val returnInstructions: kotlin.String? = null,
    /* This field will be returned if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a> */
    @Json(name = "returnMethod")
    val returnMethod: kotlin.String? = null,
    @Json(name = "returnPeriod")
    val returnPeriod: TimeDuration? = null,
    /* A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created. */
    @Json(name = "returnPolicyId")
    val returnPolicyId: kotlin.String? = null,
    /* If set to <code>true</code>, the seller accepts returns. If set to <code>false</code>, this field indicates that the seller does not accept returns. */
    @Json(name = "returnsAccepted")
    val returnsAccepted: kotlin.Boolean? = null,
    /* This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This container will be returned unless the business policy states that the seller does not accept returns. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a> */
    @Json(name = "returnShippingCostPayer")
    val returnShippingCostPayer: kotlin.String? = null,
    /* An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty. */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<Error>? = null
)

