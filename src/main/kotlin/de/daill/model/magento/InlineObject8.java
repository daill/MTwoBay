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
 * InlineObject8
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject8 {
  public static final String SERIALIZED_NAME_COUPON_SPEC = "couponSpec";
  @Json(name = SERIALIZED_NAME_COUPON_SPEC)
  private SalesRuleDataCouponGenerationSpecInterface couponSpec;


  public InlineObject8 couponSpec(SalesRuleDataCouponGenerationSpecInterface couponSpec) {
    
    this.couponSpec = couponSpec;
    return this;
  }

   /**
   * Get couponSpec
   * @return couponSpec
  **/


  public SalesRuleDataCouponGenerationSpecInterface getCouponSpec() {
    return couponSpec;
  }


  public void setCouponSpec(SalesRuleDataCouponGenerationSpecInterface couponSpec) {
    this.couponSpec = couponSpec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject8 inlineObject8 = (InlineObject8) o;
    return Objects.equals(this.couponSpec, inlineObject8.couponSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject8 {\n");
    sb.append("    couponSpec: ").append(toIndentedString(couponSpec)).append("\n");
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

