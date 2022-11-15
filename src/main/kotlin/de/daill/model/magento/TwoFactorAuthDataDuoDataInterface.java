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
 * Represents the data needed to use duo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TwoFactorAuthDataDuoDataInterface {
  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @Json(name = SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_API_HOSTNAME = "api_hostname";
  @Json(name = SERIALIZED_NAME_API_HOSTNAME)
  private String apiHostname;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public TwoFactorAuthDataDuoDataInterface signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * The signature
   * @return signature
  **/


  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public TwoFactorAuthDataDuoDataInterface apiHostname(String apiHostname) {
    
    this.apiHostname = apiHostname;
    return this;
  }

   /**
   * The api hostname
   * @return apiHostname
  **/


  public String getApiHostname() {
    return apiHostname;
  }


  public void setApiHostname(String apiHostname) {
    this.apiHostname = apiHostname;
  }


  public TwoFactorAuthDataDuoDataInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\TwoFactorAuth\\Api\\Data\\DuoDataInterface
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
    TwoFactorAuthDataDuoDataInterface twoFactorAuthDataDuoDataInterface = (TwoFactorAuthDataDuoDataInterface) o;
    return Objects.equals(this.signature, twoFactorAuthDataDuoDataInterface.signature) &&
        Objects.equals(this.apiHostname, twoFactorAuthDataDuoDataInterface.apiHostname) &&
        Objects.equals(this.extensionAttributes, twoFactorAuthDataDuoDataInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, apiHostname, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthDataDuoDataInterface {\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    apiHostname: ").append(toIndentedString(apiHostname)).append("\n");
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

