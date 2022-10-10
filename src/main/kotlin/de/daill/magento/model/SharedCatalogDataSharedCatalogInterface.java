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
 * SharedCatalogInterface interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SharedCatalogDataSharedCatalogInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CUSTOMER_GROUP_ID = "customer_group_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GROUP_ID)
  private Integer customerGroupId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_TAX_CLASS_ID = "tax_class_id";
  @SerializedName(SERIALIZED_NAME_TAX_CLASS_ID)
  private Integer taxClassId;


  public SharedCatalogDataSharedCatalogInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID.
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SharedCatalogDataSharedCatalogInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Shared Catalog name.
   * @return name
  **/


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SharedCatalogDataSharedCatalogInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Shared Catalog description.
   * @return description
  **/


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SharedCatalogDataSharedCatalogInterface customerGroupId(Integer customerGroupId) {
    
    this.customerGroupId = customerGroupId;
    return this;
  }

   /**
   * Customer Group Id.
   * @return customerGroupId
  **/


  public Integer getCustomerGroupId() {
    return customerGroupId;
  }


  public void setCustomerGroupId(Integer customerGroupId) {
    this.customerGroupId = customerGroupId;
  }


  public SharedCatalogDataSharedCatalogInterface type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Shared Catalog type.
   * @return type
  **/


  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public SharedCatalogDataSharedCatalogInterface createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created time for Shared Catalog.
   * @return createdAt
  **/


  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SharedCatalogDataSharedCatalogInterface createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Admin id for Shared Catalog.
   * @return createdBy
  **/


  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public SharedCatalogDataSharedCatalogInterface storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Store group id for Shared Catalog.
   * @return storeId
  **/


  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public SharedCatalogDataSharedCatalogInterface taxClassId(Integer taxClassId) {
    
    this.taxClassId = taxClassId;
    return this;
  }

   /**
   * Tax class id.
   * @return taxClassId
  **/


  public Integer getTaxClassId() {
    return taxClassId;
  }


  public void setTaxClassId(Integer taxClassId) {
    this.taxClassId = taxClassId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCatalogDataSharedCatalogInterface sharedCatalogDataSharedCatalogInterface = (SharedCatalogDataSharedCatalogInterface) o;
    return Objects.equals(this.id, sharedCatalogDataSharedCatalogInterface.id) &&
        Objects.equals(this.name, sharedCatalogDataSharedCatalogInterface.name) &&
        Objects.equals(this.description, sharedCatalogDataSharedCatalogInterface.description) &&
        Objects.equals(this.customerGroupId, sharedCatalogDataSharedCatalogInterface.customerGroupId) &&
        Objects.equals(this.type, sharedCatalogDataSharedCatalogInterface.type) &&
        Objects.equals(this.createdAt, sharedCatalogDataSharedCatalogInterface.createdAt) &&
        Objects.equals(this.createdBy, sharedCatalogDataSharedCatalogInterface.createdBy) &&
        Objects.equals(this.storeId, sharedCatalogDataSharedCatalogInterface.storeId) &&
        Objects.equals(this.taxClassId, sharedCatalogDataSharedCatalogInterface.taxClassId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, customerGroupId, type, createdAt, createdBy, storeId, taxClassId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCatalogDataSharedCatalogInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customerGroupId: ").append(toIndentedString(customerGroupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    taxClassId: ").append(toIndentedString(taxClassId)).append("\n");
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

