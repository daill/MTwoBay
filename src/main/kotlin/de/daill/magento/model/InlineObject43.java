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
 * InlineObject43
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject43 {
  public static final String SERIALIZED_NAME_STOCK_ITEM = "stockItem";
  @SerializedName(SERIALIZED_NAME_STOCK_ITEM)
  private CatalogInventoryDataStockItemInterface stockItem;


  public InlineObject43 stockItem(CatalogInventoryDataStockItemInterface stockItem) {
    
    this.stockItem = stockItem;
    return this;
  }

   /**
   * Get stockItem
   * @return stockItem
  **/
  

  public CatalogInventoryDataStockItemInterface getStockItem() {
    return stockItem;
  }


  public void setStockItem(CatalogInventoryDataStockItemInterface stockItem) {
    this.stockItem = stockItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject43 inlineObject43 = (InlineObject43) o;
    return Objects.equals(this.stockItem, inlineObject43.stockItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject43 {\n");
    sb.append("    stockItem: ").append(toIndentedString(stockItem)).append("\n");
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

