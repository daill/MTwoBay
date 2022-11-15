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
 * Button interface. This interface represents all manner of product buttons: add to cart, add to compare, etc... The buttons describes by this interface should have interaction with backend
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductRenderButtonInterface {
  public static final String SERIALIZED_NAME_POST_DATA = "post_data";
  @Json(name = SERIALIZED_NAME_POST_DATA)
  private String postData;

  public static final String SERIALIZED_NAME_URL = "url";
  @Json(name = SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_REQUIRED_OPTIONS = "required_options";
  @Json(name = SERIALIZED_NAME_REQUIRED_OPTIONS)
  private Boolean requiredOptions;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public CatalogDataProductRenderButtonInterface postData(String postData) {
    
    this.postData = postData;
    return this;
  }

   /**
   * Post data
   * @return postData
  **/
  

  public String getPostData() {
    return postData;
  }


  public void setPostData(String postData) {
    this.postData = postData;
  }


  public CatalogDataProductRenderButtonInterface url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Url, needed to add product to cart
   * @return url
  **/
  

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CatalogDataProductRenderButtonInterface requiredOptions(Boolean requiredOptions) {
    
    this.requiredOptions = requiredOptions;
    return this;
  }

   /**
   * Flag whether a product has options or not
   * @return requiredOptions
  **/
  

  public Boolean getRequiredOptions() {
    return requiredOptions;
  }


  public void setRequiredOptions(Boolean requiredOptions) {
    this.requiredOptions = requiredOptions;
  }


  public CatalogDataProductRenderButtonInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\ProductRender\\ButtonInterface
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
    CatalogDataProductRenderButtonInterface catalogDataProductRenderButtonInterface = (CatalogDataProductRenderButtonInterface) o;
    return Objects.equals(this.postData, catalogDataProductRenderButtonInterface.postData) &&
        Objects.equals(this.url, catalogDataProductRenderButtonInterface.url) &&
        Objects.equals(this.requiredOptions, catalogDataProductRenderButtonInterface.requiredOptions) &&
        Objects.equals(this.extensionAttributes, catalogDataProductRenderButtonInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postData, url, requiredOptions, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductRenderButtonInterface {\n");
    sb.append("    postData: ").append(toIndentedString(postData)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requiredOptions: ").append(toIndentedString(requiredOptions)).append("\n");
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

