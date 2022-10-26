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


/**
 * Shipment comment interface. A shipment is a delivery package that contains products. A shipment document accompanies the shipment. This document lists the products and their quantities in the delivery package. A shipment document can contain comments.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataShipmentCommentInterface {
  public static final String SERIALIZED_NAME_IS_CUSTOMER_NOTIFIED = "is_customer_notified";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOMER_NOTIFIED)
  private Integer isCustomerNotified;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_IS_VISIBLE_ON_FRONT = "is_visible_on_front";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_ON_FRONT)
  private Integer isVisibleOnFront;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;


  public SalesDataShipmentCommentInterface isCustomerNotified(Integer isCustomerNotified) {
    
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


  public SalesDataShipmentCommentInterface parentId(Integer parentId) {
    
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


  public SalesDataShipmentCommentInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\ShipmentCommentInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public SalesDataShipmentCommentInterface comment(String comment) {
    
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


  public SalesDataShipmentCommentInterface isVisibleOnFront(Integer isVisibleOnFront) {
    
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


  public SalesDataShipmentCommentInterface createdAt(String createdAt) {
    
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


  public SalesDataShipmentCommentInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Invoice ID.
   * @return entityId
  **/



  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataShipmentCommentInterface salesDataShipmentCommentInterface = (SalesDataShipmentCommentInterface) o;
    return Objects.equals(this.isCustomerNotified, salesDataShipmentCommentInterface.isCustomerNotified) &&
        Objects.equals(this.parentId, salesDataShipmentCommentInterface.parentId) &&
        Objects.equals(this.extensionAttributes, salesDataShipmentCommentInterface.extensionAttributes) &&
        Objects.equals(this.comment, salesDataShipmentCommentInterface.comment) &&
        Objects.equals(this.isVisibleOnFront, salesDataShipmentCommentInterface.isVisibleOnFront) &&
        Objects.equals(this.createdAt, salesDataShipmentCommentInterface.createdAt) &&
        Objects.equals(this.entityId, salesDataShipmentCommentInterface.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCustomerNotified, parentId, extensionAttributes, comment, isVisibleOnFront, createdAt, entityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataShipmentCommentInterface {\n");
    sb.append("    isCustomerNotified: ").append(toIndentedString(isCustomerNotified)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isVisibleOnFront: ").append(toIndentedString(isVisibleOnFront)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
