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
package org.openapitools.client.models

import org.openapitools.client.models.Error
import org.openapitools.client.models.Fee

import com.squareup.moshi.Json

/**
 * This type is used to display the expected listing fees for each unpublished offer specified in the request of the <strong>getListingFees</strong> call.
 * @param fees This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (<strong>marketplaceId</strong> value). Many fee types will get returned even when they are <code>0.0</code>.<br/><br/>See the <a href=\"https://pages.ebay.com/help/sell/fees.html\" target=\"_blank\">Standard selling fees</a> help page for more information on listing fees.
 * @param marketplaceId This is the unique identifier of the eBay site for which  listing fees for the offer are applicable. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a>
 * @param warnings This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur.
 */

data class FeeSummary (
    /* This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (<strong>marketplaceId</strong> value). Many fee types will get returned even when they are <code>0.0</code>.<br/><br/>See the <a href=\"https://pages.ebay.com/help/sell/fees.html\" target=\"_blank\">Standard selling fees</a> help page for more information on listing fees. */
    @Json(name = "fees")
    val fees: kotlin.collections.List<Fee>? = null,
    /* This is the unique identifier of the eBay site for which  listing fees for the offer are applicable. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a> */
    @Json(name = "marketplaceId")
    val marketplaceId: kotlin.String? = null,
    /* This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur. */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<Error>? = null
)

