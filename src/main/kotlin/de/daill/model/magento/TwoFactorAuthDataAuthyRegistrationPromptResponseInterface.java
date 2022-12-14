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


package de.daill.model.magento;

import com.squareup.moshi.Json;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


/**
 * Response for device registration prompt
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TwoFactorAuthDataAuthyRegistrationPromptResponseInterface {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @Json(name = SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expiration_seconds";
  @Json(name = SERIALIZED_NAME_EXPIRATION_SECONDS)
  private String expirationSeconds;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public TwoFactorAuthDataAuthyRegistrationPromptResponseInterface message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message
   * @return message
  **/


  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TwoFactorAuthDataAuthyRegistrationPromptResponseInterface expirationSeconds(String expirationSeconds) {
    
    this.expirationSeconds = expirationSeconds;
    return this;
  }

   /**
   * The seconds to expire
   * @return expirationSeconds
  **/


  public String getExpirationSeconds() {
    return expirationSeconds;
  }


  public void setExpirationSeconds(String expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }


  public TwoFactorAuthDataAuthyRegistrationPromptResponseInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\TwoFactorAuth\\Api\\Data\\AuthyRegistrationPromptResponseInterface
   * @return extensionAttributes
  **/

  

  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoFactorAuthDataAuthyRegistrationPromptResponseInterface twoFactorAuthDataAuthyRegistrationPromptResponseInterface = (TwoFactorAuthDataAuthyRegistrationPromptResponseInterface) o;
    return Objects.equals(this.message, twoFactorAuthDataAuthyRegistrationPromptResponseInterface.message) &&
        Objects.equals(this.expirationSeconds, twoFactorAuthDataAuthyRegistrationPromptResponseInterface.expirationSeconds) &&
        Objects.equals(this.extensionAttributes, twoFactorAuthDataAuthyRegistrationPromptResponseInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, expirationSeconds, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthDataAuthyRegistrationPromptResponseInterface {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
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

