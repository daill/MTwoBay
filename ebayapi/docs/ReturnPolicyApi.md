# ReturnPolicyApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReturnPolicy**](ReturnPolicyApi.md#createReturnPolicy) | **POST** /return_policy | 
[**deleteReturnPolicy**](ReturnPolicyApi.md#deleteReturnPolicy) | **DELETE** /return_policy/{return_policy_id} | 
[**getReturnPolicies**](ReturnPolicyApi.md#getReturnPolicies) | **GET** /return_policy | 
[**getReturnPolicy**](ReturnPolicyApi.md#getReturnPolicy) | **GET** /return_policy/{return_policy_id} | 
[**getReturnPolicyByName**](ReturnPolicyApi.md#getReturnPolicyByName) | **GET** /return_policy/get_by_policy_name | 
[**updateReturnPolicy**](ReturnPolicyApi.md#updateReturnPolicy) | **PUT** /return_policy/{return_policy_id} | 


<a name="createReturnPolicy"></a>
# **createReturnPolicy**
> SetReturnPolicyResponse createReturnPolicy(returnPolicyRequest)



This method creates a new return policy where the policy encapsulates seller&#39;s terms for returning items.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val returnPolicyRequest : ReturnPolicyRequest =  // ReturnPolicyRequest | Return policy request
try {
    val result : SetReturnPolicyResponse = apiInstance.createReturnPolicy(returnPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#createReturnPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#createReturnPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnPolicyRequest** | [**ReturnPolicyRequest**](ReturnPolicyRequest.md)| Return policy request |

### Return type

[**SetReturnPolicyResponse**](SetReturnPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReturnPolicy"></a>
# **deleteReturnPolicy**
> deleteReturnPolicy(returnPolicyId)



This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val returnPolicyId : kotlin.String = returnPolicyId_example // kotlin.String | This path parameter specifies the ID of the return policy you want to delete.
try {
    apiInstance.deleteReturnPolicy(returnPolicyId)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#deleteReturnPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#deleteReturnPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnPolicyId** | **kotlin.String**| This path parameter specifies the ID of the return policy you want to delete. |

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

<a name="getReturnPolicies"></a>
# **getReturnPolicies**
> ReturnPolicyResponse getReturnPolicies(marketplaceId)



This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
try {
    val result : ReturnPolicyResponse = apiInstance.getReturnPolicies(marketplaceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#getReturnPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#getReturnPolicies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |

### Return type

[**ReturnPolicyResponse**](ReturnPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnPolicy"></a>
# **getReturnPolicy**
> ReturnPolicy getReturnPolicy(returnPolicyId)



This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val returnPolicyId : kotlin.String = returnPolicyId_example // kotlin.String | This path parameter specifies the of the return policy you want to retrieve.
try {
    val result : ReturnPolicy = apiInstance.getReturnPolicy(returnPolicyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#getReturnPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#getReturnPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnPolicyId** | **kotlin.String**| This path parameter specifies the of the return policy you want to retrieve. |

### Return type

[**ReturnPolicy**](ReturnPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturnPolicyByName"></a>
# **getReturnPolicyByName**
> ReturnPolicy getReturnPolicyByName(marketplaceId, name)



This method retrieves the details of a specific return policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
val name : kotlin.String = name_example // kotlin.String | This query parameter specifies the seller-defined name of the return policy you want to retrieve.
try {
    val result : ReturnPolicy = apiInstance.getReturnPolicyByName(marketplaceId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#getReturnPolicyByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#getReturnPolicyByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |
 **name** | **kotlin.String**| This query parameter specifies the seller-defined name of the return policy you want to retrieve. |

### Return type

[**ReturnPolicy**](ReturnPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturnPolicy"></a>
# **updateReturnPolicy**
> SetReturnPolicyResponse updateReturnPolicy(returnPolicyId, returnPolicyRequest)



This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPolicyApi()
val returnPolicyId : kotlin.String = returnPolicyId_example // kotlin.String | This path parameter specifies the ID of the return policy you want to update.
val returnPolicyRequest : ReturnPolicyRequest =  // ReturnPolicyRequest | Container for a return policy request.
try {
    val result : SetReturnPolicyResponse = apiInstance.updateReturnPolicy(returnPolicyId, returnPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPolicyApi#updateReturnPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPolicyApi#updateReturnPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnPolicyId** | **kotlin.String**| This path parameter specifies the ID of the return policy you want to update. |
 **returnPolicyRequest** | [**ReturnPolicyRequest**](ReturnPolicyRequest.md)| Container for a return policy request. |

### Return type

[**SetReturnPolicyResponse**](SetReturnPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

