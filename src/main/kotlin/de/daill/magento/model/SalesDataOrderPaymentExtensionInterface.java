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
 * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\OrderPaymentInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataOrderPaymentExtensionInterface {
  public static final String SERIALIZED_NAME_NOTIFICATION_MESSAGE = "notification_message";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_MESSAGE)
  private String notificationMessage;

  public static final String SERIALIZED_NAME_VAULT_PAYMENT_TOKEN = "vault_payment_token";
  @SerializedName(SERIALIZED_NAME_VAULT_PAYMENT_TOKEN)
  private VaultDataPaymentTokenInterface vaultPaymentToken;


  public SalesDataOrderPaymentExtensionInterface notificationMessage(String notificationMessage) {
    
    this.notificationMessage = notificationMessage;
    return this;
  }

   /**
   * Get notificationMessage
   * @return notificationMessage
  **/



  public String getNotificationMessage() {
    return notificationMessage;
  }


  public void setNotificationMessage(String notificationMessage) {
    this.notificationMessage = notificationMessage;
  }


  public SalesDataOrderPaymentExtensionInterface vaultPaymentToken(VaultDataPaymentTokenInterface vaultPaymentToken) {
    
    this.vaultPaymentToken = vaultPaymentToken;
    return this;
  }

   /**
   * Get vaultPaymentToken
   * @return vaultPaymentToken
  **/



  public VaultDataPaymentTokenInterface getVaultPaymentToken() {
    return vaultPaymentToken;
  }


  public void setVaultPaymentToken(VaultDataPaymentTokenInterface vaultPaymentToken) {
    this.vaultPaymentToken = vaultPaymentToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataOrderPaymentExtensionInterface salesDataOrderPaymentExtensionInterface = (SalesDataOrderPaymentExtensionInterface) o;
    return Objects.equals(this.notificationMessage, salesDataOrderPaymentExtensionInterface.notificationMessage) &&
        Objects.equals(this.vaultPaymentToken, salesDataOrderPaymentExtensionInterface.vaultPaymentToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationMessage, vaultPaymentToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataOrderPaymentExtensionInterface {\n");
    sb.append("    notificationMessage: ").append(toIndentedString(notificationMessage)).append("\n");
    sb.append("    vaultPaymentToken: ").append(toIndentedString(vaultPaymentToken)).append("\n");
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
