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
 * Endpoint used to search Pickup Locations by different parameters: - by attribute filters fields @see \\Magento\\InventoryInStorePickupApi\\Api\\Data\\SearchRequest\\FiltersInterface - by distance to the address @see \\Magento\\InventoryInStorePickupApi\\Api\\Data\\SearchRequest\\AreaInterface Also, endpoint supports paging and sort orders.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryInStorePickupApiDataSearchRequestInterface {
  public static final String SERIALIZED_NAME_AREA = "area";
  @Json(name = SERIALIZED_NAME_AREA)
  private InventoryInStorePickupApiDataSearchRequestAreaInterface area;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @Json(name = SERIALIZED_NAME_FILTERS)
  private InventoryInStorePickupApiDataSearchRequestFiltersInterface filters;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @Json(name = SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @Json(name = SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_SCOPE_TYPE = "scope_type";
  @Json(name = SERIALIZED_NAME_SCOPE_TYPE)
  private String scopeType;

  public static final String SERIALIZED_NAME_SCOPE_CODE = "scope_code";
  @Json(name = SERIALIZED_NAME_SCOPE_CODE)
  private String scopeCode;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @Json(name = SERIALIZED_NAME_SORT)
  private List<FrameworkSortOrder> sort = null;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private InventoryInStorePickupApiDataSearchRequestExtensionInterface extensionAttributes;


  public InventoryInStorePickupApiDataSearchRequestInterface area(InventoryInStorePickupApiDataSearchRequestAreaInterface area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/

  

  public InventoryInStorePickupApiDataSearchRequestAreaInterface getArea() {
    return area;
  }


  public void setArea(InventoryInStorePickupApiDataSearchRequestAreaInterface area) {
    this.area = area;
  }


  public InventoryInStorePickupApiDataSearchRequestInterface filters(InventoryInStorePickupApiDataSearchRequestFiltersInterface filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/

  

  public InventoryInStorePickupApiDataSearchRequestFiltersInterface getFilters() {
    return filters;
  }


  public void setFilters(InventoryInStorePickupApiDataSearchRequestFiltersInterface filters) {
    this.filters = filters;
  }


  public InventoryInStorePickupApiDataSearchRequestInterface pageSize(Integer pageSize) {
    
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


  public InventoryInStorePickupApiDataSearchRequestInterface currentPage(Integer currentPage) {
    
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


  public InventoryInStorePickupApiDataSearchRequestInterface scopeType(String scopeType) {
    
    this.scopeType = scopeType;
    return this;
  }

   /**
   * Sales Channel Type.
   * @return scopeType
  **/


  public String getScopeType() {
    return scopeType;
  }


  public void setScopeType(String scopeType) {
    this.scopeType = scopeType;
  }


  public InventoryInStorePickupApiDataSearchRequestInterface scopeCode(String scopeCode) {
    
    this.scopeCode = scopeCode;
    return this;
  }

   /**
   * Sales Channel code.
   * @return scopeCode
  **/


  public String getScopeCode() {
    return scopeCode;
  }


  public void setScopeCode(String scopeCode) {
    this.scopeCode = scopeCode;
  }


  public InventoryInStorePickupApiDataSearchRequestInterface sort(List<FrameworkSortOrder> sort) {
    
    this.sort = sort;
    return this;
  }

  public InventoryInStorePickupApiDataSearchRequestInterface addSortItem(FrameworkSortOrder sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<FrameworkSortOrder>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sort Order.
   * @return sort
  **/

  

  public List<FrameworkSortOrder> getSort() {
    return sort;
  }


  public void setSort(List<FrameworkSortOrder> sort) {
    this.sort = sort;
  }


  public InventoryInStorePickupApiDataSearchRequestInterface extensionAttributes(InventoryInStorePickupApiDataSearchRequestExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/

  

  public InventoryInStorePickupApiDataSearchRequestExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(InventoryInStorePickupApiDataSearchRequestExtensionInterface extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryInStorePickupApiDataSearchRequestInterface inventoryInStorePickupApiDataSearchRequestInterface = (InventoryInStorePickupApiDataSearchRequestInterface) o;
    return Objects.equals(this.area, inventoryInStorePickupApiDataSearchRequestInterface.area) &&
        Objects.equals(this.filters, inventoryInStorePickupApiDataSearchRequestInterface.filters) &&
        Objects.equals(this.pageSize, inventoryInStorePickupApiDataSearchRequestInterface.pageSize) &&
        Objects.equals(this.currentPage, inventoryInStorePickupApiDataSearchRequestInterface.currentPage) &&
        Objects.equals(this.scopeType, inventoryInStorePickupApiDataSearchRequestInterface.scopeType) &&
        Objects.equals(this.scopeCode, inventoryInStorePickupApiDataSearchRequestInterface.scopeCode) &&
        Objects.equals(this.sort, inventoryInStorePickupApiDataSearchRequestInterface.sort) &&
        Objects.equals(this.extensionAttributes, inventoryInStorePickupApiDataSearchRequestInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, filters, pageSize, currentPage, scopeType, scopeCode, sort, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryInStorePickupApiDataSearchRequestInterface {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
    sb.append("    scopeCode: ").append(toIndentedString(scopeCode)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
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

