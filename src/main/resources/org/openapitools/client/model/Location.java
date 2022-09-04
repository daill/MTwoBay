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
import org.openapitools.client.model.Address;
import org.openapitools.client.model.GeoCoordinates;

/**
 * A complex type that is used to provide the physical address of a location, and it geo-coordinates.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class Location {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_GEO_COORDINATES = "geoCoordinates";
  @SerializedName(SERIALIZED_NAME_GEO_COORDINATES)
  private GeoCoordinates geoCoordinates;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;


  public Location address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  


  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public Location geoCoordinates(GeoCoordinates geoCoordinates) {
    
    this.geoCoordinates = geoCoordinates;
    return this;
  }

   /**
   * Get geoCoordinates
   * @return geoCoordinates
  **/
  


  public GeoCoordinates getGeoCoordinates() {
    return geoCoordinates;
  }


  public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
  }


  public Location locationId(String locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * A unique eBay-assigned ID for the location. &lt;br&gt;&lt;br&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field should not be confused with the seller-defined &lt;b&gt;merchantLocationKey&lt;/b&gt; value. It is the &lt;b&gt;merchantLocationKey&lt;/b&gt; value which is used to identify an inventory location when working with inventory location API calls. The &lt;strong&gt;locationId&lt;/strong&gt; value is only used internally by eBay.&lt;/span&gt;
   * @return locationId
  **/
  


  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.address, location.address) &&
        Objects.equals(this.geoCoordinates, location.geoCoordinates) &&
        Objects.equals(this.locationId, location.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, geoCoordinates, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    geoCoordinates: ").append(toIndentedString(geoCoordinates)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
