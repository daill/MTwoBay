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

public class SharedCatalogSharedCatalogIdCompaniesApi {
    private ApiClient localVarApiClient;

    public SharedCatalogSharedCatalogIdCompaniesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedCatalogSharedCatalogIdCompaniesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getV1SharedCatalogSharedCatalogIdCompanies
     * @param sharedCatalogId  (required)
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
    public okhttp3.Call getV1SharedCatalogSharedCatalogIdCompaniesCall(Integer sharedCatalogId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/sharedCatalog/{sharedCatalogId}/companies"
            .replaceAll("\\{" + "sharedCatalogId" + "\\}", localVarApiClient.escapeString(sharedCatalogId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getV1SharedCatalogSharedCatalogIdCompaniesValidateBeforeCall(Integer sharedCatalogId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sharedCatalogId' is set
        if (sharedCatalogId == null) {
            throw new ApiException("Missing the required parameter 'sharedCatalogId' when calling getV1SharedCatalogSharedCatalogIdCompanies(Async)");
        }
        

        okhttp3.Call localVarCall = getV1SharedCatalogSharedCatalogIdCompaniesCall(sharedCatalogId, _callback);
        return localVarCall;

    }

    /**
     * sharedCatalog/{sharedCatalogId}/companies
     * Return the list of company IDs for the companies assigned to the selected catalog.
     * @param sharedCatalogId  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public String getV1SharedCatalogSharedCatalogIdCompanies(Integer sharedCatalogId) throws ApiException {
        ApiResponse<String> localVarResp = getV1SharedCatalogSharedCatalogIdCompaniesWithHttpInfo(sharedCatalogId);
        return localVarResp.getData();
    }

    /**
     * sharedCatalog/{sharedCatalogId}/companies
     * Return the list of company IDs for the companies assigned to the selected catalog.
     * @param sharedCatalogId  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getV1SharedCatalogSharedCatalogIdCompaniesWithHttpInfo(Integer sharedCatalogId) throws ApiException {
        okhttp3.Call localVarCall = getV1SharedCatalogSharedCatalogIdCompaniesValidateBeforeCall(sharedCatalogId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * sharedCatalog/{sharedCatalogId}/companies (asynchronously)
     * Return the list of company IDs for the companies assigned to the selected catalog.
     * @param sharedCatalogId  (required)
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
    public okhttp3.Call getV1SharedCatalogSharedCatalogIdCompaniesAsync(Integer sharedCatalogId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV1SharedCatalogSharedCatalogIdCompaniesValidateBeforeCall(sharedCatalogId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
