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
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\CartItemInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataCartItemExtensionInterface {
  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<SalesRuleDataRuleDiscountInterface> discounts = null;

  public static final String SERIALIZED_NAME_NEGOTIABLE_QUOTE_ITEM = "negotiable_quote_item";
  @SerializedName(SERIALIZED_NAME_NEGOTIABLE_QUOTE_ITEM)
  private NegotiableQuoteDataNegotiableQuoteItemInterface negotiableQuoteItem;


  public QuoteDataCartItemExtensionInterface discounts(List<SalesRuleDataRuleDiscountInterface> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public QuoteDataCartItemExtensionInterface addDiscountsItem(SalesRuleDataRuleDiscountInterface discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<SalesRuleDataRuleDiscountInterface>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/



  public List<SalesRuleDataRuleDiscountInterface> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(List<SalesRuleDataRuleDiscountInterface> discounts) {
    this.discounts = discounts;
  }


  public QuoteDataCartItemExtensionInterface negotiableQuoteItem(NegotiableQuoteDataNegotiableQuoteItemInterface negotiableQuoteItem) {
    
    this.negotiableQuoteItem = negotiableQuoteItem;
    return this;
  }

   /**
   * Get negotiableQuoteItem
   * @return negotiableQuoteItem
  **/



  public NegotiableQuoteDataNegotiableQuoteItemInterface getNegotiableQuoteItem() {
    return negotiableQuoteItem;
  }


  public void setNegotiableQuoteItem(NegotiableQuoteDataNegotiableQuoteItemInterface negotiableQuoteItem) {
    this.negotiableQuoteItem = negotiableQuoteItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataCartItemExtensionInterface quoteDataCartItemExtensionInterface = (QuoteDataCartItemExtensionInterface) o;
    return Objects.equals(this.discounts, quoteDataCartItemExtensionInterface.discounts) &&
        Objects.equals(this.negotiableQuoteItem, quoteDataCartItemExtensionInterface.negotiableQuoteItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discounts, negotiableQuoteItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataCartItemExtensionInterface {\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    negotiableQuoteItem: ").append(toIndentedString(negotiableQuoteItem)).append("\n");
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
