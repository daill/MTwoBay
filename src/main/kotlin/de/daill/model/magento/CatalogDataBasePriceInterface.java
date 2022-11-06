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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Price interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataBasePriceInterface {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogDataBasePriceInterface price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price.
   * @return price
  **/


  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public CatalogDataBasePriceInterface storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Store id.
   * @return storeId
  **/


  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public CatalogDataBasePriceInterface sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * SKU.
   * @return sku
  **/


  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public CatalogDataBasePriceInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\BasePriceInterface
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
    CatalogDataBasePriceInterface catalogDataBasePriceInterface = (CatalogDataBasePriceInterface) o;
    return Objects.equals(this.price, catalogDataBasePriceInterface.price) &&
        Objects.equals(this.storeId, catalogDataBasePriceInterface.storeId) &&
        Objects.equals(this.sku, catalogDataBasePriceInterface.sku) &&
        Objects.equals(this.extensionAttributes, catalogDataBasePriceInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, storeId, sku, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataBasePriceInterface {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

