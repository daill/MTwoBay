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

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Credit memo search result interface. After a customer places and pays for an order and an invoice has been issued, the merchant can create a credit memo to refund all or part of the amount paid for any returned or undelivered items. The memo restores funds to the customer account so that the customer can make future purchases.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataCreditmemoSearchResultInterface {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SalesDataCreditmemoInterface> items = new ArrayList<SalesDataCreditmemoInterface>();

  public static final String SERIALIZED_NAME_SEARCH_CRITERIA = "search_criteria";
  @SerializedName(SERIALIZED_NAME_SEARCH_CRITERIA)
  private FrameworkSearchCriteriaInterface searchCriteria;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;


  public SalesDataCreditmemoSearchResultInterface items(List<SalesDataCreditmemoInterface> items) {
    
    this.items = items;
    return this;
  }

  public SalesDataCreditmemoSearchResultInterface addItemsItem(SalesDataCreditmemoInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of collection items.
   * @return items
  **/


  public List<SalesDataCreditmemoInterface> getItems() {
    return items;
  }


  public void setItems(List<SalesDataCreditmemoInterface> items) {
    this.items = items;
  }


  public SalesDataCreditmemoSearchResultInterface searchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
    
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


  public SalesDataCreditmemoSearchResultInterface totalCount(Integer totalCount) {
    
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
    SalesDataCreditmemoSearchResultInterface salesDataCreditmemoSearchResultInterface = (SalesDataCreditmemoSearchResultInterface) o;
    return Objects.equals(this.items, salesDataCreditmemoSearchResultInterface.items) &&
        Objects.equals(this.searchCriteria, salesDataCreditmemoSearchResultInterface.searchCriteria) &&
        Objects.equals(this.totalCount, salesDataCreditmemoSearchResultInterface.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, searchCriteria, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataCreditmemoSearchResultInterface {\n");
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

