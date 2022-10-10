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
 * Search criteria interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkSearchCriteriaInterface {
  public static final String SERIALIZED_NAME_FILTER_GROUPS = "filter_groups";
  @SerializedName(SERIALIZED_NAME_FILTER_GROUPS)
  private List<FrameworkSearchFilterGroup> filterGroups = new ArrayList<FrameworkSearchFilterGroup>();

  public static final String SERIALIZED_NAME_SORT_ORDERS = "sort_orders";
  @SerializedName(SERIALIZED_NAME_SORT_ORDERS)
  private List<FrameworkSortOrder> sortOrders = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;


  public FrameworkSearchCriteriaInterface filterGroups(List<FrameworkSearchFilterGroup> filterGroups) {
    
    this.filterGroups = filterGroups;
    return this;
  }

  public FrameworkSearchCriteriaInterface addFilterGroupsItem(FrameworkSearchFilterGroup filterGroupsItem) {
    this.filterGroups.add(filterGroupsItem);
    return this;
  }

   /**
   * A list of filter groups.
   * @return filterGroups
  **/
  

  public List<FrameworkSearchFilterGroup> getFilterGroups() {
    return filterGroups;
  }


  public void setFilterGroups(List<FrameworkSearchFilterGroup> filterGroups) {
    this.filterGroups = filterGroups;
  }


  public FrameworkSearchCriteriaInterface sortOrders(List<FrameworkSortOrder> sortOrders) {
    
    this.sortOrders = sortOrders;
    return this;
  }

  public FrameworkSearchCriteriaInterface addSortOrdersItem(FrameworkSortOrder sortOrdersItem) {
    if (this.sortOrders == null) {
      this.sortOrders = new ArrayList<FrameworkSortOrder>();
    }
    this.sortOrders.add(sortOrdersItem);
    return this;
  }

   /**
   * Sort order.
   * @return sortOrders
  **/
  
  

  public List<FrameworkSortOrder> getSortOrders() {
    return sortOrders;
  }


  public void setSortOrders(List<FrameworkSortOrder> sortOrders) {
    this.sortOrders = sortOrders;
  }


  public FrameworkSearchCriteriaInterface pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size.
   * @return pageSize
  **/
  
  

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public FrameworkSearchCriteriaInterface currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Current page.
   * @return currentPage
  **/
  
  

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkSearchCriteriaInterface frameworkSearchCriteriaInterface = (FrameworkSearchCriteriaInterface) o;
    return Objects.equals(this.filterGroups, frameworkSearchCriteriaInterface.filterGroups) &&
        Objects.equals(this.sortOrders, frameworkSearchCriteriaInterface.sortOrders) &&
        Objects.equals(this.pageSize, frameworkSearchCriteriaInterface.pageSize) &&
        Objects.equals(this.currentPage, frameworkSearchCriteriaInterface.currentPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterGroups, sortOrders, pageSize, currentPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchCriteriaInterface {\n");
    sb.append("    filterGroups: ").append(toIndentedString(filterGroups)).append("\n");
    sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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
