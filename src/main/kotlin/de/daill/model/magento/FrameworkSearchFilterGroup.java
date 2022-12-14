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
 * Groups two or more filters together using a logical OR
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkSearchFilterGroup {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @Json(name = SERIALIZED_NAME_FILTERS)
  private List<FrameworkFilter> filters = null;


  public FrameworkSearchFilterGroup filters(List<FrameworkFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public FrameworkSearchFilterGroup addFiltersItem(FrameworkFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<FrameworkFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * A list of filters in this group
   * @return filters
  **/



  public List<FrameworkFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<FrameworkFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkSearchFilterGroup frameworkSearchFilterGroup = (FrameworkSearchFilterGroup) o;
    return Objects.equals(this.filters, frameworkSearchFilterGroup.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchFilterGroup {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

