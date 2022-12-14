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
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\CartInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataCartExtensionInterface {
  public static final String SERIALIZED_NAME_SHIPPING_ASSIGNMENTS = "shipping_assignments";
  @Json(name = SERIALIZED_NAME_SHIPPING_ASSIGNMENTS)
  private List<QuoteDataShippingAssignmentInterface> shippingAssignments = null;

  public static final String SERIALIZED_NAME_NEGOTIABLE_QUOTE = "negotiable_quote";
  @Json(name = SERIALIZED_NAME_NEGOTIABLE_QUOTE)
  private NegotiableQuoteDataNegotiableQuoteInterface negotiableQuote;


  public QuoteDataCartExtensionInterface shippingAssignments(List<QuoteDataShippingAssignmentInterface> shippingAssignments) {
    
    this.shippingAssignments = shippingAssignments;
    return this;
  }

  public QuoteDataCartExtensionInterface addShippingAssignmentsItem(QuoteDataShippingAssignmentInterface shippingAssignmentsItem) {
    if (this.shippingAssignments == null) {
      this.shippingAssignments = new ArrayList<QuoteDataShippingAssignmentInterface>();
    }
    this.shippingAssignments.add(shippingAssignmentsItem);
    return this;
  }

   /**
   * Get shippingAssignments
   * @return shippingAssignments
  **/



  public List<QuoteDataShippingAssignmentInterface> getShippingAssignments() {
    return shippingAssignments;
  }


  public void setShippingAssignments(List<QuoteDataShippingAssignmentInterface> shippingAssignments) {
    this.shippingAssignments = shippingAssignments;
  }


  public QuoteDataCartExtensionInterface negotiableQuote(NegotiableQuoteDataNegotiableQuoteInterface negotiableQuote) {
    
    this.negotiableQuote = negotiableQuote;
    return this;
  }

   /**
   * Get negotiableQuote
   * @return negotiableQuote
  **/



  public NegotiableQuoteDataNegotiableQuoteInterface getNegotiableQuote() {
    return negotiableQuote;
  }


  public void setNegotiableQuote(NegotiableQuoteDataNegotiableQuoteInterface negotiableQuote) {
    this.negotiableQuote = negotiableQuote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataCartExtensionInterface quoteDataCartExtensionInterface = (QuoteDataCartExtensionInterface) o;
    return Objects.equals(this.shippingAssignments, quoteDataCartExtensionInterface.shippingAssignments) &&
        Objects.equals(this.negotiableQuote, quoteDataCartExtensionInterface.negotiableQuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAssignments, negotiableQuote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataCartExtensionInterface {\n");
    sb.append("    shippingAssignments: ").append(toIndentedString(shippingAssignments)).append("\n");
    sb.append("    negotiableQuote: ").append(toIndentedString(negotiableQuote)).append("\n");
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

