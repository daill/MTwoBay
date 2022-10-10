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
 * Interface SearchCriteriaInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkSearchSearchCriteriaInterface {
  public static final String SERIALIZED_NAME_REQUEST_NAME = "request_name";
  @SerializedName(SERIALIZED_NAME_REQUEST_NAME)
  private String requestName;

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


  public FrameworkSearchSearchCriteriaInterface requestName(String requestName) {
    
    this.requestName = requestName;
    return this;
  }

   /**
   * Get requestName
   * @return requestName
  **/


  public String getRequestName() {
    return requestName;
  }


  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }


  public FrameworkSearchSearchCriteriaInterface filterGroups(List<FrameworkSearchFilterGroup> filterGroups) {
    
    this.filterGroups = filterGroups;
    return this;
  }

  public FrameworkSearchSearchCriteriaInterface addFilterGroupsItem(FrameworkSearchFilterGroup filterGroupsItem) {
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


  public FrameworkSearchSearchCriteriaInterface sortOrders(List<FrameworkSortOrder> sortOrders) {
    
    this.sortOrders = sortOrders;
    return this;
  }

  public FrameworkSearchSearchCriteriaInterface addSortOrdersItem(FrameworkSortOrder sortOrdersItem) {
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


  public FrameworkSearchSearchCriteriaInterface pageSize(Integer pageSize) {
    
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


  public FrameworkSearchSearchCriteriaInterface currentPage(Integer currentPage) {
    
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
    FrameworkSearchSearchCriteriaInterface frameworkSearchSearchCriteriaInterface = (FrameworkSearchSearchCriteriaInterface) o;
    return Objects.equals(this.requestName, frameworkSearchSearchCriteriaInterface.requestName) &&
        Objects.equals(this.filterGroups, frameworkSearchSearchCriteriaInterface.filterGroups) &&
        Objects.equals(this.sortOrders, frameworkSearchSearchCriteriaInterface.sortOrders) &&
        Objects.equals(this.pageSize, frameworkSearchSearchCriteriaInterface.pageSize) &&
        Objects.equals(this.currentPage, frameworkSearchSearchCriteriaInterface.currentPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestName, filterGroups, sortOrders, pageSize, currentPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchSearchCriteriaInterface {\n");
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
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

