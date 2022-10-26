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


import java.math.BigDecimal;

/**
 * Interface CompanyQuoteConfigInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class NegotiableQuoteDataNegotiableQuoteItemInterface {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private BigDecimal originalPrice;

  public static final String SERIALIZED_NAME_ORIGINAL_TAX_AMOUNT = "original_tax_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TAX_AMOUNT)
  private BigDecimal originalTaxAmount;

  public static final String SERIALIZED_NAME_ORIGINAL_DISCOUNT_AMOUNT = "original_discount_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DISCOUNT_AMOUNT)
  private BigDecimal originalDiscountAmount;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public NegotiableQuoteDataNegotiableQuoteItemInterface itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Quote item id
   * @return itemId
  **/


  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public NegotiableQuoteDataNegotiableQuoteItemInterface originalPrice(BigDecimal originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Quote item original price
   * @return originalPrice
  **/


  public BigDecimal getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }


  public NegotiableQuoteDataNegotiableQuoteItemInterface originalTaxAmount(BigDecimal originalTaxAmount) {
    
    this.originalTaxAmount = originalTaxAmount;
    return this;
  }

   /**
   * Quote item original tax amount
   * @return originalTaxAmount
  **/


  public BigDecimal getOriginalTaxAmount() {
    return originalTaxAmount;
  }


  public void setOriginalTaxAmount(BigDecimal originalTaxAmount) {
    this.originalTaxAmount = originalTaxAmount;
  }


  public NegotiableQuoteDataNegotiableQuoteItemInterface originalDiscountAmount(BigDecimal originalDiscountAmount) {
    
    this.originalDiscountAmount = originalDiscountAmount;
    return this;
  }

   /**
   * Quote item original discount amount
   * @return originalDiscountAmount
  **/


  public BigDecimal getOriginalDiscountAmount() {
    return originalDiscountAmount;
  }


  public void setOriginalDiscountAmount(BigDecimal originalDiscountAmount) {
    this.originalDiscountAmount = originalDiscountAmount;
  }


  public NegotiableQuoteDataNegotiableQuoteItemInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\NegotiableQuote\\Api\\Data\\NegotiableQuoteItemInterface
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
    NegotiableQuoteDataNegotiableQuoteItemInterface negotiableQuoteDataNegotiableQuoteItemInterface = (NegotiableQuoteDataNegotiableQuoteItemInterface) o;
    return Objects.equals(this.itemId, negotiableQuoteDataNegotiableQuoteItemInterface.itemId) &&
        Objects.equals(this.originalPrice, negotiableQuoteDataNegotiableQuoteItemInterface.originalPrice) &&
        Objects.equals(this.originalTaxAmount, negotiableQuoteDataNegotiableQuoteItemInterface.originalTaxAmount) &&
        Objects.equals(this.originalDiscountAmount, negotiableQuoteDataNegotiableQuoteItemInterface.originalDiscountAmount) &&
        Objects.equals(this.extensionAttributes, negotiableQuoteDataNegotiableQuoteItemInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, originalPrice, originalTaxAmount, originalDiscountAmount, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiableQuoteDataNegotiableQuoteItemInterface {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    originalTaxAmount: ").append(toIndentedString(originalTaxAmount)).append("\n");
    sb.append("    originalDiscountAmount: ").append(toIndentedString(originalDiscountAmount)).append("\n");
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
