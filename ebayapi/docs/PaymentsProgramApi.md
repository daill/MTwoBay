# PaymentsProgramApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentsProgram**](PaymentsProgramApi.md#getPaymentsProgram) | **GET** /payments_program/{marketplace_id}/{payments_program_type} | 


<a name="getPaymentsProgram"></a>
# **getPaymentsProgram**
> PaymentsProgramResponse getPaymentsProgram(marketplaceId, paymentsProgramType)



&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method returns whether or not the user is opted-in to the specified payments program. Sellers opt-in to payments programs by marketplace and you use the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter to specify the marketplace of the status flag you want returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsProgramApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller's status.
val paymentsProgramType : kotlin.String = paymentsProgramType_example // kotlin.String | This path parameter specifies the payments program whose status is returned by the call.
try {
    val result : PaymentsProgramResponse = apiInstance.getPaymentsProgram(marketplaceId, paymentsProgramType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsProgramApi#getPaymentsProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsProgramApi#getPaymentsProgram")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller&#39;s status. |
 **paymentsProgramType** | **kotlin.String**| This path parameter specifies the payments program whose status is returned by the call. |

### Return type

[**PaymentsProgramResponse**](PaymentsProgramResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

