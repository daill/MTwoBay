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
 * Interface for facet Bucket
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkSearchBucketInterface {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<FrameworkSearchAggregationValueInterface> values = new ArrayList<FrameworkSearchAggregationValueInterface>();


  public FrameworkSearchBucketInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Field name
   * @return name
  **/
  

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FrameworkSearchBucketInterface values(List<FrameworkSearchAggregationValueInterface> values) {
    
    this.values = values;
    return this;
  }

  public FrameworkSearchBucketInterface addValuesItem(FrameworkSearchAggregationValueInterface valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Field values
   * @return values
  **/
  

  public List<FrameworkSearchAggregationValueInterface> getValues() {
    return values;
  }


  public void setValues(List<FrameworkSearchAggregationValueInterface> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkSearchBucketInterface frameworkSearchBucketInterface = (FrameworkSearchBucketInterface) o;
    return Objects.equals(this.name, frameworkSearchBucketInterface.name) &&
        Objects.equals(this.values, frameworkSearchBucketInterface.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSearchBucketInterface {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

