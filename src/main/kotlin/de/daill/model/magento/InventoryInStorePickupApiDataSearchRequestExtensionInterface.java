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
 * ExtensionInterface class for @see \\Magento\\InventoryInStorePickupApi\\Api\\Data\\SearchRequestInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryInStorePickupApiDataSearchRequestExtensionInterface {
  public static final String SERIALIZED_NAME_PRODUCTS_INFO = "products_info";
  @Json(name = SERIALIZED_NAME_PRODUCTS_INFO)
  private List<InventoryInStorePickupApiDataSearchRequestProductInfoInterface> productsInfo = null;


  public InventoryInStorePickupApiDataSearchRequestExtensionInterface productsInfo(List<InventoryInStorePickupApiDataSearchRequestProductInfoInterface> productsInfo) {
    
    this.productsInfo = productsInfo;
    return this;
  }

  public InventoryInStorePickupApiDataSearchRequestExtensionInterface addProductsInfoItem(InventoryInStorePickupApiDataSearchRequestProductInfoInterface productsInfoItem) {
    if (this.productsInfo == null) {
      this.productsInfo = new ArrayList<InventoryInStorePickupApiDataSearchRequestProductInfoInterface>();
    }
    this.productsInfo.add(productsInfoItem);
    return this;
  }

   /**
   * Get productsInfo
   * @return productsInfo
  **/



  public List<InventoryInStorePickupApiDataSearchRequestProductInfoInterface> getProductsInfo() {
    return productsInfo;
  }


  public void setProductsInfo(List<InventoryInStorePickupApiDataSearchRequestProductInfoInterface> productsInfo) {
    this.productsInfo = productsInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryInStorePickupApiDataSearchRequestExtensionInterface inventoryInStorePickupApiDataSearchRequestExtensionInterface = (InventoryInStorePickupApiDataSearchRequestExtensionInterface) o;
    return Objects.equals(this.productsInfo, inventoryInStorePickupApiDataSearchRequestExtensionInterface.productsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productsInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryInStorePickupApiDataSearchRequestExtensionInterface {\n");
    sb.append("    productsInfo: ").append(toIndentedString(productsInfo)).append("\n");
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

