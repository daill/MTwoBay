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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Order search result interface. An order is a document that a web store issues to a customer. Magento generates a sales order that lists the product items, billing and shipping addresses, and shipping and payment methods. A corresponding external document, known as a purchase order, is emailed to the customer.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataOrderSearchResultInterface {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @Json(name = SERIALIZED_NAME_ITEMS)
  private List<SalesDataOrderInterface> items = new ArrayList<SalesDataOrderInterface>();

  public static final String SERIALIZED_NAME_SEARCH_CRITERIA = "search_criteria";
  @Json(name = SERIALIZED_NAME_SEARCH_CRITERIA)
  private FrameworkSearchCriteriaInterface searchCriteria;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @Json(name = SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;


  public SalesDataOrderSearchResultInterface items(List<SalesDataOrderInterface> items) {
    
    this.items = items;
    return this;
  }

  public SalesDataOrderSearchResultInterface addItemsItem(SalesDataOrderInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of collection items.
   * @return items
  **/


  public List<SalesDataOrderInterface> getItems() {
    return items;
  }


  public void setItems(List<SalesDataOrderInterface> items) {
    this.items = items;
  }


  public SalesDataOrderSearchResultInterface searchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
    
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


  public SalesDataOrderSearchResultInterface totalCount(Integer totalCount) {
    
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
    SalesDataOrderSearchResultInterface salesDataOrderSearchResultInterface = (SalesDataOrderSearchResultInterface) o;
    return Objects.equals(this.items, salesDataOrderSearchResultInterface.items) &&
        Objects.equals(this.searchCriteria, salesDataOrderSearchResultInterface.searchCriteria) &&
        Objects.equals(this.totalCount, salesDataOrderSearchResultInterface.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, searchCriteria, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataOrderSearchResultInterface {\n");
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

