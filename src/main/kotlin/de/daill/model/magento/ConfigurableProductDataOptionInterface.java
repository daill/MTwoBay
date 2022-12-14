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
 * Interface OptionInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class ConfigurableProductDataOptionInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
  @Json(name = SERIALIZED_NAME_ATTRIBUTE_ID)
  private String attributeId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @Json(name = SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @Json(name = SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_IS_USE_DEFAULT = "is_use_default";
  @Json(name = SERIALIZED_NAME_IS_USE_DEFAULT)
  private Boolean isUseDefault;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @Json(name = SERIALIZED_NAME_VALUES)
  private List<ConfigurableProductDataOptionValueInterface> values = null;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @Json(name = SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;


  public ConfigurableProductDataOptionInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ConfigurableProductDataOptionInterface attributeId(String attributeId) {
    
    this.attributeId = attributeId;
    return this;
  }

   /**
   * Get attributeId
   * @return attributeId
  **/
  


  public String getAttributeId() {
    return attributeId;
  }


  public void setAttributeId(String attributeId) {
    this.attributeId = attributeId;
  }


  public ConfigurableProductDataOptionInterface label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  


  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ConfigurableProductDataOptionInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  


  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public ConfigurableProductDataOptionInterface isUseDefault(Boolean isUseDefault) {
    
    this.isUseDefault = isUseDefault;
    return this;
  }

   /**
   * Get isUseDefault
   * @return isUseDefault
  **/
  


  public Boolean getIsUseDefault() {
    return isUseDefault;
  }


  public void setIsUseDefault(Boolean isUseDefault) {
    this.isUseDefault = isUseDefault;
  }


  public ConfigurableProductDataOptionInterface values(List<ConfigurableProductDataOptionValueInterface> values) {
    
    this.values = values;
    return this;
  }

  public ConfigurableProductDataOptionInterface addValuesItem(ConfigurableProductDataOptionValueInterface valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<ConfigurableProductDataOptionValueInterface>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  


  public List<ConfigurableProductDataOptionValueInterface> getValues() {
    return values;
  }


  public void setValues(List<ConfigurableProductDataOptionValueInterface> values) {
    this.values = values;
  }


  public ConfigurableProductDataOptionInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\ConfigurableProduct\\Api\\Data\\OptionInterface
   * @return extensionAttributes
  **/
  


  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public ConfigurableProductDataOptionInterface productId(Integer productId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurableProductDataOptionInterface configurableProductDataOptionInterface = (ConfigurableProductDataOptionInterface) o;
    return Objects.equals(this.id, configurableProductDataOptionInterface.id) &&
        Objects.equals(this.attributeId, configurableProductDataOptionInterface.attributeId) &&
        Objects.equals(this.label, configurableProductDataOptionInterface.label) &&
        Objects.equals(this.position, configurableProductDataOptionInterface.position) &&
        Objects.equals(this.isUseDefault, configurableProductDataOptionInterface.isUseDefault) &&
        Objects.equals(this.values, configurableProductDataOptionInterface.values) &&
        Objects.equals(this.extensionAttributes, configurableProductDataOptionInterface.extensionAttributes) &&
        Objects.equals(this.productId, configurableProductDataOptionInterface.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributeId, label, position, isUseDefault, values, extensionAttributes, productId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurableProductDataOptionInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isUseDefault: ").append(toIndentedString(isUseDefault)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

