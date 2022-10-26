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
 * Credit balance data transfer object interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CompanyCreditDataCreditBalanceOptionsInterface {
  public static final String SERIALIZED_NAME_PURCHASE_ORDER = "purchase_order";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER)
  private String purchaseOrder;

  public static final String SERIALIZED_NAME_CUSTOM_REFERENCE_NUMBER = "custom_reference_number";
  @SerializedName(SERIALIZED_NAME_CUSTOM_REFERENCE_NUMBER)
  private String customReferenceNumber;

  public static final String SERIALIZED_NAME_ORDER_INCREMENT = "order_increment";
  @SerializedName(SERIALIZED_NAME_ORDER_INCREMENT)
  private String orderIncrement;

  public static final String SERIALIZED_NAME_CURRENCY_DISPLAY = "currency_display";
  @SerializedName(SERIALIZED_NAME_CURRENCY_DISPLAY)
  private String currencyDisplay;

  public static final String SERIALIZED_NAME_CURRENCY_BASE = "currency_base";
  @SerializedName(SERIALIZED_NAME_CURRENCY_BASE)
  private String currencyBase;


  public CompanyCreditDataCreditBalanceOptionsInterface purchaseOrder(String purchaseOrder) {
    
    this.purchaseOrder = purchaseOrder;
    return this;
  }

   /**
   * Purchase order number.
   * @return purchaseOrder
  **/


  public String getPurchaseOrder() {
    return purchaseOrder;
  }


  public void setPurchaseOrder(String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }


  public CompanyCreditDataCreditBalanceOptionsInterface customReferenceNumber(String customReferenceNumber) {
    
    this.customReferenceNumber = customReferenceNumber;
    return this;
  }

   /**
   * Custom Reference number.
   * @return customReferenceNumber
  **/

  

  public String getCustomReferenceNumber() {
    return customReferenceNumber;
  }


  public void setCustomReferenceNumber(String customReferenceNumber) {
    this.customReferenceNumber = customReferenceNumber;
  }


  public CompanyCreditDataCreditBalanceOptionsInterface orderIncrement(String orderIncrement) {
    
    this.orderIncrement = orderIncrement;
    return this;
  }

   /**
   * Order increment.
   * @return orderIncrement
  **/


  public String getOrderIncrement() {
    return orderIncrement;
  }


  public void setOrderIncrement(String orderIncrement) {
    this.orderIncrement = orderIncrement;
  }


  public CompanyCreditDataCreditBalanceOptionsInterface currencyDisplay(String currencyDisplay) {
    
    this.currencyDisplay = currencyDisplay;
    return this;
  }

   /**
   * Currency display.
   * @return currencyDisplay
  **/


  public String getCurrencyDisplay() {
    return currencyDisplay;
  }


  public void setCurrencyDisplay(String currencyDisplay) {
    this.currencyDisplay = currencyDisplay;
  }


  public CompanyCreditDataCreditBalanceOptionsInterface currencyBase(String currencyBase) {
    
    this.currencyBase = currencyBase;
    return this;
  }

   /**
   * Currency base.
   * @return currencyBase
  **/


  public String getCurrencyBase() {
    return currencyBase;
  }


  public void setCurrencyBase(String currencyBase) {
    this.currencyBase = currencyBase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyCreditDataCreditBalanceOptionsInterface companyCreditDataCreditBalanceOptionsInterface = (CompanyCreditDataCreditBalanceOptionsInterface) o;
    return Objects.equals(this.purchaseOrder, companyCreditDataCreditBalanceOptionsInterface.purchaseOrder) &&
        Objects.equals(this.customReferenceNumber, companyCreditDataCreditBalanceOptionsInterface.customReferenceNumber) &&
        Objects.equals(this.orderIncrement, companyCreditDataCreditBalanceOptionsInterface.orderIncrement) &&
        Objects.equals(this.currencyDisplay, companyCreditDataCreditBalanceOptionsInterface.currencyDisplay) &&
        Objects.equals(this.currencyBase, companyCreditDataCreditBalanceOptionsInterface.currencyBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrder, customReferenceNumber, orderIncrement, currencyDisplay, currencyBase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyCreditDataCreditBalanceOptionsInterface {\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
    sb.append("    customReferenceNumber: ").append(toIndentedString(customReferenceNumber)).append("\n");
    sb.append("    orderIncrement: ").append(toIndentedString(orderIncrement)).append("\n");
    sb.append("    currencyDisplay: ").append(toIndentedString(currencyDisplay)).append("\n");
    sb.append("    currencyBase: ").append(toIndentedString(currencyBase)).append("\n");
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
