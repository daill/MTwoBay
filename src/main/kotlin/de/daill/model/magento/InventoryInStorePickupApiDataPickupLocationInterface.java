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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents sources projection on In-Store Pickup context. Realisation must follow immutable DTO concept. Partial immutability done according to restriction of current Extension Attributes implementation.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryInStorePickupApiDataPickupLocationInterface {
  public static final String SERIALIZED_NAME_PICKUP_LOCATION_CODE = "pickup_location_code";
  @Json(name = SERIALIZED_NAME_PICKUP_LOCATION_CODE)
  private String pickupLocationCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @Json(name = SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @Json(name = SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @Json(name = SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @Json(name = SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @Json(name = SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @Json(name = SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @Json(name = SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "country_id";
  @Json(name = SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_REGION_ID = "region_id";
  @Json(name = SERIALIZED_NAME_REGION_ID)
  private Integer regionId;

  public static final String SERIALIZED_NAME_REGION = "region";
  @Json(name = SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_CITY = "city";
  @Json(name = SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STREET = "street";
  @Json(name = SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @Json(name = SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @Json(name = SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public InventoryInStorePickupApiDataPickupLocationInterface pickupLocationCode(String pickupLocationCode) {
    
    this.pickupLocationCode = pickupLocationCode;
    return this;
  }

   /**
   * Source code of Pickup Location.
   * @return pickupLocationCode
  **/


  public String getPickupLocationCode() {
    return pickupLocationCode;
  }


  public void setPickupLocationCode(String pickupLocationCode) {
    this.pickupLocationCode = pickupLocationCode;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Pickup Location name.
   * @return name
  **/



  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Pickup Location contact email.
   * @return email
  **/



  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Fax contact info.
   * @return fax
  **/



  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * Pickup Location contact name.
   * @return contactName
  **/



  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Pickup Location description.
   * @return description
  **/



  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Pickup Location latitude.
   * @return latitude
  **/



  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Pickup Location longitude.
   * @return longitude
  **/



  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface countryId(String countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Pickup Location country ID.
   * @return countryId
  **/



  public String getCountryId() {
    return countryId;
  }


  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface regionId(Integer regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * Pickup Location region ID.
   * @return regionId
  **/



  public Integer getRegionId() {
    return regionId;
  }


  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Pickup Location region.
   * @return region
  **/



  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Pickup Location city.
   * @return city
  **/



  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Pickup Location street.
   * @return street
  **/



  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Pickup Location postcode.
   * @return postcode
  **/



  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Pickup Location phone.
   * @return phone
  **/



  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InventoryInStorePickupApiDataPickupLocationInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\InventoryInStorePickupApi\\Api\\Data\\PickupLocationInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryInStorePickupApiDataPickupLocationInterface inventoryInStorePickupApiDataPickupLocationInterface = (InventoryInStorePickupApiDataPickupLocationInterface) o;
    return Objects.equals(this.pickupLocationCode, inventoryInStorePickupApiDataPickupLocationInterface.pickupLocationCode) &&
        Objects.equals(this.name, inventoryInStorePickupApiDataPickupLocationInterface.name) &&
        Objects.equals(this.email, inventoryInStorePickupApiDataPickupLocationInterface.email) &&
        Objects.equals(this.fax, inventoryInStorePickupApiDataPickupLocationInterface.fax) &&
        Objects.equals(this.contactName, inventoryInStorePickupApiDataPickupLocationInterface.contactName) &&
        Objects.equals(this.description, inventoryInStorePickupApiDataPickupLocationInterface.description) &&
        Objects.equals(this.latitude, inventoryInStorePickupApiDataPickupLocationInterface.latitude) &&
        Objects.equals(this.longitude, inventoryInStorePickupApiDataPickupLocationInterface.longitude) &&
        Objects.equals(this.countryId, inventoryInStorePickupApiDataPickupLocationInterface.countryId) &&
        Objects.equals(this.regionId, inventoryInStorePickupApiDataPickupLocationInterface.regionId) &&
        Objects.equals(this.region, inventoryInStorePickupApiDataPickupLocationInterface.region) &&
        Objects.equals(this.city, inventoryInStorePickupApiDataPickupLocationInterface.city) &&
        Objects.equals(this.street, inventoryInStorePickupApiDataPickupLocationInterface.street) &&
        Objects.equals(this.postcode, inventoryInStorePickupApiDataPickupLocationInterface.postcode) &&
        Objects.equals(this.phone, inventoryInStorePickupApiDataPickupLocationInterface.phone) &&
        Objects.equals(this.extensionAttributes, inventoryInStorePickupApiDataPickupLocationInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupLocationCode, name, email, fax, contactName, description, latitude, longitude, countryId, regionId, region, city, street, postcode, phone, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryInStorePickupApiDataPickupLocationInterface {\n");
    sb.append("    pickupLocationCode: ").append(toIndentedString(pickupLocationCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
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

