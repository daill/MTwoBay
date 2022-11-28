
# LocationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **kotlin.String** | The URI of the current page of results from the result set. |  [optional]
**limit** | **kotlin.Int** | The number of items returned on a single page from the result set. |  [optional]
**next** | **kotlin.String** | The URI for the following page of results. This value is returned only if there is an additional page of results to display from the result set. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048 |  [optional]
**offset** | **kotlin.Int** | The number of results skipped in the result set before listing the first returned result. This value is set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt; |  [optional]
**prev** | **kotlin.String** | The URI for the preceding page of results. This value is returned only if there is a previous page of results to display from the result set. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048 |  [optional]
**total** | **kotlin.Int** | The total number of items retrieved in the result set.  &lt;br/&gt;&lt;br/&gt;If no items are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;. |  [optional]
**locations** | [**kotlin.collections.List&lt;InventoryLocationResponse&gt;**](InventoryLocationResponse.md) | An array of one or more of the merchant&#39;s inventory locations. |  [optional]



