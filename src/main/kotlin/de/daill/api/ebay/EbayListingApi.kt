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
package de.daill.api.ebay

import de.daill.model.ebay.BulkMigrateListing
import de.daill.model.ebay.BulkMigrateListingResponse
import de.daill.services.ebay.*
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EbayListingApi() {
    val LOG = LoggerFactory.getLogger(this::class.java)
    @Autowired
    lateinit var client: EbayApiClient

    /**
    * 
    * This call is used to convert existing eBay Listings to the corresponding Inventory API objects. If an eBay listing is successfully migrated to the Inventory API model, new Inventory Location, Inventory Item, and Offer objects are created. For a multiple-variation listing that is successfully migrated, in addition to the three new Inventory API objects just mentioned, an Inventory Item Group object will also be created. If the eBay listing is a motor vehicle part or accessory listing with a compatible vehicle list (&lt;strong&gt;ItemCompatibilityList&lt;/strong&gt; container in Trading API&#39;s Add/Revise/Relist/Verify calls), a Product Compatibility object will be created.&lt;br/&gt;&lt;br/&gt;&lt;h3&gt;Migration Requirements&lt;/h3&gt;&lt;br/&gt;To be eligible for migration, the active eBay listings must meet the following requirements:&lt;ul&gt;&lt;li&gt;Listing type is Fixed-Price&lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Auction listings are supported by the Inventory API, but the &lt;b&gt;bulkMigrateListing&lt;/b&gt; method cannot be used to migrate auction listings.&lt;/span&gt;&lt;/p&gt;&lt;/li&gt;&lt;li&gt;The item(s) in the listings must have seller-defined SKU values associated with them, and in the case of a multiple-variation listing, each product variation must also have its own SKU value&lt;/li&gt;&lt;li&gt;Business Polices (Payment, Return Policy, and Shipping) must be used on the listing, as legacy payment, return policy, and shipping fields will not be accepted. With the Payment Policy associated with a listing, the immediate payment requirement must be enabled.&lt;/li&gt;&lt;li&gt;The postal/zip code (&lt;strong&gt;PostalCode&lt;/strong&gt; field in Trading&#39;s &lt;strong&gt;ItemType&lt;/strong&gt;) or city (&lt;strong&gt;Location&lt;/strong&gt; field in Trading&#39;s &lt;strong&gt;ItemType&lt;/strong&gt;) must be set in the listing; the country is also needed, but this value is required in Trading API, so it will always be set for every listing&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;h3&gt;Unsupported Listing Features&lt;/h3&gt;&lt;br/&gt;The following features are not yet available to be set or modified through the Inventory API, but they will remain on the active eBay listing, even after a successful migration to the Inventory model. The downside to this is that the seller will be completely blocked (in APIs or My eBay) from revising these features/settings once the migration takes place:&lt;ul&gt;&lt;li&gt;Any listing-level Buyer Requirements&lt;/li&gt;&lt;li&gt;Listing enhancements like a bold listing title or Gallery Plus&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;h3&gt;Making the Call&lt;/h3&gt;&lt;br/&gt;In the apiClient.request payload of the &lt;strong&gt;bulkMigrateListings&lt;/strong&gt; call, the seller will pass in an array of one to five eBay listing IDs (aka Item IDs). To save time and hassle, that seller should do a pre-check on each listing to make sure those listings meet the requirements to be migrated to the new Inventory model. There are no path or query parameters for this call.&lt;br/&gt;&lt;br/&gt;&lt;h3&gt;Call Response&lt;/h3&gt;&lt;br/&gt;If an eBay listing is migrated successfully to the new Inventory model, the following will occur:&lt;ul&gt;&lt;li&gt;An Inventory Item object will be created for the item(s) in the listing, and this object will be accessible through the Inventory API&lt;/li&gt;&lt;li&gt;An Offer object will be created for the listing, and this object will be accessible through the Inventory API&lt;/li&gt;&lt;li&gt;An Inventory Location object will be created and associated with the Offer object, as an Inventory Location must be associated with a published Offer&lt;/li&gt;&lt;/ul&gt;The response payload of the Bulk Migrate Listings call will show the results of each listing migration. These results include an HTTP status code to indicate the success or failure of each listing migration, the SKU value associated with each item, and if the migration is successful, an Offer ID value. The SKU value will be used in the Inventory API to manage the Inventory Item object, and the Offer ID value will be used in the Inventory API to manage the Offer object. Errors and/or warnings containers will be returned for each listing where an error and/or warning occurred with the attempted migration.&lt;br/&gt;&lt;br/&gt;If a multiple-variation listing is successfully migrated, along with the Offer and Inventory Location objects, an Inventory Item object will be created for each product variation within the listing, and an Inventory Item Group object will also be created, grouping those variations together in the Inventory API platform. For a motor vehicle part or accessory listing that has a specified list of compatible vehicles, in addition to the Inventory Item, Inventory Location, and Offer objects that are created, a Product Compatibility object will also be created in the Inventory API platform.
    * @param body Details of the listings that needs to be migrated into Inventory 
    * @return BulkMigrateListingResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkMigrateListing(body: BulkMigrateListing) : BulkMigrateListingResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bulk_migrate_listing",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = client.request<BulkMigrateListingResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BulkMigrateListingResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
