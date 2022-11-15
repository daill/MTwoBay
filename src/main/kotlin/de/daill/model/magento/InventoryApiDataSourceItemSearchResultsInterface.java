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
 * Search results of Repository::getList method Used fully qualified namespaces in annotations for proper work of WebApi request parser
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryApiDataSourceItemSearchResultsInterface {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @Json(name = SERIALIZED_NAME_ITEMS)
  private List<InventoryApiDataSourceItemInterface> items = new ArrayList<InventoryApiDataSourceItemInterface>();

  public static final String SERIALIZED_NAME_SEARCH_CRITERIA = "search_criteria";
  @Json(name = SERIALIZED_NAME_SEARCH_CRITERIA)
  private FrameworkSearchCriteriaInterface searchCriteria;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @Json(name = SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;


  public InventoryApiDataSourceItemSearchResultsInterface items(List<InventoryApiDataSourceItemInterface> items) {
    
    this.items = items;
    return this;
  }

  public InventoryApiDataSourceItemSearchResultsInterface addItemsItem(InventoryApiDataSourceItemInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Source items list
   * @return items
  **/
  

  public List<InventoryApiDataSourceItemInterface> getItems() {
    return items;
  }


  public void setItems(List<InventoryApiDataSourceItemInterface> items) {
    this.items = items;
  }


  public InventoryApiDataSourceItemSearchResultsInterface searchCriteria(FrameworkSearchCriteriaInterface searchCriteria) {
    
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


  public InventoryApiDataSourceItemSearchResultsInterface totalCount(Integer totalCount) {
    
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
    InventoryApiDataSourceItemSearchResultsInterface inventoryApiDataSourceItemSearchResultsInterface = (InventoryApiDataSourceItemSearchResultsInterface) o;
    return Objects.equals(this.items, inventoryApiDataSourceItemSearchResultsInterface.items) &&
        Objects.equals(this.searchCriteria, inventoryApiDataSourceItemSearchResultsInterface.searchCriteria) &&
        Objects.equals(this.totalCount, inventoryApiDataSourceItemSearchResultsInterface.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, searchCriteria, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiDataSourceItemSearchResultsInterface {\n");
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

