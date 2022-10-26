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


import java.math.BigDecimal;

/**
 * Product Render image interface. Represents physical characteristics of image, that can be used in product listing or product view
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductRenderImageInterface {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_RESIZED_WIDTH = "resized_width";
  @SerializedName(SERIALIZED_NAME_RESIZED_WIDTH)
  private BigDecimal resizedWidth;

  public static final String SERIALIZED_NAME_RESIZED_HEIGHT = "resized_height";
  @SerializedName(SERIALIZED_NAME_RESIZED_HEIGHT)
  private BigDecimal resizedHeight;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogDataProductRenderImageInterface url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Image url
   * @return url
  **/


  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CatalogDataProductRenderImageInterface code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Image code
   * @return code
  **/


  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CatalogDataProductRenderImageInterface height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Image height
   * @return height
  **/


  public BigDecimal getHeight() {
    return height;
  }


  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public CatalogDataProductRenderImageInterface width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

   /**
   * Image width in px
   * @return width
  **/


  public BigDecimal getWidth() {
    return width;
  }


  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  public CatalogDataProductRenderImageInterface label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Image label
   * @return label
  **/


  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CatalogDataProductRenderImageInterface resizedWidth(BigDecimal resizedWidth) {
    
    this.resizedWidth = resizedWidth;
    return this;
  }

   /**
   * Resize width
   * @return resizedWidth
  **/


  public BigDecimal getResizedWidth() {
    return resizedWidth;
  }


  public void setResizedWidth(BigDecimal resizedWidth) {
    this.resizedWidth = resizedWidth;
  }


  public CatalogDataProductRenderImageInterface resizedHeight(BigDecimal resizedHeight) {
    
    this.resizedHeight = resizedHeight;
    return this;
  }

   /**
   * Resize height
   * @return resizedHeight
  **/


  public BigDecimal getResizedHeight() {
    return resizedHeight;
  }


  public void setResizedHeight(BigDecimal resizedHeight) {
    this.resizedHeight = resizedHeight;
  }


  public CatalogDataProductRenderImageInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\ProductRender\\ImageInterface
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
    CatalogDataProductRenderImageInterface catalogDataProductRenderImageInterface = (CatalogDataProductRenderImageInterface) o;
    return Objects.equals(this.url, catalogDataProductRenderImageInterface.url) &&
        Objects.equals(this.code, catalogDataProductRenderImageInterface.code) &&
        Objects.equals(this.height, catalogDataProductRenderImageInterface.height) &&
        Objects.equals(this.width, catalogDataProductRenderImageInterface.width) &&
        Objects.equals(this.label, catalogDataProductRenderImageInterface.label) &&
        Objects.equals(this.resizedWidth, catalogDataProductRenderImageInterface.resizedWidth) &&
        Objects.equals(this.resizedHeight, catalogDataProductRenderImageInterface.resizedHeight) &&
        Objects.equals(this.extensionAttributes, catalogDataProductRenderImageInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, code, height, width, label, resizedWidth, resizedHeight, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductRenderImageInterface {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    resizedWidth: ").append(toIndentedString(resizedWidth)).append("\n");
    sb.append("    resizedHeight: ").append(toIndentedString(resizedHeight)).append("\n");
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
