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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;


/**
 * CatalogDataProductLinkInterface
 */
@Entity
@Table(name = "magento_product_link")
public class CatalogDataProductLinkInterface {
  public static final String SERIALIZED_NAME_SKU = "sku";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType;

  public static final String SERIALIZED_NAME_LINKED_PRODUCT_SKU = "linked_product_sku";
  @SerializedName(SERIALIZED_NAME_LINKED_PRODUCT_SKU)
  private String linkedProductSku;

  public static final String SERIALIZED_NAME_LINKED_PRODUCT_TYPE = "linked_product_type";
  @SerializedName(SERIALIZED_NAME_LINKED_PRODUCT_TYPE)
  private String linkedProductType;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private CatalogDataProductLinkExtensionInterface extensionAttributes;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CatalogDataProductLinkInterface sku(String sku) {
    
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


  public CatalogDataProductLinkInterface linkType(String linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Link type
   * @return linkType
  **/


  public String getLinkType() {
    return linkType;
  }


  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public CatalogDataProductLinkInterface linkedProductSku(String linkedProductSku) {
    
    this.linkedProductSku = linkedProductSku;
    return this;
  }

   /**
   * Linked product sku
   * @return linkedProductSku
  **/


  public String getLinkedProductSku() {
    return linkedProductSku;
  }


  public void setLinkedProductSku(String linkedProductSku) {
    this.linkedProductSku = linkedProductSku;
  }


  public CatalogDataProductLinkInterface linkedProductType(String linkedProductType) {
    
    this.linkedProductType = linkedProductType;
    return this;
  }

   /**
   * Linked product type (simple, virtual, etc)
   * @return linkedProductType
  **/


  public String getLinkedProductType() {
    return linkedProductType;
  }


  public void setLinkedProductType(String linkedProductType) {
    this.linkedProductType = linkedProductType;
  }


  public CatalogDataProductLinkInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Linked item position
   * @return position
  **/


  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public CatalogDataProductLinkInterface extensionAttributes(CatalogDataProductLinkExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public CatalogDataProductLinkExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(CatalogDataProductLinkExtensionInterface extensionAttributes) {
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
    CatalogDataProductLinkInterface catalogDataProductLinkInterface = (CatalogDataProductLinkInterface) o;
    return Objects.equals(this.sku, catalogDataProductLinkInterface.sku) &&
        Objects.equals(this.linkType, catalogDataProductLinkInterface.linkType) &&
        Objects.equals(this.linkedProductSku, catalogDataProductLinkInterface.linkedProductSku) &&
        Objects.equals(this.linkedProductType, catalogDataProductLinkInterface.linkedProductType) &&
        Objects.equals(this.position, catalogDataProductLinkInterface.position) &&
        Objects.equals(this.extensionAttributes, catalogDataProductLinkInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, linkType, linkedProductSku, linkedProductType, position, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductLinkInterface {\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkedProductSku: ").append(toIndentedString(linkedProductSku)).append("\n");
    sb.append("    linkedProductType: ").append(toIndentedString(linkedProductType)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

