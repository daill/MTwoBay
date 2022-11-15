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
 * Interface NegotiableQuoteInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class NegotiableQuoteDataNegotiableQuoteInterface {
  public static final String SERIALIZED_NAME_QUOTE_ID = "quote_id";
  @Json(name = SERIALIZED_NAME_QUOTE_ID)
  private Integer quoteId;

  public static final String SERIALIZED_NAME_IS_REGULAR_QUOTE = "is_regular_quote";
  @Json(name = SERIALIZED_NAME_IS_REGULAR_QUOTE)
  private Boolean isRegularQuote;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @Json(name = SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NEGOTIATED_PRICE_TYPE = "negotiated_price_type";
  @Json(name = SERIALIZED_NAME_NEGOTIATED_PRICE_TYPE)
  private Integer negotiatedPriceType;

  public static final String SERIALIZED_NAME_NEGOTIATED_PRICE_VALUE = "negotiated_price_value";
  @Json(name = SERIALIZED_NAME_NEGOTIATED_PRICE_VALUE)
  private BigDecimal negotiatedPriceValue;

  public static final String SERIALIZED_NAME_SHIPPING_PRICE = "shipping_price";
  @Json(name = SERIALIZED_NAME_SHIPPING_PRICE)
  private BigDecimal shippingPrice;

  public static final String SERIALIZED_NAME_QUOTE_NAME = "quote_name";
  @Json(name = SERIALIZED_NAME_QUOTE_NAME)
  private String quoteName;

  public static final String SERIALIZED_NAME_EXPIRATION_PERIOD = "expiration_period";
  @Json(name = SERIALIZED_NAME_EXPIRATION_PERIOD)
  private String expirationPeriod;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATION_STATUS = "email_notification_status";
  @Json(name = SERIALIZED_NAME_EMAIL_NOTIFICATION_STATUS)
  private Integer emailNotificationStatus;

  public static final String SERIALIZED_NAME_HAS_UNCONFIRMED_CHANGES = "has_unconfirmed_changes";
  @Json(name = SERIALIZED_NAME_HAS_UNCONFIRMED_CHANGES)
  private Boolean hasUnconfirmedChanges;

  public static final String SERIALIZED_NAME_IS_SHIPPING_TAX_CHANGED = "is_shipping_tax_changed";
  @Json(name = SERIALIZED_NAME_IS_SHIPPING_TAX_CHANGED)
  private Boolean isShippingTaxChanged;

  public static final String SERIALIZED_NAME_IS_CUSTOMER_PRICE_CHANGED = "is_customer_price_changed";
  @Json(name = SERIALIZED_NAME_IS_CUSTOMER_PRICE_CHANGED)
  private Boolean isCustomerPriceChanged;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @Json(name = SERIALIZED_NAME_NOTIFICATIONS)
  private Integer notifications;

  public static final String SERIALIZED_NAME_APPLIED_RULE_IDS = "applied_rule_ids";
  @Json(name = SERIALIZED_NAME_APPLIED_RULE_IDS)
  private String appliedRuleIds;

  public static final String SERIALIZED_NAME_IS_ADDRESS_DRAFT = "is_address_draft";
  @Json(name = SERIALIZED_NAME_IS_ADDRESS_DRAFT)
  private Boolean isAddressDraft;

  public static final String SERIALIZED_NAME_DELETED_SKU = "deleted_sku";
  @Json(name = SERIALIZED_NAME_DELETED_SKU)
  private String deletedSku;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @Json(name = SERIALIZED_NAME_CREATOR_ID)
  private Integer creatorId;

  public static final String SERIALIZED_NAME_CREATOR_TYPE = "creator_type";
  @Json(name = SERIALIZED_NAME_CREATOR_TYPE)
  private Integer creatorType;

  public static final String SERIALIZED_NAME_ORIGINAL_TOTAL_PRICE = "original_total_price";
  @Json(name = SERIALIZED_NAME_ORIGINAL_TOTAL_PRICE)
  private BigDecimal originalTotalPrice;

  public static final String SERIALIZED_NAME_BASE_ORIGINAL_TOTAL_PRICE = "base_original_total_price";
  @Json(name = SERIALIZED_NAME_BASE_ORIGINAL_TOTAL_PRICE)
  private BigDecimal baseOriginalTotalPrice;

  public static final String SERIALIZED_NAME_NEGOTIATED_TOTAL_PRICE = "negotiated_total_price";
  @Json(name = SERIALIZED_NAME_NEGOTIATED_TOTAL_PRICE)
  private BigDecimal negotiatedTotalPrice;

  public static final String SERIALIZED_NAME_BASE_NEGOTIATED_TOTAL_PRICE = "base_negotiated_total_price";
  @Json(name = SERIALIZED_NAME_BASE_NEGOTIATED_TOTAL_PRICE)
  private BigDecimal baseNegotiatedTotalPrice;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public NegotiableQuoteDataNegotiableQuoteInterface quoteId(Integer quoteId) {
    
    this.quoteId = quoteId;
    return this;
  }

   /**
   * Negotiable quote ID.
   * @return quoteId
  **/


  public Integer getQuoteId() {
    return quoteId;
  }


  public void setQuoteId(Integer quoteId) {
    this.quoteId = quoteId;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface isRegularQuote(Boolean isRegularQuote) {
    
    this.isRegularQuote = isRegularQuote;
    return this;
  }

   /**
   * Is regular quote.
   * @return isRegularQuote
  **/


  public Boolean getIsRegularQuote() {
    return isRegularQuote;
  }


  public void setIsRegularQuote(Boolean isRegularQuote) {
    this.isRegularQuote = isRegularQuote;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Negotiable quote status.
   * @return status
  **/


  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface negotiatedPriceType(Integer negotiatedPriceType) {
    
    this.negotiatedPriceType = negotiatedPriceType;
    return this;
  }

   /**
   * Negotiated price type.
   * @return negotiatedPriceType
  **/


  public Integer getNegotiatedPriceType() {
    return negotiatedPriceType;
  }


  public void setNegotiatedPriceType(Integer negotiatedPriceType) {
    this.negotiatedPriceType = negotiatedPriceType;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface negotiatedPriceValue(BigDecimal negotiatedPriceValue) {
    
    this.negotiatedPriceValue = negotiatedPriceValue;
    return this;
  }

   /**
   * Negotiated price value.
   * @return negotiatedPriceValue
  **/


  public BigDecimal getNegotiatedPriceValue() {
    return negotiatedPriceValue;
  }


  public void setNegotiatedPriceValue(BigDecimal negotiatedPriceValue) {
    this.negotiatedPriceValue = negotiatedPriceValue;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface shippingPrice(BigDecimal shippingPrice) {
    
    this.shippingPrice = shippingPrice;
    return this;
  }

   /**
   * Proposed shipping price.
   * @return shippingPrice
  **/


  public BigDecimal getShippingPrice() {
    return shippingPrice;
  }


  public void setShippingPrice(BigDecimal shippingPrice) {
    this.shippingPrice = shippingPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface quoteName(String quoteName) {
    
    this.quoteName = quoteName;
    return this;
  }

   /**
   * Negotiable quote name.
   * @return quoteName
  **/


  public String getQuoteName() {
    return quoteName;
  }


  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface expirationPeriod(String expirationPeriod) {
    
    this.expirationPeriod = expirationPeriod;
    return this;
  }

   /**
   * Expiration period.
   * @return expirationPeriod
  **/


  public String getExpirationPeriod() {
    return expirationPeriod;
  }


  public void setExpirationPeriod(String expirationPeriod) {
    this.expirationPeriod = expirationPeriod;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface emailNotificationStatus(Integer emailNotificationStatus) {
    
    this.emailNotificationStatus = emailNotificationStatus;
    return this;
  }

   /**
   * Email notification status.
   * @return emailNotificationStatus
  **/


  public Integer getEmailNotificationStatus() {
    return emailNotificationStatus;
  }


  public void setEmailNotificationStatus(Integer emailNotificationStatus) {
    this.emailNotificationStatus = emailNotificationStatus;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface hasUnconfirmedChanges(Boolean hasUnconfirmedChanges) {
    
    this.hasUnconfirmedChanges = hasUnconfirmedChanges;
    return this;
  }

   /**
   * Has unconfirmed changes.
   * @return hasUnconfirmedChanges
  **/


  public Boolean getHasUnconfirmedChanges() {
    return hasUnconfirmedChanges;
  }


  public void setHasUnconfirmedChanges(Boolean hasUnconfirmedChanges) {
    this.hasUnconfirmedChanges = hasUnconfirmedChanges;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface isShippingTaxChanged(Boolean isShippingTaxChanged) {
    
    this.isShippingTaxChanged = isShippingTaxChanged;
    return this;
  }

   /**
   * Shipping tax changes.
   * @return isShippingTaxChanged
  **/


  public Boolean getIsShippingTaxChanged() {
    return isShippingTaxChanged;
  }


  public void setIsShippingTaxChanged(Boolean isShippingTaxChanged) {
    this.isShippingTaxChanged = isShippingTaxChanged;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface isCustomerPriceChanged(Boolean isCustomerPriceChanged) {
    
    this.isCustomerPriceChanged = isCustomerPriceChanged;
    return this;
  }

   /**
   * Customer price changes.
   * @return isCustomerPriceChanged
  **/


  public Boolean getIsCustomerPriceChanged() {
    return isCustomerPriceChanged;
  }


  public void setIsCustomerPriceChanged(Boolean isCustomerPriceChanged) {
    this.isCustomerPriceChanged = isCustomerPriceChanged;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface notifications(Integer notifications) {
    
    this.notifications = notifications;
    return this;
  }

   /**
   * Quote notifications.
   * @return notifications
  **/


  public Integer getNotifications() {
    return notifications;
  }


  public void setNotifications(Integer notifications) {
    this.notifications = notifications;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface appliedRuleIds(String appliedRuleIds) {
    
    this.appliedRuleIds = appliedRuleIds;
    return this;
  }

   /**
   * Quote rules.
   * @return appliedRuleIds
  **/


  public String getAppliedRuleIds() {
    return appliedRuleIds;
  }


  public void setAppliedRuleIds(String appliedRuleIds) {
    this.appliedRuleIds = appliedRuleIds;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface isAddressDraft(Boolean isAddressDraft) {
    
    this.isAddressDraft = isAddressDraft;
    return this;
  }

   /**
   * Is address draft.
   * @return isAddressDraft
  **/


  public Boolean getIsAddressDraft() {
    return isAddressDraft;
  }


  public void setIsAddressDraft(Boolean isAddressDraft) {
    this.isAddressDraft = isAddressDraft;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface deletedSku(String deletedSku) {
    
    this.deletedSku = deletedSku;
    return this;
  }

   /**
   * Deleted products sku.
   * @return deletedSku
  **/


  public String getDeletedSku() {
    return deletedSku;
  }


  public void setDeletedSku(String deletedSku) {
    this.deletedSku = deletedSku;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface creatorId(Integer creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * Quote creator id.
   * @return creatorId
  **/


  public Integer getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface creatorType(Integer creatorType) {
    
    this.creatorType = creatorType;
    return this;
  }

   /**
   * Quote creator type.
   * @return creatorType
  **/


  public Integer getCreatorType() {
    return creatorType;
  }


  public void setCreatorType(Integer creatorType) {
    this.creatorType = creatorType;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface originalTotalPrice(BigDecimal originalTotalPrice) {
    
    this.originalTotalPrice = originalTotalPrice;
    return this;
  }

   /**
   * Quote original total price.
   * @return originalTotalPrice
  **/

  

  public BigDecimal getOriginalTotalPrice() {
    return originalTotalPrice;
  }


  public void setOriginalTotalPrice(BigDecimal originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface baseOriginalTotalPrice(BigDecimal baseOriginalTotalPrice) {
    
    this.baseOriginalTotalPrice = baseOriginalTotalPrice;
    return this;
  }

   /**
   * Quote original total price in base currency.
   * @return baseOriginalTotalPrice
  **/

  

  public BigDecimal getBaseOriginalTotalPrice() {
    return baseOriginalTotalPrice;
  }


  public void setBaseOriginalTotalPrice(BigDecimal baseOriginalTotalPrice) {
    this.baseOriginalTotalPrice = baseOriginalTotalPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface negotiatedTotalPrice(BigDecimal negotiatedTotalPrice) {
    
    this.negotiatedTotalPrice = negotiatedTotalPrice;
    return this;
  }

   /**
   * Quote negotiated total price.
   * @return negotiatedTotalPrice
  **/

  

  public BigDecimal getNegotiatedTotalPrice() {
    return negotiatedTotalPrice;
  }


  public void setNegotiatedTotalPrice(BigDecimal negotiatedTotalPrice) {
    this.negotiatedTotalPrice = negotiatedTotalPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface baseNegotiatedTotalPrice(BigDecimal baseNegotiatedTotalPrice) {
    
    this.baseNegotiatedTotalPrice = baseNegotiatedTotalPrice;
    return this;
  }

   /**
   * Quote negotiated total price in base currency.
   * @return baseNegotiatedTotalPrice
  **/

  

  public BigDecimal getBaseNegotiatedTotalPrice() {
    return baseNegotiatedTotalPrice;
  }


  public void setBaseNegotiatedTotalPrice(BigDecimal baseNegotiatedTotalPrice) {
    this.baseNegotiatedTotalPrice = baseNegotiatedTotalPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\NegotiableQuote\\Api\\Data\\NegotiableQuoteInterface
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
    NegotiableQuoteDataNegotiableQuoteInterface negotiableQuoteDataNegotiableQuoteInterface = (NegotiableQuoteDataNegotiableQuoteInterface) o;
    return Objects.equals(this.quoteId, negotiableQuoteDataNegotiableQuoteInterface.quoteId) &&
        Objects.equals(this.isRegularQuote, negotiableQuoteDataNegotiableQuoteInterface.isRegularQuote) &&
        Objects.equals(this.status, negotiableQuoteDataNegotiableQuoteInterface.status) &&
        Objects.equals(this.negotiatedPriceType, negotiableQuoteDataNegotiableQuoteInterface.negotiatedPriceType) &&
        Objects.equals(this.negotiatedPriceValue, negotiableQuoteDataNegotiableQuoteInterface.negotiatedPriceValue) &&
        Objects.equals(this.shippingPrice, negotiableQuoteDataNegotiableQuoteInterface.shippingPrice) &&
        Objects.equals(this.quoteName, negotiableQuoteDataNegotiableQuoteInterface.quoteName) &&
        Objects.equals(this.expirationPeriod, negotiableQuoteDataNegotiableQuoteInterface.expirationPeriod) &&
        Objects.equals(this.emailNotificationStatus, negotiableQuoteDataNegotiableQuoteInterface.emailNotificationStatus) &&
        Objects.equals(this.hasUnconfirmedChanges, negotiableQuoteDataNegotiableQuoteInterface.hasUnconfirmedChanges) &&
        Objects.equals(this.isShippingTaxChanged, negotiableQuoteDataNegotiableQuoteInterface.isShippingTaxChanged) &&
        Objects.equals(this.isCustomerPriceChanged, negotiableQuoteDataNegotiableQuoteInterface.isCustomerPriceChanged) &&
        Objects.equals(this.notifications, negotiableQuoteDataNegotiableQuoteInterface.notifications) &&
        Objects.equals(this.appliedRuleIds, negotiableQuoteDataNegotiableQuoteInterface.appliedRuleIds) &&
        Objects.equals(this.isAddressDraft, negotiableQuoteDataNegotiableQuoteInterface.isAddressDraft) &&
        Objects.equals(this.deletedSku, negotiableQuoteDataNegotiableQuoteInterface.deletedSku) &&
        Objects.equals(this.creatorId, negotiableQuoteDataNegotiableQuoteInterface.creatorId) &&
        Objects.equals(this.creatorType, negotiableQuoteDataNegotiableQuoteInterface.creatorType) &&
        Objects.equals(this.originalTotalPrice, negotiableQuoteDataNegotiableQuoteInterface.originalTotalPrice) &&
        Objects.equals(this.baseOriginalTotalPrice, negotiableQuoteDataNegotiableQuoteInterface.baseOriginalTotalPrice) &&
        Objects.equals(this.negotiatedTotalPrice, negotiableQuoteDataNegotiableQuoteInterface.negotiatedTotalPrice) &&
        Objects.equals(this.baseNegotiatedTotalPrice, negotiableQuoteDataNegotiableQuoteInterface.baseNegotiatedTotalPrice) &&
        Objects.equals(this.extensionAttributes, negotiableQuoteDataNegotiableQuoteInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, isRegularQuote, status, negotiatedPriceType, negotiatedPriceValue, shippingPrice, quoteName, expirationPeriod, emailNotificationStatus, hasUnconfirmedChanges, isShippingTaxChanged, isCustomerPriceChanged, notifications, appliedRuleIds, isAddressDraft, deletedSku, creatorId, creatorType, originalTotalPrice, baseOriginalTotalPrice, negotiatedTotalPrice, baseNegotiatedTotalPrice, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiableQuoteDataNegotiableQuoteInterface {\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    isRegularQuote: ").append(toIndentedString(isRegularQuote)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    negotiatedPriceType: ").append(toIndentedString(negotiatedPriceType)).append("\n");
    sb.append("    negotiatedPriceValue: ").append(toIndentedString(negotiatedPriceValue)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    expirationPeriod: ").append(toIndentedString(expirationPeriod)).append("\n");
    sb.append("    emailNotificationStatus: ").append(toIndentedString(emailNotificationStatus)).append("\n");
    sb.append("    hasUnconfirmedChanges: ").append(toIndentedString(hasUnconfirmedChanges)).append("\n");
    sb.append("    isShippingTaxChanged: ").append(toIndentedString(isShippingTaxChanged)).append("\n");
    sb.append("    isCustomerPriceChanged: ").append(toIndentedString(isCustomerPriceChanged)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    appliedRuleIds: ").append(toIndentedString(appliedRuleIds)).append("\n");
    sb.append("    isAddressDraft: ").append(toIndentedString(isAddressDraft)).append("\n");
    sb.append("    deletedSku: ").append(toIndentedString(deletedSku)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
    sb.append("    originalTotalPrice: ").append(toIndentedString(originalTotalPrice)).append("\n");
    sb.append("    baseOriginalTotalPrice: ").append(toIndentedString(baseOriginalTotalPrice)).append("\n");
    sb.append("    negotiatedTotalPrice: ").append(toIndentedString(negotiatedTotalPrice)).append("\n");
    sb.append("    baseNegotiatedTotalPrice: ").append(toIndentedString(baseNegotiatedTotalPrice)).append("\n");
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

