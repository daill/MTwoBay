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
 * InlineObject56
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject56 {
  public static final String SERIALIZED_NAME_TFA_TOKEN = "tfaToken";
  @Json(name = SERIALIZED_NAME_TFA_TOKEN)
  private String tfaToken;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_CREDENTIAL_JSON = "publicKeyCredentialJson";
  @Json(name = SERIALIZED_NAME_PUBLIC_KEY_CREDENTIAL_JSON)
  private String publicKeyCredentialJson;


  public InlineObject56 tfaToken(String tfaToken) {
    
    this.tfaToken = tfaToken;
    return this;
  }

   /**
   * Get tfaToken
   * @return tfaToken
  **/


  public String getTfaToken() {
    return tfaToken;
  }


  public void setTfaToken(String tfaToken) {
    this.tfaToken = tfaToken;
  }


  public InlineObject56 publicKeyCredentialJson(String publicKeyCredentialJson) {
    
    this.publicKeyCredentialJson = publicKeyCredentialJson;
    return this;
  }

   /**
   * Get publicKeyCredentialJson
   * @return publicKeyCredentialJson
  **/


  public String getPublicKeyCredentialJson() {
    return publicKeyCredentialJson;
  }


  public void setPublicKeyCredentialJson(String publicKeyCredentialJson) {
    this.publicKeyCredentialJson = publicKeyCredentialJson;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject56 inlineObject56 = (InlineObject56) o;
    return Objects.equals(this.tfaToken, inlineObject56.tfaToken) &&
        Objects.equals(this.publicKeyCredentialJson, inlineObject56.publicKeyCredentialJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tfaToken, publicKeyCredentialJson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject56 {\n");
    sb.append("    tfaToken: ").append(toIndentedString(tfaToken)).append("\n");
    sb.append("    publicKeyCredentialJson: ").append(toIndentedString(publicKeyCredentialJson)).append("\n");
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

