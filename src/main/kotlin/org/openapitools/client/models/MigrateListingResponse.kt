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
import org.openapitools.client.models.InventoryItemListing

import com.squareup.moshi.Json

/**
 * This type is used to display the results of each listing that the seller attempted to migrate.
 * @param errors If one or more errors occur with the attempt to migrate the listing, this container will be returned with detailed information on each error.
 * @param inventoryItemGroupKey This field will only be returned for a multiple-variation listing that the seller attempted to migrate. Its value is auto-generated by eBay. For a multiple-variation listing that is successfully migrated to the new Inventory model, eBay automatically creates an inventory item group object for the listing, and the seller will be able to retrieve and manage that new inventory item group object by using the value in this field.
 * @param inventoryItems This container exists of an array of SKU values and offer IDs. For single-variation listings, this will only be one SKU value and one offer ID (if listing was successfully migrated), but multiple SKU values and offer IDs will be returned for multiple-variation listings.
 * @param listingId The unique identifier of the eBay listing that the seller attempted to migrate.
 * @param marketplaceId This is the unique identifier of the eBay Marketplace where the listing resides. The value fo the eBay US site will be <code>EBAY_US</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a>
 * @param statusCode This field is returned for each listing that the seller attempted to migrate. See the <strong>HTTP status codes</strong> table to see which each status code indicates.
 * @param warnings If one or more warnings occur with the attempt to migrate the listing, this container will be returned with detailed information on each warning. It is possible that a listing can be successfully migrated even if a warning occurs.
 */

data class MigrateListingResponse (
    /* If one or more errors occur with the attempt to migrate the listing, this container will be returned with detailed information on each error. */
    @Json(name = "errors")
    val errors: kotlin.collections.List<Error>? = null,
    /* This field will only be returned for a multiple-variation listing that the seller attempted to migrate. Its value is auto-generated by eBay. For a multiple-variation listing that is successfully migrated to the new Inventory model, eBay automatically creates an inventory item group object for the listing, and the seller will be able to retrieve and manage that new inventory item group object by using the value in this field. */
    @Json(name = "inventoryItemGroupKey")
    val inventoryItemGroupKey: kotlin.String? = null,
    /* This container exists of an array of SKU values and offer IDs. For single-variation listings, this will only be one SKU value and one offer ID (if listing was successfully migrated), but multiple SKU values and offer IDs will be returned for multiple-variation listings. */
    @Json(name = "inventoryItems")
    val inventoryItems: kotlin.collections.List<InventoryItemListing>? = null,
    /* The unique identifier of the eBay listing that the seller attempted to migrate. */
    @Json(name = "listingId")
    val listingId: kotlin.String? = null,
    /* This is the unique identifier of the eBay Marketplace where the listing resides. The value fo the eBay US site will be <code>EBAY_US</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a> */
    @Json(name = "marketplaceId")
    val marketplaceId: kotlin.String? = null,
    /* This field is returned for each listing that the seller attempted to migrate. See the <strong>HTTP status codes</strong> table to see which each status code indicates. */
    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null,
    /* If one or more warnings occur with the attempt to migrate the listing, this container will be returned with detailed information on each warning. It is possible that a listing can be successfully migrated even if a warning occurs. */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<Error>? = null
)

