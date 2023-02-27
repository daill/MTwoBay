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
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType

/**
 * This type provides details of an offer, and is used by the response payloads of the <strong>getOffer</strong> and the <strong>getOffers</strong> calls.
 * @param availableQuantity This integer value indicates the quantity of the inventory item (specified by the <strong>sku</strong> value) that will be available for purchase by buyers shopping on the eBay site specified in the <strong>marketplaceId</strong> field. For unpublished offers where the available quantity has yet to be set, the <strong>availableQuantity</strong> value is set to <code>0</code>.
 * @param categoryId The unique identifier of the primary eBay category that the inventory item is listed under. This field is always returned for published offers, but is only returned if set for unpublished offers.
 * @param charity 
 * @param extendedProducerResponsibility 
 * @param format This enumerated value indicates the listing format of the offer. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:FormatTypeEnum'>eBay API documentation</a>
 * @param hideBuyerDetails This field is returned as <code>true</code> if the private listing feature has been enabled for the offer. Sellers may want to use this feature when they believe that a listing's potential bidders/buyers would not want their obfuscated user IDs (and feedback scores) exposed to other users. <br><br> This field is always returned even if not explicitly set in the offer. It defaults to <code>false</code>, so will get returned as <code>false</code> if seller does not set this feature with a 'Create' or 'Update' offer method.
 * @param includeCatalogProductDetails This field indicates whether or not eBay product catalog details are applied to a listing. A value of <code>true</code> indicates the listing corresponds to the eBay product associated with the provided product identifier. The product identifier is provided in <strong>createOrReplaceInventoryItem</strong>.<p><span class=\"tablenote\"><strong>Note:</strong> Though the <strong>includeCatalogProductDetails</strong> parameter is not required to be submitted in the request, the parameter defaults to 'true' if omitted.</span></p>
 * @param listing 
 * @param listingDescription The description of the eBay listing that is part of the unpublished or published offer. This field is always returned for published offers, but is only returned if set for unpublished offers.<br/><br/><strong>Max Length</strong>: 500000 (which includes HTML markup/tags)
 * @param listingDuration This field indicates the number of days that the listing will be active.<br /><br />This field is returned for both auction and fixed-price listings; however, the value returned for fixed-price listings will always be <code>GTC</code>. The GTC (Good 'Til Cancelled) listings are automatically renewed each calendar month until the seller decides to end the listing.<br /><br /><span class=\"tablenote\"> <strong>Note:</strong> If the listing duration expires for an auction offer, the listing then becomes available as a fixed-price offer and will be GTC.</span> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingDurationEnum'>eBay API documentation</a>
 * @param listingPolicies 
 * @param listingStartDate This timestamp is the date/time that the seller set for the scheduled listing. With the scheduled listing feature, the seller can set a time in the future that the listing will become active, instead of the listing becoming active immediately after a <strong>publishOffer</strong> call. <br><br> Scheduled listings do not always start at the exact date/time specified by the seller, but the date/time of the timestamp returned in <strong>getOffer</strong>/<strong>getOffers</strong> will be the same as the timestamp passed into a 'Create' or 'Update' offer call. <br><br> This field is returned if set for an offer.
 * @param lotSize This field is only applicable and returned if the listing is a lot listing. A lot listing is a listing that has multiple quantity of the same product. An example would be a set of four identical car tires. The integer value in this field is the number of identical items being sold through the lot listing.
 * @param marketplaceId This enumeration value is the unique identifier of the eBay site on which the offer is available, or will be made available. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a>
 * @param merchantLocationKey The unique identifier of the inventory location. This identifier is set up by the merchant when the inventory location is first created with the <strong>createInventoryLocation</strong> call. Once this value is set for an inventory location, it can not be modified. To get more information about this inventory location, the <strong>getInventoryLocation</strong> call can be used, passing in this value at the end of the call URI.<br/><br/>This field is always returned for published offers, but is only returned if set for unpublished offers.<br/><br/><b>Max length</b>: 36
 * @param offerId The unique identifier of the offer. This identifier is used in many offer-related calls, and it is also used in the <strong>bulkUpdatePriceQuantity</strong> call.
 * @param pricingSummary 
 * @param quantityLimitPerBuyer This field is only applicable and set if the seller wishes to set a restriction on the purchase quantity of an inventory item per seller. If this field is set by the seller for the offer, then each distinct buyer may purchase up to, but not exceed the quantity in this field. So, if this field's value is <code>5</code>, each buyer may purchase a quantity of the inventory item between one and five, and the purchases can occur in one multiple-quantity purchase, or over multiple transactions. If a buyer attempts to purchase one or more of these products, and the cumulative quantity will take the buyer beyond the quantity limit, that buyer will be blocked from that purchase.<br/>
 * @param secondaryCategoryId The unique identifier for a secondary category. This field is applicable if the seller decides to list the item under two categories. Sellers can use the <a href=\"/api-docs/commerce/taxonomy/resources/category_tree/methods/getCategorySuggestions\" target=\"_blank\">getCategorySuggestions</a> method of the Taxonomy API to retrieve suggested category ID values. A fee may be charged when adding a secondary category to a listing. <br/><br/><span class=\"tablenote\"><strong>Note:</strong> You cannot list <strong>US eBay Motors</strong> vehicles in two categories. However, you can list <strong>Parts & Accessories</strong> in two categories.</span>
 * @param sku This is the seller-defined SKU value of the product in the offer.<br/><br/><strong>Max Length</strong>: 50 <br/>
 * @param status The enumeration value in this field specifies the status of the offer - either <code>PUBLISHED</code> or <code>UNPUBLISHED</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:OfferStatusEnum'>eBay API documentation</a>
 * @param storeCategoryNames This container is returned if the seller chose to place the inventory item into one or two eBay store categories that the seller has set up for their eBay store. The string value(s) in this container will be the full path(s) to the eBay store categories, as shown below:<br> <pre><code>\"storeCategoryNames\": [<br/> \"/Fashion/Men/Shirts\", <br/> \"/Fashion/Men/Accessories\" ], </pre></code>
 * @param tax 
 */

