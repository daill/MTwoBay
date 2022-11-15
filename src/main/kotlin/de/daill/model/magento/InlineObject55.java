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
 * InlineObject55
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject55 {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @Json(name = SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @Json(name = SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SIGNATURE_RESPONSE = "signatureResponse";
  @Json(name = SERIALIZED_NAME_SIGNATURE_RESPONSE)
  private String signatureResponse;


  public InlineObject55 username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/


  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public InlineObject55 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/


  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public InlineObject55 signatureResponse(String signatureResponse) {
    
    this.signatureResponse = signatureResponse;
    return this;
  }

   /**
   * Get signatureResponse
   * @return signatureResponse
  **/


  public String getSignatureResponse() {
    return signatureResponse;
  }


  public void setSignatureResponse(String signatureResponse) {
    this.signatureResponse = signatureResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject55 inlineObject55 = (InlineObject55) o;
    return Objects.equals(this.username, inlineObject55.username) &&
        Objects.equals(this.password, inlineObject55.password) &&
        Objects.equals(this.signatureResponse, inlineObject55.signatureResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, signatureResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject55 {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    signatureResponse: ").append(toIndentedString(signatureResponse)).append("\n");
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

