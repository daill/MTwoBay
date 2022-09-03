/*
 * Inventory API
 * The Inventory API is used to create and manage inventory, and then to publish and manage this inventory on an eBay marketplace. There are also methods in this API that will convert eligible, active eBay listings into the Inventory API model.
 *
 * The version of the OpenAPI document: 1.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.
 */
@ApiModel(description = "This type is used to indicate the fulfillment time for an In-Store Pickup order, or for an order than will be shipped to the buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class TimeDuration {
  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;


  public TimeDuration unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * This enumeration value indicates the time unit used to specify the fulfillment time, such as &lt;code&gt;HOUR&lt;/code&gt; or &lt;code&gt;BUSINESS_DAY&lt;/code&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:TimeDurationUnitEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value indicates the time unit used to specify the fulfillment time, such as <code>HOUR</code> or <code>BUSINESS_DAY</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:TimeDurationUnitEnum'>eBay API documentation</a>")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public TimeDuration value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The integer value in this field, along with the time unit in the &lt;strong&gt;unit&lt;/strong&gt; field, will indicate the fulfillment time.&lt;br&gt;&lt;br&gt; For In-Store Pickup orders, this value will indicate how soon after an In-Store Pickup purchase can the buyer pick up the item at the designated store location. If the value of this field is &lt;code&gt;4&lt;/code&gt;, and the value of the &lt;strong&gt;unit&lt;/strong&gt; field is &lt;code&gt;HOUR&lt;/code&gt;, then the fulfillment time for the In-Store Pickup order is four hours, which means that the buyer will be able to pick up the item at the store four hours after the transaction took place.&lt;br&gt;&lt;br&gt; For standard orders that will be shipped, this value will indicate the expected fulfillment time if the inventory item is shipped from the inventory location. If the value of this field is &lt;code&gt;4&lt;/code&gt;, and the value of the &lt;strong&gt;unit&lt;/strong&gt; field is &lt;code&gt;BUSINESS_DAY&lt;/code&gt;, then the estimated delivery date after purchase is 4 business days.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The integer value in this field, along with the time unit in the <strong>unit</strong> field, will indicate the fulfillment time.<br><br> For In-Store Pickup orders, this value will indicate how soon after an In-Store Pickup purchase can the buyer pick up the item at the designated store location. If the value of this field is <code>4</code>, and the value of the <strong>unit</strong> field is <code>HOUR</code>, then the fulfillment time for the In-Store Pickup order is four hours, which means that the buyer will be able to pick up the item at the store four hours after the transaction took place.<br><br> For standard orders that will be shipped, this value will indicate the expected fulfillment time if the inventory item is shipped from the inventory location. If the value of this field is <code>4</code>, and the value of the <strong>unit</strong> field is <code>BUSINESS_DAY</code>, then the estimated delivery date after purchase is 4 business days.")

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDuration timeDuration = (TimeDuration) o;
    return Objects.equals(this.unit, timeDuration.unit) &&
        Objects.equals(this.value, timeDuration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDuration {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