@Document
class EbayOfferDetailsWithAll (
    /* This integer value indicates the quantity of the inventory item (specified by the <strong>sku</strong> value) that will be available for purchase by buyers shopping on the eBay site specified in the <strong>marketplaceId</strong> field. For unpublished offers where the available quantity has yet to be set, the <strong>availableQuantity</strong> value is set to <code>0</code>. */
    @Json(name = "availableQuantity")
    var availableQuantity: kotlin.Int? = null,
    /* The unique identifier of the primary eBay category that the inventory item is listed under. This field is always returned for published offers, but is only returned if set for unpublished offers. */
    @Json(name = "categoryId")
    var categoryId: kotlin.String? = null,
    @Json(name = "charity")
    val charity: Charity? = null,
    @Json(name = "extendedProducerResponsibility")
    val extendedProducerResponsibility: ExtendedProducerResponsibility? = null,
    /* This enumerated value indicates the listing format of the offer. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:FormatTypeEnum'>eBay API documentation</a> */
    @Json(name = "format")
    var format: kotlin.String? = null,
    /* This field is returned as <code>true</code> if the private listing feature has been enabled for the offer. Sellers may want to use this feature when they believe that a listing's potential bidders/buyers would not want their obfuscated user IDs (and feedback scores) exposed to other users. <br><br> This field is always returned even if not explicitly set in the offer. It defaults to <code>false</code>, so will get returned as <code>false</code> if seller does not set this feature with a 'Create' or 'Update' offer method. */
    @Json(name = "hideBuyerDetails")
    val hideBuyerDetails: kotlin.Boolean? = null,
    /* This field indicates whether or not eBay product catalog details are applied to a listing. A value of <code>true</code> indicates the listing corresponds to the eBay product associated with the provided product identifier. The product identifier is provided in <strong>createOrReplaceInventoryItem</strong>.<p><span class=\"tablenote\"><strong>Note:</strong> Though the <strong>includeCatalogProductDetails</strong> parameter is not required to be submitted in the request, the parameter defaults to 'true' if omitted.</span></p> */
    @Json(name = "includeCatalogProductDetails")
    val includeCatalogProductDetails: kotlin.Boolean? = null,
    @Json(name = "listing")
    val listing: ListingDetails? = null,
    /* The description of the eBay listing that is part of the unpublished or published offer. This field is always returned for published offers, but is only returned if set for unpublished offers.<br/><br/><strong>Max Length</strong>: 500000 (which includes HTML markup/tags) */
    @Json(name = "listingDescription")
    var listingDescription: kotlin.String? = null,
    /* This field indicates the number of days that the listing will be active.<br /><br />This field is returned for both auction and fixed-price listings; however, the value returned for fixed-price listings will always be <code>GTC</code>. The GTC (Good 'Til Cancelled) listings are automatically renewed each calendar month until the seller decides to end the listing.<br /><br /><span class=\"tablenote\"> <strong>Note:</strong> If the listing duration expires for an auction offer, the listing then becomes available as a fixed-price offer and will be GTC.</span> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingDurationEnum'>eBay API documentation</a> */
    @Json(name = "listingDuration")
    val listingDuration: kotlin.String? = null,
    @Json(name = "listingPolicies")
    var listingPolicies: ListingPolicies? = null,
    /* This timestamp is the date/time that the seller set for the scheduled listing. With the scheduled listing feature, the seller can set a time in the future that the listing will become active, instead of the listing becoming active immediately after a <strong>publishOffer</strong> call. <br><br> Scheduled listings do not always start at the exact date/time specified by the seller, but the date/time of the timestamp returned in <strong>getOffer</strong>/<strong>getOffers</strong> will be the same as the timestamp passed into a 'Create' or 'Update' offer call. <br><br> This field is returned if set for an offer. */
    @Json(name = "listingStartDate")
    val listingStartDate: kotlin.String? = null,
    /* This field is only applicable and returned if the listing is a lot listing. A lot listing is a listing that has multiple quantity of the same product. An example would be a set of four identical car tires. The integer value in this field is the number of identical items being sold through the lot listing. */
    @Json(name = "lotSize")
    val lotSize: kotlin.Int? = null,
    /* This enumeration value is the unique identifier of the eBay site on which the offer is available, or will be made available. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum'>eBay API documentation</a> */
    @Json(name = "marketplaceId")
    var marketplaceId: kotlin.String? = null,
    /* The unique identifier of the inventory location. This identifier is set up by the merchant when the inventory location is first created with the <strong>createInventoryLocation</strong> call. Once this value is set for an inventory location, it can not be modified. To get more information about this inventory location, the <strong>getInventoryLocation</strong> call can be used, passing in this value at the end of the call URI.<br/><br/>This field is always returned for published offers, but is only returned if set for unpublished offers.<br/><br/><b>Max length</b>: 36 */
    @Json(name = "merchantLocationKey")
    var merchantLocationKey: kotlin.String? = null,
    /* The unique identifier of the offer. This identifier is used in many offer-related calls, and it is also used in the <strong>bulkUpdatePriceQuantity</strong> call. */
    @Json(name = "offerId")
    var offerId: kotlin.String? = null,
    @Json(name = "pricingSummary")
    var pricingSummary: PricingSummary? = null,
    /* This field is only applicable and set if the seller wishes to set a restriction on the purchase quantity of an inventory item per seller. If this field is set by the seller for the offer, then each distinct buyer may purchase up to, but not exceed the quantity in this field. So, if this field's value is <code>5</code>, each buyer may purchase a quantity of the inventory item between one and five, and the purchases can occur in one multiple-quantity purchase, or over multiple transactions. If a buyer attempts to purchase one or more of these products, and the cumulative quantity will take the buyer beyond the quantity limit, that buyer will be blocked from that purchase.<br/> */
    @Json(name = "quantityLimitPerBuyer")
    val quantityLimitPerBuyer: kotlin.Int? = null,
    /* The unique identifier for a secondary category. This field is applicable if the seller decides to list the item under two categories. Sellers can use the <a href=\"/api-docs/commerce/taxonomy/resources/category_tree/methods/getCategorySuggestions\" target=\"_blank\">getCategorySuggestions</a> method of the Taxonomy API to retrieve suggested category ID values. A fee may be charged when adding a secondary category to a listing. <br/><br/><span class=\"tablenote\"><strong>Note:</strong> You cannot list <strong>US eBay Motors</strong> vehicles in two categories. However, you can list <strong>Parts & Accessories</strong> in two categories.</span> */
    @Json(name = "secondaryCategoryId")
    val secondaryCategoryId: kotlin.String? = null,
    /* This is the seller-defined SKU value of the product in the offer.<br/><br/><strong>Max Length</strong>: 50 <br/> */
    @Json(name = "sku")
    @Id
    var sku: kotlin.String? = null,
    /* The enumeration value in this field specifies the status of the offer - either <code>PUBLISHED</code> or <code>UNPUBLISHED</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:OfferStatusEnum'>eBay API documentation</a> */
    @Json(name = "status")
    val status: kotlin.String? = null,
    /* This container is returned if the seller chose to place the inventory item into one or two eBay store categories that the seller has set up for their eBay store. The string value(s) in this container will be the full path(s) to the eBay store categories, as shown below:<br> <pre><code>\"storeCategoryNames\": [<br/> \"/Fashion/Men/Shirts\", <br/> \"/Fashion/Men/Accessories\" ], </pre></code> */
    @Json(name = "storeCategoryNames")
    val storeCategoryNames: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "tax")
    var tax: Tax? = null
)

