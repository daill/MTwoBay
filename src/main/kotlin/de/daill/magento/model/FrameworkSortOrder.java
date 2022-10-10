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


/**
 * Data object for sort order.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class FrameworkSortOrder {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;


  public FrameworkSortOrder field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Sorting field.
   * @return field
  **/


  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public FrameworkSortOrder direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Sorting direction.
   * @return direction
  **/


  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrameworkSortOrder frameworkSortOrder = (FrameworkSortOrder) o;
    return Objects.equals(this.field, frameworkSortOrder.field) &&
        Objects.equals(this.direction, frameworkSortOrder.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrameworkSortOrder {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

