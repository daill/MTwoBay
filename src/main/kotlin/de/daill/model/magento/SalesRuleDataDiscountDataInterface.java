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
 * Discount Data Interface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesRuleDataDiscountDataInterface {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "base_amount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private BigDecimal baseAmount;

  public static final String SERIALIZED_NAME_ORIGINAL_AMOUNT = "original_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AMOUNT)
  private BigDecimal originalAmount;

  public static final String SERIALIZED_NAME_BASE_ORIGINAL_AMOUNT = "base_original_amount";
  @SerializedName(SERIALIZED_NAME_BASE_ORIGINAL_AMOUNT)
  private BigDecimal baseOriginalAmount;


  public SalesRuleDataDiscountDataInterface amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public SalesRuleDataDiscountDataInterface baseAmount(BigDecimal baseAmount) {
    
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * Base Amount
   * @return baseAmount
  **/
  

  public BigDecimal getBaseAmount() {
    return baseAmount;
  }


  public void setBaseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }


  public SalesRuleDataDiscountDataInterface originalAmount(BigDecimal originalAmount) {
    
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Original Amount
   * @return originalAmount
  **/
  

  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }


  public SalesRuleDataDiscountDataInterface baseOriginalAmount(BigDecimal baseOriginalAmount) {
    
    this.baseOriginalAmount = baseOriginalAmount;
    return this;
  }

   /**
   * Base Original Amount
   * @return baseOriginalAmount
  **/
  

  public BigDecimal getBaseOriginalAmount() {
    return baseOriginalAmount;
  }


  public void setBaseOriginalAmount(BigDecimal baseOriginalAmount) {
    this.baseOriginalAmount = baseOriginalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesRuleDataDiscountDataInterface salesRuleDataDiscountDataInterface = (SalesRuleDataDiscountDataInterface) o;
    return Objects.equals(this.amount, salesRuleDataDiscountDataInterface.amount) &&
        Objects.equals(this.baseAmount, salesRuleDataDiscountDataInterface.baseAmount) &&
        Objects.equals(this.originalAmount, salesRuleDataDiscountDataInterface.originalAmount) &&
        Objects.equals(this.baseOriginalAmount, salesRuleDataDiscountDataInterface.baseOriginalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, baseAmount, originalAmount, baseOriginalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRuleDataDiscountDataInterface {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    baseOriginalAmount: ").append(toIndentedString(baseOriginalAmount)).append("\n");
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
