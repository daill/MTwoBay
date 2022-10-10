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


package de.daill.magento.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * Interface AuthDataInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class PayPalBraintreeDataAuthDataInterface {
  public static final String SERIALIZED_NAME_CLIENT_TOKEN = "client_token";
  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
  private String clientToken;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ACTION_SUCCESS = "action_success";
  @SerializedName(SERIALIZED_NAME_ACTION_SUCCESS)
  private String actionSuccess;

  public static final String SERIALIZED_NAME_LOGGED_IN = "logged_in";
  @SerializedName(SERIALIZED_NAME_LOGGED_IN)
  private Boolean loggedIn;

  public static final String SERIALIZED_NAME_STORE_CODE = "store_code";
  @SerializedName(SERIALIZED_NAME_STORE_CODE)
  private String storeCode;


  public PayPalBraintreeDataAuthDataInterface clientToken(String clientToken) {
    
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Client token
   * @return clientToken
  **/



  public String getClientToken() {
    return clientToken;
  }


  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  public PayPalBraintreeDataAuthDataInterface displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name
   * @return displayName
  **/


  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PayPalBraintreeDataAuthDataInterface actionSuccess(String actionSuccess) {
    
    this.actionSuccess = actionSuccess;
    return this;
  }

   /**
   * To success page
   * @return actionSuccess
  **/


  public String getActionSuccess() {
    return actionSuccess;
  }


  public void setActionSuccess(String actionSuccess) {
    this.actionSuccess = actionSuccess;
  }


  public PayPalBraintreeDataAuthDataInterface loggedIn(Boolean loggedIn) {
    
    this.loggedIn = loggedIn;
    return this;
  }

   /**
   * Get loggedIn
   * @return loggedIn
  **/


  public Boolean getLoggedIn() {
    return loggedIn;
  }


  public void setLoggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
  }


  public PayPalBraintreeDataAuthDataInterface storeCode(String storeCode) {
    
    this.storeCode = storeCode;
    return this;
  }

   /**
   * Current store code
   * @return storeCode
  **/


  public String getStoreCode() {
    return storeCode;
  }


  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalBraintreeDataAuthDataInterface payPalBraintreeDataAuthDataInterface = (PayPalBraintreeDataAuthDataInterface) o;
    return Objects.equals(this.clientToken, payPalBraintreeDataAuthDataInterface.clientToken) &&
        Objects.equals(this.displayName, payPalBraintreeDataAuthDataInterface.displayName) &&
        Objects.equals(this.actionSuccess, payPalBraintreeDataAuthDataInterface.actionSuccess) &&
        Objects.equals(this.loggedIn, payPalBraintreeDataAuthDataInterface.loggedIn) &&
        Objects.equals(this.storeCode, payPalBraintreeDataAuthDataInterface.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, displayName, actionSuccess, loggedIn, storeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalBraintreeDataAuthDataInterface {\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    actionSuccess: ").append(toIndentedString(actionSuccess)).append("\n");
    sb.append("    loggedIn: ").append(toIndentedString(loggedIn)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

