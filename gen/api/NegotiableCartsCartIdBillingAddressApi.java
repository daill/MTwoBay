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

import org.magento.api.model.QuoteDataAddressInterface;
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

public class NegotiableCartsCartIdBillingAddressApi {
    private ApiClient localVarApiClient;

    public NegotiableCartsCartIdBillingAddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NegotiableCartsCartIdBillingAddressApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getV1NegotiablecartsCartIdBillingaddress
     * @param cartId The cart ID. (required)
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
    public okhttp3.Call getV1NegotiablecartsCartIdBillingaddressCall(Integer cartId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/negotiable-carts/{cartId}/billing-address"
            .replaceAll("\\{" + "cartId" + "\\}", localVarApiClient.escapeString(cartId.toString()));

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
    private okhttp3.Call getV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(Integer cartId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new ApiException("Missing the required parameter 'cartId' when calling getV1NegotiablecartsCartIdBillingaddress(Async)");
        }
        

        okhttp3.Call localVarCall = getV1NegotiablecartsCartIdBillingaddressCall(cartId, _callback);
        return localVarCall;

    }

    /**
     * negotiable-carts/{cartId}/billing-address
     * Returns the billing address for a specified quote.
     * @param cartId The cart ID. (required)
     * @return QuoteDataAddressInterface
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
    public QuoteDataAddressInterface getV1NegotiablecartsCartIdBillingaddress(Integer cartId) throws ApiException {
        ApiResponse<QuoteDataAddressInterface> localVarResp = getV1NegotiablecartsCartIdBillingaddressWithHttpInfo(cartId);
        return localVarResp.getData();
    }

    /**
     * negotiable-carts/{cartId}/billing-address
     * Returns the billing address for a specified quote.
     * @param cartId The cart ID. (required)
     * @return ApiResponse&lt;QuoteDataAddressInterface&gt;
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
    public ApiResponse<QuoteDataAddressInterface> getV1NegotiablecartsCartIdBillingaddressWithHttpInfo(Integer cartId) throws ApiException {
        okhttp3.Call localVarCall = getV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(cartId, null);
        Type localVarReturnType = new TypeToken<QuoteDataAddressInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * negotiable-carts/{cartId}/billing-address (asynchronously)
     * Returns the billing address for a specified quote.
     * @param cartId The cart ID. (required)
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
    public okhttp3.Call getV1NegotiablecartsCartIdBillingaddressAsync(Integer cartId, final ApiCallback<QuoteDataAddressInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(cartId, _callback);
        Type localVarReturnType = new TypeToken<QuoteDataAddressInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postV1NegotiablecartsCartIdBillingaddress
     * @param cartId The cart ID. (required)
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
    public okhttp3.Call postV1NegotiablecartsCartIdBillingaddressCall(Integer cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = UNKNOWN_BASE_TYPE;

        // create path and map variables
        String localVarPath = "/V1/negotiable-carts/{cartId}/billing-address"
            .replaceAll("\\{" + "cartId" + "\\}", localVarApiClient.escapeString(cartId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(Integer cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new ApiException("Missing the required parameter 'cartId' when calling postV1NegotiablecartsCartIdBillingaddress(Async)");
        }
        

        okhttp3.Call localVarCall = postV1NegotiablecartsCartIdBillingaddressCall(cartId, UNKNOWN_BASE_TYPE, _callback);
        return localVarCall;

    }

    /**
     * negotiable-carts/{cartId}/billing-address
     * Assigns a specified billing address to a specified cart.
     * @param cartId The cart ID. (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return Integer
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
    public Integer postV1NegotiablecartsCartIdBillingaddress(Integer cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        ApiResponse<Integer> localVarResp = postV1NegotiablecartsCartIdBillingaddressWithHttpInfo(cartId, UNKNOWN_BASE_TYPE);
        return localVarResp.getData();
    }

    /**
     * negotiable-carts/{cartId}/billing-address
     * Assigns a specified billing address to a specified cart.
     * @param cartId The cart ID. (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return ApiResponse&lt;Integer&gt;
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
    public ApiResponse<Integer> postV1NegotiablecartsCartIdBillingaddressWithHttpInfo(Integer cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        okhttp3.Call localVarCall = postV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(cartId, UNKNOWN_BASE_TYPE, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * negotiable-carts/{cartId}/billing-address (asynchronously)
     * Assigns a specified billing address to a specified cart.
     * @param cartId The cart ID. (required)
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
    public okhttp3.Call postV1NegotiablecartsCartIdBillingaddressAsync(Integer cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback<Integer> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV1NegotiablecartsCartIdBillingaddressValidateBeforeCall(cartId, UNKNOWN_BASE_TYPE, _callback);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}