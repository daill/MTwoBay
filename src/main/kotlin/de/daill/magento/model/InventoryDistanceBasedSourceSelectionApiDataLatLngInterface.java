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


import java.math.BigDecimal;

/**
 * DTO for latitude and longitude request
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryDistanceBasedSourceSelectionApiDataLatLngInterface {
  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private BigDecimal lat;

  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private BigDecimal lng;


  public InventoryDistanceBasedSourceSelectionApiDataLatLngInterface lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Latitude
   * @return lat
  **/
  

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }


  public InventoryDistanceBasedSourceSelectionApiDataLatLngInterface lng(BigDecimal lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * Longitude
   * @return lng
  **/
  

  public BigDecimal getLng() {
    return lng;
  }


  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryDistanceBasedSourceSelectionApiDataLatLngInterface inventoryDistanceBasedSourceSelectionApiDataLatLngInterface = (InventoryDistanceBasedSourceSelectionApiDataLatLngInterface) o;
    return Objects.equals(this.lat, inventoryDistanceBasedSourceSelectionApiDataLatLngInterface.lat) &&
        Objects.equals(this.lng, inventoryDistanceBasedSourceSelectionApiDataLatLngInterface.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDistanceBasedSourceSelectionApiDataLatLngInterface {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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
