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

import de.daill.model.ebay.BaseResponse
import de.daill.model.ebay.InventoryItemGroup
import de.daill.services.ebay.*
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EbayInventoryItemGroupApi() {
    val LOG = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var client: EbayApiClient

    /**
    * 
    * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;strong&gt;variantSKUs&lt;/strong&gt; array in the apiClient.request payload. &lt;br&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;strong&gt;getInventoryItemGroup&lt;/strong&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br/&gt;&lt;br/&gt; In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the qroup share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;strong&gt;variesBy.aspectsImageVariesBy&lt;/strong&gt; field&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the apiClient.request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-apiClient.request-components.html#HTTP\&quot;&gt;HTTP apiClient.request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;
    * @param contentLanguage This apiClient.request header sets the natural language that will be provided in the field values of the apiClient.request payload.
    * @param inventoryItemGroupKey Unique identifier of the inventory item group. This identifier is supplied by the seller. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to create/update is passed in at the end of the call URI. This value cannot be changed once it is set. 
    * @param body Details of the inventory Item Group 
    * @return BaseResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createOrReplaceInventoryItemGroup(contentLanguage: kotlin.String, inventoryItemGroupKey: kotlin.String, body: InventoryItemGroup) : BaseResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentLanguage.apply { localVariableHeaders["Content-Language"] = this.toString() }
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/inventory_item_group/{inventoryItemGroupKey}".replace("{"+"inventoryItemGroupKey"+"}", "$inventoryItemGroupKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = client.request<BaseResponse>(
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
    * This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.
    * @param inventoryItemGroupKey The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to delete is passed in at the end of the call URI. 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteInventoryItemGroup(inventoryItemGroupKey: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/inventory_item_group/{inventoryItemGroupKey}".replace("{"+"inventoryItemGroupKey"+"}", "$inventoryItemGroupKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = client.request<Any?>(
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
    * This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.
    * @param inventoryItemGroupKey The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to retrieve is passed in at the end of the call URI. 
    * @return InventoryItemGroup
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInventoryItemGroup(inventoryItemGroupKey: kotlin.String) : InventoryItemGroup {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/inventory_item_group/{inventoryItemGroupKey}".replace("{"+"inventoryItemGroupKey"+"}", "$inventoryItemGroupKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = client.request<InventoryItemGroup>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InventoryItemGroup
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
