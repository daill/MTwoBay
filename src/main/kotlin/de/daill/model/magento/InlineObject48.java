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
 * InlineObject48
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject48 {
  public static final String SERIALIZED_NAME_TRACK = "track";
  @Json(name = SERIALIZED_NAME_TRACK)
  private RmaDataTrackInterface track;


  public InlineObject48 track(RmaDataTrackInterface track) {
    
    this.track = track;
    return this;
  }

   /**
   * Get track
   * @return track
  **/


  public RmaDataTrackInterface getTrack() {
    return track;
  }


  public void setTrack(RmaDataTrackInterface track) {
    this.track = track;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject48 inlineObject48 = (InlineObject48) o;
    return Objects.equals(this.track, inlineObject48.track);
  }

  @Override
  public int hashCode() {
    return Objects.hash(track);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject48 {\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
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

