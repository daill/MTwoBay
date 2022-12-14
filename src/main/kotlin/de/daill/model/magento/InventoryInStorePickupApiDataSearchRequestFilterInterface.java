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

import java.util.Objects;


/**
 * Filter for Pickup Location search.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryInStorePickupApiDataSearchRequestFilterInterface {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @Json(name = SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CONDITION_TYPE = "condition_type";
  @Json(name = SERIALIZED_NAME_CONDITION_TYPE)
  private String conditionType;


  public InventoryInStorePickupApiDataSearchRequestFilterInterface value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value.
   * @return value
  **/
  

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public InventoryInStorePickupApiDataSearchRequestFilterInterface conditionType(String conditionType) {
    
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Condition Type.
   * @return conditionType
  **/
  

  public String getConditionType() {
    return conditionType;
  }


  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryInStorePickupApiDataSearchRequestFilterInterface inventoryInStorePickupApiDataSearchRequestFilterInterface = (InventoryInStorePickupApiDataSearchRequestFilterInterface) o;
    return Objects.equals(this.value, inventoryInStorePickupApiDataSearchRequestFilterInterface.value) &&
        Objects.equals(this.conditionType, inventoryInStorePickupApiDataSearchRequestFilterInterface.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, conditionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryInStorePickupApiDataSearchRequestFilterInterface {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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

