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
 * Represents relation between some physical storage and shipping method Used fully qualified namespaces in annotations for proper work of WebApi request parser
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryApiDataSourceCarrierLinkInterface {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public InventoryApiDataSourceCarrierLinkInterface carrierCode(String carrierCode) {
    
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


  public InventoryApiDataSourceCarrierLinkInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/
  


  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public InventoryApiDataSourceCarrierLinkInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\InventoryApi\\Api\\Data\\SourceCarrierLinkInterface
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
    InventoryApiDataSourceCarrierLinkInterface inventoryApiDataSourceCarrierLinkInterface = (InventoryApiDataSourceCarrierLinkInterface) o;
    return Objects.equals(this.carrierCode, inventoryApiDataSourceCarrierLinkInterface.carrierCode) &&
        Objects.equals(this.position, inventoryApiDataSourceCarrierLinkInterface.position) &&
        Objects.equals(this.extensionAttributes, inventoryApiDataSourceCarrierLinkInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, position, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryApiDataSourceCarrierLinkInterface {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

