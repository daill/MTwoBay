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


import java.util.ArrayList;
import java.util.List;

/**
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\TotalsAdditionalDataInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataTotalsAdditionalDataExtensionInterface {
  public static final String SERIALIZED_NAME_GIFT_MESSAGES = "gift_messages";
  @SerializedName(SERIALIZED_NAME_GIFT_MESSAGES)
  private List<GiftMessageDataMessageInterface> giftMessages = null;


  public QuoteDataTotalsAdditionalDataExtensionInterface giftMessages(List<GiftMessageDataMessageInterface> giftMessages) {
    
    this.giftMessages = giftMessages;
    return this;
  }

  public QuoteDataTotalsAdditionalDataExtensionInterface addGiftMessagesItem(GiftMessageDataMessageInterface giftMessagesItem) {
    if (this.giftMessages == null) {
      this.giftMessages = new ArrayList<GiftMessageDataMessageInterface>();
    }
    this.giftMessages.add(giftMessagesItem);
    return this;
  }

   /**
   * Get giftMessages
   * @return giftMessages
  **/
  


  public List<GiftMessageDataMessageInterface> getGiftMessages() {
    return giftMessages;
  }


  public void setGiftMessages(List<GiftMessageDataMessageInterface> giftMessages) {
    this.giftMessages = giftMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataTotalsAdditionalDataExtensionInterface quoteDataTotalsAdditionalDataExtensionInterface = (QuoteDataTotalsAdditionalDataExtensionInterface) o;
    return Objects.equals(this.giftMessages, quoteDataTotalsAdditionalDataExtensionInterface.giftMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataTotalsAdditionalDataExtensionInterface {\n");
    sb.append("    giftMessages: ").append(toIndentedString(giftMessages)).append("\n");
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
