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

import com.squareup.moshi.Json

/**
 * This type is used to display the result for each offer and/or inventory item that the seller attempted to update with a <strong>bulkUpdatePriceQuantity</strong> call. If any errors or warnings occur, the error/warning data is returned at the offer/inventory item level.
 * @param errors This array will be returned if there were one or more errors associated with the update to the offer or inventory item record.
 * @param offerId The unique identifier of the offer that was updated. This field will not be returned in situations where the seller is only updating the total 'ship-to-home' quantity of an inventory item record.
 * @param sku This is the seller-defined SKU value of the product. This field is returned whether the seller attempted to update an offer with the SKU value or just attempted to update the total 'ship-to-home' quantity of an inventory item record.<br/><br/><strong>Max Length</strong>: 50<br/>
 * @param statusCode The value returned in this container will indicate the status of the attempt to update the price and/or quantity of the offer (specified in the corresponding <strong>offerId</strong> field) or the attempt to update the total 'ship-to-home' quantity of an inventory item (specified in the corresponding <strong>sku</strong> field). For a completely successful update of an offer or inventory item record, a value of <code>200</code> will appear in this field.  A user can view the <strong>HTTP status codes</strong> section for information on other status codes that may be returned with the <strong>bulkUpdatePriceQuantity</strong> method.
 * @param warnings This array will be returned if there were one or more warnings associated with the update to the offer or inventory item record.
 */

data class PriceQuantityResponse (
    /* This array will be returned if there were one or more errors associated with the update to the offer or inventory item record. */
    @Json(name = "errors")
    val errors: kotlin.collections.List<Error>? = null,
    /* The unique identifier of the offer that was updated. This field will not be returned in situations where the seller is only updating the total 'ship-to-home' quantity of an inventory item record. */
    @Json(name = "offerId")
    val offerId: kotlin.String? = null,
    /* This is the seller-defined SKU value of the product. This field is returned whether the seller attempted to update an offer with the SKU value or just attempted to update the total 'ship-to-home' quantity of an inventory item record.<br/><br/><strong>Max Length</strong>: 50<br/> */
    @Json(name = "sku")
    val sku: kotlin.String? = null,
    /* The value returned in this container will indicate the status of the attempt to update the price and/or quantity of the offer (specified in the corresponding <strong>offerId</strong> field) or the attempt to update the total 'ship-to-home' quantity of an inventory item (specified in the corresponding <strong>sku</strong> field). For a completely successful update of an offer or inventory item record, a value of <code>200</code> will appear in this field.  A user can view the <strong>HTTP status codes</strong> section for information on other status codes that may be returned with the <strong>bulkUpdatePriceQuantity</strong> method. */
    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null,
    /* This array will be returned if there were one or more warnings associated with the update to the offer or inventory item record. */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<Error>? = null
)

