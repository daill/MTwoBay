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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Shipment track interface. A shipment is a delivery package that contains products. A shipment document accompanies the shipment. This document lists the products and their quantities in the delivery package. Merchants and customers can track shipments.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataShipmentTrackInterface {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @Json(name = SERIALIZED_NAME_ORDER_ID)
  private Integer orderId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @Json(name = SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @Json(name = SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @Json(name = SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @Json(name = SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @Json(name = SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @Json(name = SERIALIZED_NAME_QTY)
  private BigDecimal qty;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @Json(name = SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_TRACK_NUMBER = "track_number";
  @Json(name = SERIALIZED_NAME_TRACK_NUMBER)
  private String trackNumber;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @Json(name = SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @Json(name = SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;


  public SalesDataShipmentTrackInterface orderId(Integer orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The order_id for the shipment package.
   * @return orderId
  **/
  

  public Integer getOrderId() {
    return orderId;
  }


  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public SalesDataShipmentTrackInterface createdAt(String createdAt) {
    
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


  public SalesDataShipmentTrackInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Shipment package ID.
   * @return entityId
  **/
  
  

  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  public SalesDataShipmentTrackInterface parentId(Integer parentId) {
    
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


  public SalesDataShipmentTrackInterface updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated-at timestamp.
   * @return updatedAt
  **/
  
  

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SalesDataShipmentTrackInterface weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight.
   * @return weight
  **/
  

  public BigDecimal getWeight() {
    return weight;
  }


  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public SalesDataShipmentTrackInterface qty(BigDecimal qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Quantity.
   * @return qty
  **/
  

  public BigDecimal getQty() {
    return qty;
  }


  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }


  public SalesDataShipmentTrackInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description.
   * @return description
  **/
  

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SalesDataShipmentTrackInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\ShipmentTrackInterface
   * @return extensionAttributes
  **/
  
  

  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public SalesDataShipmentTrackInterface trackNumber(String trackNumber) {
    
    this.trackNumber = trackNumber;
    return this;
  }

   /**
   * Track number.
   * @return trackNumber
  **/
  

  public String getTrackNumber() {
    return trackNumber;
  }


  public void setTrackNumber(String trackNumber) {
    this.trackNumber = trackNumber;
  }


  public SalesDataShipmentTrackInterface title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title.
   * @return title
  **/
  

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SalesDataShipmentTrackInterface carrierCode(String carrierCode) {
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Carrier code.
   * @return carrierCode
  **/
  

  public String getCarrierCode() {
    return carrierCode;
  }


  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataShipmentTrackInterface salesDataShipmentTrackInterface = (SalesDataShipmentTrackInterface) o;
    return Objects.equals(this.orderId, salesDataShipmentTrackInterface.orderId) &&
        Objects.equals(this.createdAt, salesDataShipmentTrackInterface.createdAt) &&
        Objects.equals(this.entityId, salesDataShipmentTrackInterface.entityId) &&
        Objects.equals(this.parentId, salesDataShipmentTrackInterface.parentId) &&
        Objects.equals(this.updatedAt, salesDataShipmentTrackInterface.updatedAt) &&
        Objects.equals(this.weight, salesDataShipmentTrackInterface.weight) &&
        Objects.equals(this.qty, salesDataShipmentTrackInterface.qty) &&
        Objects.equals(this.description, salesDataShipmentTrackInterface.description) &&
        Objects.equals(this.extensionAttributes, salesDataShipmentTrackInterface.extensionAttributes) &&
        Objects.equals(this.trackNumber, salesDataShipmentTrackInterface.trackNumber) &&
        Objects.equals(this.title, salesDataShipmentTrackInterface.title) &&
        Objects.equals(this.carrierCode, salesDataShipmentTrackInterface.carrierCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, createdAt, entityId, parentId, updatedAt, weight, qty, description, extensionAttributes, trackNumber, title, carrierCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataShipmentTrackInterface {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
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

