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
package org.openapitools.client.models

import org.openapitools.client.models.Amount
import org.openapitools.client.models.RegionSet

import com.squareup.moshi.Json

/**
 * This type is used by the <b>shippingServices</b> array, an array that provides details about every domestic and international shipping service option that is defined for the policy.
 * @param additionalShippingCost 
 * @param buyerResponsibleForPickup This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false
 * @param buyerResponsibleForShipping This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false
 * @param cashOnDeliveryFee 
 * @param freeShipping This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set.
 * @param shippingCarrierCode This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set.
 * @param shippingCost 
 * @param shippingServiceCode This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set.
 * @param shipToLocations 
 * @param sortOrder The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service).
 * @param surcharge 
 */

data class ShippingService (
    @Json(name = "additionalShippingCost")
    val additionalShippingCost: Amount? = null,
    /* This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false */
    @Json(name = "buyerResponsibleForPickup")
    val buyerResponsibleForPickup: kotlin.Boolean? = null,
    /* This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false */
    @Json(name = "buyerResponsibleForShipping")
    val buyerResponsibleForShipping: kotlin.Boolean? = null,
    @Json(name = "cashOnDeliveryFee")
    val cashOnDeliveryFee: Amount? = null,
    /* This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set. */
    @Json(name = "freeShipping")
    val freeShipping: kotlin.Boolean? = null,
    /* This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set. */
    @Json(name = "shippingCarrierCode")
    val shippingCarrierCode: kotlin.String? = null,
    @Json(name = "shippingCost")
    val shippingCost: Amount? = null,
    /* This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set. */
    @Json(name = "shippingServiceCode")
    val shippingServiceCode: kotlin.String? = null,
    @Json(name = "shipToLocations")
    val shipToLocations: RegionSet? = null,
    /* The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service). */
    @Json(name = "sortOrder")
    val sortOrder: kotlin.Int? = null,
    @Json(name = "surcharge")
    val surcharge: Amount? = null
)

