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
 * Additional data for totals collection.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class QuoteDataTotalsAdditionalDataInterface {
  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private QuoteDataTotalsAdditionalDataExtensionInterface extensionAttributes;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @Json(name = SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<FrameworkAttributeInterface> customAttributes = null;


  public QuoteDataTotalsAdditionalDataInterface extensionAttributes(QuoteDataTotalsAdditionalDataExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public QuoteDataTotalsAdditionalDataExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(QuoteDataTotalsAdditionalDataExtensionInterface extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public QuoteDataTotalsAdditionalDataInterface customAttributes(List<FrameworkAttributeInterface> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public QuoteDataTotalsAdditionalDataInterface addCustomAttributesItem(FrameworkAttributeInterface customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<FrameworkAttributeInterface>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Custom attributes values.
   * @return customAttributes
  **/



  public List<FrameworkAttributeInterface> getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(List<FrameworkAttributeInterface> customAttributes) {
    this.customAttributes = customAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDataTotalsAdditionalDataInterface quoteDataTotalsAdditionalDataInterface = (QuoteDataTotalsAdditionalDataInterface) o;
    return Objects.equals(this.extensionAttributes, quoteDataTotalsAdditionalDataInterface.extensionAttributes) &&
        Objects.equals(this.customAttributes, quoteDataTotalsAdditionalDataInterface.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionAttributes, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDataTotalsAdditionalDataInterface {\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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

