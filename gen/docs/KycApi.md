# KycApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getKYC**](KycApi.md#getKYC) | **GET** /kyc | 


<a name="getKYC"></a>
# **getKYC**
> KycResponse getKYC()



&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This method was originally created to see which onboarding requirements were still pending for sellers being onboarded for eBay managed payments, but now that all seller accounts are onboarded globally, this method should now just returne an empty payload with a &lt;code&gt;204 No Content&lt;/code&gt; HTTP status code. &lt;/span&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KycApi()
try {
    val result : KycResponse = apiInstance.getKYC()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KycApi#getKYC")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KycApi#getKYC")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**KycResponse**](KycResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

