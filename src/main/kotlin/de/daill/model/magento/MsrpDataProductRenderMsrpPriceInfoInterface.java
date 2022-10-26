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
 * Price interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class MsrpDataProductRenderMsrpPriceInfoInterface {
  public static final String SERIALIZED_NAME_MSRP_PRICE = "msrp_price";
  @SerializedName(SERIALIZED_NAME_MSRP_PRICE)
  private String msrpPrice;

  public static final String SERIALIZED_NAME_IS_APPLICABLE = "is_applicable";
  @SerializedName(SERIALIZED_NAME_IS_APPLICABLE)
  private String isApplicable;

  public static final String SERIALIZED_NAME_IS_SHOWN_PRICE_ON_GESTURE = "is_shown_price_on_gesture";
  @SerializedName(SERIALIZED_NAME_IS_SHOWN_PRICE_ON_GESTURE)
  private String isShownPriceOnGesture;

  public static final String SERIALIZED_NAME_MSRP_MESSAGE = "msrp_message";
  @SerializedName(SERIALIZED_NAME_MSRP_MESSAGE)
  private String msrpMessage;

  public static final String SERIALIZED_NAME_EXPLANATION_MESSAGE = "explanation_message";
  @SerializedName(SERIALIZED_NAME_EXPLANATION_MESSAGE)
  private String explanationMessage;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public MsrpDataProductRenderMsrpPriceInfoInterface msrpPrice(String msrpPrice) {
    
    this.msrpPrice = msrpPrice;
    return this;
  }

   /**
   * Get msrpPrice
   * @return msrpPrice
  **/


  public String getMsrpPrice() {
    return msrpPrice;
  }


  public void setMsrpPrice(String msrpPrice) {
    this.msrpPrice = msrpPrice;
  }


  public MsrpDataProductRenderMsrpPriceInfoInterface isApplicable(String isApplicable) {
    
    this.isApplicable = isApplicable;
    return this;
  }

   /**
   * Get isApplicable
   * @return isApplicable
  **/


  public String getIsApplicable() {
    return isApplicable;
  }


  public void setIsApplicable(String isApplicable) {
    this.isApplicable = isApplicable;
  }


  public MsrpDataProductRenderMsrpPriceInfoInterface isShownPriceOnGesture(String isShownPriceOnGesture) {
    
    this.isShownPriceOnGesture = isShownPriceOnGesture;
    return this;
  }

   /**
   * Get isShownPriceOnGesture
   * @return isShownPriceOnGesture
  **/


  public String getIsShownPriceOnGesture() {
    return isShownPriceOnGesture;
  }


  public void setIsShownPriceOnGesture(String isShownPriceOnGesture) {
    this.isShownPriceOnGesture = isShownPriceOnGesture;
  }


  public MsrpDataProductRenderMsrpPriceInfoInterface msrpMessage(String msrpMessage) {
    
    this.msrpMessage = msrpMessage;
    return this;
  }

   /**
   * Get msrpMessage
   * @return msrpMessage
  **/


  public String getMsrpMessage() {
    return msrpMessage;
  }


  public void setMsrpMessage(String msrpMessage) {
    this.msrpMessage = msrpMessage;
  }


  public MsrpDataProductRenderMsrpPriceInfoInterface explanationMessage(String explanationMessage) {
    
    this.explanationMessage = explanationMessage;
    return this;
  }

   /**
   * Get explanationMessage
   * @return explanationMessage
  **/


  public String getExplanationMessage() {
    return explanationMessage;
  }


  public void setExplanationMessage(String explanationMessage) {
    this.explanationMessage = explanationMessage;
  }


  public MsrpDataProductRenderMsrpPriceInfoInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Msrp\\Api\\Data\\ProductRender\\MsrpPriceInfoInterface
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
    MsrpDataProductRenderMsrpPriceInfoInterface msrpDataProductRenderMsrpPriceInfoInterface = (MsrpDataProductRenderMsrpPriceInfoInterface) o;
    return Objects.equals(this.msrpPrice, msrpDataProductRenderMsrpPriceInfoInterface.msrpPrice) &&
        Objects.equals(this.isApplicable, msrpDataProductRenderMsrpPriceInfoInterface.isApplicable) &&
        Objects.equals(this.isShownPriceOnGesture, msrpDataProductRenderMsrpPriceInfoInterface.isShownPriceOnGesture) &&
        Objects.equals(this.msrpMessage, msrpDataProductRenderMsrpPriceInfoInterface.msrpMessage) &&
        Objects.equals(this.explanationMessage, msrpDataProductRenderMsrpPriceInfoInterface.explanationMessage) &&
        Objects.equals(this.extensionAttributes, msrpDataProductRenderMsrpPriceInfoInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msrpPrice, isApplicable, isShownPriceOnGesture, msrpMessage, explanationMessage, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsrpDataProductRenderMsrpPriceInfoInterface {\n");
    sb.append("    msrpPrice: ").append(toIndentedString(msrpPrice)).append("\n");
    sb.append("    isApplicable: ").append(toIndentedString(isApplicable)).append("\n");
    sb.append("    isShownPriceOnGesture: ").append(toIndentedString(isShownPriceOnGesture)).append("\n");
    sb.append("    msrpMessage: ").append(toIndentedString(msrpMessage)).append("\n");
    sb.append("    explanationMessage: ").append(toIndentedString(explanationMessage)).append("\n");
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
