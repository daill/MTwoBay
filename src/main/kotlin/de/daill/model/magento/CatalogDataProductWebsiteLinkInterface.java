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

import java.util.Objects;


/**
 * CatalogDataProductWebsiteLinkInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductWebsiteLinkInterface {
  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_WEBSITE_ID = "website_id";
  @SerializedName(SERIALIZED_NAME_WEBSITE_ID)
  private Integer websiteId;


  public CatalogDataProductWebsiteLinkInterface sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public CatalogDataProductWebsiteLinkInterface websiteId(Integer websiteId) {
    
    this.websiteId = websiteId;
    return this;
  }

   /**
   * Website ids
   * @return websiteId
  **/
  

  public Integer getWebsiteId() {
    return websiteId;
  }


  public void setWebsiteId(Integer websiteId) {
    this.websiteId = websiteId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogDataProductWebsiteLinkInterface catalogDataProductWebsiteLinkInterface = (CatalogDataProductWebsiteLinkInterface) o;
    return Objects.equals(this.sku, catalogDataProductWebsiteLinkInterface.sku) &&
        Objects.equals(this.websiteId, catalogDataProductWebsiteLinkInterface.websiteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, websiteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductWebsiteLinkInterface {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    websiteId: ").append(toIndentedString(websiteId)).append("\n");
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

