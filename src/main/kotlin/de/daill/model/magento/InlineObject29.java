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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineObject29
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject29 {
  public static final String SERIALIZED_NAME_QUOTE_IDS = "quoteIds";
  @SerializedName(SERIALIZED_NAME_QUOTE_IDS)
  private List<Integer> quoteIds = new ArrayList<Integer>();


  public InlineObject29 quoteIds(List<Integer> quoteIds) {
    
    this.quoteIds = quoteIds;
    return this;
  }

  public InlineObject29 addQuoteIdsItem(Integer quoteIdsItem) {
    this.quoteIds.add(quoteIdsItem);
    return this;
  }

   /**
   * Get quoteIds
   * @return quoteIds
  **/


  public List<Integer> getQuoteIds() {
    return quoteIds;
  }


  public void setQuoteIds(List<Integer> quoteIds) {
    this.quoteIds = quoteIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject29 inlineObject29 = (InlineObject29) o;
    return Objects.equals(this.quoteIds, inlineObject29.quoteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject29 {\n");
    sb.append("    quoteIds: ").append(toIndentedString(quoteIds)).append("\n");
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

