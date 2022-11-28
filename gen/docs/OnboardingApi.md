# OnboardingApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentsProgramOnboarding**](OnboardingApi.md#getPaymentsProgramOnboarding) | **GET** /payments_program/{marketplace_id}/{payments_program_type}/onboarding | 


<a name="getPaymentsProgramOnboarding"></a>
# **getPaymentsProgramOnboarding**
> PaymentsProgramOnboardingResponse getPaymentsProgramOnboarding(marketplaceId, paymentsProgramType)



&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OnboardingApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | The eBay marketplace ID associated with the onboarding status to retrieve.
val paymentsProgramType : kotlin.String = paymentsProgramType_example // kotlin.String | The type of payments program whose status is returned by the method.
try {
    val result : PaymentsProgramOnboardingResponse = apiInstance.getPaymentsProgramOnboarding(marketplaceId, paymentsProgramType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OnboardingApi#getPaymentsProgramOnboarding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OnboardingApi#getPaymentsProgramOnboarding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| The eBay marketplace ID associated with the onboarding status to retrieve. |
 **paymentsProgramType** | **kotlin.String**| The type of payments program whose status is returned by the method. |

### Return type

[**PaymentsProgramOnboardingResponse**](PaymentsProgramOnboardingResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

