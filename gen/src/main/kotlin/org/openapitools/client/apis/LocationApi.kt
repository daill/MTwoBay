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
package org.openapitools.client.apis

import org.openapitools.client.models.InventoryLocation
import org.openapitools.client.models.InventoryLocationFull
import org.openapitools.client.models.InventoryLocationResponse
import org.openapitools.client.models.LocationResponse

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

class LocationApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://api.ebay.com/sell/account/v1")
        }
    }

    /**
    * 
    * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one inventory location, as every offer must be associated with a location.&lt;/p&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the inventory location to perform an action against.&lt;/p&gt;&lt;p&gt;At this time, location types are either warehouse or store. Warehouse locations are used for traditional shipping, and store locations are generally used by US merchants selling products through the In-Store Pickup program, or used by UK, Australian, and German merchants selling products through the Click and Collect program. A full address is required for store inventory locations. However, for warehouse inventory locations, a full street address is not needed, but the city, state/province, and country of the location must be provided. &lt;/p&gt;&lt;p&gt;Note that all inventory locations are \&quot;enabled\&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&#39;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br/&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;/p&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique, merchant-defined key (ID) for an inventory location. This unique identifier, or key, is used in other Inventory API calls to identify an inventory location. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @param inventoryLocationFull Inventory Location details 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createInventoryLocation(merchantLocationKey: kotlin.String, inventoryLocationFull: InventoryLocationFull) : Unit {
        val localVariableBody: kotlin.Any? = inventoryLocationFull
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/location/{merchantLocationKey}".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
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
    * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the inventory location once it is deleted.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to indicate the inventory location to be deleted. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteInventoryLocation(merchantLocationKey: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/location/{merchantLocationKey}".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
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
    * &lt;p&gt;This call disables the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Sellers can not load/modify inventory to disabled inventory locations. Note that disabling an inventory location will not affect any active eBay listings associated with the disabled location, but the seller will not be able modify the offers associated with a disabled inventory location.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to disable the specified inventory location. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @return kotlin.Any
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun disableInventoryLocation(merchantLocationKey: kotlin.String) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/location/{merchantLocationKey}/disable".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
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
    * &lt;p&gt;This call enables a disabled inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Once a disabled inventory location is enabled, sellers can start loading/modifying inventory to that inventory location. &lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to specify the disabled inventory location to enable. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @return kotlin.Any
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun enableInventoryLocation(merchantLocationKey: kotlin.String) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/location/{merchantLocationKey}/enable".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
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
    * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to specify the inventory location to retrieve. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @return InventoryLocationResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInventoryLocation(merchantLocationKey: kotlin.String) : InventoryLocationResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/location/{merchantLocationKey}".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<InventoryLocationResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InventoryLocationResponse
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
    * This call retrieves all defined details for every inventory location associated with the seller&#39;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of inventory locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
    * @param limit The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results. &lt;br/&gt;&lt;br/&gt; &lt;strong&gt;Min&lt;/strong&gt;: 1 (optional)
    * @param offset Specifies the number of locations to skip in the result set before returning the first location in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; (optional)
    * @return LocationResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInventoryLocations(limit: kotlin.String?, offset: kotlin.String?) : LocationResponse {
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
            "/location",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<LocationResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LocationResponse
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
    * &lt;p&gt;Use this call to update non-physical location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;br/&gt;&lt;br/&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt;. Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields. For store inventory locations, the operating hours and/or the special hours can also be updated. &lt;br/&gt;&lt;br/&gt; The merchant location key, the physical location of the store, and its geo-location coordinates can not be updated with an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call &lt;/p&gt;&lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br/&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
    * @param merchantLocationKey A unique merchant-defined key (ID) for an inventory location. This value is passed in the call URI to indicate the inventory location to be updated. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 
    * @param inventoryLocation The inventory location details to be updated (other than the address and geo co-ordinates). 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateInventoryLocation(merchantLocationKey: kotlin.String, inventoryLocation: InventoryLocation) : Unit {
        val localVariableBody: kotlin.Any? = inventoryLocation
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/location/{merchantLocationKey}/update_location_details".replace("{"+"merchantLocationKey"+"}", "$merchantLocationKey"),
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

}
