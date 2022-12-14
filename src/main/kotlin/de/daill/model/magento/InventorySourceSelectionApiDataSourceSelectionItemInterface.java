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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents source selection result for the specific source and SKU
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventorySourceSelectionApiDataSourceSelectionItemInterface {
  public static final String SERIALIZED_NAME_SOURCE_CODE = "source_code";
  @Json(name = SERIALIZED_NAME_SOURCE_CODE)
  private String sourceCode;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @Json(name = SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_QTY_TO_DEDUCT = "qty_to_deduct";
  @Json(name = SERIALIZED_NAME_QTY_TO_DEDUCT)
  private BigDecimal qtyToDeduct;

  public static final String SERIALIZED_NAME_QTY_AVAILABLE = "qty_available";
  @Json(name = SERIALIZED_NAME_QTY_AVAILABLE)
  private BigDecimal qtyAvailable;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public InventorySourceSelectionApiDataSourceSelectionItemInterface sourceCode(String sourceCode) {
    
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * Source code
   * @return sourceCode
  **/
  

  public String getSourceCode() {
    return sourceCode;
  }


  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  public InventorySourceSelectionApiDataSourceSelectionItemInterface sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Item SKU
   * @return sku
  **/
  

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public InventorySourceSelectionApiDataSourceSelectionItemInterface qtyToDeduct(BigDecimal qtyToDeduct) {
    
    this.qtyToDeduct = qtyToDeduct;
    return this;
  }

   /**
   * Quantity which will be deducted for this source
   * @return qtyToDeduct
  **/
  

  public BigDecimal getQtyToDeduct() {
    return qtyToDeduct;
  }


  public void setQtyToDeduct(BigDecimal qtyToDeduct) {
    this.qtyToDeduct = qtyToDeduct;
  }


  public InventorySourceSelectionApiDataSourceSelectionItemInterface qtyAvailable(BigDecimal qtyAvailable) {
    
    this.qtyAvailable = qtyAvailable;
    return this;
  }

   /**
   * Available quantity for this source
   * @return qtyAvailable
  **/
  

  public BigDecimal getQtyAvailable() {
    return qtyAvailable;
  }


  public void setQtyAvailable(BigDecimal qtyAvailable) {
    this.qtyAvailable = qtyAvailable;
  }


  public InventorySourceSelectionApiDataSourceSelectionItemInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\InventorySourceSelectionApi\\Api\\Data\\SourceSelectionItemInterface
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
    InventorySourceSelectionApiDataSourceSelectionItemInterface inventorySourceSelectionApiDataSourceSelectionItemInterface = (InventorySourceSelectionApiDataSourceSelectionItemInterface) o;
    return Objects.equals(this.sourceCode, inventorySourceSelectionApiDataSourceSelectionItemInterface.sourceCode) &&
        Objects.equals(this.sku, inventorySourceSelectionApiDataSourceSelectionItemInterface.sku) &&
        Objects.equals(this.qtyToDeduct, inventorySourceSelectionApiDataSourceSelectionItemInterface.qtyToDeduct) &&
        Objects.equals(this.qtyAvailable, inventorySourceSelectionApiDataSourceSelectionItemInterface.qtyAvailable) &&
        Objects.equals(this.extensionAttributes, inventorySourceSelectionApiDataSourceSelectionItemInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCode, sku, qtyToDeduct, qtyAvailable, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventorySourceSelectionApiDataSourceSelectionItemInterface {\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    qtyToDeduct: ").append(toIndentedString(qtyToDeduct)).append("\n");
    sb.append("    qtyAvailable: ").append(toIndentedString(qtyAvailable)).append("\n");
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

