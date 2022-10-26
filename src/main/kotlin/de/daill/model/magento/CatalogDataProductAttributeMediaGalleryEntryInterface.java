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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

/**
 * CatalogDataProductAttributeMediaGalleryEntryInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductAttributeMediaGalleryEntryInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = new ArrayList<String>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String file;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private FrameworkDataImageContentInterface content;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
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
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductAttributeMediaGalleryEntryInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
