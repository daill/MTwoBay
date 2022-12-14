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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Interface GrandTotalDetailsInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TaxDataGrandTotalDetailsInterface {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @Json(name = SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_RATES = "rates";
  @Json(name = SERIALIZED_NAME_RATES)
  private List<TaxDataGrandTotalRatesInterface> rates = new ArrayList<TaxDataGrandTotalRatesInterface>();

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @Json(name = SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;


  public TaxDataGrandTotalDetailsInterface amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Tax amount value
   * @return amount
  **/
  

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public TaxDataGrandTotalDetailsInterface rates(List<TaxDataGrandTotalRatesInterface> rates) {
    
    this.rates = rates;
    return this;
  }

  public TaxDataGrandTotalDetailsInterface addRatesItem(TaxDataGrandTotalRatesInterface ratesItem) {
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Tax rates info
   * @return rates
  **/
  

  public List<TaxDataGrandTotalRatesInterface> getRates() {
    return rates;
  }


  public void setRates(List<TaxDataGrandTotalRatesInterface> rates) {
    this.rates = rates;
  }


  public TaxDataGrandTotalDetailsInterface groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Group identifier
   * @return groupId
  **/
  

  public Integer getGroupId() {
    return groupId;
  }


  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDataGrandTotalDetailsInterface taxDataGrandTotalDetailsInterface = (TaxDataGrandTotalDetailsInterface) o;
    return Objects.equals(this.amount, taxDataGrandTotalDetailsInterface.amount) &&
        Objects.equals(this.rates, taxDataGrandTotalDetailsInterface.rates) &&
        Objects.equals(this.groupId, taxDataGrandTotalDetailsInterface.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, rates, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDataGrandTotalDetailsInterface {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

