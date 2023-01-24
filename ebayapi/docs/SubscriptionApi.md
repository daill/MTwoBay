# SubscriptionApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscription**](SubscriptionApi.md#getSubscription) | **GET** /subscription | 


<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionResponse getSubscription(limit, continuationToken)



This method retrieves a list of subscriptions associated with the seller account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionApi()
val limit : kotlin.String = limit_example // kotlin.String | This field is for future use.
val continuationToken : kotlin.String = continuationToken_example // kotlin.String | This field is for future use.
try {
    val result : SubscriptionResponse = apiInstance.getSubscription(limit, continuationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionApi#getSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionApi#getSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.String**| This field is for future use. | [optional]
 **continuationToken** | **kotlin.String**| This field is for future use. | [optional]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

