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
 * This type is used by the base request payload of the <strong>getListingFees</strong> call.
 * @param offers This container is used to identify one or more (up to 250)unpublished offers for which expected listing fees will be retrieved. The user passes one or more <strong>offerId</strong> values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. <br/><br/> The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level.
 */

data class OfferKeysWithId (
    /* This container is used to identify one or more (up to 250)unpublished offers for which expected listing fees will be retrieved. The user passes one or more <strong>offerId</strong> values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. <br/><br/> The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level. */
    @Json(name = "offers")
    val offers: kotlin.collections.List<OfferKeyWithId>? = null
)

