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
 * A unique ID for a sales tax jurisdiction.
 * @param salesTaxJurisdictionId The unique ID for a sales tax jurisdiction.
 */

data class SalesTaxJurisdiction (
    /* The unique ID for a sales tax jurisdiction. */
    @Json(name = "salesTaxJurisdictionId")
    val salesTaxJurisdictionId: kotlin.String? = null
)

