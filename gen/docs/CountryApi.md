# CountryApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSalesTaxJurisdictions**](CountryApi.md#getSalesTaxJurisdictions) | **GET** /country/{countryCode}/sales_tax_jurisdiction | 


<a name="getSalesTaxJurisdictions"></a>
# **getSalesTaxJurisdictions**
> SalesTaxJurisdictions getSalesTaxJurisdictions(countryCode)



This method retrieves all the sales tax jurisdictions for the country that you specify in the &lt;b&gt;countryCode&lt;/b&gt; path parameter. Countries with valid sales tax jurisdictions are Canada and the US.  &lt;br/&gt;&lt;br/&gt;The response from this call tells you the jurisdictions for which a seller can configure tax tables. Although setting up tax tables is optional, you can use the &lt;b&gt;createOrReplaceSalesTax&lt;/b&gt; in the &lt;b&gt;Account API&lt;/b&gt; call to configure the tax tables for the jurisdictions you sell to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CountryApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> country code for the country whose jurisdictions you want to retrieve. eBay provides sales tax jurisdiction information for Canada and the United States.Valid values for this path parameter are <code>CA</code> and <code>US</code>.
try {
    val result : SalesTaxJurisdictions = apiInstance.getSalesTaxJurisdictions(countryCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CountryApi#getSalesTaxJurisdictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CountryApi#getSalesTaxJurisdictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; country code for the country whose jurisdictions you want to retrieve. eBay provides sales tax jurisdiction information for Canada and the United States.Valid values for this path parameter are &lt;code&gt;CA&lt;/code&gt; and &lt;code&gt;US&lt;/code&gt;. |

### Return type

[**SalesTaxJurisdictions**](SalesTaxJurisdictions.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

