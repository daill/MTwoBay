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

import org.magento.api.model.QuoteDataTotalsInterface;
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

public class GuestCartsCartIdTotalsInformationApi {
    private ApiClient localVarApiClient;

    public GuestCartsCartIdTotalsInformationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GuestCartsCartIdTotalsInformationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for postV1GuestcartsCartIdTotalsinformation
     * @param cartId  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV1GuestcartsCartIdTotalsinformationCall(String cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = UNKNOWN_BASE_TYPE;

        // create path and map variables
        String localVarPath = "/V1/guest-carts/{cartId}/totals-information"
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
    private okhttp3.Call postV1GuestcartsCartIdTotalsinformationValidateBeforeCall(String cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new ApiException("Missing the required parameter 'cartId' when calling postV1GuestcartsCartIdTotalsinformation(Async)");
        }
        

        okhttp3.Call localVarCall = postV1GuestcartsCartIdTotalsinformationCall(cartId, UNKNOWN_BASE_TYPE, _callback);
        return localVarCall;

    }

    /**
     * guest-carts/{cartId}/totals-information
     * Calculate quote totals based on address and shipping method.
     * @param cartId  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return QuoteDataTotalsInterface
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public QuoteDataTotalsInterface postV1GuestcartsCartIdTotalsinformation(String cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        ApiResponse<QuoteDataTotalsInterface> localVarResp = postV1GuestcartsCartIdTotalsinformationWithHttpInfo(cartId, UNKNOWN_BASE_TYPE);
        return localVarResp.getData();
    }

    /**
     * guest-carts/{cartId}/totals-information
     * Calculate quote totals based on address and shipping method.
     * @param cartId  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @return ApiResponse&lt;QuoteDataTotalsInterface&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteDataTotalsInterface> postV1GuestcartsCartIdTotalsinformationWithHttpInfo(String cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
        okhttp3.Call localVarCall = postV1GuestcartsCartIdTotalsinformationValidateBeforeCall(cartId, UNKNOWN_BASE_TYPE, null);
        Type localVarReturnType = new TypeToken<QuoteDataTotalsInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * guest-carts/{cartId}/totals-information (asynchronously)
     * Calculate quote totals based on address and shipping method.
     * @param cartId  (required)
     * @param UNKNOWN_BASE_TYPE  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV1GuestcartsCartIdTotalsinformationAsync(String cartId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, final ApiCallback<QuoteDataTotalsInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV1GuestcartsCartIdTotalsinformationValidateBeforeCall(cartId, UNKNOWN_BASE_TYPE, _callback);
        Type localVarReturnType = new TypeToken<QuoteDataTotalsInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
