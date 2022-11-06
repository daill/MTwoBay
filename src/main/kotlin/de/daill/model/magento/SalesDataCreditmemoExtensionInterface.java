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

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\CreditmemoInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataCreditmemoExtensionInterface {
  public static final String SERIALIZED_NAME_BASE_CUSTOMER_BALANCE_AMOUNT = "base_customer_balance_amount";
  @SerializedName(SERIALIZED_NAME_BASE_CUSTOMER_BALANCE_AMOUNT)
  private BigDecimal baseCustomerBalanceAmount;

  public static final String SERIALIZED_NAME_CUSTOMER_BALANCE_AMOUNT = "customer_balance_amount";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BALANCE_AMOUNT)
  private BigDecimal customerBalanceAmount;

  public static final String SERIALIZED_NAME_BASE_GIFT_CARDS_AMOUNT = "base_gift_cards_amount";
  @SerializedName(SERIALIZED_NAME_BASE_GIFT_CARDS_AMOUNT)
  private BigDecimal baseGiftCardsAmount;

  public static final String SERIALIZED_NAME_GIFT_CARDS_AMOUNT = "gift_cards_amount";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS_AMOUNT)
  private BigDecimal giftCardsAmount;

  public static final String SERIALIZED_NAME_GW_BASE_PRICE = "gw_base_price";
  @SerializedName(SERIALIZED_NAME_GW_BASE_PRICE)
  private String gwBasePrice;

  public static final String SERIALIZED_NAME_GW_PRICE = "gw_price";
  @SerializedName(SERIALIZED_NAME_GW_PRICE)
  private String gwPrice;

  public static final String SERIALIZED_NAME_GW_ITEMS_BASE_PRICE = "gw_items_base_price";
  @SerializedName(SERIALIZED_NAME_GW_ITEMS_BASE_PRICE)
  private String gwItemsBasePrice;

  public static final String SERIALIZED_NAME_GW_ITEMS_PRICE = "gw_items_price";
  @SerializedName(SERIALIZED_NAME_GW_ITEMS_PRICE)
  private String gwItemsPrice;

  public static final String SERIALIZED_NAME_GW_CARD_BASE_PRICE = "gw_card_base_price";
  @SerializedName(SERIALIZED_NAME_GW_CARD_BASE_PRICE)
  private String gwCardBasePrice;

  public static final String SERIALIZED_NAME_GW_CARD_PRICE = "gw_card_price";
  @SerializedName(SERIALIZED_NAME_GW_CARD_PRICE)
  private String gwCardPrice;

  public static final String SERIALIZED_NAME_GW_BASE_TAX_AMOUNT = "gw_base_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_BASE_TAX_AMOUNT)
  private String gwBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_TAX_AMOUNT = "gw_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_TAX_AMOUNT)
  private String gwTaxAmount;

  public static final String SERIALIZED_NAME_GW_ITEMS_BASE_TAX_AMOUNT = "gw_items_base_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_ITEMS_BASE_TAX_AMOUNT)
  private String gwItemsBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_ITEMS_TAX_AMOUNT = "gw_items_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_ITEMS_TAX_AMOUNT)
  private String gwItemsTaxAmount;

  public static final String SERIALIZED_NAME_GW_CARD_BASE_TAX_AMOUNT = "gw_card_base_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_CARD_BASE_TAX_AMOUNT)
  private String gwCardBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_CARD_TAX_AMOUNT = "gw_card_tax_amount";
  @SerializedName(SERIALIZED_NAME_GW_CARD_TAX_AMOUNT)
  private String gwCardTaxAmount;


  public SalesDataCreditmemoExtensionInterface baseCustomerBalanceAmount(BigDecimal baseCustomerBalanceAmount) {
    
    this.baseCustomerBalanceAmount = baseCustomerBalanceAmount;
    return this;
  }

   /**
   * Get baseCustomerBalanceAmount
   * @return baseCustomerBalanceAmount
  **/
  
  

  public BigDecimal getBaseCustomerBalanceAmount() {
    return baseCustomerBalanceAmount;
  }


  public void setBaseCustomerBalanceAmount(BigDecimal baseCustomerBalanceAmount) {
    this.baseCustomerBalanceAmount = baseCustomerBalanceAmount;
  }


  public SalesDataCreditmemoExtensionInterface customerBalanceAmount(BigDecimal customerBalanceAmount) {
    
    this.customerBalanceAmount = customerBalanceAmount;
    return this;
  }

   /**
   * Get customerBalanceAmount
   * @return customerBalanceAmount
  **/
  
  

  public BigDecimal getCustomerBalanceAmount() {
    return customerBalanceAmount;
  }


  public void setCustomerBalanceAmount(BigDecimal customerBalanceAmount) {
    this.customerBalanceAmount = customerBalanceAmount;
  }


  public SalesDataCreditmemoExtensionInterface baseGiftCardsAmount(BigDecimal baseGiftCardsAmount) {
    
    this.baseGiftCardsAmount = baseGiftCardsAmount;
    return this;
  }

   /**
   * Get baseGiftCardsAmount
   * @return baseGiftCardsAmount
  **/
  
  

  public BigDecimal getBaseGiftCardsAmount() {
    return baseGiftCardsAmount;
  }


  public void setBaseGiftCardsAmount(BigDecimal baseGiftCardsAmount) {
    this.baseGiftCardsAmount = baseGiftCardsAmount;
  }


  public SalesDataCreditmemoExtensionInterface giftCardsAmount(BigDecimal giftCardsAmount) {
    
    this.giftCardsAmount = giftCardsAmount;
    return this;
  }

   /**
   * Get giftCardsAmount
   * @return giftCardsAmount
  **/
  
  

  public BigDecimal getGiftCardsAmount() {
    return giftCardsAmount;
  }


  public void setGiftCardsAmount(BigDecimal giftCardsAmount) {
    this.giftCardsAmount = giftCardsAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwBasePrice(String gwBasePrice) {
    
    this.gwBasePrice = gwBasePrice;
    return this;
  }

   /**
   * Get gwBasePrice
   * @return gwBasePrice
  **/
  
  

  public String getGwBasePrice() {
    return gwBasePrice;
  }


  public void setGwBasePrice(String gwBasePrice) {
    this.gwBasePrice = gwBasePrice;
  }


  public SalesDataCreditmemoExtensionInterface gwPrice(String gwPrice) {
    
    this.gwPrice = gwPrice;
    return this;
  }

   /**
   * Get gwPrice
   * @return gwPrice
  **/
  
  

  public String getGwPrice() {
    return gwPrice;
  }


  public void setGwPrice(String gwPrice) {
    this.gwPrice = gwPrice;
  }


  public SalesDataCreditmemoExtensionInterface gwItemsBasePrice(String gwItemsBasePrice) {
    
    this.gwItemsBasePrice = gwItemsBasePrice;
    return this;
  }

   /**
   * Get gwItemsBasePrice
   * @return gwItemsBasePrice
  **/
  
  

  public String getGwItemsBasePrice() {
    return gwItemsBasePrice;
  }


  public void setGwItemsBasePrice(String gwItemsBasePrice) {
    this.gwItemsBasePrice = gwItemsBasePrice;
  }


  public SalesDataCreditmemoExtensionInterface gwItemsPrice(String gwItemsPrice) {
    
    this.gwItemsPrice = gwItemsPrice;
    return this;
  }

   /**
   * Get gwItemsPrice
   * @return gwItemsPrice
  **/
  
  

  public String getGwItemsPrice() {
    return gwItemsPrice;
  }


  public void setGwItemsPrice(String gwItemsPrice) {
    this.gwItemsPrice = gwItemsPrice;
  }


  public SalesDataCreditmemoExtensionInterface gwCardBasePrice(String gwCardBasePrice) {
    
    this.gwCardBasePrice = gwCardBasePrice;
    return this;
  }

   /**
   * Get gwCardBasePrice
   * @return gwCardBasePrice
  **/
  
  

  public String getGwCardBasePrice() {
    return gwCardBasePrice;
  }


  public void setGwCardBasePrice(String gwCardBasePrice) {
    this.gwCardBasePrice = gwCardBasePrice;
  }


  public SalesDataCreditmemoExtensionInterface gwCardPrice(String gwCardPrice) {
    
    this.gwCardPrice = gwCardPrice;
    return this;
  }

   /**
   * Get gwCardPrice
   * @return gwCardPrice
  **/
  
  

  public String getGwCardPrice() {
    return gwCardPrice;
  }


  public void setGwCardPrice(String gwCardPrice) {
    this.gwCardPrice = gwCardPrice;
  }


  public SalesDataCreditmemoExtensionInterface gwBaseTaxAmount(String gwBaseTaxAmount) {
    
    this.gwBaseTaxAmount = gwBaseTaxAmount;
    return this;
  }

   /**
   * Get gwBaseTaxAmount
   * @return gwBaseTaxAmount
  **/
  
  

  public String getGwBaseTaxAmount() {
    return gwBaseTaxAmount;
  }


  public void setGwBaseTaxAmount(String gwBaseTaxAmount) {
    this.gwBaseTaxAmount = gwBaseTaxAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwTaxAmount(String gwTaxAmount) {
    
    this.gwTaxAmount = gwTaxAmount;
    return this;
  }

   /**
   * Get gwTaxAmount
   * @return gwTaxAmount
  **/
  
  

  public String getGwTaxAmount() {
    return gwTaxAmount;
  }


  public void setGwTaxAmount(String gwTaxAmount) {
    this.gwTaxAmount = gwTaxAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwItemsBaseTaxAmount(String gwItemsBaseTaxAmount) {
    
    this.gwItemsBaseTaxAmount = gwItemsBaseTaxAmount;
    return this;
  }

   /**
   * Get gwItemsBaseTaxAmount
   * @return gwItemsBaseTaxAmount
  **/
  
  

  public String getGwItemsBaseTaxAmount() {
    return gwItemsBaseTaxAmount;
  }


  public void setGwItemsBaseTaxAmount(String gwItemsBaseTaxAmount) {
    this.gwItemsBaseTaxAmount = gwItemsBaseTaxAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwItemsTaxAmount(String gwItemsTaxAmount) {
    
    this.gwItemsTaxAmount = gwItemsTaxAmount;
    return this;
  }

   /**
   * Get gwItemsTaxAmount
   * @return gwItemsTaxAmount
  **/
  
  

  public String getGwItemsTaxAmount() {
    return gwItemsTaxAmount;
  }


  public void setGwItemsTaxAmount(String gwItemsTaxAmount) {
    this.gwItemsTaxAmount = gwItemsTaxAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwCardBaseTaxAmount(String gwCardBaseTaxAmount) {
    
    this.gwCardBaseTaxAmount = gwCardBaseTaxAmount;
    return this;
  }

   /**
   * Get gwCardBaseTaxAmount
   * @return gwCardBaseTaxAmount
  **/
  
  

  public String getGwCardBaseTaxAmount() {
    return gwCardBaseTaxAmount;
  }


  public void setGwCardBaseTaxAmount(String gwCardBaseTaxAmount) {
    this.gwCardBaseTaxAmount = gwCardBaseTaxAmount;
  }


  public SalesDataCreditmemoExtensionInterface gwCardTaxAmount(String gwCardTaxAmount) {
    
    this.gwCardTaxAmount = gwCardTaxAmount;
    return this;
  }

   /**
   * Get gwCardTaxAmount
   * @return gwCardTaxAmount
  **/
  
  

  public String getGwCardTaxAmount() {
    return gwCardTaxAmount;
  }


  public void setGwCardTaxAmount(String gwCardTaxAmount) {
    this.gwCardTaxAmount = gwCardTaxAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataCreditmemoExtensionInterface salesDataCreditmemoExtensionInterface = (SalesDataCreditmemoExtensionInterface) o;
    return Objects.equals(this.baseCustomerBalanceAmount, salesDataCreditmemoExtensionInterface.baseCustomerBalanceAmount) &&
        Objects.equals(this.customerBalanceAmount, salesDataCreditmemoExtensionInterface.customerBalanceAmount) &&
        Objects.equals(this.baseGiftCardsAmount, salesDataCreditmemoExtensionInterface.baseGiftCardsAmount) &&
        Objects.equals(this.giftCardsAmount, salesDataCreditmemoExtensionInterface.giftCardsAmount) &&
        Objects.equals(this.gwBasePrice, salesDataCreditmemoExtensionInterface.gwBasePrice) &&
        Objects.equals(this.gwPrice, salesDataCreditmemoExtensionInterface.gwPrice) &&
        Objects.equals(this.gwItemsBasePrice, salesDataCreditmemoExtensionInterface.gwItemsBasePrice) &&
        Objects.equals(this.gwItemsPrice, salesDataCreditmemoExtensionInterface.gwItemsPrice) &&
        Objects.equals(this.gwCardBasePrice, salesDataCreditmemoExtensionInterface.gwCardBasePrice) &&
        Objects.equals(this.gwCardPrice, salesDataCreditmemoExtensionInterface.gwCardPrice) &&
        Objects.equals(this.gwBaseTaxAmount, salesDataCreditmemoExtensionInterface.gwBaseTaxAmount) &&
        Objects.equals(this.gwTaxAmount, salesDataCreditmemoExtensionInterface.gwTaxAmount) &&
        Objects.equals(this.gwItemsBaseTaxAmount, salesDataCreditmemoExtensionInterface.gwItemsBaseTaxAmount) &&
        Objects.equals(this.gwItemsTaxAmount, salesDataCreditmemoExtensionInterface.gwItemsTaxAmount) &&
        Objects.equals(this.gwCardBaseTaxAmount, salesDataCreditmemoExtensionInterface.gwCardBaseTaxAmount) &&
        Objects.equals(this.gwCardTaxAmount, salesDataCreditmemoExtensionInterface.gwCardTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCustomerBalanceAmount, customerBalanceAmount, baseGiftCardsAmount, giftCardsAmount, gwBasePrice, gwPrice, gwItemsBasePrice, gwItemsPrice, gwCardBasePrice, gwCardPrice, gwBaseTaxAmount, gwTaxAmount, gwItemsBaseTaxAmount, gwItemsTaxAmount, gwCardBaseTaxAmount, gwCardTaxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataCreditmemoExtensionInterface {\n");
    sb.append("    baseCustomerBalanceAmount: ").append(toIndentedString(baseCustomerBalanceAmount)).append("\n");
    sb.append("    customerBalanceAmount: ").append(toIndentedString(customerBalanceAmount)).append("\n");
    sb.append("    baseGiftCardsAmount: ").append(toIndentedString(baseGiftCardsAmount)).append("\n");
    sb.append("    giftCardsAmount: ").append(toIndentedString(giftCardsAmount)).append("\n");
    sb.append("    gwBasePrice: ").append(toIndentedString(gwBasePrice)).append("\n");
    sb.append("    gwPrice: ").append(toIndentedString(gwPrice)).append("\n");
    sb.append("    gwItemsBasePrice: ").append(toIndentedString(gwItemsBasePrice)).append("\n");
    sb.append("    gwItemsPrice: ").append(toIndentedString(gwItemsPrice)).append("\n");
    sb.append("    gwCardBasePrice: ").append(toIndentedString(gwCardBasePrice)).append("\n");
    sb.append("    gwCardPrice: ").append(toIndentedString(gwCardPrice)).append("\n");
    sb.append("    gwBaseTaxAmount: ").append(toIndentedString(gwBaseTaxAmount)).append("\n");
    sb.append("    gwTaxAmount: ").append(toIndentedString(gwTaxAmount)).append("\n");
    sb.append("    gwItemsBaseTaxAmount: ").append(toIndentedString(gwItemsBaseTaxAmount)).append("\n");
    sb.append("    gwItemsTaxAmount: ").append(toIndentedString(gwItemsTaxAmount)).append("\n");
    sb.append("    gwCardBaseTaxAmount: ").append(toIndentedString(gwCardBaseTaxAmount)).append("\n");
    sb.append("    gwCardTaxAmount: ").append(toIndentedString(gwCardTaxAmount)).append("\n");
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

