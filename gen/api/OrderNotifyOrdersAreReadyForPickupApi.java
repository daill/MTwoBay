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

import org.magento.api.model.InlineObject33;
import org.magento.api.model.InventoryInStorePickupSalesApiDataResultInterface;
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

public class OrderNotifyOrdersAreReadyForPickupApi {
    private ApiClient localVarApiClient;

    public OrderNotifyOrdersAreReadyForPickupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderNotifyOrdersAreReadyForPickupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for postV1OrderNotifyordersarereadyforpickup
     * @param inlineObject33  (optional)
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
    public okhttp3.Call postV1OrderNotifyordersarereadyforpickupCall(InlineObject33 inlineObject33, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject33;

        // create path and map variables
        String localVarPath = "/V1/order/notify-orders-are-ready-for-pickup";

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
    private okhttp3.Call postV1OrderNotifyordersarereadyforpickupValidateBeforeCall(InlineObject33 inlineObject33, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = postV1OrderNotifyordersarereadyforpickupCall(inlineObject33, _callback);
        return localVarCall;

    }

    /**
     * order/notify-orders-are-ready-for-pickup
     * Notify customer that the orders is ready for pickup.
     * @param inlineObject33  (optional)
     * @return InventoryInStorePickupSalesApiDataResultInterface
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public InventoryInStorePickupSalesApiDataResultInterface postV1OrderNotifyordersarereadyforpickup(InlineObject33 inlineObject33) throws ApiException {
        ApiResponse<InventoryInStorePickupSalesApiDataResultInterface> localVarResp = postV1OrderNotifyordersarereadyforpickupWithHttpInfo(inlineObject33);
        return localVarResp.getData();
    }

    /**
     * order/notify-orders-are-ready-for-pickup
     * Notify customer that the orders is ready for pickup.
     * @param inlineObject33  (optional)
     * @return ApiResponse&lt;InventoryInStorePickupSalesApiDataResultInterface&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InventoryInStorePickupSalesApiDataResultInterface> postV1OrderNotifyordersarereadyforpickupWithHttpInfo(InlineObject33 inlineObject33) throws ApiException {
        okhttp3.Call localVarCall = postV1OrderNotifyordersarereadyforpickupValidateBeforeCall(inlineObject33, null);
        Type localVarReturnType = new TypeToken<InventoryInStorePickupSalesApiDataResultInterface>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * order/notify-orders-are-ready-for-pickup (asynchronously)
     * Notify customer that the orders is ready for pickup.
     * @param inlineObject33  (optional)
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
    public okhttp3.Call postV1OrderNotifyordersarereadyforpickupAsync(InlineObject33 inlineObject33, final ApiCallback<InventoryInStorePickupSalesApiDataResultInterface> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV1OrderNotifyordersarereadyforpickupValidateBeforeCall(inlineObject33, _callback);
        Type localVarReturnType = new TypeToken<InventoryInStorePickupSalesApiDataResultInterface>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
