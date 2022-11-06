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
 * Interface AttributeSetInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class EavDataAttributeSetInterface {
  public static final String SERIALIZED_NAME_ATTRIBUTE_SET_ID = "attribute_set_id";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_SET_ID)
  private Integer attributeSetId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_SET_NAME = "attribute_set_name";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_SET_NAME)
  private String attributeSetName;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_ID = "entity_type_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_ID)
  private Integer entityTypeId;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public EavDataAttributeSetInterface attributeSetId(Integer attributeSetId) {
    
    this.attributeSetId = attributeSetId;
    return this;
  }

   /**
   * Attribute set ID
   * @return attributeSetId
  **/



  public Integer getAttributeSetId() {
    return attributeSetId;
  }


  public void setAttributeSetId(Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }


  public EavDataAttributeSetInterface attributeSetName(String attributeSetName) {
    
    this.attributeSetName = attributeSetName;
    return this;
  }

   /**
   * Attribute set name
   * @return attributeSetName
  **/


  public String getAttributeSetName() {
    return attributeSetName;
  }


  public void setAttributeSetName(String attributeSetName) {
    this.attributeSetName = attributeSetName;
  }


  public EavDataAttributeSetInterface sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Attribute set sort order index
   * @return sortOrder
  **/


  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public EavDataAttributeSetInterface entityTypeId(Integer entityTypeId) {
    
    this.entityTypeId = entityTypeId;
    return this;
  }

   /**
   * Attribute set entity type id
   * @return entityTypeId
  **/



  public Integer getEntityTypeId() {
    return entityTypeId;
  }


  public void setEntityTypeId(Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }


  public EavDataAttributeSetInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Eav\\Api\\Data\\AttributeSetInterface
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
    EavDataAttributeSetInterface eavDataAttributeSetInterface = (EavDataAttributeSetInterface) o;
    return Objects.equals(this.attributeSetId, eavDataAttributeSetInterface.attributeSetId) &&
        Objects.equals(this.attributeSetName, eavDataAttributeSetInterface.attributeSetName) &&
        Objects.equals(this.sortOrder, eavDataAttributeSetInterface.sortOrder) &&
        Objects.equals(this.entityTypeId, eavDataAttributeSetInterface.entityTypeId) &&
        Objects.equals(this.extensionAttributes, eavDataAttributeSetInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeSetId, attributeSetName, sortOrder, entityTypeId, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EavDataAttributeSetInterface {\n");
    sb.append("    attributeSetId: ").append(toIndentedString(attributeSetId)).append("\n");
    sb.append("    attributeSetName: ").append(toIndentedString(attributeSetName)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    entityTypeId: ").append(toIndentedString(entityTypeId)).append("\n");
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

