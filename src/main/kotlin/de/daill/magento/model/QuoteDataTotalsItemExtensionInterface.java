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


/**
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\TotalsItemInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataTotalsItemExtensionInterface {
  public static final String SERIALIZED_NAME_NEGOTIABLE_QUOTE_ITEM_TOTALS = "negotiable_quote_item_totals";
  @SerializedName(SERIALIZED_NAME_NEGOTIABLE_QUOTE_ITEM_TOTALS)
  private NegotiableQuoteDataNegotiableQuoteItemTotalsInterface negotiableQuoteItemTotals;


  public QuoteDataTotalsItemExtensionInterface negotiableQuoteItemTotals(NegotiableQuoteDataNegotiableQuoteItemTotalsInterface negotiableQuoteItemTotals) {
    
    this.negotiableQuoteItemTotals = negotiableQuoteItemTotals;
    return this;
  }

   /**
   * Get negotiableQuoteItemTotals
   * @return negotiableQuoteItemTotals
  **/



  public NegotiableQuoteDataNegotiableQuoteItemTotalsInterface getNegotiableQuoteItemTotals() {
    return negotiableQuoteItemTotals;
  }


  public void setNegotiableQuoteItemTotals(NegotiableQuoteDataNegotiableQuoteItemTotalsInterface negotiableQuoteItemTotals) {
    this.negotiableQuoteItemTotals = negotiableQuoteItemTotals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataTotalsItemExtensionInterface quoteDataTotalsItemExtensionInterface = (QuoteDataTotalsItemExtensionInterface) o;
    return Objects.equals(this.negotiableQuoteItemTotals, quoteDataTotalsItemExtensionInterface.negotiableQuoteItemTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiableQuoteItemTotals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataTotalsItemExtensionInterface {\n");
    sb.append("    negotiableQuoteItemTotals: ").append(toIndentedString(negotiableQuoteItemTotals)).append("\n");
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

