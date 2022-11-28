# PrivilegeApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrivileges**](PrivilegeApi.md#getPrivileges) | **GET** /privilege | 


<a name="getPrivileges"></a>
# **getPrivileges**
> SellingPrivileges getPrivileges()



This method retrieves the seller&#39;s current set of privileges, including whether or not the seller&#39;s eBay registration has been completed, as well as the details of their site-wide &lt;b&gt;sellingLimt&lt;/b&gt; (the amount and quantity they can sell on a given day).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PrivilegeApi()
try {
    val result : SellingPrivileges = apiInstance.getPrivileges()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PrivilegeApi#getPrivileges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PrivilegeApi#getPrivileges")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SellingPrivileges**](SellingPrivileges.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

