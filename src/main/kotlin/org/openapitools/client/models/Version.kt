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


import com.squareup.moshi.Json

/**
 * This type is used to show the version number and instance of the service or API.
 * @param instance 
 * @param version The version number of the service or API.
 */

data class Version (
    @Json(name = "instance")
    val instance: Version? = null,
    /* The version number of the service or API. */
    @Json(name = "version")
    val version: kotlin.String? = null
)

