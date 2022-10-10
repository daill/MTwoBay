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
package de.daill.ebay.models


import com.squareup.moshi.Json

/**
 * This type is used by the request payload of the <strong>publishByInventoryItemGroup</strong> call. The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
 * @param inventoryItemGroupKey This is the unique identifier of the inventory item group. All unpublished offers associated with this inventory item group will be published as a multiple-variation listing if the <strong>publishByInventoryItemGroup</strong> call is successful. The <strong>inventoryItemGroupKey</strong> identifier is automatically generated by eBay once an inventory item group is created.<br/><br/>To retrieve an <strong>inventoryItemGroupKey</strong> value, you can use the <strong>getInventoryItem</strong> call to retrieve an inventory item that is known to be in the inventory item group to publish, and then look for the inventory item group identifier under the <strong>groupIds</strong> container in the response of that call.
 * @param marketplaceId This is the unique identifier of the eBay site on which the multiple-variation listing will be published. The <strong>marketPlaceId</strong> enumeration values are found in <strong>MarketplaceIdEnum</strong>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a>
 */

data class PublishByInventoryItemGroupRequest (
    /* This is the unique identifier of the inventory item group. All unpublished offers associated with this inventory item group will be published as a multiple-variation listing if the <strong>publishByInventoryItemGroup</strong> call is successful. The <strong>inventoryItemGroupKey</strong> identifier is automatically generated by eBay once an inventory item group is created.<br/><br/>To retrieve an <strong>inventoryItemGroupKey</strong> value, you can use the <strong>getInventoryItem</strong> call to retrieve an inventory item that is known to be in the inventory item group to publish, and then look for the inventory item group identifier under the <strong>groupIds</strong> container in the response of that call. */
    @Json(name = "inventoryItemGroupKey")
    val inventoryItemGroupKey: kotlin.String? = null,
    /* This is the unique identifier of the eBay site on which the multiple-variation listing will be published. The <strong>marketPlaceId</strong> enumeration values are found in <strong>MarketplaceIdEnum</strong>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a> */
    @Json(name = "marketplaceId")
    val marketplaceId: kotlin.String? = null
)
