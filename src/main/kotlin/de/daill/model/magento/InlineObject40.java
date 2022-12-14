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
 * InlineObject40
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject40 {
  public static final String SERIALIZED_NAME_ATTRIBUTE_SET_ID = "attributeSetId";
  @Json(name = SERIALIZED_NAME_ATTRIBUTE_SET_ID)
  private Integer attributeSetId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_GROUP_ID = "attributeGroupId";
  @Json(name = SERIALIZED_NAME_ATTRIBUTE_GROUP_ID)
  private Integer attributeGroupId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attributeCode";
  @Json(name = SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @Json(name = SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;


  public InlineObject40 attributeSetId(Integer attributeSetId) {
    
    this.attributeSetId = attributeSetId;
    return this;
  }

   /**
   * Get attributeSetId
   * @return attributeSetId
  **/
  

  public Integer getAttributeSetId() {
    return attributeSetId;
  }


  public void setAttributeSetId(Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }


  public InlineObject40 attributeGroupId(Integer attributeGroupId) {
    
    this.attributeGroupId = attributeGroupId;
    return this;
  }

   /**
   * Get attributeGroupId
   * @return attributeGroupId
  **/
  

  public Integer getAttributeGroupId() {
    return attributeGroupId;
  }


  public void setAttributeGroupId(Integer attributeGroupId) {
    this.attributeGroupId = attributeGroupId;
  }


  public InlineObject40 attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Get attributeCode
   * @return attributeCode
  **/
  

  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  public InlineObject40 sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  

  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject40 inlineObject40 = (InlineObject40) o;
    return Objects.equals(this.attributeSetId, inlineObject40.attributeSetId) &&
        Objects.equals(this.attributeGroupId, inlineObject40.attributeGroupId) &&
        Objects.equals(this.attributeCode, inlineObject40.attributeCode) &&
        Objects.equals(this.sortOrder, inlineObject40.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeSetId, attributeGroupId, attributeCode, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject40 {\n");
    sb.append("    attributeSetId: ").append(toIndentedString(attributeSetId)).append("\n");
    sb.append("    attributeGroupId: ").append(toIndentedString(attributeGroupId)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

