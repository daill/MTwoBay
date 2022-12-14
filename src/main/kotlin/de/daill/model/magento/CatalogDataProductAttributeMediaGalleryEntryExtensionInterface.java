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
 * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\ProductAttributeMediaGalleryEntryInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductAttributeMediaGalleryEntryExtensionInterface {
  public static final String SERIALIZED_NAME_VIDEO_CONTENT = "video_content";
  @Json(name = SERIALIZED_NAME_VIDEO_CONTENT)
  private FrameworkDataVideoContentInterface videoContent;


  public CatalogDataProductAttributeMediaGalleryEntryExtensionInterface videoContent(FrameworkDataVideoContentInterface videoContent) {
    
    this.videoContent = videoContent;
    return this;
  }

   /**
   * Get videoContent
   * @return videoContent
  **/
  
  

  public FrameworkDataVideoContentInterface getVideoContent() {
    return videoContent;
  }


  public void setVideoContent(FrameworkDataVideoContentInterface videoContent) {
    this.videoContent = videoContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogDataProductAttributeMediaGalleryEntryExtensionInterface catalogDataProductAttributeMediaGalleryEntryExtensionInterface = (CatalogDataProductAttributeMediaGalleryEntryExtensionInterface) o;
    return Objects.equals(this.videoContent, catalogDataProductAttributeMediaGalleryEntryExtensionInterface.videoContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductAttributeMediaGalleryEntryExtensionInterface {\n");
    sb.append("    videoContent: ").append(toIndentedString(videoContent)).append("\n");
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

