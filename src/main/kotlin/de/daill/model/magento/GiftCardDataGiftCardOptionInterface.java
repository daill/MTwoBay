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
 * Interface GiftCardOptionInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class GiftCardDataGiftCardOptionInterface {
  public static final String SERIALIZED_NAME_GIFTCARD_AMOUNT = "giftcard_amount";
  @Json(name = SERIALIZED_NAME_GIFTCARD_AMOUNT)
  private String giftcardAmount;

  public static final String SERIALIZED_NAME_CUSTOM_GIFTCARD_AMOUNT = "custom_giftcard_amount";
  @Json(name = SERIALIZED_NAME_CUSTOM_GIFTCARD_AMOUNT)
  private BigDecimal customGiftcardAmount;

  public static final String SERIALIZED_NAME_GIFTCARD_SENDER_NAME = "giftcard_sender_name";
  @Json(name = SERIALIZED_NAME_GIFTCARD_SENDER_NAME)
  private String giftcardSenderName;

  public static final String SERIALIZED_NAME_GIFTCARD_RECIPIENT_NAME = "giftcard_recipient_name";
  @Json(name = SERIALIZED_NAME_GIFTCARD_RECIPIENT_NAME)
  private String giftcardRecipientName;

  public static final String SERIALIZED_NAME_GIFTCARD_SENDER_EMAIL = "giftcard_sender_email";
  @Json(name = SERIALIZED_NAME_GIFTCARD_SENDER_EMAIL)
  private String giftcardSenderEmail;

  public static final String SERIALIZED_NAME_GIFTCARD_RECIPIENT_EMAIL = "giftcard_recipient_email";
  @Json(name = SERIALIZED_NAME_GIFTCARD_RECIPIENT_EMAIL)
  private String giftcardRecipientEmail;

  public static final String SERIALIZED_NAME_GIFTCARD_MESSAGE = "giftcard_message";
  @Json(name = SERIALIZED_NAME_GIFTCARD_MESSAGE)
  private String giftcardMessage;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private GiftCardDataGiftCardOptionExtensionInterface extensionAttributes;


  public GiftCardDataGiftCardOptionInterface giftcardAmount(String giftcardAmount) {
    
    this.giftcardAmount = giftcardAmount;
    return this;
  }

   /**
   * Gift card amount.
   * @return giftcardAmount
  **/


  public String getGiftcardAmount() {
    return giftcardAmount;
  }


  public void setGiftcardAmount(String giftcardAmount) {
    this.giftcardAmount = giftcardAmount;
  }


  public GiftCardDataGiftCardOptionInterface customGiftcardAmount(BigDecimal customGiftcardAmount) {
    
    this.customGiftcardAmount = customGiftcardAmount;
    return this;
  }

   /**
   * Gift card open amount value.
   * @return customGiftcardAmount
  **/



  public BigDecimal getCustomGiftcardAmount() {
    return customGiftcardAmount;
  }


  public void setCustomGiftcardAmount(BigDecimal customGiftcardAmount) {
    this.customGiftcardAmount = customGiftcardAmount;
  }


  public GiftCardDataGiftCardOptionInterface giftcardSenderName(String giftcardSenderName) {
    
    this.giftcardSenderName = giftcardSenderName;
    return this;
  }

   /**
   * Gift card sender name.
   * @return giftcardSenderName
  **/


  public String getGiftcardSenderName() {
    return giftcardSenderName;
  }


  public void setGiftcardSenderName(String giftcardSenderName) {
    this.giftcardSenderName = giftcardSenderName;
  }


  public GiftCardDataGiftCardOptionInterface giftcardRecipientName(String giftcardRecipientName) {
    
    this.giftcardRecipientName = giftcardRecipientName;
    return this;
  }

   /**
   * Gift card recipient name.
   * @return giftcardRecipientName
  **/


  public String getGiftcardRecipientName() {
    return giftcardRecipientName;
  }


  public void setGiftcardRecipientName(String giftcardRecipientName) {
    this.giftcardRecipientName = giftcardRecipientName;
  }


  public GiftCardDataGiftCardOptionInterface giftcardSenderEmail(String giftcardSenderEmail) {
    
    this.giftcardSenderEmail = giftcardSenderEmail;
    return this;
  }

   /**
   * Gift card sender email.
   * @return giftcardSenderEmail
  **/


  public String getGiftcardSenderEmail() {
    return giftcardSenderEmail;
  }


  public void setGiftcardSenderEmail(String giftcardSenderEmail) {
    this.giftcardSenderEmail = giftcardSenderEmail;
  }


  public GiftCardDataGiftCardOptionInterface giftcardRecipientEmail(String giftcardRecipientEmail) {
    
    this.giftcardRecipientEmail = giftcardRecipientEmail;
    return this;
  }

   /**
   * Gift card recipient email.
   * @return giftcardRecipientEmail
  **/


  public String getGiftcardRecipientEmail() {
    return giftcardRecipientEmail;
  }


  public void setGiftcardRecipientEmail(String giftcardRecipientEmail) {
    this.giftcardRecipientEmail = giftcardRecipientEmail;
  }


  public GiftCardDataGiftCardOptionInterface giftcardMessage(String giftcardMessage) {
    
    this.giftcardMessage = giftcardMessage;
    return this;
  }

   /**
   * Giftcard message.
   * @return giftcardMessage
  **/



  public String getGiftcardMessage() {
    return giftcardMessage;
  }


  public void setGiftcardMessage(String giftcardMessage) {
    this.giftcardMessage = giftcardMessage;
  }


  public GiftCardDataGiftCardOptionInterface extensionAttributes(GiftCardDataGiftCardOptionExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public GiftCardDataGiftCardOptionExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(GiftCardDataGiftCardOptionExtensionInterface extensionAttributes) {
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
    GiftCardDataGiftCardOptionInterface giftCardDataGiftCardOptionInterface = (GiftCardDataGiftCardOptionInterface) o;
    return Objects.equals(this.giftcardAmount, giftCardDataGiftCardOptionInterface.giftcardAmount) &&
        Objects.equals(this.customGiftcardAmount, giftCardDataGiftCardOptionInterface.customGiftcardAmount) &&
        Objects.equals(this.giftcardSenderName, giftCardDataGiftCardOptionInterface.giftcardSenderName) &&
        Objects.equals(this.giftcardRecipientName, giftCardDataGiftCardOptionInterface.giftcardRecipientName) &&
        Objects.equals(this.giftcardSenderEmail, giftCardDataGiftCardOptionInterface.giftcardSenderEmail) &&
        Objects.equals(this.giftcardRecipientEmail, giftCardDataGiftCardOptionInterface.giftcardRecipientEmail) &&
        Objects.equals(this.giftcardMessage, giftCardDataGiftCardOptionInterface.giftcardMessage) &&
        Objects.equals(this.extensionAttributes, giftCardDataGiftCardOptionInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftcardAmount, customGiftcardAmount, giftcardSenderName, giftcardRecipientName, giftcardSenderEmail, giftcardRecipientEmail, giftcardMessage, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCardDataGiftCardOptionInterface {\n");
    sb.append("    giftcardAmount: ").append(toIndentedString(giftcardAmount)).append("\n");
    sb.append("    customGiftcardAmount: ").append(toIndentedString(customGiftcardAmount)).append("\n");
    sb.append("    giftcardSenderName: ").append(toIndentedString(giftcardSenderName)).append("\n");
    sb.append("    giftcardRecipientName: ").append(toIndentedString(giftcardRecipientName)).append("\n");
    sb.append("    giftcardSenderEmail: ").append(toIndentedString(giftcardSenderEmail)).append("\n");
    sb.append("    giftcardRecipientEmail: ").append(toIndentedString(giftcardRecipientEmail)).append("\n");
    sb.append("    giftcardMessage: ").append(toIndentedString(giftcardMessage)).append("\n");
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

