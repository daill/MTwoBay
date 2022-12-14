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
 * Interface StockItemCriteriaInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogInventoryStockItemCriteriaInterface {
  public static final String SERIALIZED_NAME_MAPPER_INTERFACE_NAME = "mapper_interface_name";
  @Json(name = SERIALIZED_NAME_MAPPER_INTERFACE_NAME)
  private String mapperInterfaceName;

  public static final String SERIALIZED_NAME_CRITERIA_LIST = "criteria_list";
  @Json(name = SERIALIZED_NAME_CRITERIA_LIST)
  private List<FrameworkCriteriaInterface> criteriaList = new ArrayList<FrameworkCriteriaInterface>();

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @Json(name = SERIALIZED_NAME_FILTERS)
  private List<String> filters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @Json(name = SERIALIZED_NAME_ORDERS)
  private List<String> orders = new ArrayList<String>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @Json(name = SERIALIZED_NAME_LIMIT)
  private List<String> limit = new ArrayList<String>();


  public CatalogInventoryStockItemCriteriaInterface mapperInterfaceName(String mapperInterfaceName) {
    
    this.mapperInterfaceName = mapperInterfaceName;
    return this;
  }

   /**
   * Associated Mapper Interface name
   * @return mapperInterfaceName
  **/
  

  public String getMapperInterfaceName() {
    return mapperInterfaceName;
  }


  public void setMapperInterfaceName(String mapperInterfaceName) {
    this.mapperInterfaceName = mapperInterfaceName;
  }


  public CatalogInventoryStockItemCriteriaInterface criteriaList(List<FrameworkCriteriaInterface> criteriaList) {
    
    this.criteriaList = criteriaList;
    return this;
  }

  public CatalogInventoryStockItemCriteriaInterface addCriteriaListItem(FrameworkCriteriaInterface criteriaListItem) {
    this.criteriaList.add(criteriaListItem);
    return this;
  }

   /**
   * Criteria objects added to current Composite Criteria
   * @return criteriaList
  **/
  

  public List<FrameworkCriteriaInterface> getCriteriaList() {
    return criteriaList;
  }


  public void setCriteriaList(List<FrameworkCriteriaInterface> criteriaList) {
    this.criteriaList = criteriaList;
  }


  public CatalogInventoryStockItemCriteriaInterface filters(List<String> filters) {
    
    this.filters = filters;
    return this;
  }

  public CatalogInventoryStockItemCriteriaInterface addFiltersItem(String filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * List of filters
   * @return filters
  **/
  

  public List<String> getFilters() {
    return filters;
  }


  public void setFilters(List<String> filters) {
    this.filters = filters;
  }


  public CatalogInventoryStockItemCriteriaInterface orders(List<String> orders) {
    
    this.orders = orders;
    return this;
  }

  public CatalogInventoryStockItemCriteriaInterface addOrdersItem(String ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Ordering criteria
   * @return orders
  **/
  

  public List<String> getOrders() {
    return orders;
  }


  public void setOrders(List<String> orders) {
    this.orders = orders;
  }


  public CatalogInventoryStockItemCriteriaInterface limit(List<String> limit) {
    
    this.limit = limit;
    return this;
  }

  public CatalogInventoryStockItemCriteriaInterface addLimitItem(String limitItem) {
    this.limit.add(limitItem);
    return this;
  }

   /**
   * Limit
   * @return limit
  **/
  

  public List<String> getLimit() {
    return limit;
  }


  public void setLimit(List<String> limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogInventoryStockItemCriteriaInterface catalogInventoryStockItemCriteriaInterface = (CatalogInventoryStockItemCriteriaInterface) o;
    return Objects.equals(this.mapperInterfaceName, catalogInventoryStockItemCriteriaInterface.mapperInterfaceName) &&
        Objects.equals(this.criteriaList, catalogInventoryStockItemCriteriaInterface.criteriaList) &&
        Objects.equals(this.filters, catalogInventoryStockItemCriteriaInterface.filters) &&
        Objects.equals(this.orders, catalogInventoryStockItemCriteriaInterface.orders) &&
        Objects.equals(this.limit, catalogInventoryStockItemCriteriaInterface.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapperInterfaceName, criteriaList, filters, orders, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInventoryStockItemCriteriaInterface {\n");
    sb.append("    mapperInterfaceName: ").append(toIndentedString(mapperInterfaceName)).append("\n");
    sb.append("    criteriaList: ").append(toIndentedString(criteriaList)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

