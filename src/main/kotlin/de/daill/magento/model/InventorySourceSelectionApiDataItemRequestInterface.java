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


import java.math.BigDecimal;

/**
 * Represents requested quantity for particular product
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventorySourceSelectionApiDataItemRequestInterface {
  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private BigDecimal qty;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public InventorySourceSelectionApiDataItemRequestInterface sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * SKU
   * @return sku
  **/


  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public InventorySourceSelectionApiDataItemRequestInterface qty(BigDecimal qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Product Quantity
   * @return qty
  **/


  public BigDecimal getQty() {
    return qty;
  }


  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }


  public InventorySourceSelectionApiDataItemRequestInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\InventorySourceSelectionApi\\Api\\Data\\ItemRequestInterface
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
    InventorySourceSelectionApiDataItemRequestInterface inventorySourceSelectionApiDataItemRequestInterface = (InventorySourceSelectionApiDataItemRequestInterface) o;
    return Objects.equals(this.sku, inventorySourceSelectionApiDataItemRequestInterface.sku) &&
        Objects.equals(this.qty, inventorySourceSelectionApiDataItemRequestInterface.qty) &&
        Objects.equals(this.extensionAttributes, inventorySourceSelectionApiDataItemRequestInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, qty, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventorySourceSelectionApiDataItemRequestInterface {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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

