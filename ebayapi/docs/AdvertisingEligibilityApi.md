# AdvertisingEligibilityApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdvertisingEligibility**](AdvertisingEligibilityApi.md#getAdvertisingEligibility) | **GET** /advertising_eligibility | 


<a name="getAdvertisingEligibility"></a>
# **getAdvertisingEligibility**
> SellerEligibilityMultiProgramResponse getAdvertisingEligibility(X_EBAY_C_MARKETPLACE_ID, programTypes)



This method allows developers to check the seller eligibility status for eBay advertising programs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdvertisingEligibilityApi()
val X_EBAY_C_MARKETPLACE_ID : kotlin.String = X_EBAY_C_MARKETPLACE_ID_example // kotlin.String | The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.<br /><br /><span class=\"tablenote\"><b>Note:</b> This value is case-sensitive.</span>
val programTypes : kotlin.String = programTypes_example // kotlin.String | A comma-separated list of eBay advertising programs.<br /><br /><span class=\"tablenote\"><b>Tip:</b> See the <a href=\"/api-docs/sell/account/types/plser:AdvertisingProgramEnum\"> AdvertisingProgramEnum</a> type for possible values.</span><br /><br />If no programs are specified, the results will be returned for all programs.
try {
    val result : SellerEligibilityMultiProgramResponse = apiInstance.getAdvertisingEligibility(X_EBAY_C_MARKETPLACE_ID, programTypes)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdvertisingEligibilityApi#getAdvertisingEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdvertisingEligibilityApi#getAdvertisingEligibility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_EBAY_C_MARKETPLACE_ID** | **kotlin.String**| The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This value is case-sensitive.&lt;/span&gt; |
 **programTypes** | **kotlin.String**| A comma-separated list of eBay advertising programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; See the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/plser:AdvertisingProgramEnum\&quot;&gt; AdvertisingProgramEnum&lt;/a&gt; type for possible values.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If no programs are specified, the results will be returned for all programs. | [optional]

### Return type

[**SellerEligibilityMultiProgramResponse**](SellerEligibilityMultiProgramResponse.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

