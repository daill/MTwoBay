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


import java.util.ArrayList;
import java.util.List;

/**
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject4 {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private CatalogDataProductInterface product;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ConfigurableProductDataOptionInterface> options = new ArrayList<ConfigurableProductDataOptionInterface>();


  public InlineObject4 product(CatalogDataProductInterface product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/


  public CatalogDataProductInterface getProduct() {
    return product;
  }


  public void setProduct(CatalogDataProductInterface product) {
    this.product = product;
  }


  public InlineObject4 options(List<ConfigurableProductDataOptionInterface> options) {
    
    this.options = options;
    return this;
  }

  public InlineObject4 addOptionsItem(ConfigurableProductDataOptionInterface optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/


  public List<ConfigurableProductDataOptionInterface> getOptions() {
    return options;
  }


  public void setOptions(List<ConfigurableProductDataOptionInterface> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.product, inlineObject4.product) &&
        Objects.equals(this.options, inlineObject4.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

