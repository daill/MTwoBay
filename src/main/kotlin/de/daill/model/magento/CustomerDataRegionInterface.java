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
 * Customer address region interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CustomerDataRegionInterface {
  public static final String SERIALIZED_NAME_REGION_CODE = "region_code";
  @Json(name = SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @Json(name = SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGION_ID = "region_id";
  @Json(name = SERIALIZED_NAME_REGION_ID)
  private Integer regionId;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CustomerDataRegionInterface regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Region code
   * @return regionCode
  **/


  public String getRegionCode() {
    return regionCode;
  }


  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public CustomerDataRegionInterface region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region
   * @return region
  **/


  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public CustomerDataRegionInterface regionId(Integer regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * Region id
   * @return regionId
  **/


  public Integer getRegionId() {
    return regionId;
  }


  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public CustomerDataRegionInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Customer\\Api\\Data\\RegionInterface
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
    CustomerDataRegionInterface customerDataRegionInterface = (CustomerDataRegionInterface) o;
    return Objects.equals(this.regionCode, customerDataRegionInterface.regionCode) &&
        Objects.equals(this.region, customerDataRegionInterface.region) &&
        Objects.equals(this.regionId, customerDataRegionInterface.regionId) &&
        Objects.equals(this.extensionAttributes, customerDataRegionInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionCode, region, regionId, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDataRegionInterface {\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

