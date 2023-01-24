# FulfillmentPolicyApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFulfillmentPolicy**](FulfillmentPolicyApi.md#createFulfillmentPolicy) | **POST** /fulfillment_policy/ | 
[**deleteFulfillmentPolicy**](FulfillmentPolicyApi.md#deleteFulfillmentPolicy) | **DELETE** /fulfillment_policy/{fulfillmentPolicyId} | 
[**getFulfillmentPolicies**](FulfillmentPolicyApi.md#getFulfillmentPolicies) | **GET** /fulfillment_policy | 
[**getFulfillmentPolicy**](FulfillmentPolicyApi.md#getFulfillmentPolicy) | **GET** /fulfillment_policy/{fulfillmentPolicyId} | 
[**getFulfillmentPolicyByName**](FulfillmentPolicyApi.md#getFulfillmentPolicyByName) | **GET** /fulfillment_policy/get_by_policy_name | 
[**updateFulfillmentPolicy**](FulfillmentPolicyApi.md#updateFulfillmentPolicy) | **PUT** /fulfillment_policy/{fulfillmentPolicyId} | 


<a name="createFulfillmentPolicy"></a>
# **createFulfillmentPolicy**
> SetFulfillmentPolicyResponse createFulfillmentPolicy(fulfillmentPolicyRequest)



This method creates a new fulfillment policy where the policy encapsulates seller&#39;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and a category group type, and you can create multiple policies for each combination. &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Using the eBay standard envelope service (eSE)&lt;/b&gt;&lt;/p&gt;  &lt;p&gt;The eBay standard envelope service (eSE) is a domestic envelope service with tracking through eBay. This service applies to specific Trading Cards categories (not all categories are supported), and to Coins &amp; Paper Money, Postcards, and Stamps. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Using the eBay standard envelope (eSE) service&lt;/a&gt;.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val fulfillmentPolicyRequest : FulfillmentPolicyRequest =  // FulfillmentPolicyRequest | Request to create a seller account fulfillment policy.
try {
    val result : SetFulfillmentPolicyResponse = apiInstance.createFulfillmentPolicy(fulfillmentPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#createFulfillmentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#createFulfillmentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPolicyRequest** | [**FulfillmentPolicyRequest**](FulfillmentPolicyRequest.md)| Request to create a seller account fulfillment policy. |

### Return type

[**SetFulfillmentPolicyResponse**](SetFulfillmentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFulfillmentPolicy"></a>
# **deleteFulfillmentPolicy**
> deleteFulfillmentPolicy(fulfillmentPolicyId)



This method deletes a fulfillment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val fulfillmentPolicyId : kotlin.String = fulfillmentPolicyId_example // kotlin.String | This path parameter specifies the ID of the fulfillment policy to delete.
try {
    apiInstance.deleteFulfillmentPolicy(fulfillmentPolicyId)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#deleteFulfillmentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#deleteFulfillmentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the fulfillment policy to delete. |

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

<a name="getFulfillmentPolicies"></a>
# **getFulfillmentPolicies**
> FulfillmentPolicyResponse getFulfillmentPolicies(marketplaceId)



This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
try {
    val result : FulfillmentPolicyResponse = apiInstance.getFulfillmentPolicies(marketplaceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#getFulfillmentPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#getFulfillmentPolicies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |

### Return type

[**FulfillmentPolicyResponse**](FulfillmentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPolicy"></a>
# **getFulfillmentPolicy**
> FulfillmentPolicy getFulfillmentPolicy(fulfillmentPolicyId)



This method retrieves the complete details of a fulfillment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val fulfillmentPolicyId : kotlin.String = fulfillmentPolicyId_example // kotlin.String | This path parameter specifies the ID of the fulfillment policy you want to retrieve.
try {
    val result : FulfillmentPolicy = apiInstance.getFulfillmentPolicy(fulfillmentPolicyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#getFulfillmentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#getFulfillmentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the fulfillment policy you want to retrieve. |

### Return type

[**FulfillmentPolicy**](FulfillmentPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFulfillmentPolicyByName"></a>
# **getFulfillmentPolicyByName**
> FulfillmentPolicy getFulfillmentPolicyByName(marketplaceId, name)



This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val marketplaceId : kotlin.String = marketplaceId_example // kotlin.String | This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
val name : kotlin.String = name_example // kotlin.String | This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve.
try {
    val result : FulfillmentPolicy = apiInstance.getFulfillmentPolicyByName(marketplaceId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#getFulfillmentPolicyByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#getFulfillmentPolicyByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceId** | **kotlin.String**| This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |
 **name** | **kotlin.String**| This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve. |

### Return type

[**FulfillmentPolicy**](FulfillmentPolicy.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFulfillmentPolicy"></a>
# **updateFulfillmentPolicy**
> SetFulfillmentPolicyResponse updateFulfillmentPolicy(fulfillmentPolicyId, fulfillmentPolicyRequest)



This method updates an existing fulfillment policy. Specify the policy you want to update using the &lt;b&gt;fulfillment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FulfillmentPolicyApi()
val fulfillmentPolicyId : kotlin.String = fulfillmentPolicyId_example // kotlin.String | This path parameter specifies the ID of the fulfillment policy you want to update.
val fulfillmentPolicyRequest : FulfillmentPolicyRequest =  // FulfillmentPolicyRequest | Fulfillment policy request
try {
    val result : SetFulfillmentPolicyResponse = apiInstance.updateFulfillmentPolicy(fulfillmentPolicyId, fulfillmentPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FulfillmentPolicyApi#updateFulfillmentPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FulfillmentPolicyApi#updateFulfillmentPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentPolicyId** | **kotlin.String**| This path parameter specifies the ID of the fulfillment policy you want to update. |
 **fulfillmentPolicyRequest** | [**FulfillmentPolicyRequest**](FulfillmentPolicyRequest.md)| Fulfillment policy request |

### Return type

[**SetFulfillmentPolicyResponse**](SetFulfillmentPolicyResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

