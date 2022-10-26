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
 * ExtensionInterface class for @see \\Magento\\GiftMessage\\Api\\Data\\MessageInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class GiftMessageDataMessageExtensionInterface {
  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_WRAPPING_ID = "wrapping_id";
  @SerializedName(SERIALIZED_NAME_WRAPPING_ID)
  private Integer wrappingId;

  public static final String SERIALIZED_NAME_WRAPPING_ALLOW_GIFT_RECEIPT = "wrapping_allow_gift_receipt";
  @SerializedName(SERIALIZED_NAME_WRAPPING_ALLOW_GIFT_RECEIPT)
  private Boolean wrappingAllowGiftReceipt;

  public static final String SERIALIZED_NAME_WRAPPING_ADD_PRINTED_CARD = "wrapping_add_printed_card";
  @SerializedName(SERIALIZED_NAME_WRAPPING_ADD_PRINTED_CARD)
  private Boolean wrappingAddPrintedCard;


  public GiftMessageDataMessageExtensionInterface entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  


  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public GiftMessageDataMessageExtensionInterface entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  


  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public GiftMessageDataMessageExtensionInterface wrappingId(Integer wrappingId) {
    
    this.wrappingId = wrappingId;
    return this;
  }

   /**
   * Get wrappingId
   * @return wrappingId
  **/
  


  public Integer getWrappingId() {
    return wrappingId;
  }


  public void setWrappingId(Integer wrappingId) {
    this.wrappingId = wrappingId;
  }


  public GiftMessageDataMessageExtensionInterface wrappingAllowGiftReceipt(Boolean wrappingAllowGiftReceipt) {
    
    this.wrappingAllowGiftReceipt = wrappingAllowGiftReceipt;
    return this;
  }

   /**
   * Get wrappingAllowGiftReceipt
   * @return wrappingAllowGiftReceipt
  **/
  


  public Boolean getWrappingAllowGiftReceipt() {
    return wrappingAllowGiftReceipt;
  }


  public void setWrappingAllowGiftReceipt(Boolean wrappingAllowGiftReceipt) {
    this.wrappingAllowGiftReceipt = wrappingAllowGiftReceipt;
  }


  public GiftMessageDataMessageExtensionInterface wrappingAddPrintedCard(Boolean wrappingAddPrintedCard) {
    
    this.wrappingAddPrintedCard = wrappingAddPrintedCard;
    return this;
  }

   /**
   * Get wrappingAddPrintedCard
   * @return wrappingAddPrintedCard
  **/
  


  public Boolean getWrappingAddPrintedCard() {
    return wrappingAddPrintedCard;
  }


  public void setWrappingAddPrintedCard(Boolean wrappingAddPrintedCard) {
    this.wrappingAddPrintedCard = wrappingAddPrintedCard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftMessageDataMessageExtensionInterface giftMessageDataMessageExtensionInterface = (GiftMessageDataMessageExtensionInterface) o;
    return Objects.equals(this.entityId, giftMessageDataMessageExtensionInterface.entityId) &&
        Objects.equals(this.entityType, giftMessageDataMessageExtensionInterface.entityType) &&
        Objects.equals(this.wrappingId, giftMessageDataMessageExtensionInterface.wrappingId) &&
        Objects.equals(this.wrappingAllowGiftReceipt, giftMessageDataMessageExtensionInterface.wrappingAllowGiftReceipt) &&
        Objects.equals(this.wrappingAddPrintedCard, giftMessageDataMessageExtensionInterface.wrappingAddPrintedCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, wrappingId, wrappingAllowGiftReceipt, wrappingAddPrintedCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftMessageDataMessageExtensionInterface {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    wrappingId: ").append(toIndentedString(wrappingId)).append("\n");
    sb.append("    wrappingAllowGiftReceipt: ").append(toIndentedString(wrappingAllowGiftReceipt)).append("\n");
    sb.append("    wrappingAddPrintedCard: ").append(toIndentedString(wrappingAddPrintedCard)).append("\n");
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
