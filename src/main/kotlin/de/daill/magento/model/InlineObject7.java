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
 * InlineObject7
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject7 {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Integer> ids = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_IGNORE_INVALID_COUPONS = "ignoreInvalidCoupons";
  @SerializedName(SERIALIZED_NAME_IGNORE_INVALID_COUPONS)
  private Boolean ignoreInvalidCoupons;


  public InlineObject7 ids(List<Integer> ids) {
    
    this.ids = ids;
    return this;
  }

  public InlineObject7 addIdsItem(Integer idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  

  public List<Integer> getIds() {
    return ids;
  }


  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }


  public InlineObject7 ignoreInvalidCoupons(Boolean ignoreInvalidCoupons) {
    
    this.ignoreInvalidCoupons = ignoreInvalidCoupons;
    return this;
  }

   /**
   * Get ignoreInvalidCoupons
   * @return ignoreInvalidCoupons
  **/
  
  

  public Boolean getIgnoreInvalidCoupons() {
    return ignoreInvalidCoupons;
  }


  public void setIgnoreInvalidCoupons(Boolean ignoreInvalidCoupons) {
    this.ignoreInvalidCoupons = ignoreInvalidCoupons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(this.ids, inlineObject7.ids) &&
        Objects.equals(this.ignoreInvalidCoupons, inlineObject7.ignoreInvalidCoupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, ignoreInvalidCoupons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    ignoreInvalidCoupons: ").append(toIndentedString(ignoreInvalidCoupons)).append("\n");
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

