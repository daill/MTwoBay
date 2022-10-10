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
 * InlineObject52
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject52 {
  public static final String SERIALIZED_NAME_PROVIDER_CODE = "providerCode";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CODE)
  private String providerCode;


  public InlineObject52 providerCode(String providerCode) {
    
    this.providerCode = providerCode;
    return this;
  }

   /**
   * Get providerCode
   * @return providerCode
  **/


  public String getProviderCode() {
    return providerCode;
  }


  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject52 inlineObject52 = (InlineObject52) o;
    return Objects.equals(this.providerCode, inlineObject52.providerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject52 {\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
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

