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

import org.magento.api.model.CustomerDataCustomerInterface;
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

public class CompanyRoleRoleIdUsersApi {
    private ApiClient localVarApiClient;

    public CompanyRoleRoleIdUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyRoleRoleIdUsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getV1CompanyRoleRoleIdUsers
     * @param roleId  (required)
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
    public okhttp3.Call getV1CompanyRoleRoleIdUsersCall(Integer roleId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/V1/company/role/{roleId}/users"
            .replaceAll("\\{" + "roleId" + "\\}", localVarApiClient.escapeString(roleId.toString()));

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
    private okhttp3.Call getV1CompanyRoleRoleIdUsersValidateBeforeCall(Integer roleId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling getV1CompanyRoleRoleIdUsers(Async)");
        }
        

        okhttp3.Call localVarCall = getV1CompanyRoleRoleIdUsersCall(roleId, _callback);
        return localVarCall;

    }

    /**
     * company/role/{roleId}/users
     * View the list of company users assigned to a specified role.
     * @param roleId  (required)
     * @return List&lt;CustomerDataCustomerInterface&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<CustomerDataCustomerInterface> getV1CompanyRoleRoleIdUsers(Integer roleId) throws ApiException {
        ApiResponse<List<CustomerDataCustomerInterface>> localVarResp = getV1CompanyRoleRoleIdUsersWithHttpInfo(roleId);
        return localVarResp.getData();
    }

    /**
     * company/role/{roleId}/users
     * View the list of company users assigned to a specified role.
     * @param roleId  (required)
     * @return ApiResponse&lt;List&lt;CustomerDataCustomerInterface&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CustomerDataCustomerInterface>> getV1CompanyRoleRoleIdUsersWithHttpInfo(Integer roleId) throws ApiException {
        okhttp3.Call localVarCall = getV1CompanyRoleRoleIdUsersValidateBeforeCall(roleId, null);
        Type localVarReturnType = new TypeToken<List<CustomerDataCustomerInterface>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * company/role/{roleId}/users (asynchronously)
     * View the list of company users assigned to a specified role.
     * @param roleId  (required)
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
    public okhttp3.Call getV1CompanyRoleRoleIdUsersAsync(Integer roleId, final ApiCallback<List<CustomerDataCustomerInterface>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV1CompanyRoleRoleIdUsersValidateBeforeCall(roleId, _callback);
        Type localVarReturnType = new TypeToken<List<CustomerDataCustomerInterface>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}