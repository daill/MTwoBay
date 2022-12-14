/**
* Inventory API
* The Inventory API is used to create and manage inventory, and then to publish and manage this inventory on an eBay marketplace. There are also methods in this API that will convert eligible, active eBay listings into the Inventory API model.
*
* The version of the OpenAPI document: 1.16.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package de.daill.model.ebay


import com.squareup.moshi.Json

/**
 * This type is used to express a dollar value and the applicable currency.
 * @param currency A three-digit string value respresenting the type of currency being used. Both the <strong>value</strong> and <strong>currency</strong> fields are required/always returned when expressing prices. See the <a href=\"/api-docs/sell/inventory/types/ba:CurrencyCodeEnum\">CurrencyCodeEnum</a> type for the full list of currencies and their corresponding three-digit string values.
 * @param value A string representation of a dollar value expressed in the currency specified in the <strong>currency</strong> field. Both the <strong>value</strong> and <strong>currency</strong> fields are required/always returned when expressing prices.
 */

data class Amount (
    /* A three-digit string value respresenting the type of currency being used. Both the <strong>value</strong> and <strong>currency</strong> fields are required/always returned when expressing prices. See the <a href=\"/api-docs/sell/inventory/types/ba:CurrencyCodeEnum\">CurrencyCodeEnum</a> type for the full list of currencies and their corresponding three-digit string values. */
    @Json(name = "currency")
    val currency: kotlin.String? = null,
    /* A string representation of a dollar value expressed in the currency specified in the <strong>currency</strong> field. Both the <strong>value</strong> and <strong>currency</strong> fields are required/always returned when expressing prices. */
    @Json(name = "value")
    val value: kotlin.String? = null
)

