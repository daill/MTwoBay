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
 * ExtensionInterface class for @see \\Magento\\Quote\\Api\\Data\\TotalsInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataTotalsExtensionInterface {
  public static final String SERIALIZED_NAME_COUPON_LABEL = "coupon_label";
  @SerializedName(SERIALIZED_NAME_COUPON_LABEL)
  private String couponLabel;

  public static final String SERIALIZED_NAME_NEGOTIABLE_QUOTE_TOTALS = "negotiable_quote_totals";
  @SerializedName(SERIALIZED_NAME_NEGOTIABLE_QUOTE_TOTALS)
  private NegotiableQuoteDataNegotiableQuoteTotalsInterface negotiableQuoteTotals;

  public static final String SERIALIZED_NAME_BASE_CUSTOMER_BALANCE_AMOUNT = "base_customer_balance_amount";
  @SerializedName(SERIALIZED_NAME_BASE_CUSTOMER_BALANCE_AMOUNT)
  private BigDecimal baseCustomerBalanceAmount;

  public static final String SERIALIZED_NAME_CUSTOMER_BALANCE_AMOUNT = "customer_balance_amount";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BALANCE_AMOUNT)
  private BigDecimal customerBalanceAmount;

  public static final String SERIALIZED_NAME_REWARD_POINTS_BALANCE = "reward_points_balance";
  @SerializedName(SERIALIZED_NAME_REWARD_POINTS_BALANCE)
  private BigDecimal rewardPointsBalance;

  public static final String SERIALIZED_NAME_REWARD_CURRENCY_AMOUNT = "reward_currency_amount";
  @SerializedName(SERIALIZED_NAME_REWARD_CURRENCY_AMOUNT)
  private BigDecimal rewardCurrencyAmount;

  public static final String SERIALIZED_NAME_BASE_REWARD_CURRENCY_AMOUNT = "base_reward_currency_amount";
  @SerializedName(SERIALIZED_NAME_BASE_REWARD_CURRENCY_AMOUNT)
  private BigDecimal baseRewardCurrencyAmount;


  public QuoteDataTotalsExtensionInterface couponLabel(String couponLabel) {
    
    this.couponLabel = couponLabel;
    return this;
  }

   /**
   * Get couponLabel
   * @return couponLabel
  **/



  public String getCouponLabel() {
    return couponLabel;
  }


  public void setCouponLabel(String couponLabel) {
    this.couponLabel = couponLabel;
  }


  public QuoteDataTotalsExtensionInterface negotiableQuoteTotals(NegotiableQuoteDataNegotiableQuoteTotalsInterface negotiableQuoteTotals) {
    
    this.negotiableQuoteTotals = negotiableQuoteTotals;
    return this;
  }

   /**
   * Get negotiableQuoteTotals
   * @return negotiableQuoteTotals
  **/



  public NegotiableQuoteDataNegotiableQuoteTotalsInterface getNegotiableQuoteTotals() {
    return negotiableQuoteTotals;
  }


  public void setNegotiableQuoteTotals(NegotiableQuoteDataNegotiableQuoteTotalsInterface negotiableQuoteTotals) {
    this.negotiableQuoteTotals = negotiableQuoteTotals;
  }


  public QuoteDataTotalsExtensionInterface baseCustomerBalanceAmount(BigDecimal baseCustomerBalanceAmount) {
    
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


  public QuoteDataTotalsExtensionInterface customerBalanceAmount(BigDecimal customerBalanceAmount) {
    
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


  public QuoteDataTotalsExtensionInterface rewardPointsBalance(BigDecimal rewardPointsBalance) {
    
    this.rewardPointsBalance = rewardPointsBalance;
    return this;
  }

   /**
   * Get rewardPointsBalance
   * @return rewardPointsBalance
  **/



  public BigDecimal getRewardPointsBalance() {
    return rewardPointsBalance;
  }


  public void setRewardPointsBalance(BigDecimal rewardPointsBalance) {
    this.rewardPointsBalance = rewardPointsBalance;
  }


  public QuoteDataTotalsExtensionInterface rewardCurrencyAmount(BigDecimal rewardCurrencyAmount) {
    
    this.rewardCurrencyAmount = rewardCurrencyAmount;
    return this;
  }

   /**
   * Get rewardCurrencyAmount
   * @return rewardCurrencyAmount
  **/



  public BigDecimal getRewardCurrencyAmount() {
    return rewardCurrencyAmount;
  }


  public void setRewardCurrencyAmount(BigDecimal rewardCurrencyAmount) {
    this.rewardCurrencyAmount = rewardCurrencyAmount;
  }


  public QuoteDataTotalsExtensionInterface baseRewardCurrencyAmount(BigDecimal baseRewardCurrencyAmount) {
    
    this.baseRewardCurrencyAmount = baseRewardCurrencyAmount;
    return this;
  }

   /**
   * Get baseRewardCurrencyAmount
   * @return baseRewardCurrencyAmount
  **/



  public BigDecimal getBaseRewardCurrencyAmount() {
    return baseRewardCurrencyAmount;
  }


  public void setBaseRewardCurrencyAmount(BigDecimal baseRewardCurrencyAmount) {
    this.baseRewardCurrencyAmount = baseRewardCurrencyAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataTotalsExtensionInterface quoteDataTotalsExtensionInterface = (QuoteDataTotalsExtensionInterface) o;
    return Objects.equals(this.couponLabel, quoteDataTotalsExtensionInterface.couponLabel) &&
        Objects.equals(this.negotiableQuoteTotals, quoteDataTotalsExtensionInterface.negotiableQuoteTotals) &&
        Objects.equals(this.baseCustomerBalanceAmount, quoteDataTotalsExtensionInterface.baseCustomerBalanceAmount) &&
        Objects.equals(this.customerBalanceAmount, quoteDataTotalsExtensionInterface.customerBalanceAmount) &&
        Objects.equals(this.rewardPointsBalance, quoteDataTotalsExtensionInterface.rewardPointsBalance) &&
        Objects.equals(this.rewardCurrencyAmount, quoteDataTotalsExtensionInterface.rewardCurrencyAmount) &&
        Objects.equals(this.baseRewardCurrencyAmount, quoteDataTotalsExtensionInterface.baseRewardCurrencyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponLabel, negotiableQuoteTotals, baseCustomerBalanceAmount, customerBalanceAmount, rewardPointsBalance, rewardCurrencyAmount, baseRewardCurrencyAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataTotalsExtensionInterface {\n");
    sb.append("    couponLabel: ").append(toIndentedString(couponLabel)).append("\n");
    sb.append("    negotiableQuoteTotals: ").append(toIndentedString(negotiableQuoteTotals)).append("\n");
    sb.append("    baseCustomerBalanceAmount: ").append(toIndentedString(baseCustomerBalanceAmount)).append("\n");
    sb.append("    customerBalanceAmount: ").append(toIndentedString(customerBalanceAmount)).append("\n");
    sb.append("    rewardPointsBalance: ").append(toIndentedString(rewardPointsBalance)).append("\n");
    sb.append("    rewardCurrencyAmount: ").append(toIndentedString(rewardCurrencyAmount)).append("\n");
    sb.append("    baseRewardCurrencyAmount: ").append(toIndentedString(baseRewardCurrencyAmount)).append("\n");
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

