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

import org.openapitools.client.models.MigrateListing

import com.squareup.moshi.Json

/**
 * This type is used by the base container of the <strong>bulkMigrateListings</strong> request payload.
 * @param requests This is the base container of the <strong>bulkMigrateListings</strong> request payload. One to five eBay listings will be included under this container.
 */

data class BulkMigrateListing (
    /* This is the base container of the <strong>bulkMigrateListings</strong> request payload. One to five eBay listings will be included under this container. */
    @Json(name = "requests")
    val requests: kotlin.collections.List<MigrateListing>? = null
)

