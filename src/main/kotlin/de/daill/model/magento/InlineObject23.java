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
 * InlineObject23
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject23 {
  public static final String SERIALIZED_NAME_SOURCE_ITEM_CONFIGURATIONS = "sourceItemConfigurations";
  @Json(name = SERIALIZED_NAME_SOURCE_ITEM_CONFIGURATIONS)
  private List<InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface> sourceItemConfigurations = new ArrayList<InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface>();


  public InlineObject23 sourceItemConfigurations(List<InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface> sourceItemConfigurations) {
    
    this.sourceItemConfigurations = sourceItemConfigurations;
    return this;
  }

  public InlineObject23 addSourceItemConfigurationsItem(InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface sourceItemConfigurationsItem) {
    this.sourceItemConfigurations.add(sourceItemConfigurationsItem);
    return this;
  }

   /**
   * Get sourceItemConfigurations
   * @return sourceItemConfigurations
  **/
  

  public List<InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface> getSourceItemConfigurations() {
    return sourceItemConfigurations;
  }


  public void setSourceItemConfigurations(List<InventoryLowQuantityNotificationApiDataSourceItemConfigurationInterface> sourceItemConfigurations) {
    this.sourceItemConfigurations = sourceItemConfigurations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject23 inlineObject23 = (InlineObject23) o;
    return Objects.equals(this.sourceItemConfigurations, inlineObject23.sourceItemConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceItemConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject23 {\n");
    sb.append("    sourceItemConfigurations: ").append(toIndentedString(sourceItemConfigurations)).append("\n");
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

