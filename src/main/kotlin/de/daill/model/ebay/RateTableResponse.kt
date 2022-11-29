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
 * This type is the base response of the <b>getRateTables</b> method.
 * @param rateTables An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace.
 */

data class RateTableResponse (
    /* An array of all shipping rate tables defined for a marketplace (or all marketplaces if no <b>country_code</b> query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace. */
    @Json(name = "rateTables")
    val rateTables: kotlin.collections.List<RateTable>? = null
)

