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

import org.magento.api.model.InlineObject38;
import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;


import org.magento.api.model.SalesDataOrderAddressInterface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersParentIdApi {
    private ApiClient localVarApiClient;

    public OrdersParentIdApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdersParentIdApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for putV1OrdersParentId
     * @param parentId  (required)
     * @param inlineObject38  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putV1OrdersParentIdCall(String parentId, InlineObject38 inlineObject38, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject38;

        // create path and map variables
        String localVarPath = "/V1/orders/{parent_id}"
            .replaceAll("\\{" + "parent_id" + "\\}", localVarApiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putV1OrdersParentIdValidateBeforeCall(String parentId, InlineObject38 inlineObject38, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling putV1OrdersParentId(Async)");
        }
        

        okhttp3.Call localVarCall = putV1OrdersParentIdCall(parentId, inlineObject38, _callback);
        return localVarCall;

    }

    /**
     * orders/{parent_id}
     * Performs persist operations for a specified order address.
     * @param parentId  (required)
     * @param inlineObject38  (optional)
     * @return SalesDataOrderAddressInterface
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public SalesDataOrderAddressInterface putV1OrdersParentId(String parentId, InlineObject38 inlineObject38) throws ApiException {
        ApiResponse<SalesDataOrderAddressInterface> localVarResp = putV1OrdersParentIdWithHttpInfo(parentId, inlineObject38);
        return localVarResp.getData();
    }

    /**
     * orders/{parent_id}
     * Performs persist operations for a specified order address.
     * @param parentId  (required)
     * @param inlineObject38  (optional)
     * @return ApiResponse&lt;SalesDataOrderAddressInterface&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SalesDataOrderAddressInterface> putV1OrdersParentIdWithHttpInfo(String parentId, InlineObject38 inlineObject38) throws ApiException {
        okhttp3.Call localVarCall = putV1OrdersParentIdValidateBeforeCall(parentId, inlineObject38, null);
        Type localVarReturnType = new TypeToken<SalesDataOrderAddressInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * orders/{parent_id} (asynchronously)
     * Performs persist operations for a specified order address.
     * @param parentId  (required)
     * @param inlineObject38  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putV1OrdersParentIdAsync(String parentId, InlineObject38 inlineObject38, final ApiCallback<SalesDataOrderAddressInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = putV1OrdersParentIdValidateBeforeCall(parentId, inlineObject38, _callback);
        Type localVarReturnType = new TypeToken<SalesDataOrderAddressInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}