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


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Interval;

/**
 * This type is used to express the regular operating hours of a merchant&#39;s store during the days of the week.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class OperatingHours {
  public static final String SERIALIZED_NAME_DAY_OF_WEEK_ENUM = "dayOfWeekEnum";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK_ENUM)
  private String dayOfWeekEnum;

  public static final String SERIALIZED_NAME_INTERVALS = "intervals";
  @SerializedName(SERIALIZED_NAME_INTERVALS)
  private List<Interval> intervals = null;


  public OperatingHours dayOfWeekEnum(String dayOfWeekEnum) {
    
    this.dayOfWeekEnum = dayOfWeekEnum;
    return this;
  }

   /**
   * A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; value is required for each day of the week that the store location has regular operating hours. &lt;br&gt;&lt;br&gt;This field is returned if operating hours are defined for the store location. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/api:DayOfWeekEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return dayOfWeekEnum
  **/
  


  public String getDayOfWeekEnum() {
    return dayOfWeekEnum;
  }


  public void setDayOfWeekEnum(String dayOfWeekEnum) {
    this.dayOfWeekEnum = dayOfWeekEnum;
  }


  public OperatingHours intervals(List<Interval> intervals) {
    
    this.intervals = intervals;
    return this;
  }

  public OperatingHours addIntervalsItem(Interval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<Interval>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * This container is used to define the opening and closing times of a store&#39;s working day (defined in the &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field). An &lt;strong&gt;intervals&lt;/strong&gt; container is needed for each day of the week that the store location is open. If a store location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed &lt;br&gt;&lt;br&gt;This container is returned if operating hours are defined for the store location.
   * @return intervals
  **/
  


  public List<Interval> getIntervals() {
    return intervals;
  }


  public void setIntervals(List<Interval> intervals) {
    this.intervals = intervals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingHours operatingHours = (OperatingHours) o;
    return Objects.equals(this.dayOfWeekEnum, operatingHours.dayOfWeekEnum) &&
        Objects.equals(this.intervals, operatingHours.intervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeekEnum, intervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingHours {\n");
    sb.append("    dayOfWeekEnum: ").append(toIndentedString(dayOfWeekEnum)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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
