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

import org.openapitools.client.models.RateTableResponse

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

class RateTableApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://api.ebay.com/sell/account/v1")
        }
    }

    /**
    * 
    * This method retrieves a seller&#39;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&#39;s shipping rate tables.  &lt;br/&gt;&lt;br/&gt;The method&#39;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&#39;s domestic or international shipping options. &lt;br/&gt;&lt;br/&gt;This call currently supports getting rate tables related to the following marketplaces:&lt;ul&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_CA&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br/&gt;&lt;br/&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href&#x3D;\&quot;https://www.ebay.com/ship/rt \&quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
    * @param countryCode This query parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller&#39;s defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum (optional)
    * @return RateTableResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getRateTables(countryCode: kotlin.String?) : RateTableResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (countryCode != null) {
                    put("country_code", listOf(countryCode.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rate_table",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<RateTableResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RateTableResponse
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
