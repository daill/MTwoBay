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
 * Provides metadata about an attribute.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkMetadataObjectInterface {
  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attribute_code";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;


  public FrameworkMetadataObjectInterface attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Code of the attribute.
   * @return attributeCode
  **/


  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkMetadataObjectInterface frameworkMetadataObjectInterface = (FrameworkMetadataObjectInterface) o;
    return Objects.equals(this.attributeCode, frameworkMetadataObjectInterface.attributeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkMetadataObjectInterface {\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
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

