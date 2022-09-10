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
package org.openapitools.client.apis

import org.openapitools.client.models.BaseResponse
import org.openapitools.client.models.BulkGetInventoryItem
import org.openapitools.client.models.BulkGetInventoryItemResponse
import org.openapitools.client.models.BulkInventoryItem
import org.openapitools.client.models.BulkInventoryItemResponse
import org.openapitools.client.models.BulkPriceQuantity
import org.openapitools.client.models.BulkPriceQuantityResponse
import org.openapitools.client.models.InventoryItem
import org.openapitools.client.models.InventoryItemWithSkuLocaleGroupid
import org.openapitools.client.models.InventoryItems

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class InventoryItemApi(basePath: String = defaultBasePath, token: String) : ApiClient(basePath, token) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://api.ebay.com/sell/inventory/v1")
        }

    }

    /**
    * 
    * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This call can be used to create and/or update up to 25 new inventory item records. It is up to sellers whether they want to create a complete inventory item records right from the start, or sellers can provide only some information with the initial &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for the inventory item records and prepare for publishing. Upon first creating inventory item records, only the SKU values are required. &lt;br/&gt;&lt;br/&gt; In the case of updating existing inventory item records, the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item records, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &#39;Get&#39; call to retrieve the full details of the inventory item records and see all of its current values/settings before attempting to update the records. Any changes that are made to inventory item records that are part of one or more active eBay listings, a successful call will automatically update these active listings. &lt;br/&gt;&lt;br/&gt; The key information that is set with the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;Seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. &lt;/li&gt; &lt;li&gt;Condition of the item&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;Quantity of the inventory item that is available for purchase&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update a single inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; method can be used.&lt;/p&gt;
    * @param body Details of the inventories with sku and locale 
    * @return BulkInventoryItemResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkCreateOrReplaceInventoryItem(body: BulkInventoryItem) : BulkInventoryItemResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bulk_create_or_replace_inventory_item",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<BulkInventoryItemResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BulkInventoryItemResponse
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

    /**
    * 
    * This call retrieves up to 25 inventory item records. The SKU value of each inventory item record to retrieve is specified in the request payload. &lt;br/&gt;&lt;br/&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br/&gt;&lt;br/&gt;For those who prefer to retrieve only one inventory item record by SKU value, , the &lt;strong&gt;getInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&#39;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
    * @param body Details of the inventories with sku and locale 
    * @return BulkGetInventoryItemResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkGetInventoryItem(body: BulkGetInventoryItem) : BulkGetInventoryItemResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bulk_get_inventory_item",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<BulkGetInventoryItemResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BulkGetInventoryItemResponse
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

    /**
    * 
    * This call is used by the seller to update the total ship-to-home quantity of one inventory item, and/or to update the price and/or quantity of one or more offers associated with one inventory item. Up to 25 offers associated with an inventory item may be updated with one &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. Only one SKU (one product) can be updated per call.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;The &lt;strong&gt;getOffers&lt;/strong&gt; call can be used to retrieve all offers associated with a SKU. The seller will just pass in the correct SKU value through the &lt;strong&gt;sku&lt;/strong&gt; query parameter. To update an offer, the &lt;strong&gt;offerId&lt;/strong&gt; value is required, and this value is returned in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. It is also useful to know which offers are unpublished and which ones are published. To get this status, look for the &lt;strong&gt;status&lt;/strong&gt; value in the &lt;strong&gt;getOffers&lt;/strong&gt; call response. Offers in the published state are live eBay listings, and these listings will be revised with a successful &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call.&lt;br /&gt;&lt;br /&gt;An issue will occur if duplicate &lt;strong&gt;offerId&lt;/strong&gt; values are passed through the same &lt;strong&gt;offers&lt;/strong&gt; container, or if one or more of the specified offers are associated with different products/SKUs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For multiple-variation listings, it is recommended that the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call be used to update price and quantity information for each SKU within that multiple-variation listing instead of using &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to update the price and quantity for each SKU. Just remember that only one SKU (one product variation) can be updated per call.&lt;/span&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
    * @param body Price and allocation details for the given SKU and Marketplace 
    * @return BulkPriceQuantityResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkUpdatePriceQuantity(body: BulkPriceQuantity) : BulkPriceQuantityResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bulk_update_price_quantity",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<BulkPriceQuantityResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BulkPriceQuantityResponse
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

    /**
    * 
    * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This call creates a new inventory item record or replaces an existing inventory item record. It is up to sellers whether they want to create a complete inventory item record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; calls to complete all required fields for  the inventory item record and prepare it for publishing. Upon first creating an inventory item record, only the SKU value in the call path is required. &lt;br/&gt;&lt;br/&gt; In the case of replacing an existing inventory item record, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call will do a complete replacement of the existing inventory item record, so all fields that are currently defined for the inventory item record are required in that update action, regardless of whether their values changed. So, when replacing/updating an inventory item record, it is advised that the seller run a &lt;strong&gt;getInventoryItem&lt;/strong&gt; call to retrieve the full inventory item record and see all of its current values/settings before attempting to update the record. And if changes are made to an inventory item that is part of one or more active eBay listings, a successful call will automatically update these eBay listings. &lt;br/&gt;&lt;br/&gt; The key information that is set with the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call include: &lt;ul&gt; &lt;li&gt;Seller-defined SKU value for the product. Each seller product, including products within an item inventory group, must have their own SKU value. This SKU value is passed in at the end of the call URI&lt;/li&gt; &lt;li&gt;Condition of the item&lt;/li&gt; &lt;li&gt;Product details, including any product identifier(s), such as a UPC, ISBN, EAN, or Brand/Manufacturer Part Number pair, a product description, a product title, product/item aspects, and links to images. eBay will use any supplied eBay Product ID (ePID) or a GTIN (UPC, ISBN, or EAN) and attempt to match those identifiers to a product in the eBay Catalog, and if a product match is found, the product details for the inventory item will automatically be populated.&lt;/li&gt; &lt;li&gt;Quantity of the inventory item that is available for purchase&lt;/li&gt; &lt;li&gt;Package weight and dimensions, which is required if the seller will be offering calculated shipping options. The package weight will also be required if the seller will be providing flat-rate shipping services, but charging a weight surcharge.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create or update numerous inventory item records with one call (up to 25 at a time), the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; method can be used.&lt;/p&gt;
    * @param contentLanguage This request header sets the natural language that will be provided in the field values of the request payload. 
    * @param sku The seller-defined SKU value for the inventory item is required whether the seller is creating a new inventory item, or updating an existing inventory item. This SKU value is passed in at the end of the call URI. SKU values must be unique across the seller&#39;s inventory. &lt;br/&gt;&lt;br/&gt; &lt;strong&gt;Max length&lt;/strong&gt;: 50. 
    * @param body Details of the inventory item record. 
    * @return BaseResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createOrReplaceInventoryItem(contentLanguage: kotlin.String, sku: kotlin.String, body: InventoryItem) : BaseResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentLanguage?.apply { localVariableHeaders["Content-Language"] = this.toString() }
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/inventory_item/{sku}".replace("{"+"sku"+"}", "$sku"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<BaseResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BaseResponse
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

    /**
    * 
    * This call is used to delete an inventory item record associated with a specified SKU. A successful call will not only delete that inventory item record, but will also have the following effects:&lt;ul&gt;&lt;li&gt;Delete any and all unpublished offers associated with that SKU;&lt;/li&gt;&lt;li&gt;Delete any and all single-variation eBay listings associated with that SKU;&lt;/li&gt;&lt;li&gt;Automatically remove that SKU from a multiple-variation listing and remove that SKU from any and all inventory item groups in which that SKU was a member.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
    * @param sku This is the seller-defined SKU value of the product whose inventory item record you wish to delete.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 50. 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteInventoryItem(sku: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/inventory_item/{sku}".replace("{"+"sku"+"}", "$sku"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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

    /**
    * 
    * This call retrieves the inventory item record for a given SKU. The SKU value is passed in at the end of the call URI. There is no request payload for this call.&lt;br/&gt;&lt;br/&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br/&gt;&lt;br/&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used. To retrieve all inventory item records defined on the seller&#39;s account, the &lt;strong&gt;getInventoryItems&lt;/strong&gt; method can be used (with pagination control if desired).
    * @param sku This is the seller-defined SKU value of the product whose inventory item record you wish to retrieve.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max length&lt;/strong&gt;: 50. 
    * @return InventoryItemWithSkuLocaleGroupid
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInventoryItem(sku: kotlin.String) : InventoryItemWithSkuLocaleGroupid {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/inventory_item/{sku}".replace("{"+"sku"+"}", "$sku"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<InventoryItemWithSkuLocaleGroupid>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InventoryItemWithSkuLocaleGroupid
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

    /**
    * 
    * This call retrieves all inventory item records defined for the seller&#39;s account. The &lt;strong&gt;limit&lt;/strong&gt; query parameter allows the seller to control how many records are returned per page, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter is used to retrieve a specific page of records. The seller can make multiple calls to scan through multiple pages of records. There is no request payload for this call.&lt;br/&gt;&lt;br/&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call, and it is required for all Inventory API calls. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;br/&gt;&lt;br/&gt;For those who prefer to retrieve numerous inventory item records by SKU value with one call (up to 25 at a time), the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method can be used.
    * @param limit The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be an integer  from &lt;code&gt;1&lt;/code&gt; to &lt;code&gt;100&lt;/code&gt;. If this query parameter is not set, up to 100 records will be returned on each page of results.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Min&lt;/strong&gt;: 1, &lt;strong&gt;Max&lt;/strong&gt;: 100  (optional)
    * @param offset The value passed in this query parameter sets the page number to retrieve. The first page of records has a value of &lt;code&gt;0&lt;/code&gt;, the second page of records has a value of &lt;code&gt;1&lt;/code&gt;, and so on. If this query parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt;, and the first page of records is returned.  (optional)
    * @return InventoryItems
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInventoryItems(limit: kotlin.String?, offset: kotlin.String?) : InventoryItems {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (offset != null) {
                    put("offset", listOf(offset.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/inventory_item",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<InventoryItems>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InventoryItems
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
