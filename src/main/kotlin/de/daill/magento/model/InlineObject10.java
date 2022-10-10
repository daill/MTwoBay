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
 * InlineObject10
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject10 {
  public static final String SERIALIZED_NAME_CREDITMEMO = "creditmemo";
  @SerializedName(SERIALIZED_NAME_CREDITMEMO)
  private SalesDataCreditmemoInterface creditmemo;

  public static final String SERIALIZED_NAME_OFFLINE_REQUESTED = "offlineRequested";
  @SerializedName(SERIALIZED_NAME_OFFLINE_REQUESTED)
  private Boolean offlineRequested;


  public InlineObject10 creditmemo(SalesDataCreditmemoInterface creditmemo) {
    
    this.creditmemo = creditmemo;
    return this;
  }

   /**
   * Get creditmemo
   * @return creditmemo
  **/


  public SalesDataCreditmemoInterface getCreditmemo() {
    return creditmemo;
  }


  public void setCreditmemo(SalesDataCreditmemoInterface creditmemo) {
    this.creditmemo = creditmemo;
  }


  public InlineObject10 offlineRequested(Boolean offlineRequested) {
    
    this.offlineRequested = offlineRequested;
    return this;
  }

   /**
   * Get offlineRequested
   * @return offlineRequested
  **/
  


  public Boolean getOfflineRequested() {
    return offlineRequested;
  }


  public void setOfflineRequested(Boolean offlineRequested) {
    this.offlineRequested = offlineRequested;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject10 inlineObject10 = (InlineObject10) o;
    return Objects.equals(this.creditmemo, inlineObject10.creditmemo) &&
        Objects.equals(this.offlineRequested, inlineObject10.offlineRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditmemo, offlineRequested);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject10 {\n");
    sb.append("    creditmemo: ").append(toIndentedString(creditmemo)).append("\n");
    sb.append("    offlineRequested: ").append(toIndentedString(offlineRequested)).append("\n");
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

