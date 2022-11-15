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
 * InlineObject20
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject20 {
  public static final String SERIALIZED_NAME_NEW_PARENT_ID = "newParentId";
  @Json(name = SERIALIZED_NAME_NEW_PARENT_ID)
  private Integer newParentId;


  public InlineObject20 newParentId(Integer newParentId) {
    
    this.newParentId = newParentId;
    return this;
  }

   /**
   * Get newParentId
   * @return newParentId
  **/


  public Integer getNewParentId() {
    return newParentId;
  }


  public void setNewParentId(Integer newParentId) {
    this.newParentId = newParentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject20 inlineObject20 = (InlineObject20) o;
    return Objects.equals(this.newParentId, inlineObject20.newParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newParentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject20 {\n");
    sb.append("    newParentId: ").append(toIndentedString(newParentId)).append("\n");
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

