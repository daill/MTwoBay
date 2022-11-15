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
 * CatalogDataProductAttributeMediaGalleryEntryInterface
 */
public class CatalogDataProductAttributeMediaGalleryEntryInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @Json(name = SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @Json(name = SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @Json(name = SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @Json(name = SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @Json(name = SERIALIZED_NAME_TYPES)
  private List<String> types = new ArrayList<String>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @Json(name = SERIALIZED_NAME_FILE)
  private String file;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @Json(name = SERIALIZED_NAME_CONTENT)
  private FrameworkDataImageContentInterface content;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private CatalogDataProductAttributeMediaGalleryEntryExtensionInterface extensionAttributes;


  public CatalogDataProductAttributeMediaGalleryEntryInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Gallery entry ID
   * @return id
  **/
  


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Media type
   * @return mediaType
  **/
  

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Gallery entry alternative text
   * @return label
  **/
  

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Gallery entry position (sort order)
   * @return position
  **/
  

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * If gallery entry is hidden from product page
   * @return disabled
  **/
  

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public CatalogDataProductAttributeMediaGalleryEntryInterface addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * Gallery entry image types (thumbnail, image, small_image etc)
   * @return types
  **/
  

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    this.types = types;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface file(String file) {
    
    this.file = file;
    return this;
  }

   /**
   * File path
   * @return file
  **/
  


  public String getFile() {
    return file;
  }


  public void setFile(String file) {
    this.file = file;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface content(FrameworkDataImageContentInterface content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  


  public FrameworkDataImageContentInterface getContent() {
    return content;
  }


  public void setContent(FrameworkDataImageContentInterface content) {
    this.content = content;
  }


  public CatalogDataProductAttributeMediaGalleryEntryInterface extensionAttributes(CatalogDataProductAttributeMediaGalleryEntryExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/
  


  public CatalogDataProductAttributeMediaGalleryEntryExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(CatalogDataProductAttributeMediaGalleryEntryExtensionInterface extensionAttributes) {
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
    CatalogDataProductAttributeMediaGalleryEntryInterface catalogDataProductAttributeMediaGalleryEntryInterface = (CatalogDataProductAttributeMediaGalleryEntryInterface) o;
    return Objects.equals(this.id, catalogDataProductAttributeMediaGalleryEntryInterface.id) &&
        Objects.equals(this.mediaType, catalogDataProductAttributeMediaGalleryEntryInterface.mediaType) &&
        Objects.equals(this.label, catalogDataProductAttributeMediaGalleryEntryInterface.label) &&
        Objects.equals(this.position, catalogDataProductAttributeMediaGalleryEntryInterface.position) &&
        Objects.equals(this.disabled, catalogDataProductAttributeMediaGalleryEntryInterface.disabled) &&
        Objects.equals(this.types, catalogDataProductAttributeMediaGalleryEntryInterface.types) &&
        Objects.equals(this.file, catalogDataProductAttributeMediaGalleryEntryInterface.file) &&
        Objects.equals(this.content, catalogDataProductAttributeMediaGalleryEntryInterface.content) &&
        Objects.equals(this.extensionAttributes, catalogDataProductAttributeMediaGalleryEntryInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaType, label, position, disabled, types, file, content, extensionAttributes);
  }


  @Override
  public String toString() {
    String sb = "class CatalogDataProductAttributeMediaGalleryEntryInterface {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    mediaType: " + toIndentedString(mediaType) + "\n" +
            "    label: " + toIndentedString(label) + "\n" +
            "    position: " + toIndentedString(position) + "\n" +
            "    disabled: " + toIndentedString(disabled) + "\n" +
            "    types: " + toIndentedString(types) + "\n" +
            "    file: " + toIndentedString(file) + "\n" +
            "    content: " + toIndentedString(content) + "\n" +
            "    extensionAttributes: " + toIndentedString(extensionAttributes) + "\n" +
            "}";
    return sb;
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

