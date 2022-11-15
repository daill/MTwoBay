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

import java.util.Objects;


/**
 * InlineObject12
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject12 {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @Json(name = SERIALIZED_NAME_CUSTOMER)
  private CustomerDataCustomerInterface customer;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @Json(name = SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @Json(name = SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;


  public InlineObject12 customer(CustomerDataCustomerInterface customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/


  public CustomerDataCustomerInterface getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerDataCustomerInterface customer) {
    this.customer = customer;
  }


  public InlineObject12 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/

  

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public InlineObject12 redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/

  

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject12 inlineObject12 = (InlineObject12) o;
    return Objects.equals(this.customer, inlineObject12.customer) &&
        Objects.equals(this.password, inlineObject12.password) &&
        Objects.equals(this.redirectUrl, inlineObject12.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, password, redirectUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject12 {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

