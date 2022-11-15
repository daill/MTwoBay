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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents physical storage, i.e. brick and mortar store or warehouse Used fully qualified namespaces in annotations for proper work of WebApi request parser
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryApiDataSourceInterface {
  public static final String SERIALIZED_NAME_SOURCE_CODE = "source_code";
  @Json(name = SERIALIZED_NAME_SOURCE_CODE)
  private String sourceCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @Json(name = SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @Json(name = SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @Json(name = SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @Json(name = SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

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

  public static final String SERIALIZED_NAME_FAX = "fax";
  @Json(name = SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_USE_DEFAULT_CARRIER_CONFIG = "use_default_carrier_config";
  @Json(name = SERIALIZED_NAME_USE_DEFAULT_CARRIER_CONFIG)
  private Boolean useDefaultCarrierConfig;

  public static final String SERIALIZED_NAME_CARRIER_LINKS = "carrier_links";
  @Json(name = SERIALIZED_NAME_CARRIER_LINKS)
  private List<InventoryApiDataSourceCarrierLinkInterface> carrierLinks = null;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private InventoryApiDataSourceExtensionInterface extensionAttributes;


  public InventoryApiDataSourceInterface sourceCode(String sourceCode) {
    
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * Source code
   * @return sourceCode
  **/



  public String getSourceCode() {
    return sourceCode;
  }


  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  public InventoryApiDataSourceInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Source name
   * @return name
  **/



  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InventoryApiDataSourceInterface email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Source email
   * @return email
  **/



  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InventoryApiDataSourceInterface contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * Source contact name
   * @return contactName
  **/



  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public InventoryApiDataSourceInterface enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * If source is enabled. For new entity can be null
   * @return enabled
  **/



  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public InventoryApiDataSourceInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Source description
   * @return description
  **/



  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InventoryApiDataSourceInterface latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Source latitude
   * @return latitude
  **/



  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public InventoryApiDataSourceInterface longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Source longitude
   * @return longitude
  **/



  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public InventoryApiDataSourceInterface countryId(String countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Source country id
   * @return countryId
  **/



  public String getCountryId() {
    return countryId;
  }


  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public InventoryApiDataSourceInterface regionId(Integer regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * Region id if source has registered region.
   * @return regionId
  **/



  public Integer getRegionId() {
    return regionId;
  }


  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public InventoryApiDataSourceInterface region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region title if source has custom region
   * @return region
  **/



  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public InventoryApiDataSourceInterface city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Source city
   * @return city
  **/



  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public InventoryApiDataSourceInterface street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Source street name
   * @return street
  **/



  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public InventoryApiDataSourceInterface postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Source post code
   * @return postcode
  **/



  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public InventoryApiDataSourceInterface phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Source phone number
   * @return phone
  **/



  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InventoryApiDataSourceInterface fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Source fax
   * @return fax
  **/



  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public InventoryApiDataSourceInterface useDefaultCarrierConfig(Boolean useDefaultCarrierConfig) {
    
    this.useDefaultCarrierConfig = useDefaultCarrierConfig;
    return this;
  }

   /**
   * Is need to use default config
   * @return useDefaultCarrierConfig
  **/



  public Boolean getUseDefaultCarrierConfig() {
    return useDefaultCarrierConfig;
  }


  public void setUseDefaultCarrierConfig(Boolean useDefaultCarrierConfig) {
    this.useDefaultCarrierConfig = useDefaultCarrierConfig;
  }


  public InventoryApiDataSourceInterface carrierLinks(List<InventoryApiDataSourceCarrierLinkInterface> carrierLinks) {
    
    this.carrierLinks = carrierLinks;
    return this;
  }

  public InventoryApiDataSourceInterface addCarrierLinksItem(InventoryApiDataSourceCarrierLinkInterface carrierLinksItem) {
    if (this.carrierLinks == null) {
      this.carrierLinks = new ArrayList<InventoryApiDataSourceCarrierLinkInterface>();
    }
    this.carrierLinks.add(carrierLinksItem);
    return this;
  }

   /**
   * Get carrierLinks
   * @return carrierLinks
  **/



  public List<InventoryApiDataSourceCarrierLinkInterface> getCarrierLinks() {
    return carrierLinks;
  }


  public void setCarrierLinks(List<InventoryApiDataSourceCarrierLinkInterface> carrierLinks) {
    this.carrierLinks = carrierLinks;
  }


  public InventoryApiDataSourceInterface extensionAttributes(InventoryApiDataSourceExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public InventoryApiDataSourceExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(InventoryApiDataSourceExtensionInterface extensionAttributes) {
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
    InventoryApiDataSourceInterface inventoryApiDataSourceInterface = (InventoryApiDataSourceInterface) o;
    return Objects.equals(this.sourceCode, inventoryApiDataSourceInterface.sourceCode) &&
        Objects.equals(this.name, inventoryApiDataSourceInterface.name) &&
        Objects.equals(this.email, inventoryApiDataSourceInterface.email) &&
        Objects.equals(this.contactName, inventoryApiDataSourceInterface.contactName) &&
        Objects.equals(this.enabled, inventoryApiDataSourceInterface.enabled) &&
        Objects.equals(this.description, inventoryApiDataSourceInterface.description) &&
        Objects.equals(this.latitude, inventoryApiDataSourceInterface.latitude) &&
        Objects.equals(this.longitude, inventoryApiDataSourceInterface.longitude) &&
        Objects.equals(this.countryId, inventoryApiDataSourceInterface.countryId) &&
        Objects.equals(this.regionId, inventoryApiDataSourceInterface.regionId) &&
        Objects.equals(this.region, inventoryApiDataSourceInterface.region) &&
        Objects.equals(this.city, inventoryApiDataSourceInterface.city) &&
        Objects.equals(this.street, inventoryApiDataSourceInterface.street) &&
        Objects.equals(this.postcode, inventoryApiDataSourceInterface.postcode) &&
        Objects.equals(this.phone, inventoryApiDataSourceInterface.phone) &&
        Objects.equals(this.fax, inventoryApiDataSourceInterface.fax) &&
        Objects.equals(this.useDefaultCarrierConfig, inventoryApiDataSourceInterface.useDefaultCarrierConfig) &&
        Objects.equals(this.carrierLinks, inventoryApiDataSourceInterface.carrierLinks) &&
        Objects.equals(this.extensionAttributes, inventoryApiDataSourceInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCode, name, email, contactName, enabled, description, latitude, longitude, countryId, regionId, region, city, street, postcode, phone, fax, useDefaultCarrierConfig, carrierLinks, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiDataSourceInterface {\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    useDefaultCarrierConfig: ").append(toIndentedString(useDefaultCarrierConfig)).append("\n");
    sb.append("    carrierLinks: ").append(toIndentedString(carrierLinks)).append("\n");
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

