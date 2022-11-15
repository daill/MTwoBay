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
 * Category data interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataCategoryInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @Json(name = SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @Json(name = SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @Json(name = SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @Json(name = SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @Json(name = SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @Json(name = SERIALIZED_NAME_CHILDREN)
  private String children;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @Json(name = SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @Json(name = SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_PATH = "path";
  @Json(name = SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_AVAILABLE_SORT_BY = "available_sort_by";
  @Json(name = SERIALIZED_NAME_AVAILABLE_SORT_BY)
  private List<String> availableSortBy = null;

  public static final String SERIALIZED_NAME_INCLUDE_IN_MENU = "include_in_menu";
  @Json(name = SERIALIZED_NAME_INCLUDE_IN_MENU)
  private Boolean includeInMenu;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @Json(name = SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<FrameworkAttributeInterface> customAttributes = null;


  public CatalogDataCategoryInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Category id.
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CatalogDataCategoryInterface parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent category ID
   * @return parentId
  **/



  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public CatalogDataCategoryInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Category name
   * @return name
  **/



  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CatalogDataCategoryInterface isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether category is active
   * @return isActive
  **/



  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public CatalogDataCategoryInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Category position
   * @return position
  **/



  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public CatalogDataCategoryInterface level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Category level
   * @return level
  **/



  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  public CatalogDataCategoryInterface children(String children) {
    
    this.children = children;
    return this;
  }

   /**
   * Children ids comma separated.
   * @return children
  **/



  public String getChildren() {
    return children;
  }


  public void setChildren(String children) {
    this.children = children;
  }


  public CatalogDataCategoryInterface createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Category creation date and time.
   * @return createdAt
  **/



  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public CatalogDataCategoryInterface updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Category last update date and time.
   * @return updatedAt
  **/



  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CatalogDataCategoryInterface path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Category full path.
   * @return path
  **/



  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public CatalogDataCategoryInterface availableSortBy(List<String> availableSortBy) {
    
    this.availableSortBy = availableSortBy;
    return this;
  }

  public CatalogDataCategoryInterface addAvailableSortByItem(String availableSortByItem) {
    if (this.availableSortBy == null) {
      this.availableSortBy = new ArrayList<String>();
    }
    this.availableSortBy.add(availableSortByItem);
    return this;
  }

   /**
   * Available sort by for category.
   * @return availableSortBy
  **/



  public List<String> getAvailableSortBy() {
    return availableSortBy;
  }


  public void setAvailableSortBy(List<String> availableSortBy) {
    this.availableSortBy = availableSortBy;
  }


  public CatalogDataCategoryInterface includeInMenu(Boolean includeInMenu) {
    
    this.includeInMenu = includeInMenu;
    return this;
  }

   /**
   * Category is included in menu.
   * @return includeInMenu
  **/



  public Boolean getIncludeInMenu() {
    return includeInMenu;
  }


  public void setIncludeInMenu(Boolean includeInMenu) {
    this.includeInMenu = includeInMenu;
  }


  public CatalogDataCategoryInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Catalog\\Api\\Data\\CategoryInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public CatalogDataCategoryInterface customAttributes(List<FrameworkAttributeInterface> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public CatalogDataCategoryInterface addCustomAttributesItem(FrameworkAttributeInterface customAttributesItem) {
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
    CatalogDataCategoryInterface catalogDataCategoryInterface = (CatalogDataCategoryInterface) o;
    return Objects.equals(this.id, catalogDataCategoryInterface.id) &&
        Objects.equals(this.parentId, catalogDataCategoryInterface.parentId) &&
        Objects.equals(this.name, catalogDataCategoryInterface.name) &&
        Objects.equals(this.isActive, catalogDataCategoryInterface.isActive) &&
        Objects.equals(this.position, catalogDataCategoryInterface.position) &&
        Objects.equals(this.level, catalogDataCategoryInterface.level) &&
        Objects.equals(this.children, catalogDataCategoryInterface.children) &&
        Objects.equals(this.createdAt, catalogDataCategoryInterface.createdAt) &&
        Objects.equals(this.updatedAt, catalogDataCategoryInterface.updatedAt) &&
        Objects.equals(this.path, catalogDataCategoryInterface.path) &&
        Objects.equals(this.availableSortBy, catalogDataCategoryInterface.availableSortBy) &&
        Objects.equals(this.includeInMenu, catalogDataCategoryInterface.includeInMenu) &&
        Objects.equals(this.extensionAttributes, catalogDataCategoryInterface.extensionAttributes) &&
        Objects.equals(this.customAttributes, catalogDataCategoryInterface.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, isActive, position, level, children, createdAt, updatedAt, path, availableSortBy, includeInMenu, extensionAttributes, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataCategoryInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    availableSortBy: ").append(toIndentedString(availableSortBy)).append("\n");
    sb.append("    includeInMenu: ").append(toIndentedString(includeInMenu)).append("\n");
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

