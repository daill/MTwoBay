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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Credit Data interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CompanyCreditDataCreditDataInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @Json(name = SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "credit_limit";
  @Json(name = SERIALIZED_NAME_CREDIT_LIMIT)
  private BigDecimal creditLimit;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @Json(name = SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @Json(name = SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_EXCEED_LIMIT = "exceed_limit";
  @Json(name = SERIALIZED_NAME_EXCEED_LIMIT)
  private Boolean exceedLimit;

  public static final String SERIALIZED_NAME_AVAILABLE_LIMIT = "available_limit";
  @Json(name = SERIALIZED_NAME_AVAILABLE_LIMIT)
  private BigDecimal availableLimit;


  public CompanyCreditDataCreditDataInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID.
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CompanyCreditDataCreditDataInterface companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company id.
   * @return companyId
  **/



  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public CompanyCreditDataCreditDataInterface creditLimit(BigDecimal creditLimit) {
    
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Credit Limit.
   * @return creditLimit
  **/



  public BigDecimal getCreditLimit() {
    return creditLimit;
  }


  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }


  public CompanyCreditDataCreditDataInterface balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Balance.
   * @return balance
  **/



  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public CompanyCreditDataCreditDataInterface currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency Code.
   * @return currencyCode
  **/



  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public CompanyCreditDataCreditDataInterface exceedLimit(Boolean exceedLimit) {
    
    this.exceedLimit = exceedLimit;
    return this;
  }

   /**
   * Exceed Limit.
   * @return exceedLimit
  **/


  public Boolean getExceedLimit() {
    return exceedLimit;
  }


  public void setExceedLimit(Boolean exceedLimit) {
    this.exceedLimit = exceedLimit;
  }


  public CompanyCreditDataCreditDataInterface availableLimit(BigDecimal availableLimit) {
    
    this.availableLimit = availableLimit;
    return this;
  }

   /**
   * Available Limit.
   * @return availableLimit
  **/



  public BigDecimal getAvailableLimit() {
    return availableLimit;
  }


  public void setAvailableLimit(BigDecimal availableLimit) {
    this.availableLimit = availableLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyCreditDataCreditDataInterface companyCreditDataCreditDataInterface = (CompanyCreditDataCreditDataInterface) o;
    return Objects.equals(this.id, companyCreditDataCreditDataInterface.id) &&
        Objects.equals(this.companyId, companyCreditDataCreditDataInterface.companyId) &&
        Objects.equals(this.creditLimit, companyCreditDataCreditDataInterface.creditLimit) &&
        Objects.equals(this.balance, companyCreditDataCreditDataInterface.balance) &&
        Objects.equals(this.currencyCode, companyCreditDataCreditDataInterface.currencyCode) &&
        Objects.equals(this.exceedLimit, companyCreditDataCreditDataInterface.exceedLimit) &&
        Objects.equals(this.availableLimit, companyCreditDataCreditDataInterface.availableLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, creditLimit, balance, currencyCode, exceedLimit, availableLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyCreditDataCreditDataInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    exceedLimit: ").append(toIndentedString(exceedLimit)).append("\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
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

