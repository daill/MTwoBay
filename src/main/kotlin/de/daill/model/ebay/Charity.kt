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
import org.springframework.data.mongodb.core.mapping.Document

/**
 * This type is used to identify the charitable organization associated with the listing, and the percentage of the sale proceeds that the charitable organization will receive for each sale generated by the listing. <br/><br/>In order to receive a percentage of the sales proceeds, the charitable organization must be registered with the PayPal Giving Fund, which is a partner of eBay for Charity.
 * @param charityId The eBay-assigned unique identifier of the charitable organization that will receive a percentage of the sales proceeds. The charitable organization must be reqistered with the PayPal Giving Fund in order to receive sales proceeds through eBay listings.<br/><br/>This field is conditionally required if a seller is planning on donating a percentage of the sale proceeds to a charitable organization.<br><br>The eBay-assigned unique identifier of a charitable organization can be found using the <strong>GetCharities</strong> call of the Trading API. In the <strong>GetCharities</strong> call response, this unique identifier is shown in the <strong>id</strong> attribute of the <strong>Charity</strong> container.
 * @param donationPercentage This field is the percentage of the purchase price that the charitable organization (identified in the <strong>charityId</strong> field) will receive for each sale that the listing generates. This field is conditionally required if a seller is planning on donating a percentage of the sale proceeds to a charitable organization. This numeric value can range from 10 to 100, and in any 5 (percent) increments in between this range (e.g. <code>10</code>, <code>15</code>, <code>20</code>...<code>95</code>,... <code>100</code>). The seller would pass in <code>10</code> for 10 percent, <code>15</code> for 15 percent, <code>20</code> for 20 percent, and so on, all the way to <code>100</code> for 100 percent.
 */
@Document
data class Charity (
    /* The eBay-assigned unique identifier of the charitable organization that will receive a percentage of the sales proceeds. The charitable organization must be reqistered with the PayPal Giving Fund in order to receive sales proceeds through eBay listings.<br/><br/>This field is conditionally required if a seller is planning on donating a percentage of the sale proceeds to a charitable organization.<br><br>The eBay-assigned unique identifier of a charitable organization can be found using the <strong>GetCharities</strong> call of the Trading API. In the <strong>GetCharities</strong> call response, this unique identifier is shown in the <strong>id</strong> attribute of the <strong>Charity</strong> container. */
    @Json(name = "charityId")
    val charityId: kotlin.String? = null,
    /* This field is the percentage of the purchase price that the charitable organization (identified in the <strong>charityId</strong> field) will receive for each sale that the listing generates. This field is conditionally required if a seller is planning on donating a percentage of the sale proceeds to a charitable organization. This numeric value can range from 10 to 100, and in any 5 (percent) increments in between this range (e.g. <code>10</code>, <code>15</code>, <code>20</code>...<code>95</code>,... <code>100</code>). The seller would pass in <code>10</code> for 10 percent, <code>15</code> for 15 percent, <code>20</code> for 20 percent, and so on, all the way to <code>100</code> for 100 percent. */
    @Json(name = "donationPercentage")
    val donationPercentage: kotlin.String? = null
)

