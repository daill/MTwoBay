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
 * Authy device data interface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TwoFactorAuthDataAuthyDeviceInterface {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @Json(name = SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @Json(name = SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @Json(name = SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public TwoFactorAuthDataAuthyDeviceInterface country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country
   * @return country
  **/


  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TwoFactorAuthDataAuthyDeviceInterface phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number
   * @return phoneNumber
  **/


  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public TwoFactorAuthDataAuthyDeviceInterface method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method to authenticate with
   * @return method
  **/


  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public TwoFactorAuthDataAuthyDeviceInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\TwoFactorAuth\\Api\\Data\\AuthyDeviceInterface
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
    TwoFactorAuthDataAuthyDeviceInterface twoFactorAuthDataAuthyDeviceInterface = (TwoFactorAuthDataAuthyDeviceInterface) o;
    return Objects.equals(this.country, twoFactorAuthDataAuthyDeviceInterface.country) &&
        Objects.equals(this.phoneNumber, twoFactorAuthDataAuthyDeviceInterface.phoneNumber) &&
        Objects.equals(this.method, twoFactorAuthDataAuthyDeviceInterface.method) &&
        Objects.equals(this.extensionAttributes, twoFactorAuthDataAuthyDeviceInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, phoneNumber, method, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthDataAuthyDeviceInterface {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

