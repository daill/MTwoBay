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
 * Represents product aggregation among some different physical storages (in technical words, it is an index) Used fully qualified namespaces in annotations for proper work of WebApi request parser
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryApiDataStockInterface {
  public static final String SERIALIZED_NAME_STOCK_ID = "stock_id";
  @Json(name = SERIALIZED_NAME_STOCK_ID)
  private Integer stockId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @Json(name = SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private InventoryApiDataStockExtensionInterface extensionAttributes;


  public InventoryApiDataStockInterface stockId(Integer stockId) {
    
    this.stockId = stockId;
    return this;
  }

   /**
   * Stock id
   * @return stockId
  **/
  
  

  public Integer getStockId() {
    return stockId;
  }


  public void setStockId(Integer stockId) {
    this.stockId = stockId;
  }


  public InventoryApiDataStockInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Stock name
   * @return name
  **/
  
  

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InventoryApiDataStockInterface extensionAttributes(InventoryApiDataStockExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/
  
  

  public InventoryApiDataStockExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(InventoryApiDataStockExtensionInterface extensionAttributes) {
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
    InventoryApiDataStockInterface inventoryApiDataStockInterface = (InventoryApiDataStockInterface) o;
    return Objects.equals(this.stockId, inventoryApiDataStockInterface.stockId) &&
        Objects.equals(this.name, inventoryApiDataStockInterface.name) &&
        Objects.equals(this.extensionAttributes, inventoryApiDataStockInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockId, name, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiDataStockInterface {\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

