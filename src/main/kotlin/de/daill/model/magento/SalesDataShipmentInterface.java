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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shipment interface. A shipment is a delivery package that contains products. A shipment document accompanies the shipment. This document lists the products and their quantities in the delivery package.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataShipmentInterface {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS_ID = "billing_address_id";
  @Json(name = SERIALIZED_NAME_BILLING_ADDRESS_ID)
  private Integer billingAddressId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @Json(name = SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @Json(name = SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_EMAIL_SENT = "email_sent";
  @Json(name = SERIALIZED_NAME_EMAIL_SENT)
  private Integer emailSent;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @Json(name = SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;

  public static final String SERIALIZED_NAME_INCREMENT_ID = "increment_id";
  @Json(name = SERIALIZED_NAME_INCREMENT_ID)
  private String incrementId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @Json(name = SERIALIZED_NAME_ORDER_ID)
  private Integer orderId;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @Json(name = SERIALIZED_NAME_PACKAGES)
  private List<SalesDataShipmentPackageInterface> packages = null;

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "shipment_status";
  @Json(name = SERIALIZED_NAME_SHIPMENT_STATUS)
  private Integer shipmentStatus;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS_ID = "shipping_address_id";
  @Json(name = SERIALIZED_NAME_SHIPPING_ADDRESS_ID)
  private Integer shippingAddressId;

  public static final String SERIALIZED_NAME_SHIPPING_LABEL = "shipping_label";
  @Json(name = SERIALIZED_NAME_SHIPPING_LABEL)
  private String shippingLabel;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @Json(name = SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_TOTAL_QTY = "total_qty";
  @Json(name = SERIALIZED_NAME_TOTAL_QTY)
  private BigDecimal totalQty;

  public static final String SERIALIZED_NAME_TOTAL_WEIGHT = "total_weight";
  @Json(name = SERIALIZED_NAME_TOTAL_WEIGHT)
  private BigDecimal totalWeight;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @Json(name = SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @Json(name = SERIALIZED_NAME_ITEMS)
  private List<SalesDataShipmentItemInterface> items = new ArrayList<SalesDataShipmentItemInterface>();

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @Json(name = SERIALIZED_NAME_TRACKS)
  private List<SalesDataShipmentTrackInterface> tracks = new ArrayList<SalesDataShipmentTrackInterface>();

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @Json(name = SERIALIZED_NAME_COMMENTS)
  private List<SalesDataShipmentCommentInterface> comments = new ArrayList<SalesDataShipmentCommentInterface>();

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private SalesDataShipmentExtensionInterface extensionAttributes;


  public SalesDataShipmentInterface billingAddressId(Integer billingAddressId) {
    
    this.billingAddressId = billingAddressId;
    return this;
  }

   /**
   * Billing address ID.
   * @return billingAddressId
  **/
  


  public Integer getBillingAddressId() {
    return billingAddressId;
  }


  public void setBillingAddressId(Integer billingAddressId) {
    this.billingAddressId = billingAddressId;
  }


  public SalesDataShipmentInterface createdAt(String createdAt) {
    
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


  public SalesDataShipmentInterface customerId(Integer customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer ID.
   * @return customerId
  **/
  


  public Integer getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public SalesDataShipmentInterface emailSent(Integer emailSent) {
    
    this.emailSent = emailSent;
    return this;
  }

   /**
   * Email-sent flag value.
   * @return emailSent
  **/
  


  public Integer getEmailSent() {
    return emailSent;
  }


  public void setEmailSent(Integer emailSent) {
    this.emailSent = emailSent;
  }


  public SalesDataShipmentInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Shipment ID.
   * @return entityId
  **/
  


  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  public SalesDataShipmentInterface incrementId(String incrementId) {
    
    this.incrementId = incrementId;
    return this;
  }

   /**
   * Increment ID.
   * @return incrementId
  **/
  


  public String getIncrementId() {
    return incrementId;
  }


  public void setIncrementId(String incrementId) {
    this.incrementId = incrementId;
  }


  public SalesDataShipmentInterface orderId(Integer orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID.
   * @return orderId
  **/
  

  public Integer getOrderId() {
    return orderId;
  }


  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public SalesDataShipmentInterface packages(List<SalesDataShipmentPackageInterface> packages) {
    
    this.packages = packages;
    return this;
  }

  public SalesDataShipmentInterface addPackagesItem(SalesDataShipmentPackageInterface packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<SalesDataShipmentPackageInterface>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Array of packages, if any. Otherwise, null.
   * @return packages
  **/
  


  public List<SalesDataShipmentPackageInterface> getPackages() {
    return packages;
  }


  public void setPackages(List<SalesDataShipmentPackageInterface> packages) {
    this.packages = packages;
  }


  public SalesDataShipmentInterface shipmentStatus(Integer shipmentStatus) {
    
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Shipment status.
   * @return shipmentStatus
  **/
  


  public Integer getShipmentStatus() {
    return shipmentStatus;
  }


  public void setShipmentStatus(Integer shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }


  public SalesDataShipmentInterface shippingAddressId(Integer shippingAddressId) {
    
    this.shippingAddressId = shippingAddressId;
    return this;
  }

   /**
   * Shipping address ID.
   * @return shippingAddressId
  **/
  


  public Integer getShippingAddressId() {
    return shippingAddressId;
  }


  public void setShippingAddressId(Integer shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }


  public SalesDataShipmentInterface shippingLabel(String shippingLabel) {
    
    this.shippingLabel = shippingLabel;
    return this;
  }

   /**
   * Shipping label.
   * @return shippingLabel
  **/
  


  public String getShippingLabel() {
    return shippingLabel;
  }


  public void setShippingLabel(String shippingLabel) {
    this.shippingLabel = shippingLabel;
  }


  public SalesDataShipmentInterface storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID.
   * @return storeId
  **/
  


  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public SalesDataShipmentInterface totalQty(BigDecimal totalQty) {
    
    this.totalQty = totalQty;
    return this;
  }

   /**
   * Total quantity.
   * @return totalQty
  **/
  


  public BigDecimal getTotalQty() {
    return totalQty;
  }


  public void setTotalQty(BigDecimal totalQty) {
    this.totalQty = totalQty;
  }


  public SalesDataShipmentInterface totalWeight(BigDecimal totalWeight) {
    
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * Total weight.
   * @return totalWeight
  **/
  


  public BigDecimal getTotalWeight() {
    return totalWeight;
  }


  public void setTotalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
  }


  public SalesDataShipmentInterface updatedAt(String updatedAt) {
    
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


  public SalesDataShipmentInterface items(List<SalesDataShipmentItemInterface> items) {
    
    this.items = items;
    return this;
  }

  public SalesDataShipmentInterface addItemsItem(SalesDataShipmentItemInterface itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of items.
   * @return items
  **/
  

  public List<SalesDataShipmentItemInterface> getItems() {
    return items;
  }


  public void setItems(List<SalesDataShipmentItemInterface> items) {
    this.items = items;
  }


  public SalesDataShipmentInterface tracks(List<SalesDataShipmentTrackInterface> tracks) {
    
    this.tracks = tracks;
    return this;
  }

  public SalesDataShipmentInterface addTracksItem(SalesDataShipmentTrackInterface tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Array of tracks.
   * @return tracks
  **/
  

  public List<SalesDataShipmentTrackInterface> getTracks() {
    return tracks;
  }


  public void setTracks(List<SalesDataShipmentTrackInterface> tracks) {
    this.tracks = tracks;
  }


  public SalesDataShipmentInterface comments(List<SalesDataShipmentCommentInterface> comments) {
    
    this.comments = comments;
    return this;
  }

  public SalesDataShipmentInterface addCommentsItem(SalesDataShipmentCommentInterface commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Array of comments.
   * @return comments
  **/
  

  public List<SalesDataShipmentCommentInterface> getComments() {
    return comments;
  }


  public void setComments(List<SalesDataShipmentCommentInterface> comments) {
    this.comments = comments;
  }


  public SalesDataShipmentInterface extensionAttributes(SalesDataShipmentExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/
  


  public SalesDataShipmentExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(SalesDataShipmentExtensionInterface extensionAttributes) {
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
    SalesDataShipmentInterface salesDataShipmentInterface = (SalesDataShipmentInterface) o;
    return Objects.equals(this.billingAddressId, salesDataShipmentInterface.billingAddressId) &&
        Objects.equals(this.createdAt, salesDataShipmentInterface.createdAt) &&
        Objects.equals(this.customerId, salesDataShipmentInterface.customerId) &&
        Objects.equals(this.emailSent, salesDataShipmentInterface.emailSent) &&
        Objects.equals(this.entityId, salesDataShipmentInterface.entityId) &&
        Objects.equals(this.incrementId, salesDataShipmentInterface.incrementId) &&
        Objects.equals(this.orderId, salesDataShipmentInterface.orderId) &&
        Objects.equals(this.packages, salesDataShipmentInterface.packages) &&
        Objects.equals(this.shipmentStatus, salesDataShipmentInterface.shipmentStatus) &&
        Objects.equals(this.shippingAddressId, salesDataShipmentInterface.shippingAddressId) &&
        Objects.equals(this.shippingLabel, salesDataShipmentInterface.shippingLabel) &&
        Objects.equals(this.storeId, salesDataShipmentInterface.storeId) &&
        Objects.equals(this.totalQty, salesDataShipmentInterface.totalQty) &&
        Objects.equals(this.totalWeight, salesDataShipmentInterface.totalWeight) &&
        Objects.equals(this.updatedAt, salesDataShipmentInterface.updatedAt) &&
        Objects.equals(this.items, salesDataShipmentInterface.items) &&
        Objects.equals(this.tracks, salesDataShipmentInterface.tracks) &&
        Objects.equals(this.comments, salesDataShipmentInterface.comments) &&
        Objects.equals(this.extensionAttributes, salesDataShipmentInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddressId, createdAt, customerId, emailSent, entityId, incrementId, orderId, packages, shipmentStatus, shippingAddressId, shippingLabel, storeId, totalQty, totalWeight, updatedAt, items, tracks, comments, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataShipmentInterface {\n");
    sb.append("    billingAddressId: ").append(toIndentedString(billingAddressId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    emailSent: ").append(toIndentedString(emailSent)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    incrementId: ").append(toIndentedString(incrementId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    shippingAddressId: ").append(toIndentedString(shippingAddressId)).append("\n");
    sb.append("    shippingLabel: ").append(toIndentedString(shippingLabel)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

