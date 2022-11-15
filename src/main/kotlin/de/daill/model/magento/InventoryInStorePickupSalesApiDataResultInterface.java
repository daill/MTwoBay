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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Operation result object that contains status of the operation.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InventoryInStorePickupSalesApiDataResultInterface {
  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @Json(name = SERIALIZED_NAME_SUCCESSFUL)
  private Boolean successful;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @Json(name = SERIALIZED_NAME_ERRORS)
  private List<String> errors = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public InventoryInStorePickupSalesApiDataResultInterface successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Operation result successful.
   * @return successful
  **/
  

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public InventoryInStorePickupSalesApiDataResultInterface errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public InventoryInStorePickupSalesApiDataResultInterface addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error information for failed operations.
   * @return errors
  **/
  

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public InventoryInStorePickupSalesApiDataResultInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\InventoryInStorePickupSalesApi\\Api\\Data\\ResultInterface
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
    InventoryInStorePickupSalesApiDataResultInterface inventoryInStorePickupSalesApiDataResultInterface = (InventoryInStorePickupSalesApiDataResultInterface) o;
    return Objects.equals(this.successful, inventoryInStorePickupSalesApiDataResultInterface.successful) &&
        Objects.equals(this.errors, inventoryInStorePickupSalesApiDataResultInterface.errors) &&
        Objects.equals(this.extensionAttributes, inventoryInStorePickupSalesApiDataResultInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, errors, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryInStorePickupSalesApiDataResultInterface {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

