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
 * This type is used by the <strong>offers</strong> container in a <strong>Bulk Update Price and Quantity</strong> call to update the current price and/or quantity of one or more offers associated with a specific inventory item.
 * @param availableQuantity This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding <strong>offerId</strong> value). Either the <strong>availableQuantity</strong> field or the <strong>price</strong> container is required, but not necessarily both.
 * @param offerId This field is the unique identifier of the offer. If an <strong>offers</strong> container is used to update one or more offers associated to a specific inventory item, the <strong>offerId</strong> value is required in order to identify the offer to update with a modified price and/or quantity.<br/><br/>The seller can run a <strong>getOffers</strong> call (passing in the correct SKU value as a query parameter) to retrieve <strong>offerId</strong> values for offers associated with the SKU.
 * @param price 
 */

data class OfferPriceQuantity (
    /* This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding <strong>offerId</strong> value). Either the <strong>availableQuantity</strong> field or the <strong>price</strong> container is required, but not necessarily both. */
    @Json(name = "availableQuantity")
    val availableQuantity: kotlin.Int? = null,
    /* This field is the unique identifier of the offer. If an <strong>offers</strong> container is used to update one or more offers associated to a specific inventory item, the <strong>offerId</strong> value is required in order to identify the offer to update with a modified price and/or quantity.<br/><br/>The seller can run a <strong>getOffers</strong> call (passing in the correct SKU value as a query parameter) to retrieve <strong>offerId</strong> values for offers associated with the SKU. */
    @Json(name = "offerId")
    val offerId: kotlin.String? = null,
    @Json(name = "price")
    val price: Amount? = null
)

