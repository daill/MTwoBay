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

import org.magento.api.model.CatalogDataProductInterface;
import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;


import org.openapitools.client.model.UNKNOWN_BASE_TYPE;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsSkuApi {
    private ApiClient localVarApiClient;

    public ProductsSkuApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsSkuApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteV1ProductsSku
     * @param sku  (required)
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
    public okhttp3.Call deleteV1ProductsSkuCall(String sku, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/products/{sku}"
            .replaceAll("\\{" + "sku" + "\\}", localVarApiClient.escapeString(sku.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteV1ProductsSkuValidateBeforeCall(String sku, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling deleteV1ProductsSku(Async)");
        }
        

        okhttp3.Call localVarCall = deleteV1ProductsSkuCall(sku, _callback);
        return localVarCall;

    }

    /**
     * products/{sku}
     * 
     * @param sku  (required)
     * @return Boolean
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
    public Boolean deleteV1ProductsSku(String sku) throws ApiException {
        ApiResponse<Boolean> localVarResp = deleteV1ProductsSkuWithHttpInfo(sku);
        return localVarResp.getData();
    }

    /**
     * products/{sku}
     * 
     * @param sku  (required)
     * @return ApiResponse&lt;Boolean&gt;
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
    public ApiResponse<Boolean> deleteV1ProductsSkuWithHttpInfo(String sku) throws ApiException {
        okhttp3.Call localVarCall = deleteV1ProductsSkuValidateBeforeCall(sku, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * products/{sku} (asynchronously)
     * 
     * @param sku  (required)
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
    public okhttp3.Call deleteV1ProductsSkuAsync(String sku, final ApiCallback<Boolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteV1ProductsSkuValidateBeforeCall(sku, _callback);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getV1ProductsSku
     * @param sku  (required)
     * @param editMode  (optional)
     * @param storeId  (optional)
     * @param forceReload  (optional)
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
    public okhttp3.Call getV1ProductsSkuCall(String sku, Boolean editMode, Integer storeId, Boolean forceReload, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/products/{sku}"
            .replaceAll("\\{" + "sku" + "\\}", localVarApiClient.escapeString(sku.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (editMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("editMode", editMode));
        }

        if (storeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("storeId", storeId));
        }

        if (forceReload != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("forceReload", forceReload));
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
    private okhttp3.Call getV1ProductsSkuValidateBeforeCall(String sku, Boolean editMode, Integer storeId, Boolean forceReload, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling getV1ProductsSku(Async)");
        }
        

        okhttp3.Call localVarCall = getV1ProductsSkuCall(sku, editMode, storeId, forceReload, _callback);
        return localVarCall;

    }

    /**
     * products/{sku}
     * Get info about product by product SKU
     * @param sku  (required)
     * @param editMode  (optional)
     * @param storeId  (optional)
     * @param forceReload  (optional)
     * @return CatalogDataProductInterface
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
    public CatalogDataProductInterface getV1ProductsSku(String sku, Boolean editMode, Integer storeId, Boolean forceReload) throws ApiException {
        ApiResponse<CatalogDataProductInterface> localVarResp = getV1ProductsSkuWithHttpInfo(sku, editMode, storeId, forceReload);
        return localVarResp.getData();
    }

    /**
     * products/{sku}
     * Get info about product by product SKU
     * @param sku  (required)
     * @param editMode  (optional)
     * @param storeId  (optional)
     * @param forceReload  (optional)
     * @return ApiResponse&lt;CatalogDataProductInterface&gt;
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
    public ApiResponse<CatalogDataProductInterface> getV1ProductsSkuWithHttpInfo(String sku, Boolean editMode, Integer storeId, Boolean forceReload) throws ApiException {
        okhttp3.Call localVarCall = getV1ProductsSkuValidateBeforeCall(sku, editMode, storeId, forceReload, null);
        Type localVarReturnType = new TypeToken<CatalogDataProductInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * products/{sku} (asynchronously)
     * Get info about product by product SKU
     * @param sku  (required)
     * @param editMode  (optional)
     * @param storeId  (optional)
     * @param forceReload  (optional)
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
    public okhttp3.Call getV1ProductsSkuAsync(String sku, Boolean editMode, Integer storeId, Boolean forceReload, final ApiCallback<CatalogDataProductInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV1ProductsSkuValidateBeforeCall(sku, editMode, storeId, forceReload, _callback);
        Type localVarReturnType = new TypeToken<CatalogDataProductInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putV1ProductsSku
     * @param sku  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
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
    public okhttp3.Call putV1ProductsSkuCall(String sku, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = UNKNOWN_BASE_TYPE;

        // create path and map variables
        String localVarPath = "/V1/products/{sku}"
            .replaceAll("\\{" + "sku" + "\\}", localVarApiClient.escapeString(sku.toString()));

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
    private okhttp3.Call putV1ProductsSkuValidateBeforeCall(String sku, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling putV1ProductsSku(Async)");
        }
        

        okhttp3.Call localVarCall = putV1ProductsSkuCall(sku, UNKNOWN_BASE_TYPE, _callback);
        return localVarCall;

    }

    /**
     * products/{sku}
     * Create product
     * @param sku  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return CatalogDataProductInterface
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
    public CatalogDataProductInterface putV1ProductsSku(String sku, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        ApiResponse<CatalogDataProductInterface> localVarResp = putV1ProductsSkuWithHttpInfo(sku, UNKNOWN_BASE_TYPE);
        return localVarResp.getData();
    }

    /**
     * products/{sku}
     * Create product
     * @param sku  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return ApiResponse&lt;CatalogDataProductInterface&gt;
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
    public ApiResponse<CatalogDataProductInterface> putV1ProductsSkuWithHttpInfo(String sku, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        okhttp3.Call localVarCall = putV1ProductsSkuValidateBeforeCall(sku, UNKNOWN_BASE_TYPE, null);
        Type localVarReturnType = new TypeToken<CatalogDataProductInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * products/{sku} (asynchronously)
     * Create product
     * @param sku  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
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
    public okhttp3.Call putV1ProductsSkuAsync(String sku, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback<CatalogDataProductInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = putV1ProductsSkuValidateBeforeCall(sku, UNKNOWN_BASE_TYPE, _callback);
        Type localVarReturnType = new TypeToken<CatalogDataProductInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
