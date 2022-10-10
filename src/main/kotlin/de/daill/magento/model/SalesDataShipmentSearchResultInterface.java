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


import java.util.ArrayList;
import java.util.List;

/**
 * Shipment search result interface. A shipment is a delivery package that contains products. A shipment document accompanies the shipment. This document lists the products and their quantities in the delivery package.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataShipmentSearchResultInterface {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SalesDataShipmentInterface> items = new ArrayList<SalesDataShipmentInterface>();

  public static final String SERIALIZED_NAME_SEARCH_CRITERIA = "search_criteria";
  @SerializedName(SERIALIZED_NAME_SEARCH_CRITERIA)
  private FrameworkSearchCriteriaInterface searchCriteria;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;


  public SalesDataShipmentSearchResultInterface items(List<SalesDataShipmentInterface> items) {
    
    this.items = items;
    return this;
  }

  public SalesDataShipmentSearchResultInterface addItemsItem(SalesDataShipmentInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of collection items.
   * @return items
  **/
  

  public List<SalesDataShipmentInterface> getItems() {
    return items;
  }


  public void setItems(List<SalesDataShipmentInterface> items) {
    this.items = items;
  }


  public SalesDataShipmentSearchResultInterface searchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
    
    this.searchCriteria = searchCriteria;
    return this;
  }

   /**
   * Get searchCriteria
   * @return searchCriteria
  **/
  

  public FrameworkSearchCriteriaInterface getSearchCriteria() {
    return searchCriteria;
  }


  public void setSearchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
    this.searchCriteria = searchCriteria;
  }


  public SalesDataShipmentSearchResultInterface totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total count.
   * @return totalCount
  **/
  

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataShipmentSearchResultInterface salesDataShipmentSearchResultInterface = (SalesDataShipmentSearchResultInterface) o;
    return Objects.equals(this.items, salesDataShipmentSearchResultInterface.items) &&
        Objects.equals(this.searchCriteria, salesDataShipmentSearchResultInterface.searchCriteria) &&
        Objects.equals(this.totalCount, salesDataShipmentSearchResultInterface.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, searchCriteria, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataShipmentSearchResultInterface {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    searchCriteria: ").append(toIndentedString(searchCriteria)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

