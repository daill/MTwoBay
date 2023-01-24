# ProgramApi

All URIs are relative to *https://api.ebay.com/sell/account/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptedInPrograms**](ProgramApi.md#getOptedInPrograms) | **GET** /program/get_opted_in_programs | 
[**optInToProgram**](ProgramApi.md#optInToProgram) | **POST** /program/opt_in | 
[**optOutOfProgram**](ProgramApi.md#optOutOfProgram) | **POST** /program/opt_out | 


<a name="getOptedInPrograms"></a>
# **getOptedInPrograms**
> Programs getOptedInPrograms()



This method gets a list of the seller programs that the seller has opted-in to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramApi()
try {
    val result : Programs = apiInstance.getOptedInPrograms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramApi#getOptedInPrograms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramApi#getOptedInPrograms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Programs**](Programs.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optInToProgram"></a>
# **optInToProgram**
> kotlin.Any optInToProgram(program)



This method opts the seller in to an eBay seller program. Refer to the &lt;a href&#x3D;\&quot;/api-docs/sell/account/overview.html#opt-in\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Account API overview&lt;/a&gt; for information about available eBay seller programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; It can take up to 24-hours for eBay to process your request to opt-in to a Seller Program. Use the &lt;a href&#x3D;\&quot;/api-docs/sell/account/resources/program/methods/getOptedInPrograms\&quot; target&#x3D;\&quot;_blank\&quot;&gt;getOptedInPrograms&lt;/a&gt; call to check the status of your request after the processing period has passed.&lt;/span&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramApi()
val program : Program =  // Program | Program being opted-in to.
try {
    val result : kotlin.Any = apiInstance.optInToProgram(program)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramApi#optInToProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramApi#optInToProgram")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program** | [**Program**](Program.md)| Program being opted-in to. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optOutOfProgram"></a>
# **optOutOfProgram**
> kotlin.Any optOutOfProgram(program)



This method opts the seller out of a seller program to which you have previously opted-in to. Get a list of the seller programs you have opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; call.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramApi()
val program : Program =  // Program | Program being opted-out of.
try {
    val result : kotlin.Any = apiInstance.optOutOfProgram(program)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramApi#optOutOfProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramApi#optOutOfProgram")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program** | [**Program**](Program.md)| Program being opted-out of. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_auth:
    ApiClient.accessToken = ""
Configure api_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

