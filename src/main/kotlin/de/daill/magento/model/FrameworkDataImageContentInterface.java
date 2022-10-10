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
 * Image Content data interface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkDataImageContentInterface {
  public static final String SERIALIZED_NAME_BASE64_ENCODED_DATA = "base64_encoded_data";
  @SerializedName(SERIALIZED_NAME_BASE64_ENCODED_DATA)
  private String base64EncodedData;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public FrameworkDataImageContentInterface base64EncodedData(String base64EncodedData) {
    
    this.base64EncodedData = base64EncodedData;
    return this;
  }

   /**
   * Media data (base64 encoded content)
   * @return base64EncodedData
  **/


  public String getBase64EncodedData() {
    return base64EncodedData;
  }


  public void setBase64EncodedData(String base64EncodedData) {
    this.base64EncodedData = base64EncodedData;
  }


  public FrameworkDataImageContentInterface type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * MIME type
   * @return type
  **/


  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FrameworkDataImageContentInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Image name
   * @return name
  **/


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkDataImageContentInterface frameworkDataImageContentInterface = (FrameworkDataImageContentInterface) o;
    return Objects.equals(this.base64EncodedData, frameworkDataImageContentInterface.base64EncodedData) &&
        Objects.equals(this.type, frameworkDataImageContentInterface.type) &&
        Objects.equals(this.name, frameworkDataImageContentInterface.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64EncodedData, type, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkDataImageContentInterface {\n");
    sb.append("    base64EncodedData: ").append(toIndentedString(base64EncodedData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

