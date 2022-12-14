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
 * 
 * @param availability 
 * @param condition This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. <br /><br /> Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the 'Get' calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum'>eBay API documentation</a>
 * @param conditionDescription This string field is used by the seller to more clearly describe the condition of used items, or items that are not 'Brand New', 'New with tags', or 'New in box'. The ConditionDescription field is available for all categories. If the ConditionDescription field is used with an item in a new condition (Condition IDs 1000-1499), eBay will simply ignore this field if included, and eBay will return a warning message to the user. This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the item. Make sure that the condition value, condition description, listing description, and the item's pictures do not contradict one another.<br /><br /><strong>Max length</strong>/: 1000.
 * @param groupIds This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item group(s). This array is not returned if the inventory item is not associated with any inventory item groups.
 * @param inventoryItemGroupKeys This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item's variation in a multiple-variation listing. This array is not returned if the inventory item is not associated with any inventory item groups.
 * @param locale This field is for future use only. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum'>eBay API documentation</a>
 * @param packageWeightAndSize 
 * @param product 
 * @param sku The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
 */

data class InventoryItemWithSkuLocaleGroupid (
    @Json(name = "availability")
    val availability: AvailabilityWithAll? = null,
    /* This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. <br /><br /> Since the condition of an inventory item must be specified before being published in an offer, this field is always returned in the 'Get' calls for SKUs that are part of a published offer. If a SKU is not part of a published offer, this field will only be returned if set for the inventory item. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum'>eBay API documentation</a> */
    @Json(name = "condition")
    val condition: kotlin.String? = null,
    /* This string field is used by the seller to more clearly describe the condition of used items, or items that are not 'Brand New', 'New with tags', or 'New in box'. The ConditionDescription field is available for all categories. If the ConditionDescription field is used with an item in a new condition (Condition IDs 1000-1499), eBay will simply ignore this field if included, and eBay will return a warning message to the user. This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the item. Make sure that the condition value, condition description, listing description, and the item's pictures do not contradict one another.<br /><br /><strong>Max length</strong>/: 1000. */
    @Json(name = "conditionDescription")
    val conditionDescription: kotlin.String? = null,
    /* This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item group(s). This array is not returned if the inventory item is not associated with any inventory item groups. */
    @Json(name = "groupIds")
    val groupIds: kotlin.collections.List<kotlin.String>? = null,
    /* This array is returned if the inventory item is associated with any inventory item group(s). The value(s) returned in this array are the unique identifier(s) of the inventory item's variation in a multiple-variation listing. This array is not returned if the inventory item is not associated with any inventory item groups. */
    @Json(name = "inventoryItemGroupKeys")
    val inventoryItemGroupKeys: kotlin.collections.List<kotlin.String>? = null,
    /* This field is for future use only. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum'>eBay API documentation</a> */
    @Json(name = "locale")
    val locale: kotlin.String? = null,
    @Json(name = "packageWeightAndSize")
    val packageWeightAndSize: PackageWeightAndSize? = null,
    @Json(name = "product")
    val product: Product? = null,
    /* The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell. */
    @Json(name = "sku")
    val sku: kotlin.String? = null
)

