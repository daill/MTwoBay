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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\TotalSegmentInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataTotalSegmentExtensionInterface {
  public static final String SERIALIZED_NAME_TAX_GRANDTOTAL_DETAILS = "tax_grandtotal_details";
  @Json(name = SERIALIZED_NAME_TAX_GRANDTOTAL_DETAILS)
  private List<TaxDataGrandTotalDetailsInterface> taxGrandtotalDetails = null;

  public static final String SERIALIZED_NAME_GIFT_CARDS = "gift_cards";
  @Json(name = SERIALIZED_NAME_GIFT_CARDS)
  private String giftCards;

  public static final String SERIALIZED_NAME_GW_ORDER_ID = "gw_order_id";
  @Json(name = SERIALIZED_NAME_GW_ORDER_ID)
  private String gwOrderId;

  public static final String SERIALIZED_NAME_GW_ITEM_IDS = "gw_item_ids";
  @Json(name = SERIALIZED_NAME_GW_ITEM_IDS)
  private List<String> gwItemIds = null;

  public static final String SERIALIZED_NAME_GW_ALLOW_GIFT_RECEIPT = "gw_allow_gift_receipt";
  @Json(name = SERIALIZED_NAME_GW_ALLOW_GIFT_RECEIPT)
  private String gwAllowGiftReceipt;

  public static final String SERIALIZED_NAME_GW_ADD_CARD = "gw_add_card";
  @Json(name = SERIALIZED_NAME_GW_ADD_CARD)
  private String gwAddCard;

  public static final String SERIALIZED_NAME_GW_PRICE = "gw_price";
  @Json(name = SERIALIZED_NAME_GW_PRICE)
  private String gwPrice;

  public static final String SERIALIZED_NAME_GW_BASE_PRICE = "gw_base_price";
  @Json(name = SERIALIZED_NAME_GW_BASE_PRICE)
  private String gwBasePrice;

  public static final String SERIALIZED_NAME_GW_ITEMS_PRICE = "gw_items_price";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_PRICE)
  private String gwItemsPrice;

  public static final String SERIALIZED_NAME_GW_ITEMS_BASE_PRICE = "gw_items_base_price";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_BASE_PRICE)
  private String gwItemsBasePrice;

  public static final String SERIALIZED_NAME_GW_CARD_PRICE = "gw_card_price";
  @Json(name = SERIALIZED_NAME_GW_CARD_PRICE)
  private String gwCardPrice;

  public static final String SERIALIZED_NAME_GW_CARD_BASE_PRICE = "gw_card_base_price";
  @Json(name = SERIALIZED_NAME_GW_CARD_BASE_PRICE)
  private String gwCardBasePrice;

  public static final String SERIALIZED_NAME_GW_BASE_TAX_AMOUNT = "gw_base_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_BASE_TAX_AMOUNT)
  private String gwBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_TAX_AMOUNT = "gw_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_TAX_AMOUNT)
  private String gwTaxAmount;

  public static final String SERIALIZED_NAME_GW_ITEMS_BASE_TAX_AMOUNT = "gw_items_base_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_BASE_TAX_AMOUNT)
  private String gwItemsBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_ITEMS_TAX_AMOUNT = "gw_items_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_TAX_AMOUNT)
  private String gwItemsTaxAmount;

  public static final String SERIALIZED_NAME_GW_CARD_BASE_TAX_AMOUNT = "gw_card_base_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_CARD_BASE_TAX_AMOUNT)
  private String gwCardBaseTaxAmount;

  public static final String SERIALIZED_NAME_GW_CARD_TAX_AMOUNT = "gw_card_tax_amount";
  @Json(name = SERIALIZED_NAME_GW_CARD_TAX_AMOUNT)
  private String gwCardTaxAmount;

  public static final String SERIALIZED_NAME_GW_PRICE_INCL_TAX = "gw_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_PRICE_INCL_TAX)
  private String gwPriceInclTax;

  public static final String SERIALIZED_NAME_GW_BASE_PRICE_INCL_TAX = "gw_base_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_BASE_PRICE_INCL_TAX)
  private String gwBasePriceInclTax;

  public static final String SERIALIZED_NAME_GW_CARD_PRICE_INCL_TAX = "gw_card_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_CARD_PRICE_INCL_TAX)
  private String gwCardPriceInclTax;

  public static final String SERIALIZED_NAME_GW_CARD_BASE_PRICE_INCL_TAX = "gw_card_base_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_CARD_BASE_PRICE_INCL_TAX)
  private String gwCardBasePriceInclTax;

  public static final String SERIALIZED_NAME_GW_ITEMS_PRICE_INCL_TAX = "gw_items_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_PRICE_INCL_TAX)
  private String gwItemsPriceInclTax;

  public static final String SERIALIZED_NAME_GW_ITEMS_BASE_PRICE_INCL_TAX = "gw_items_base_price_incl_tax";
  @Json(name = SERIALIZED_NAME_GW_ITEMS_BASE_PRICE_INCL_TAX)
  private String gwItemsBasePriceInclTax;


  public QuoteDataTotalSegmentExtensionInterface taxGrandtotalDetails(List<TaxDataGrandTotalDetailsInterface> taxGrandtotalDetails) {
    
    this.taxGrandtotalDetails = taxGrandtotalDetails;
    return this;
  }

  public QuoteDataTotalSegmentExtensionInterface addTaxGrandtotalDetailsItem(TaxDataGrandTotalDetailsInterface taxGrandtotalDetailsItem) {
    if (this.taxGrandtotalDetails == null) {
      this.taxGrandtotalDetails = new ArrayList<TaxDataGrandTotalDetailsInterface>();
    }
    this.taxGrandtotalDetails.add(taxGrandtotalDetailsItem);
    return this;
  }

   /**
   * Get taxGrandtotalDetails
   * @return taxGrandtotalDetails
  **/

  

  public List<TaxDataGrandTotalDetailsInterface> getTaxGrandtotalDetails() {
    return taxGrandtotalDetails;
  }


  public void setTaxGrandtotalDetails(List<TaxDataGrandTotalDetailsInterface> taxGrandtotalDetails) {
    this.taxGrandtotalDetails = taxGrandtotalDetails;
  }


  public QuoteDataTotalSegmentExtensionInterface giftCards(String giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

   /**
   * Get giftCards
   * @return giftCards
  **/

  

  public String getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(String giftCards) {
    this.giftCards = giftCards;
  }


  public QuoteDataTotalSegmentExtensionInterface gwOrderId(String gwOrderId) {
    
    this.gwOrderId = gwOrderId;
    return this;
  }

   /**
   * Get gwOrderId
   * @return gwOrderId
  **/

  

  public String getGwOrderId() {
    return gwOrderId;
  }


  public void setGwOrderId(String gwOrderId) {
    this.gwOrderId = gwOrderId;
  }


  public QuoteDataTotalSegmentExtensionInterface gwItemIds(List<String> gwItemIds) {
    
    this.gwItemIds = gwItemIds;
    return this;
  }

  public QuoteDataTotalSegmentExtensionInterface addGwItemIdsItem(String gwItemIdsItem) {
    if (this.gwItemIds == null) {
      this.gwItemIds = new ArrayList<String>();
    }
    this.gwItemIds.add(gwItemIdsItem);
    return this;
  }

   /**
   * Get gwItemIds
   * @return gwItemIds
  **/

  

  public List<String> getGwItemIds() {
    return gwItemIds;
  }


  public void setGwItemIds(List<String> gwItemIds) {
    this.gwItemIds = gwItemIds;
  }


  public QuoteDataTotalSegmentExtensionInterface gwAllowGiftReceipt(String gwAllowGiftReceipt) {
    
    this.gwAllowGiftReceipt = gwAllowGiftReceipt;
    return this;
  }

   /**
   * Get gwAllowGiftReceipt
   * @return gwAllowGiftReceipt
  **/

  

  public String getGwAllowGiftReceipt() {
    return gwAllowGiftReceipt;
  }


  public void setGwAllowGiftReceipt(String gwAllowGiftReceipt) {
    this.gwAllowGiftReceipt = gwAllowGiftReceipt;
  }


  public QuoteDataTotalSegmentExtensionInterface gwAddCard(String gwAddCard) {
    
    this.gwAddCard = gwAddCard;
    return this;
  }

   /**
   * Get gwAddCard
   * @return gwAddCard
  **/

  

  public String getGwAddCard() {
    return gwAddCard;
  }


  public void setGwAddCard(String gwAddCard) {
    this.gwAddCard = gwAddCard;
  }


  public QuoteDataTotalSegmentExtensionInterface gwPrice(String gwPrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwBasePrice(String gwBasePrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwItemsPrice(String gwItemsPrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwItemsBasePrice(String gwItemsBasePrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwCardPrice(String gwCardPrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwCardBasePrice(String gwCardBasePrice) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwBaseTaxAmount(String gwBaseTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwTaxAmount(String gwTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwItemsBaseTaxAmount(String gwItemsBaseTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwItemsTaxAmount(String gwItemsTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwCardBaseTaxAmount(String gwCardBaseTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwCardTaxAmount(String gwCardTaxAmount) {
    
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


  public QuoteDataTotalSegmentExtensionInterface gwPriceInclTax(String gwPriceInclTax) {
    
    this.gwPriceInclTax = gwPriceInclTax;
    return this;
  }

   /**
   * Get gwPriceInclTax
   * @return gwPriceInclTax
  **/

  

  public String getGwPriceInclTax() {
    return gwPriceInclTax;
  }


  public void setGwPriceInclTax(String gwPriceInclTax) {
    this.gwPriceInclTax = gwPriceInclTax;
  }


  public QuoteDataTotalSegmentExtensionInterface gwBasePriceInclTax(String gwBasePriceInclTax) {
    
    this.gwBasePriceInclTax = gwBasePriceInclTax;
    return this;
  }

   /**
   * Get gwBasePriceInclTax
   * @return gwBasePriceInclTax
  **/

  

  public String getGwBasePriceInclTax() {
    return gwBasePriceInclTax;
  }


  public void setGwBasePriceInclTax(String gwBasePriceInclTax) {
    this.gwBasePriceInclTax = gwBasePriceInclTax;
  }


  public QuoteDataTotalSegmentExtensionInterface gwCardPriceInclTax(String gwCardPriceInclTax) {
    
    this.gwCardPriceInclTax = gwCardPriceInclTax;
    return this;
  }

   /**
   * Get gwCardPriceInclTax
   * @return gwCardPriceInclTax
  **/

  

  public String getGwCardPriceInclTax() {
    return gwCardPriceInclTax;
  }


  public void setGwCardPriceInclTax(String gwCardPriceInclTax) {
    this.gwCardPriceInclTax = gwCardPriceInclTax;
  }


  public QuoteDataTotalSegmentExtensionInterface gwCardBasePriceInclTax(String gwCardBasePriceInclTax) {
    
    this.gwCardBasePriceInclTax = gwCardBasePriceInclTax;
    return this;
  }

   /**
   * Get gwCardBasePriceInclTax
   * @return gwCardBasePriceInclTax
  **/

  

  public String getGwCardBasePriceInclTax() {
    return gwCardBasePriceInclTax;
  }


  public void setGwCardBasePriceInclTax(String gwCardBasePriceInclTax) {
    this.gwCardBasePriceInclTax = gwCardBasePriceInclTax;
  }


  public QuoteDataTotalSegmentExtensionInterface gwItemsPriceInclTax(String gwItemsPriceInclTax) {
    
    this.gwItemsPriceInclTax = gwItemsPriceInclTax;
    return this;
  }

   /**
   * Get gwItemsPriceInclTax
   * @return gwItemsPriceInclTax
  **/

  

  public String getGwItemsPriceInclTax() {
    return gwItemsPriceInclTax;
  }


  public void setGwItemsPriceInclTax(String gwItemsPriceInclTax) {
    this.gwItemsPriceInclTax = gwItemsPriceInclTax;
  }


  public QuoteDataTotalSegmentExtensionInterface gwItemsBasePriceInclTax(String gwItemsBasePriceInclTax) {
    
    this.gwItemsBasePriceInclTax = gwItemsBasePriceInclTax;
    return this;
  }

   /**
   * Get gwItemsBasePriceInclTax
   * @return gwItemsBasePriceInclTax
  **/

  

  public String getGwItemsBasePriceInclTax() {
    return gwItemsBasePriceInclTax;
  }


  public void setGwItemsBasePriceInclTax(String gwItemsBasePriceInclTax) {
    this.gwItemsBasePriceInclTax = gwItemsBasePriceInclTax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataTotalSegmentExtensionInterface quoteDataTotalSegmentExtensionInterface = (QuoteDataTotalSegmentExtensionInterface) o;
    return Objects.equals(this.taxGrandtotalDetails, quoteDataTotalSegmentExtensionInterface.taxGrandtotalDetails) &&
        Objects.equals(this.giftCards, quoteDataTotalSegmentExtensionInterface.giftCards) &&
        Objects.equals(this.gwOrderId, quoteDataTotalSegmentExtensionInterface.gwOrderId) &&
        Objects.equals(this.gwItemIds, quoteDataTotalSegmentExtensionInterface.gwItemIds) &&
        Objects.equals(this.gwAllowGiftReceipt, quoteDataTotalSegmentExtensionInterface.gwAllowGiftReceipt) &&
        Objects.equals(this.gwAddCard, quoteDataTotalSegmentExtensionInterface.gwAddCard) &&
        Objects.equals(this.gwPrice, quoteDataTotalSegmentExtensionInterface.gwPrice) &&
        Objects.equals(this.gwBasePrice, quoteDataTotalSegmentExtensionInterface.gwBasePrice) &&
        Objects.equals(this.gwItemsPrice, quoteDataTotalSegmentExtensionInterface.gwItemsPrice) &&
        Objects.equals(this.gwItemsBasePrice, quoteDataTotalSegmentExtensionInterface.gwItemsBasePrice) &&
        Objects.equals(this.gwCardPrice, quoteDataTotalSegmentExtensionInterface.gwCardPrice) &&
        Objects.equals(this.gwCardBasePrice, quoteDataTotalSegmentExtensionInterface.gwCardBasePrice) &&
        Objects.equals(this.gwBaseTaxAmount, quoteDataTotalSegmentExtensionInterface.gwBaseTaxAmount) &&
        Objects.equals(this.gwTaxAmount, quoteDataTotalSegmentExtensionInterface.gwTaxAmount) &&
        Objects.equals(this.gwItemsBaseTaxAmount, quoteDataTotalSegmentExtensionInterface.gwItemsBaseTaxAmount) &&
        Objects.equals(this.gwItemsTaxAmount, quoteDataTotalSegmentExtensionInterface.gwItemsTaxAmount) &&
        Objects.equals(this.gwCardBaseTaxAmount, quoteDataTotalSegmentExtensionInterface.gwCardBaseTaxAmount) &&
        Objects.equals(this.gwCardTaxAmount, quoteDataTotalSegmentExtensionInterface.gwCardTaxAmount) &&
        Objects.equals(this.gwPriceInclTax, quoteDataTotalSegmentExtensionInterface.gwPriceInclTax) &&
        Objects.equals(this.gwBasePriceInclTax, quoteDataTotalSegmentExtensionInterface.gwBasePriceInclTax) &&
        Objects.equals(this.gwCardPriceInclTax, quoteDataTotalSegmentExtensionInterface.gwCardPriceInclTax) &&
        Objects.equals(this.gwCardBasePriceInclTax, quoteDataTotalSegmentExtensionInterface.gwCardBasePriceInclTax) &&
        Objects.equals(this.gwItemsPriceInclTax, quoteDataTotalSegmentExtensionInterface.gwItemsPriceInclTax) &&
        Objects.equals(this.gwItemsBasePriceInclTax, quoteDataTotalSegmentExtensionInterface.gwItemsBasePriceInclTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxGrandtotalDetails, giftCards, gwOrderId, gwItemIds, gwAllowGiftReceipt, gwAddCard, gwPrice, gwBasePrice, gwItemsPrice, gwItemsBasePrice, gwCardPrice, gwCardBasePrice, gwBaseTaxAmount, gwTaxAmount, gwItemsBaseTaxAmount, gwItemsTaxAmount, gwCardBaseTaxAmount, gwCardTaxAmount, gwPriceInclTax, gwBasePriceInclTax, gwCardPriceInclTax, gwCardBasePriceInclTax, gwItemsPriceInclTax, gwItemsBasePriceInclTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataTotalSegmentExtensionInterface {\n");
    sb.append("    taxGrandtotalDetails: ").append(toIndentedString(taxGrandtotalDetails)).append("\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    gwOrderId: ").append(toIndentedString(gwOrderId)).append("\n");
    sb.append("    gwItemIds: ").append(toIndentedString(gwItemIds)).append("\n");
    sb.append("    gwAllowGiftReceipt: ").append(toIndentedString(gwAllowGiftReceipt)).append("\n");
    sb.append("    gwAddCard: ").append(toIndentedString(gwAddCard)).append("\n");
    sb.append("    gwPrice: ").append(toIndentedString(gwPrice)).append("\n");
    sb.append("    gwBasePrice: ").append(toIndentedString(gwBasePrice)).append("\n");
    sb.append("    gwItemsPrice: ").append(toIndentedString(gwItemsPrice)).append("\n");
    sb.append("    gwItemsBasePrice: ").append(toIndentedString(gwItemsBasePrice)).append("\n");
    sb.append("    gwCardPrice: ").append(toIndentedString(gwCardPrice)).append("\n");
    sb.append("    gwCardBasePrice: ").append(toIndentedString(gwCardBasePrice)).append("\n");
    sb.append("    gwBaseTaxAmount: ").append(toIndentedString(gwBaseTaxAmount)).append("\n");
    sb.append("    gwTaxAmount: ").append(toIndentedString(gwTaxAmount)).append("\n");
    sb.append("    gwItemsBaseTaxAmount: ").append(toIndentedString(gwItemsBaseTaxAmount)).append("\n");
    sb.append("    gwItemsTaxAmount: ").append(toIndentedString(gwItemsTaxAmount)).append("\n");
    sb.append("    gwCardBaseTaxAmount: ").append(toIndentedString(gwCardBaseTaxAmount)).append("\n");
    sb.append("    gwCardTaxAmount: ").append(toIndentedString(gwCardTaxAmount)).append("\n");
    sb.append("    gwPriceInclTax: ").append(toIndentedString(gwPriceInclTax)).append("\n");
    sb.append("    gwBasePriceInclTax: ").append(toIndentedString(gwBasePriceInclTax)).append("\n");
    sb.append("    gwCardPriceInclTax: ").append(toIndentedString(gwCardPriceInclTax)).append("\n");
    sb.append("    gwCardBasePriceInclTax: ").append(toIndentedString(gwCardBasePriceInclTax)).append("\n");
    sb.append("    gwItemsPriceInclTax: ").append(toIndentedString(gwItemsPriceInclTax)).append("\n");
    sb.append("    gwItemsBasePriceInclTax: ").append(toIndentedString(gwItemsBasePriceInclTax)).append("\n");
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

