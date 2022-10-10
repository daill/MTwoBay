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

public class PurchaseOrderCartsCartIdGiftCardsGiftCardCodeApi {
    private ApiClient localVarApiClient;

    public PurchaseOrderCartsCartIdGiftCardsGiftCardCodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PurchaseOrderCartsCartIdGiftCardsGiftCardCodeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCode
     * @param cartId  (required)
     * @param giftCardCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeCall(Integer cartId, String giftCardCode, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/purchase-order-carts/{cartId}/giftCards/{giftCardCode}"
            .replaceAll("\\{" + "cartId" + "\\}", localVarApiClient.escapeString(cartId.toString()))
            .replaceAll("\\{" + "giftCardCode" + "\\}", localVarApiClient.escapeString(giftCardCode.toString()));

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
    private okhttp3.Call deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeValidateBeforeCall(Integer cartId, String giftCardCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'cartId' is set
        if (cartId == null) {
            throw new ApiException("Missing the required parameter 'cartId' when calling deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCode(Async)");
        }
        
        // verify the required parameter 'giftCardCode' is set
        if (giftCardCode == null) {
            throw new ApiException("Missing the required parameter 'giftCardCode' when calling deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCode(Async)");
        }
        

        okhttp3.Call localVarCall = deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeCall(cartId, giftCardCode, _callback);
        return localVarCall;

    }

    /**
     * purchase-order-carts/{cartId}/giftCards/{giftCardCode}
     * Remove GiftCard Account entity
     * @param cartId  (required)
     * @param giftCardCode  (required)
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Boolean deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCode(Integer cartId, String giftCardCode) throws ApiException {
        ApiResponse<Boolean> localVarResp = deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeWithHttpInfo(cartId, giftCardCode);
        return localVarResp.getData();
    }

    /**
     * purchase-order-carts/{cartId}/giftCards/{giftCardCode}
     * Remove GiftCard Account entity
     * @param cartId  (required)
     * @param giftCardCode  (required)
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Boolean> deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeWithHttpInfo(Integer cartId, String giftCardCode) throws ApiException {
        okhttp3.Call localVarCall = deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeValidateBeforeCall(cartId, giftCardCode, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * purchase-order-carts/{cartId}/giftCards/{giftCardCode} (asynchronously)
     * Remove GiftCard Account entity
     * @param cartId  (required)
     * @param giftCardCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeAsync(Integer cartId, String giftCardCode, final ApiCallback<Boolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteV1PurchaseordercartsCartIdGiftCardsGiftCardCodeValidateBeforeCall(cartId, giftCardCode, _callback);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
