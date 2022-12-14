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
 * InlineObject46
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject46 {
  public static final String SERIALIZED_NAME_REQUISITION_LIST = "requisitionList";
  @Json(name = SERIALIZED_NAME_REQUISITION_LIST)
  private RequisitionListDataRequisitionListInterface requisitionList;


  public InlineObject46 requisitionList(RequisitionListDataRequisitionListInterface requisitionList) {
    
    this.requisitionList = requisitionList;
    return this;
  }

   /**
   * Get requisitionList
   * @return requisitionList
  **/
  

  public RequisitionListDataRequisitionListInterface getRequisitionList() {
    return requisitionList;
  }


  public void setRequisitionList(RequisitionListDataRequisitionListInterface requisitionList) {
    this.requisitionList = requisitionList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject46 inlineObject46 = (InlineObject46) o;
    return Objects.equals(this.requisitionList, inlineObject46.requisitionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requisitionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject46 {\n");
    sb.append("    requisitionList: ").append(toIndentedString(requisitionList)).append("\n");
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

