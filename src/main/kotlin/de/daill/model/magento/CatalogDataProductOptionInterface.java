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
 * Product option interface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductOptionInterface {
  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private CatalogDataProductOptionExtensionInterface extensionAttributes;


  public CatalogDataProductOptionInterface extensionAttributes(CatalogDataProductOptionExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public CatalogDataProductOptionExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(CatalogDataProductOptionExtensionInterface extensionAttributes) {
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
    CatalogDataProductOptionInterface catalogDataProductOptionInterface = (CatalogDataProductOptionInterface) o;
    return Objects.equals(this.extensionAttributes, catalogDataProductOptionInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductOptionInterface {\n");
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

