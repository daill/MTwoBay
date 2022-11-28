# PaymentPolicyApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentPolicy**](PaymentPolicyApi.md#createPaymentPolicy) | **POST** /payment_policy | 
[**deletePaymentPolicy**](PaymentPolicyApi.md#deletePaymentPolicy) | **DELETE** /payment_policy/{payment_policy_id} | 
[**getPaymentPolicies**](PaymentPolicyApi.md#getPaymentPolicies) | **GET** /payment_policy | 
[**getPaymentPolicy**](PaymentPolicyApi.md#getPaymentPolicy) | **GET** /payment_policy/{payment_policy_id} | 
[**getPaymentPolicyByName**](PaymentPolicyApi.md#getPaymentPolicyByName) | **GET** /payment_policy/get_by_policy_name | 
[**updatePaymentPolicy**](PaymentPolicyApi.md#updatePaymentPolicy) | **PUT** /payment_policy/{payment_policy_id} | 


<a name="createPaymentPolicy"></a>
# **createPaymentPolicy**
> SetPaymentPolicyResponse createPaymentPolicy(paymentPolicyRequest)



This method creates a new payment policy where the policy encapsulates seller&#39;s terms for order payments.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val paymentPolicyRequest : PaymentPolicyRequest =  // PaymentPolicyRequest | Payment policy request
try {
    val result : SetPaymentPolicyResponse = apiInstance.createPaymentPolicy(paymentPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#createPaymentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#createPaymentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPolicyRequest** | [**PaymentPolicyRequest**](PaymentPolicyRequest.md)| Payment policy request |

### Return type

[**SetPaymentPolicyResponse**](SetPaymentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentPolicy"></a>
# **deletePaymentPolicy**
> deletePaymentPolicy(paymentPolicyId)



This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val paymentPolicyId : kotlin.String = paymentPolicyId_example // kotlin.String | This path parameter specifies the ID of the payment policy you want to delete.
try {
    apiInstance.deletePaymentPolicy(paymentPolicyId)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#deletePaymentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#deletePaymentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the payment policy you want to delete. |

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

<a name="getPaymentPolicies"></a>
# **getPaymentPolicies**
> PaymentPolicyResponse getPaymentPolicies(marketplaceId)



This method retrieves all the payment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
try {
    val result : PaymentPolicyResponse = apiInstance.getPaymentPolicies(marketplaceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#getPaymentPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#getPaymentPolicies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |

### Return type

[**PaymentPolicyResponse**](PaymentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentPolicy"></a>
# **getPaymentPolicy**
> PaymentPolicy getPaymentPolicy(paymentPolicyId)



This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val paymentPolicyId : kotlin.String = paymentPolicyId_example // kotlin.String | This path parameter specifies the ID of the payment policy you want to retrieve.
try {
    val result : PaymentPolicy = apiInstance.getPaymentPolicy(paymentPolicyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#getPaymentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#getPaymentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the payment policy you want to retrieve. |

### Return type

[**PaymentPolicy**](PaymentPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentPolicyByName"></a>
# **getPaymentPolicyByName**
> PaymentPolicy getPaymentPolicyByName(marketplaceId, name)



This method retrieves the details of a specific payment policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
val name : kotlin.String = name_example // kotlin.String | This query parameter specifies the seller-defined name of the payment policy you want to retrieve.
try {
    val result : PaymentPolicy = apiInstance.getPaymentPolicyByName(marketplaceId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#getPaymentPolicyByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#getPaymentPolicyByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |
 **name** | **kotlin.String**| This query parameter specifies the seller-defined name of the payment policy you want to retrieve. |

### Return type

[**PaymentPolicy**](PaymentPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentPolicy"></a>
# **updatePaymentPolicy**
> SetPaymentPolicyResponse updatePaymentPolicy(paymentPolicyId, paymentPolicyRequest)



This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentPolicyApi()
val paymentPolicyId : kotlin.String = paymentPolicyId_example // kotlin.String | This path parameter specifies the ID of the payment policy you want to update.
val paymentPolicyRequest : PaymentPolicyRequest =  // PaymentPolicyRequest | Payment policy request
try {
    val result : SetPaymentPolicyResponse = apiInstance.updatePaymentPolicy(paymentPolicyId, paymentPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentPolicyApi#updatePaymentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentPolicyApi#updatePaymentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the payment policy you want to update. |
 **paymentPolicyRequest** | [**PaymentPolicyRequest**](PaymentPolicyRequest.md)| Payment policy request |

### Return type

[**SetPaymentPolicyResponse**](SetPaymentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

