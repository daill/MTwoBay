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


/**
 * Data interface for shipping source or shipping destination
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventorySourceSelectionApiDataAddressInterface {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;


  public InventorySourceSelectionApiDataAddressInterface country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Shipping country
   * @return country
  **/


  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public InventorySourceSelectionApiDataAddressInterface postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Shipping postcode
   * @return postcode
  **/


  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public InventorySourceSelectionApiDataAddressInterface street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Shipping street address
   * @return street
  **/


  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public InventorySourceSelectionApiDataAddressInterface region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Shipping region
   * @return region
  **/


  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public InventorySourceSelectionApiDataAddressInterface city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Shipping city
   * @return city
  **/


  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventorySourceSelectionApiDataAddressInterface inventorySourceSelectionApiDataAddressInterface = (InventorySourceSelectionApiDataAddressInterface) o;
    return Objects.equals(this.country, inventorySourceSelectionApiDataAddressInterface.country) &&
        Objects.equals(this.postcode, inventorySourceSelectionApiDataAddressInterface.postcode) &&
        Objects.equals(this.street, inventorySourceSelectionApiDataAddressInterface.street) &&
        Objects.equals(this.region, inventorySourceSelectionApiDataAddressInterface.region) &&
        Objects.equals(this.city, inventorySourceSelectionApiDataAddressInterface.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, postcode, street, region, city);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventorySourceSelectionApiDataAddressInterface {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

