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
 * Interface TrackInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class RmaDataTrackInterface {
  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;

  public static final String SERIALIZED_NAME_RMA_ENTITY_ID = "rma_entity_id";
  @SerializedName(SERIALIZED_NAME_RMA_ENTITY_ID)
  private Integer rmaEntityId;

  public static final String SERIALIZED_NAME_TRACK_NUMBER = "track_number";
  @SerializedName(SERIALIZED_NAME_TRACK_NUMBER)
  private String trackNumber;

  public static final String SERIALIZED_NAME_CARRIER_TITLE = "carrier_title";
  @SerializedName(SERIALIZED_NAME_CARRIER_TITLE)
  private String carrierTitle;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public RmaDataTrackInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Entity id
   * @return entityId
  **/


  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  public RmaDataTrackInterface rmaEntityId(Integer rmaEntityId) {
    
    this.rmaEntityId = rmaEntityId;
    return this;
  }

   /**
   * Rma entity id
   * @return rmaEntityId
  **/


  public Integer getRmaEntityId() {
    return rmaEntityId;
  }


  public void setRmaEntityId(Integer rmaEntityId) {
    this.rmaEntityId = rmaEntityId;
  }


  public RmaDataTrackInterface trackNumber(String trackNumber) {
    
    this.trackNumber = trackNumber;
    return this;
  }

   /**
   * Track number
   * @return trackNumber
  **/


  public String getTrackNumber() {
    return trackNumber;
  }


  public void setTrackNumber(String trackNumber) {
    this.trackNumber = trackNumber;
  }


  public RmaDataTrackInterface carrierTitle(String carrierTitle) {
    
    this.carrierTitle = carrierTitle;
    return this;
  }

   /**
   * Carrier title
   * @return carrierTitle
  **/


  public String getCarrierTitle() {
    return carrierTitle;
  }


  public void setCarrierTitle(String carrierTitle) {
    this.carrierTitle = carrierTitle;
  }


  public RmaDataTrackInterface carrierCode(String carrierCode) {
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Carrier code
   * @return carrierCode
  **/


  public String getCarrierCode() {
    return carrierCode;
  }


  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public RmaDataTrackInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Rma\\Api\\Data\\TrackInterface
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
    RmaDataTrackInterface rmaDataTrackInterface = (RmaDataTrackInterface) o;
    return Objects.equals(this.entityId, rmaDataTrackInterface.entityId) &&
        Objects.equals(this.rmaEntityId, rmaDataTrackInterface.rmaEntityId) &&
        Objects.equals(this.trackNumber, rmaDataTrackInterface.trackNumber) &&
        Objects.equals(this.carrierTitle, rmaDataTrackInterface.carrierTitle) &&
        Objects.equals(this.carrierCode, rmaDataTrackInterface.carrierCode) &&
        Objects.equals(this.extensionAttributes, rmaDataTrackInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, rmaEntityId, trackNumber, carrierTitle, carrierCode, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaDataTrackInterface {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    rmaEntityId: ").append(toIndentedString(rmaEntityId)).append("\n");
    sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
    sb.append("    carrierTitle: ").append(toIndentedString(carrierTitle)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
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
