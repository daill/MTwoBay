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
 * CatalogDataProductCustomOptionTypeInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductCustomOptionTypeInterface {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogDataProductCustomOptionTypeInterface label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Option type label
   * @return label
  **/


  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CatalogDataProductCustomOptionTypeInterface code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Option type code
   * @return code
  **/


  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CatalogDataProductCustomOptionTypeInterface group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Option type group
   * @return group
  **/


  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public CatalogDataProductCustomOptionTypeInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\ProductCustomOptionTypeInterface
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
    CatalogDataProductCustomOptionTypeInterface catalogDataProductCustomOptionTypeInterface = (CatalogDataProductCustomOptionTypeInterface) o;
    return Objects.equals(this.label, catalogDataProductCustomOptionTypeInterface.label) &&
        Objects.equals(this.code, catalogDataProductCustomOptionTypeInterface.code) &&
        Objects.equals(this.group, catalogDataProductCustomOptionTypeInterface.group) &&
        Objects.equals(this.extensionAttributes, catalogDataProductCustomOptionTypeInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, code, group, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductCustomOptionTypeInterface {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

