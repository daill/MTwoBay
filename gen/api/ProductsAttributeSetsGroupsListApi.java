/*
 * Commerce Admin REST endpoints - All inclusive
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package api;

import org.magento.api.model.EavDataAttributeGroupSearchResultsInterface;
import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsAttributeSetsGroupsListApi {
    private ApiClient localVarApiClient;

    public ProductsAttributeSetsGroupsListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsAttributeSetsGroupsListApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getV1ProductsAttributesetsGroupsList
     * @param searchCriteriaFilterGroups0Filters0Field Field (optional)
     * @param searchCriteriaFilterGroups0Filters0Value Value (optional)
     * @param searchCriteriaFilterGroups0Filters0ConditionType Condition type (optional)
     * @param searchCriteriaSortOrders0Field Sorting field. (optional)
     * @param searchCriteriaSortOrders0Direction Sorting direction. (optional)
     * @param searchCriteriaPageSize Page size. (optional)
     * @param searchCriteriaCurrentPage Current page. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV1ProductsAttributesetsGroupsListCall(String searchCriteriaFilterGroups0Filters0Field, String searchCriteriaFilterGroups0Filters0Value, String searchCriteriaFilterGroups0Filters0ConditionType, String searchCriteriaSortOrders0Field, String searchCriteriaSortOrders0Direction, Integer searchCriteriaPageSize, Integer searchCriteriaCurrentPage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/products/attribute-sets/groups/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (searchCriteriaFilterGroups0Filters0Field != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[filterGroups][0][filters][0][field]", searchCriteriaFilterGroups0Filters0Field));
        }

        if (searchCriteriaFilterGroups0Filters0Value != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[filterGroups][0][filters][0][value]", searchCriteriaFilterGroups0Filters0Value));
        }

        if (searchCriteriaFilterGroups0Filters0ConditionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[filterGroups][0][filters][0][conditionType]", searchCriteriaFilterGroups0Filters0ConditionType));
        }

        if (searchCriteriaSortOrders0Field != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[sortOrders][0][field]", searchCriteriaSortOrders0Field));
        }

        if (searchCriteriaSortOrders0Direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[sortOrders][0][direction]", searchCriteriaSortOrders0Direction));
        }

        if (searchCriteriaPageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[pageSize]", searchCriteriaPageSize));
        }

        if (searchCriteriaCurrentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchCriteria[currentPage]", searchCriteriaCurrentPage));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getV1ProductsAttributesetsGroupsListValidateBeforeCall(String searchCriteriaFilterGroups0Filters0Field, String searchCriteriaFilterGroups0Filters0Value, String searchCriteriaFilterGroups0Filters0ConditionType, String searchCriteriaSortOrders0Field, String searchCriteriaSortOrders0Direction, Integer searchCriteriaPageSize, Integer searchCriteriaCurrentPage, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getV1ProductsAttributesetsGroupsListCall(searchCriteriaFilterGroups0Filters0Field, searchCriteriaFilterGroups0Filters0Value, searchCriteriaFilterGroups0Filters0ConditionType, searchCriteriaSortOrders0Field, searchCriteriaSortOrders0Direction, searchCriteriaPageSize, searchCriteriaCurrentPage, _callback);
        return localVarCall;

    }

    /**
     * products/attribute-sets/groups/list
     * Retrieve list of attribute groups
     * @param searchCriteriaFilterGroups0Filters0Field Field (optional)
     * @param searchCriteriaFilterGroups0Filters0Value Value (optional)
     * @param searchCriteriaFilterGroups0Filters0ConditionType Condition type (optional)
     * @param searchCriteriaSortOrders0Field Sorting field. (optional)
     * @param searchCriteriaSortOrders0Direction Sorting direction. (optional)
     * @param searchCriteriaPageSize Page size. (optional)
     * @param searchCriteriaCurrentPage Current page. (optional)
     * @return EavDataAttributeGroupSearchResultsInterface
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public EavDataAttributeGroupSearchResultsInterface getV1ProductsAttributesetsGroupsList(String searchCriteriaFilterGroups0Filters0Field, String searchCriteriaFilterGroups0Filters0Value, String searchCriteriaFilterGroups0Filters0ConditionType, String searchCriteriaSortOrders0Field, String searchCriteriaSortOrders0Direction, Integer searchCriteriaPageSize, Integer searchCriteriaCurrentPage) throws ApiException {
        ApiResponse<EavDataAttributeGroupSearchResultsInterface> localVarResp = getV1ProductsAttributesetsGroupsListWithHttpInfo(searchCriteriaFilterGroups0Filters0Field, searchCriteriaFilterGroups0Filters0Value, searchCriteriaFilterGroups0Filters0ConditionType, searchCriteriaSortOrders0Field, searchCriteriaSortOrders0Direction, searchCriteriaPageSize, searchCriteriaCurrentPage);
        return localVarResp.getData();
    }

    /**
     * products/attribute-sets/groups/list
     * Retrieve list of attribute groups
     * @param searchCriteriaFilterGroups0Filters0Field Field (optional)
     * @param searchCriteriaFilterGroups0Filters0Value Value (optional)
     * @param searchCriteriaFilterGroups0Filters0ConditionType Condition type (optional)
     * @param searchCriteriaSortOrders0Field Sorting field. (optional)
     * @param searchCriteriaSortOrders0Direction Sorting direction. (optional)
     * @param searchCriteriaPageSize Page size. (optional)
     * @param searchCriteriaCurrentPage Current page. (optional)
     * @return ApiResponse&lt;EavDataAttributeGroupSearchResultsInterface&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EavDataAttributeGroupSearchResultsInterface> getV1ProductsAttributesetsGroupsListWithHttpInfo(String searchCriteriaFilterGroups0Filters0Field, String searchCriteriaFilterGroups0Filters0Value, String searchCriteriaFilterGroups0Filters0ConditionType, String searchCriteriaSortOrders0Field, String searchCriteriaSortOrders0Direction, Integer searchCriteriaPageSize, Integer searchCriteriaCurrentPage) throws ApiException {
        okhttp3.Call localVarCall = getV1ProductsAttributesetsGroupsListValidateBeforeCall(searchCriteriaFilterGroups0Filters0Field, searchCriteriaFilterGroups0Filters0Value, searchCriteriaFilterGroups0Filters0ConditionType, searchCriteriaSortOrders0Field, searchCriteriaSortOrders0Direction, searchCriteriaPageSize, searchCriteriaCurrentPage, null);
        Type localVarReturnType = new TypeToken<EavDataAttributeGroupSearchResultsInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * products/attribute-sets/groups/list (asynchronously)
     * Retrieve list of attribute groups
     * @param searchCriteriaFilterGroups0Filters0Field Field (optional)
     * @param searchCriteriaFilterGroups0Filters0Value Value (optional)
     * @param searchCriteriaFilterGroups0Filters0ConditionType Condition type (optional)
     * @param searchCriteriaSortOrders0Field Sorting field. (optional)
     * @param searchCriteriaSortOrders0Direction Sorting direction. (optional)
     * @param searchCriteriaPageSize Page size. (optional)
     * @param searchCriteriaCurrentPage Current page. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV1ProductsAttributesetsGroupsListAsync(String searchCriteriaFilterGroups0Filters0Field, String searchCriteriaFilterGroups0Filters0Value, String searchCriteriaFilterGroups0Filters0ConditionType, String searchCriteriaSortOrders0Field, String searchCriteriaSortOrders0Direction, Integer searchCriteriaPageSize, Integer searchCriteriaCurrentPage, final ApiCallback<EavDataAttributeGroupSearchResultsInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV1ProductsAttributesetsGroupsListValidateBeforeCall(searchCriteriaFilterGroups0Filters0Field, searchCriteriaFilterGroups0Filters0Value, searchCriteriaFilterGroups0Filters0ConditionType, searchCriteriaSortOrders0Field, searchCriteriaSortOrders0Direction, searchCriteriaPageSize, searchCriteriaCurrentPage, _callback);
        Type localVarReturnType = new TypeToken<EavDataAttributeGroupSearchResultsInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
