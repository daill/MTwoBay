# SalesTaxApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrReplaceSalesTax**](SalesTaxApi.md#createOrReplaceSalesTax) | **PUT** /sales_tax/{countryCode}/{jurisdictionId} | 
[**deleteSalesTax**](SalesTaxApi.md#deleteSalesTax) | **DELETE** /sales_tax/{countryCode}/{jurisdictionId} | 
[**getSalesTax**](SalesTaxApi.md#getSalesTax) | **GET** /sales_tax/{countryCode}/{jurisdictionId} | 
[**getSalesTaxes**](SalesTaxApi.md#getSalesTaxes) | **GET** /sales_tax | 


<a name="createOrReplaceSalesTax"></a>
# **createOrReplaceSalesTax**
> createOrReplaceSalesTax(countryCode, jurisdictionId, salesTaxBase)



This method creates or updates a sales tax table entry for a jurisdiction. Specify the tax table entry you want to configure using the two path parameters: &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt;.  &lt;br/&gt;&lt;br/&gt;A tax table entry for a jurisdiction is comprised of two fields: one for the jurisdiction&#39;s sales-tax rate and another that&#39;s a boolean value indicating whether or not shipping and handling are taxed in the jurisdiction.  &lt;br/&gt;&lt;br/&gt;You can set up &lt;i&gt;tax tables&lt;/i&gt; for countries that support different &lt;i&gt;tax jurisdictions&lt;/i&gt;. Currently, only Canada, India, and the US support separate tax jurisdictions. If you sell into any of these countries, you can set up tax tables for any of the country&#39;s jurisdictions. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API.  &lt;br/&gt;&lt;br/&gt;For details on using this call, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/tax-tables.html\&quot;&gt;Establishing sales-tax tables&lt;/a&gt;. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In the US, eBay now &#39;collects and remits&#39; sales tax for every US state except for Missouri (and a few US territories), so sellers can no longer configure sales tax rates for any states except Missouri. With eBay &#39;collect and remit&#39;, eBay calculates the sales tax, collects the sales tax from the buyer, and remits the sales tax to the tax authorities at the buyer&#39;s location.&lt;/span&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesTaxApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> code for the country for which you want to create a sales tax table entry.
val jurisdictionId : kotlin.String = jurisdictionId_example // kotlin.String | This path parameter specifies the ID of the tax jurisdiction for the table entry you want to create. Retrieve valid jurisdiction IDs using <b>getSalesTaxJurisdictions</b> in the Metadata API.
val salesTaxBase : SalesTaxBase =  // SalesTaxBase | A container that describes the how the sales tax is calculated.
try {
    apiInstance.createOrReplaceSalesTax(countryCode, jurisdictionId, salesTaxBase)
} catch (e: ClientException) {
    println("4xx response calling SalesTaxApi#createOrReplaceSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesTaxApi#createOrReplaceSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country for which you want to create a sales tax table entry. |
 **jurisdictionId** | **kotlin.String**| This path parameter specifies the ID of the tax jurisdiction for the table entry you want to create. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API. |
 **salesTaxBase** | [**SalesTaxBase**](SalesTaxBase.md)| A container that describes the how the sales tax is calculated. |

### Return type

null (empty response body)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteSalesTax"></a>
# **deleteSalesTax**
> deleteSalesTax(countryCode, jurisdictionId)



This call deletes a sales tax table entry for a jurisdiction. Specify the jurisdiction to delete using the &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt; path parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesTaxApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> code for the country whose sales tax table entry you want to delete.
val jurisdictionId : kotlin.String = jurisdictionId_example // kotlin.String | This path parameter specifies the ID of the sales tax jurisdiction whose table entry you want to delete. Retrieve valid jurisdiction IDs using <b>getSalesTaxJurisdictions</b> in the Metadata API.
try {
    apiInstance.deleteSalesTax(countryCode, jurisdictionId)
} catch (e: ClientException) {
    println("4xx response calling SalesTaxApi#deleteSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesTaxApi#deleteSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose sales tax table entry you want to delete. |
 **jurisdictionId** | **kotlin.String**| This path parameter specifies the ID of the sales tax jurisdiction whose table entry you want to delete. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API. |

### Return type

null (empty response body)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSalesTax"></a>
# **getSalesTax**
> SalesTax getSalesTax(countryCode, jurisdictionId)



This call gets the current sales tax table entry for a specific tax jurisdiction. Specify the jurisdiction to retrieve using the &lt;b&gt;countryCode&lt;/b&gt; and &lt;b&gt;jurisdictionId&lt;/b&gt; path parameters. All four response fields will be returned if a sales tax entry exists for the tax jurisdiction. Otherwise, the response will be returned as empty.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In most US states and territories, eBay now &#39;collects and remits&#39; sales tax, so sellers can no longer configure sales tax rates for these states/territories.&lt;/span&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesTaxApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> code for the country whose sales tax table you want to retrieve.
val jurisdictionId : kotlin.String = jurisdictionId_example // kotlin.String | This path parameter specifies the ID of the sales tax jurisdiction for the tax table entry you want to retrieve. Retrieve valid jurisdiction IDs using <b>getSalesTaxJurisdictions</b> in the Metadata API.
try {
    val result : SalesTax = apiInstance.getSalesTax(countryCode, jurisdictionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesTaxApi#getSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesTaxApi#getSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose sales tax table you want to retrieve. |
 **jurisdictionId** | **kotlin.String**| This path parameter specifies the ID of the sales tax jurisdiction for the tax table entry you want to retrieve. Retrieve valid jurisdiction IDs using &lt;b&gt;getSalesTaxJurisdictions&lt;/b&gt; in the Metadata API. |

### Return type

[**SalesTax**](SalesTax.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSalesTaxes"></a>
# **getSalesTaxes**
> SalesTaxes getSalesTaxes(countryCode)



Use this call to retrieve all sales tax table entries that the seller has defined for a specific country. All four response fields will be returned for each tax jurisdiction that matches the search criteria. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; In most US states and territories, eBay now &#39;collects and remits&#39; sales tax, so sellers can no longer configure sales tax rates for these states/territories.&lt;/span&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesTaxApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> code for the country whose tax table you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum
try {
    val result : SalesTaxes = apiInstance.getSalesTaxes(countryCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesTaxApi#getSalesTaxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesTaxApi#getSalesTaxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code for the country whose tax table you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum |

### Return type

[**SalesTaxes**](SalesTaxes.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

