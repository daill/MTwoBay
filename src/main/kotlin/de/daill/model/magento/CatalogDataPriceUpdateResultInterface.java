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
 * Interface returned in case of incorrect price passed to efficient price API.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataPriceUpdateResultInterface {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @Json(name = SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @Json(name = SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogDataPriceUpdateResultInterface message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message, that contains description of error occurred during price update.
   * @return message
  **/


  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CatalogDataPriceUpdateResultInterface parameters(List<String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public CatalogDataPriceUpdateResultInterface addParametersItem(String parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters, that could be displayed in error message placeholders.
   * @return parameters
  **/


  public List<String> getParameters() {
    return parameters;
  }


  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  public CatalogDataPriceUpdateResultInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\PriceUpdateResultInterface
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
    CatalogDataPriceUpdateResultInterface catalogDataPriceUpdateResultInterface = (CatalogDataPriceUpdateResultInterface) o;
    return Objects.equals(this.message, catalogDataPriceUpdateResultInterface.message) &&
        Objects.equals(this.parameters, catalogDataPriceUpdateResultInterface.parameters) &&
        Objects.equals(this.extensionAttributes, catalogDataPriceUpdateResultInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, parameters, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataPriceUpdateResultInterface {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

