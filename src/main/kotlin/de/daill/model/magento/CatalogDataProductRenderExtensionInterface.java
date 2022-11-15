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
 * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\ProductRenderInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductRenderExtensionInterface {
  public static final String SERIALIZED_NAME_WISHLIST_BUTTON = "wishlist_button";
  @Json(name = SERIALIZED_NAME_WISHLIST_BUTTON)
  private CatalogDataProductRenderButtonInterface wishlistButton;

  public static final String SERIALIZED_NAME_REVIEW_HTML = "review_html";
  @Json(name = SERIALIZED_NAME_REVIEW_HTML)
  private String reviewHtml;


  public CatalogDataProductRenderExtensionInterface wishlistButton(CatalogDataProductRenderButtonInterface wishlistButton) {
    
    this.wishlistButton = wishlistButton;
    return this;
  }

   /**
   * Get wishlistButton
   * @return wishlistButton
  **/



  public CatalogDataProductRenderButtonInterface getWishlistButton() {
    return wishlistButton;
  }


  public void setWishlistButton(CatalogDataProductRenderButtonInterface wishlistButton) {
    this.wishlistButton = wishlistButton;
  }


  public CatalogDataProductRenderExtensionInterface reviewHtml(String reviewHtml) {
    
    this.reviewHtml = reviewHtml;
    return this;
  }

   /**
   * Get reviewHtml
   * @return reviewHtml
  **/



  public String getReviewHtml() {
    return reviewHtml;
  }


  public void setReviewHtml(String reviewHtml) {
    this.reviewHtml = reviewHtml;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogDataProductRenderExtensionInterface catalogDataProductRenderExtensionInterface = (CatalogDataProductRenderExtensionInterface) o;
    return Objects.equals(this.wishlistButton, catalogDataProductRenderExtensionInterface.wishlistButton) &&
        Objects.equals(this.reviewHtml, catalogDataProductRenderExtensionInterface.reviewHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wishlistButton, reviewHtml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductRenderExtensionInterface {\n");
    sb.append("    wishlistButton: ").append(toIndentedString(wishlistButton)).append("\n");
    sb.append("    reviewHtml: ").append(toIndentedString(reviewHtml)).append("\n");
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

