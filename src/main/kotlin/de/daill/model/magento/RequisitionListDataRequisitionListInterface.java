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
 * Interface RequisitionListInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class RequisitionListDataRequisitionListInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @Json(name = SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @Json(name = SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @Json(name = SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @Json(name = SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @Json(name = SERIALIZED_NAME_ITEMS)
  private List<RequisitionListDataRequisitionListItemInterface> items = new ArrayList<RequisitionListDataRequisitionListItemInterface>();

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public RequisitionListDataRequisitionListInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Requisition List ID
   * @return id
  **/


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RequisitionListDataRequisitionListInterface customerId(Integer customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer ID
   * @return customerId
  **/


  public Integer getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public RequisitionListDataRequisitionListInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Requisition List Name
   * @return name
  **/


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RequisitionListDataRequisitionListInterface updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Requisition List Update Time
   * @return updatedAt
  **/


  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RequisitionListDataRequisitionListInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Requisition List Description
   * @return description
  **/


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RequisitionListDataRequisitionListInterface items(List<RequisitionListDataRequisitionListItemInterface> items) {
    
    this.items = items;
    return this;
  }

  public RequisitionListDataRequisitionListInterface addItemsItem(RequisitionListDataRequisitionListItemInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Requisition List Items
   * @return items
  **/


  public List<RequisitionListDataRequisitionListItemInterface> getItems() {
    return items;
  }


  public void setItems(List<RequisitionListDataRequisitionListItemInterface> items) {
    this.items = items;
  }


  public RequisitionListDataRequisitionListInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\RequisitionList\\Api\\Data\\RequisitionListInterface
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
    RequisitionListDataRequisitionListInterface requisitionListDataRequisitionListInterface = (RequisitionListDataRequisitionListInterface) o;
    return Objects.equals(this.id, requisitionListDataRequisitionListInterface.id) &&
        Objects.equals(this.customerId, requisitionListDataRequisitionListInterface.customerId) &&
        Objects.equals(this.name, requisitionListDataRequisitionListInterface.name) &&
        Objects.equals(this.updatedAt, requisitionListDataRequisitionListInterface.updatedAt) &&
        Objects.equals(this.description, requisitionListDataRequisitionListInterface.description) &&
        Objects.equals(this.items, requisitionListDataRequisitionListInterface.items) &&
        Objects.equals(this.extensionAttributes, requisitionListDataRequisitionListInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, name, updatedAt, description, items, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequisitionListDataRequisitionListInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

