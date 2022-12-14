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
 * InlineObject37
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject37 {
  public static final String SERIALIZED_NAME_STATUS_HISTORY = "statusHistory";
  @Json(name = SERIALIZED_NAME_STATUS_HISTORY)
  private SalesDataOrderStatusHistoryInterface statusHistory;


  public InlineObject37 statusHistory(SalesDataOrderStatusHistoryInterface statusHistory) {
    
    this.statusHistory = statusHistory;
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/


  public SalesDataOrderStatusHistoryInterface getStatusHistory() {
    return statusHistory;
  }


  public void setStatusHistory(SalesDataOrderStatusHistoryInterface statusHistory) {
    this.statusHistory = statusHistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject37 inlineObject37 = (InlineObject37) o;
    return Objects.equals(this.statusHistory, inlineObject37.statusHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject37 {\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
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

