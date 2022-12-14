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

import java.util.Objects;


/**
 * Order status history interface. An order is a document that a web store issues to a customer. Magento generates a sales order that lists the product items, billing and shipping addresses, and shipping and payment methods. A corresponding external document, known as a purchase order, is emailed to the customer.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataOrderStatusHistoryInterface {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @Json(name = SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @Json(name = SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @Json(name = SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entity_name";
  @Json(name = SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_IS_CUSTOMER_NOTIFIED = "is_customer_notified";
  @Json(name = SERIALIZED_NAME_IS_CUSTOMER_NOTIFIED)
  private Integer isCustomerNotified;

  public static final String SERIALIZED_NAME_IS_VISIBLE_ON_FRONT = "is_visible_on_front";
  @Json(name = SERIALIZED_NAME_IS_VISIBLE_ON_FRONT)
  private Integer isVisibleOnFront;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @Json(name = SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @Json(name = SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public SalesDataOrderStatusHistoryInterface comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment.
   * @return comment
  **/
  

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public SalesDataOrderStatusHistoryInterface createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created-at timestamp.
   * @return createdAt
  **/
  
  

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SalesDataOrderStatusHistoryInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Order status history ID.
   * @return entityId
  **/
  
  

  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  public SalesDataOrderStatusHistoryInterface entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Entity name.
   * @return entityName
  **/
  
  

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public SalesDataOrderStatusHistoryInterface isCustomerNotified(Integer isCustomerNotified) {
    
    this.isCustomerNotified = isCustomerNotified;
    return this;
  }

   /**
   * Is-customer-notified flag value.
   * @return isCustomerNotified
  **/
  

  public Integer getIsCustomerNotified() {
    return isCustomerNotified;
  }


  public void setIsCustomerNotified(Integer isCustomerNotified) {
    this.isCustomerNotified = isCustomerNotified;
  }


  public SalesDataOrderStatusHistoryInterface isVisibleOnFront(Integer isVisibleOnFront) {
    
    this.isVisibleOnFront = isVisibleOnFront;
    return this;
  }

   /**
   * Is-visible-on-storefront flag value.
   * @return isVisibleOnFront
  **/
  

  public Integer getIsVisibleOnFront() {
    return isVisibleOnFront;
  }


  public void setIsVisibleOnFront(Integer isVisibleOnFront) {
    this.isVisibleOnFront = isVisibleOnFront;
  }


  public SalesDataOrderStatusHistoryInterface parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent ID.
   * @return parentId
  **/
  

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public SalesDataOrderStatusHistoryInterface status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status.
   * @return status
  **/
  
  

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public SalesDataOrderStatusHistoryInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\OrderStatusHistoryInterface
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
    SalesDataOrderStatusHistoryInterface salesDataOrderStatusHistoryInterface = (SalesDataOrderStatusHistoryInterface) o;
    return Objects.equals(this.comment, salesDataOrderStatusHistoryInterface.comment) &&
        Objects.equals(this.createdAt, salesDataOrderStatusHistoryInterface.createdAt) &&
        Objects.equals(this.entityId, salesDataOrderStatusHistoryInterface.entityId) &&
        Objects.equals(this.entityName, salesDataOrderStatusHistoryInterface.entityName) &&
        Objects.equals(this.isCustomerNotified, salesDataOrderStatusHistoryInterface.isCustomerNotified) &&
        Objects.equals(this.isVisibleOnFront, salesDataOrderStatusHistoryInterface.isVisibleOnFront) &&
        Objects.equals(this.parentId, salesDataOrderStatusHistoryInterface.parentId) &&
        Objects.equals(this.status, salesDataOrderStatusHistoryInterface.status) &&
        Objects.equals(this.extensionAttributes, salesDataOrderStatusHistoryInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdAt, entityId, entityName, isCustomerNotified, isVisibleOnFront, parentId, status, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataOrderStatusHistoryInterface {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    isCustomerNotified: ").append(toIndentedString(isCustomerNotified)).append("\n");
    sb.append("    isVisibleOnFront: ").append(toIndentedString(isVisibleOnFront)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

