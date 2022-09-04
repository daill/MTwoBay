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
import org.openapitools.client.model.LocationDetails;
import org.openapitools.client.model.OperatingHours;
import org.openapitools.client.model.SpecialHours;

/**
 * This type is used by the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call to provide details on the inventory location, including the location&#39;s name, physical address, operating hours, special hours, phone number and other details of an inventory location.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class InventoryLocationFull {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationDetails location;

  public static final String SERIALIZED_NAME_LOCATION_ADDITIONAL_INFORMATION = "locationAdditionalInformation";
  @SerializedName(SERIALIZED_NAME_LOCATION_ADDITIONAL_INFORMATION)
  private String locationAdditionalInformation;

  public static final String SERIALIZED_NAME_LOCATION_INSTRUCTIONS = "locationInstructions";
  @SerializedName(SERIALIZED_NAME_LOCATION_INSTRUCTIONS)
  private String locationInstructions;

  public static final String SERIALIZED_NAME_LOCATION_TYPES = "locationTypes";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPES)
  private List<String> locationTypes = null;

  public static final String SERIALIZED_NAME_LOCATION_WEB_URL = "locationWebUrl";
  @SerializedName(SERIALIZED_NAME_LOCATION_WEB_URL)
  private String locationWebUrl;

  public static final String SERIALIZED_NAME_MERCHANT_LOCATION_STATUS = "merchantLocationStatus";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOCATION_STATUS)
  private String merchantLocationStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATING_HOURS = "operatingHours";
  @SerializedName(SERIALIZED_NAME_OPERATING_HOURS)
  private List<OperatingHours> operatingHours = null;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SPECIAL_HOURS = "specialHours";
  @SerializedName(SERIALIZED_NAME_SPECIAL_HOURS)
  private List<SpecialHours> specialHours = null;


  public InventoryLocationFull location(LocationDetails location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  


  public LocationDetails getLocation() {
    return location;
  }


  public void setLocation(LocationDetails location) {
    this.location = location;
  }


  public InventoryLocationFull locationAdditionalInformation(String locationAdditionalInformation) {
    
    this.locationAdditionalInformation = locationAdditionalInformation;
    return this;
  }

   /**
   * This text field is used by the merchant to provide additional information about an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 256
   * @return locationAdditionalInformation
  **/
  


  public String getLocationAdditionalInformation() {
    return locationAdditionalInformation;
  }


  public void setLocationAdditionalInformation(String locationAdditionalInformation) {
    this.locationAdditionalInformation = locationAdditionalInformation;
  }


  public InventoryLocationFull locationInstructions(String locationInstructions) {
    
    this.locationInstructions = locationInstructions;
    return this;
  }

   /**
   * This text field is generally used by the merchant to provide special pickup instructions for a store inventory location. Although this field is optional, it is recommended that merchants provide this field to create a pleasant and easy pickup experience for In-Store Pickup and Click and Collect orders. If this field is not included in the call request payload, eBay will use the default pickup instructions contained in the merchant&#39;s profile (if available). &lt;br&gt;&lt;br&gt;
   * @return locationInstructions
  **/
  


  public String getLocationInstructions() {
    return locationInstructions;
  }


  public void setLocationInstructions(String locationInstructions) {
    this.locationInstructions = locationInstructions;
  }


  public InventoryLocationFull locationTypes(List<String> locationTypes) {
    
    this.locationTypes = locationTypes;
    return this;
  }

  public InventoryLocationFull addLocationTypesItem(String locationTypesItem) {
    if (this.locationTypes == null) {
      this.locationTypes = new ArrayList<String>();
    }
    this.locationTypes.add(locationTypesItem);
    return this;
  }

   /**
   * This container is used to define the function of the inventory location. Typically, an inventory location will serve as a store or a warehouse, but in some cases, an inventory location may be both. &lt;br&gt;&lt;br&gt; If this container is omitted, the location type of the inventory location will default to &lt;code&gt;WAREHOUSE&lt;/code&gt;. See &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/types/api:StoreTypeEnum\&quot;&gt;StoreTypeEnum&lt;/a&gt; for the supported values.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: WAREHOUSE
   * @return locationTypes
  **/
  


  public List<String> getLocationTypes() {
    return locationTypes;
  }


  public void setLocationTypes(List<String> locationTypes) {
    this.locationTypes = locationTypes;
  }


  public InventoryLocationFull locationWebUrl(String locationWebUrl) {
    
    this.locationWebUrl = locationWebUrl;
    return this;
  }

   /**
   * This text field is used by the merchant to provide the Website address (URL) associated with the inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 512
   * @return locationWebUrl
  **/
  


  public String getLocationWebUrl() {
    return locationWebUrl;
  }


  public void setLocationWebUrl(String locationWebUrl) {
    this.locationWebUrl = locationWebUrl;
  }


  public InventoryLocationFull merchantLocationStatus(String merchantLocationStatus) {
    
    this.merchantLocationStatus = merchantLocationStatus;
    return this;
  }

   /**
   * This field is used to indicate whether the inventory location will be enabled (inventory can be loaded to location) or disabled (inventory can not be loaded to location). If this field is omitted, a successful &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call will automatically enable the inventory location. A merchant may want to create a new inventory location but leave it as disabled if the inventory location is not yet ready for active inventory. Once the inventory location is ready, the merchant can use the &lt;strong&gt;enableInventoryLocation&lt;/strong&gt; call to enable an inventory location that is in a disabled state. See &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/types/api:StatusEnum\&quot;&gt;StatusEnum&lt;/a&gt; for the supported values.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: ENABLED For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/api:StatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return merchantLocationStatus
  **/
  


  public String getMerchantLocationStatus() {
    return merchantLocationStatus;
  }


  public void setMerchantLocationStatus(String merchantLocationStatus) {
    this.merchantLocationStatus = merchantLocationStatus;
  }


  public InventoryLocationFull name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the inventory location. This name should be a human-friendly name as it will be displayed in In-Store Pickup and Click and Collect listings. A name is not required for warehouse inventory locations. For store inventory locations, this field is not immediately required, but will be required before an offer enabled with the In-Store Pickup or Click and Collect capability can be published. So, if the seller omits this field in a &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, it becomes required for an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 1000
   * @return name
  **/
  


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InventoryLocationFull operatingHours(List<OperatingHours> operatingHours) {
    
    this.operatingHours = operatingHours;
    return this;
  }

  public InventoryLocationFull addOperatingHoursItem(OperatingHours operatingHoursItem) {
    if (this.operatingHours == null) {
      this.operatingHours = new ArrayList<OperatingHours>();
    }
    this.operatingHours.add(operatingHoursItem);
    return this;
  }

   /**
   * Although not technically required, this container is highly recommended to be used to specify operating hours for a store inventory location. This container is used to express the regular operating hours for a store location during each day of the week. A &lt;strong&gt;dayOfWeekEnum&lt;/strong&gt; field and an &lt;strong&gt;intervals&lt;/strong&gt; container will be needed for each day of the week that the store location is open.
   * @return operatingHours
  **/
  


  public List<OperatingHours> getOperatingHours() {
    return operatingHours;
  }


  public void setOperatingHours(List<OperatingHours> operatingHours) {
    this.operatingHours = operatingHours;
  }


  public InventoryLocationFull phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Although not technically required, this field is highly recommended to be used to specify the phone number for a store inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36
   * @return phone
  **/
  


  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public InventoryLocationFull specialHours(List<SpecialHours> specialHours) {
    
    this.specialHours = specialHours;
    return this;
  }

  public InventoryLocationFull addSpecialHoursItem(SpecialHours specialHoursItem) {
    if (this.specialHours == null) {
      this.specialHours = new ArrayList<SpecialHours>();
    }
    this.specialHours.add(specialHoursItem);
    return this;
  }

   /**
   * This container is used to express the special operating hours for a store inventory location on a specific date, such as a holiday. The special hours specified for the specific date will override the normal operating hours for that particular day of the week.
   * @return specialHours
  **/
  


  public List<SpecialHours> getSpecialHours() {
    return specialHours;
  }


  public void setSpecialHours(List<SpecialHours> specialHours) {
    this.specialHours = specialHours;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryLocationFull inventoryLocationFull = (InventoryLocationFull) o;
    return Objects.equals(this.location, inventoryLocationFull.location) &&
        Objects.equals(this.locationAdditionalInformation, inventoryLocationFull.locationAdditionalInformation) &&
        Objects.equals(this.locationInstructions, inventoryLocationFull.locationInstructions) &&
        Objects.equals(this.locationTypes, inventoryLocationFull.locationTypes) &&
        Objects.equals(this.locationWebUrl, inventoryLocationFull.locationWebUrl) &&
        Objects.equals(this.merchantLocationStatus, inventoryLocationFull.merchantLocationStatus) &&
        Objects.equals(this.name, inventoryLocationFull.name) &&
        Objects.equals(this.operatingHours, inventoryLocationFull.operatingHours) &&
        Objects.equals(this.phone, inventoryLocationFull.phone) &&
        Objects.equals(this.specialHours, inventoryLocationFull.specialHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationAdditionalInformation, locationInstructions, locationTypes, locationWebUrl, merchantLocationStatus, name, operatingHours, phone, specialHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryLocationFull {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationAdditionalInformation: ").append(toIndentedString(locationAdditionalInformation)).append("\n");
    sb.append("    locationInstructions: ").append(toIndentedString(locationInstructions)).append("\n");
    sb.append("    locationTypes: ").append(toIndentedString(locationTypes)).append("\n");
    sb.append("    locationWebUrl: ").append(toIndentedString(locationWebUrl)).append("\n");
    sb.append("    merchantLocationStatus: ").append(toIndentedString(merchantLocationStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operatingHours: ").append(toIndentedString(operatingHours)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    specialHours: ").append(toIndentedString(specialHours)).append("\n");
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
