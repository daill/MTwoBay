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
 * Interface for creation arguments for Shipment.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataShipmentCreationArgumentsInterface {
  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private SalesDataShipmentCreationArgumentsExtensionInterface extensionAttributes;


  public SalesDataShipmentCreationArgumentsInterface extensionAttributes(SalesDataShipmentCreationArgumentsExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/
  


  public SalesDataShipmentCreationArgumentsExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(SalesDataShipmentCreationArgumentsExtensionInterface extensionAttributes) {
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
    SalesDataShipmentCreationArgumentsInterface salesDataShipmentCreationArgumentsInterface = (SalesDataShipmentCreationArgumentsInterface) o;
    return Objects.equals(this.extensionAttributes, salesDataShipmentCreationArgumentsInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataShipmentCreationArgumentsInterface {\n");
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

