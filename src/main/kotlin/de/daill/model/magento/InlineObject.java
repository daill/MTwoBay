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
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject {
  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @Json(name = SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_AFTER_ID = "afterId";
  @Json(name = SERIALIZED_NAME_AFTER_ID)
  private Integer afterId;


  public InlineObject parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/


  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public InlineObject afterId(Integer afterId) {
    
    this.afterId = afterId;
    return this;
  }

   /**
   * Get afterId
   * @return afterId
  **/



  public Integer getAfterId() {
    return afterId;
  }


  public void setAfterId(Integer afterId) {
    this.afterId = afterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.parentId, inlineObject.parentId) &&
        Objects.equals(this.afterId, inlineObject.afterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, afterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
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

