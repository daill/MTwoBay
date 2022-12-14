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
 * Interface StockStatusInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogInventoryDataStockStatusInterface {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @Json(name = SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_STOCK_ID = "stock_id";
  @Json(name = SERIALIZED_NAME_STOCK_ID)
  private Integer stockId;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @Json(name = SERIALIZED_NAME_QTY)
  private Integer qty;

  public static final String SERIALIZED_NAME_STOCK_STATUS = "stock_status";
  @Json(name = SERIALIZED_NAME_STOCK_STATUS)
  private Integer stockStatus;

  public static final String SERIALIZED_NAME_STOCK_ITEM = "stock_item";
  @Json(name = SERIALIZED_NAME_STOCK_ITEM)
  private CatalogInventoryDataStockItemInterface stockItem;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogInventoryDataStockStatusInterface productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/


  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public CatalogInventoryDataStockStatusInterface stockId(Integer stockId) {
    
    this.stockId = stockId;
    return this;
  }

   /**
   * Get stockId
   * @return stockId
  **/


  public Integer getStockId() {
    return stockId;
  }


  public void setStockId(Integer stockId) {
    this.stockId = stockId;
  }


  public CatalogInventoryDataStockStatusInterface qty(Integer qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/


  public Integer getQty() {
    return qty;
  }


  public void setQty(Integer qty) {
    this.qty = qty;
  }


  public CatalogInventoryDataStockStatusInterface stockStatus(Integer stockStatus) {
    
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * Get stockStatus
   * @return stockStatus
  **/


  public Integer getStockStatus() {
    return stockStatus;
  }


  public void setStockStatus(Integer stockStatus) {
    this.stockStatus = stockStatus;
  }


  public CatalogInventoryDataStockStatusInterface stockItem(CatalogInventoryDataStockItemInterface stockItem) {
    
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


  public CatalogInventoryDataStockStatusInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\CatalogInventory\\Api\\Data\\StockStatusInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
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
    CatalogInventoryDataStockStatusInterface catalogInventoryDataStockStatusInterface = (CatalogInventoryDataStockStatusInterface) o;
    return Objects.equals(this.productId, catalogInventoryDataStockStatusInterface.productId) &&
        Objects.equals(this.stockId, catalogInventoryDataStockStatusInterface.stockId) &&
        Objects.equals(this.qty, catalogInventoryDataStockStatusInterface.qty) &&
        Objects.equals(this.stockStatus, catalogInventoryDataStockStatusInterface.stockStatus) &&
        Objects.equals(this.stockItem, catalogInventoryDataStockStatusInterface.stockItem) &&
        Objects.equals(this.extensionAttributes, catalogInventoryDataStockStatusInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, stockId, qty, stockStatus, stockItem, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInventoryDataStockStatusInterface {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    stockItem: ").append(toIndentedString(stockItem)).append("\n");
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

