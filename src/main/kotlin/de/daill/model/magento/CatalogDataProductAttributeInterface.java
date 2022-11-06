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

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CatalogDataProductAttributeInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CatalogDataProductAttributeInterface {
  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private EavDataAttributeExtensionInterface extensionAttributes;

  public static final String SERIALIZED_NAME_IS_WYSIWYG_ENABLED = "is_wysiwyg_enabled";
  @SerializedName(SERIALIZED_NAME_IS_WYSIWYG_ENABLED)
  private Boolean isWysiwygEnabled;

  public static final String SERIALIZED_NAME_IS_HTML_ALLOWED_ON_FRONT = "is_html_allowed_on_front";
  @SerializedName(SERIALIZED_NAME_IS_HTML_ALLOWED_ON_FRONT)
  private Boolean isHtmlAllowedOnFront;

  public static final String SERIALIZED_NAME_USED_FOR_SORT_BY = "used_for_sort_by";
  @SerializedName(SERIALIZED_NAME_USED_FOR_SORT_BY)
  private Boolean usedForSortBy;

  public static final String SERIALIZED_NAME_IS_FILTERABLE = "is_filterable";
  @SerializedName(SERIALIZED_NAME_IS_FILTERABLE)
  private Boolean isFilterable;

  public static final String SERIALIZED_NAME_IS_FILTERABLE_IN_SEARCH = "is_filterable_in_search";
  @SerializedName(SERIALIZED_NAME_IS_FILTERABLE_IN_SEARCH)
  private Boolean isFilterableInSearch;

  public static final String SERIALIZED_NAME_IS_USED_IN_GRID = "is_used_in_grid";
  @SerializedName(SERIALIZED_NAME_IS_USED_IN_GRID)
  private Boolean isUsedInGrid;

  public static final String SERIALIZED_NAME_IS_VISIBLE_IN_GRID = "is_visible_in_grid";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_IN_GRID)
  private Boolean isVisibleInGrid;

  public static final String SERIALIZED_NAME_IS_FILTERABLE_IN_GRID = "is_filterable_in_grid";
  @SerializedName(SERIALIZED_NAME_IS_FILTERABLE_IN_GRID)
  private Boolean isFilterableInGrid;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";
  @SerializedName(SERIALIZED_NAME_APPLY_TO)
  private List<String> applyTo = null;

  public static final String SERIALIZED_NAME_IS_SEARCHABLE = "is_searchable";
  @SerializedName(SERIALIZED_NAME_IS_SEARCHABLE)
  private String isSearchable;

  public static final String SERIALIZED_NAME_IS_VISIBLE_IN_ADVANCED_SEARCH = "is_visible_in_advanced_search";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_IN_ADVANCED_SEARCH)
  private String isVisibleInAdvancedSearch;

  public static final String SERIALIZED_NAME_IS_COMPARABLE = "is_comparable";
  @SerializedName(SERIALIZED_NAME_IS_COMPARABLE)
  private String isComparable;

  public static final String SERIALIZED_NAME_IS_USED_FOR_PROMO_RULES = "is_used_for_promo_rules";
  @SerializedName(SERIALIZED_NAME_IS_USED_FOR_PROMO_RULES)
  private String isUsedForPromoRules;

  public static final String SERIALIZED_NAME_IS_VISIBLE_ON_FRONT = "is_visible_on_front";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_ON_FRONT)
  private String isVisibleOnFront;

  public static final String SERIALIZED_NAME_USED_IN_PRODUCT_LISTING = "used_in_product_listing";
  @SerializedName(SERIALIZED_NAME_USED_IN_PRODUCT_LISTING)
  private String usedInProductListing;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "is_visible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
  private Integer attributeId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attribute_code";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_FRONTEND_INPUT = "frontend_input";
  @SerializedName(SERIALIZED_NAME_FRONTEND_INPUT)
  private String frontendInput;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_ID = "entity_type_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_ID)
  private String entityTypeId;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<EavDataAttributeOptionInterface> options = null;

  public static final String SERIALIZED_NAME_IS_USER_DEFINED = "is_user_defined";
  @SerializedName(SERIALIZED_NAME_IS_USER_DEFINED)
  private Boolean isUserDefined;

  public static final String SERIALIZED_NAME_DEFAULT_FRONTEND_LABEL = "default_frontend_label";
  @SerializedName(SERIALIZED_NAME_DEFAULT_FRONTEND_LABEL)
  private String defaultFrontendLabel;

  public static final String SERIALIZED_NAME_FRONTEND_LABELS = "frontend_labels";
  @SerializedName(SERIALIZED_NAME_FRONTEND_LABELS)
  private List<EavDataAttributeFrontendLabelInterface> frontendLabels = new ArrayList<EavDataAttributeFrontendLabelInterface>();

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_BACKEND_TYPE = "backend_type";
  @SerializedName(SERIALIZED_NAME_BACKEND_TYPE)
  private String backendType;

  public static final String SERIALIZED_NAME_BACKEND_MODEL = "backend_model";
  @SerializedName(SERIALIZED_NAME_BACKEND_MODEL)
  private String backendModel;

  public static final String SERIALIZED_NAME_SOURCE_MODEL = "source_model";
  @SerializedName(SERIALIZED_NAME_SOURCE_MODEL)
  private String sourceModel;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "is_unique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private String isUnique;

  public static final String SERIALIZED_NAME_FRONTEND_CLASS = "frontend_class";
  @SerializedName(SERIALIZED_NAME_FRONTEND_CLASS)
  private String frontendClass;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<EavDataAttributeValidationRuleInterface> validationRules = null;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<FrameworkAttributeInterface> customAttributes = null;


  public CatalogDataProductAttributeInterface extensionAttributes(EavDataAttributeExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public EavDataAttributeExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(EavDataAttributeExtensionInterface extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public CatalogDataProductAttributeInterface isWysiwygEnabled(Boolean isWysiwygEnabled) {
    
    this.isWysiwygEnabled = isWysiwygEnabled;
    return this;
  }

   /**
   * WYSIWYG flag
   * @return isWysiwygEnabled
  **/



  public Boolean getIsWysiwygEnabled() {
    return isWysiwygEnabled;
  }


  public void setIsWysiwygEnabled(Boolean isWysiwygEnabled) {
    this.isWysiwygEnabled = isWysiwygEnabled;
  }


  public CatalogDataProductAttributeInterface isHtmlAllowedOnFront(Boolean isHtmlAllowedOnFront) {
    
    this.isHtmlAllowedOnFront = isHtmlAllowedOnFront;
    return this;
  }

   /**
   * The HTML tags are allowed on the frontend
   * @return isHtmlAllowedOnFront
  **/



  public Boolean getIsHtmlAllowedOnFront() {
    return isHtmlAllowedOnFront;
  }


  public void setIsHtmlAllowedOnFront(Boolean isHtmlAllowedOnFront) {
    this.isHtmlAllowedOnFront = isHtmlAllowedOnFront;
  }


  public CatalogDataProductAttributeInterface usedForSortBy(Boolean usedForSortBy) {
    
    this.usedForSortBy = usedForSortBy;
    return this;
  }

   /**
   * It is used for sorting in product listing
   * @return usedForSortBy
  **/



  public Boolean getUsedForSortBy() {
    return usedForSortBy;
  }


  public void setUsedForSortBy(Boolean usedForSortBy) {
    this.usedForSortBy = usedForSortBy;
  }


  public CatalogDataProductAttributeInterface isFilterable(Boolean isFilterable) {
    
    this.isFilterable = isFilterable;
    return this;
  }

   /**
   * It used in layered navigation
   * @return isFilterable
  **/



  public Boolean getIsFilterable() {
    return isFilterable;
  }


  public void setIsFilterable(Boolean isFilterable) {
    this.isFilterable = isFilterable;
  }


  public CatalogDataProductAttributeInterface isFilterableInSearch(Boolean isFilterableInSearch) {
    
    this.isFilterableInSearch = isFilterableInSearch;
    return this;
  }

   /**
   * It is used in search results layered navigation
   * @return isFilterableInSearch
  **/



  public Boolean getIsFilterableInSearch() {
    return isFilterableInSearch;
  }


  public void setIsFilterableInSearch(Boolean isFilterableInSearch) {
    this.isFilterableInSearch = isFilterableInSearch;
  }


  public CatalogDataProductAttributeInterface isUsedInGrid(Boolean isUsedInGrid) {
    
    this.isUsedInGrid = isUsedInGrid;
    return this;
  }

   /**
   * It is used in catalog product grid
   * @return isUsedInGrid
  **/



  public Boolean getIsUsedInGrid() {
    return isUsedInGrid;
  }


  public void setIsUsedInGrid(Boolean isUsedInGrid) {
    this.isUsedInGrid = isUsedInGrid;
  }


  public CatalogDataProductAttributeInterface isVisibleInGrid(Boolean isVisibleInGrid) {
    
    this.isVisibleInGrid = isVisibleInGrid;
    return this;
  }

   /**
   * It is visible in catalog product grid
   * @return isVisibleInGrid
  **/



  public Boolean getIsVisibleInGrid() {
    return isVisibleInGrid;
  }


  public void setIsVisibleInGrid(Boolean isVisibleInGrid) {
    this.isVisibleInGrid = isVisibleInGrid;
  }


  public CatalogDataProductAttributeInterface isFilterableInGrid(Boolean isFilterableInGrid) {
    
    this.isFilterableInGrid = isFilterableInGrid;
    return this;
  }

   /**
   * It is filterable in catalog product grid
   * @return isFilterableInGrid
  **/



  public Boolean getIsFilterableInGrid() {
    return isFilterableInGrid;
  }


  public void setIsFilterableInGrid(Boolean isFilterableInGrid) {
    this.isFilterableInGrid = isFilterableInGrid;
  }


  public CatalogDataProductAttributeInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/



  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public CatalogDataProductAttributeInterface applyTo(List<String> applyTo) {
    
    this.applyTo = applyTo;
    return this;
  }

  public CatalogDataProductAttributeInterface addApplyToItem(String applyToItem) {
    if (this.applyTo == null) {
      this.applyTo = new ArrayList<String>();
    }
    this.applyTo.add(applyToItem);
    return this;
  }

   /**
   * Apply to value for the element
   * @return applyTo
  **/



  public List<String> getApplyTo() {
    return applyTo;
  }


  public void setApplyTo(List<String> applyTo) {
    this.applyTo = applyTo;
  }


  public CatalogDataProductAttributeInterface isSearchable(String isSearchable) {
    
    this.isSearchable = isSearchable;
    return this;
  }

   /**
   * The attribute can be used in Quick Search
   * @return isSearchable
  **/



  public String getIsSearchable() {
    return isSearchable;
  }


  public void setIsSearchable(String isSearchable) {
    this.isSearchable = isSearchable;
  }


  public CatalogDataProductAttributeInterface isVisibleInAdvancedSearch(String isVisibleInAdvancedSearch) {
    
    this.isVisibleInAdvancedSearch = isVisibleInAdvancedSearch;
    return this;
  }

   /**
   * The attribute can be used in Advanced Search
   * @return isVisibleInAdvancedSearch
  **/



  public String getIsVisibleInAdvancedSearch() {
    return isVisibleInAdvancedSearch;
  }


  public void setIsVisibleInAdvancedSearch(String isVisibleInAdvancedSearch) {
    this.isVisibleInAdvancedSearch = isVisibleInAdvancedSearch;
  }


  public CatalogDataProductAttributeInterface isComparable(String isComparable) {
    
    this.isComparable = isComparable;
    return this;
  }

   /**
   * The attribute can be compared on the frontend
   * @return isComparable
  **/



  public String getIsComparable() {
    return isComparable;
  }


  public void setIsComparable(String isComparable) {
    this.isComparable = isComparable;
  }


  public CatalogDataProductAttributeInterface isUsedForPromoRules(String isUsedForPromoRules) {
    
    this.isUsedForPromoRules = isUsedForPromoRules;
    return this;
  }

   /**
   * The attribute can be used for promo rules
   * @return isUsedForPromoRules
  **/



  public String getIsUsedForPromoRules() {
    return isUsedForPromoRules;
  }


  public void setIsUsedForPromoRules(String isUsedForPromoRules) {
    this.isUsedForPromoRules = isUsedForPromoRules;
  }


  public CatalogDataProductAttributeInterface isVisibleOnFront(String isVisibleOnFront) {
    
    this.isVisibleOnFront = isVisibleOnFront;
    return this;
  }

   /**
   * The attribute is visible on the frontend
   * @return isVisibleOnFront
  **/



  public String getIsVisibleOnFront() {
    return isVisibleOnFront;
  }


  public void setIsVisibleOnFront(String isVisibleOnFront) {
    this.isVisibleOnFront = isVisibleOnFront;
  }


  public CatalogDataProductAttributeInterface usedInProductListing(String usedInProductListing) {
    
    this.usedInProductListing = usedInProductListing;
    return this;
  }

   /**
   * The attribute can be used in product listing
   * @return usedInProductListing
  **/



  public String getUsedInProductListing() {
    return usedInProductListing;
  }


  public void setUsedInProductListing(String usedInProductListing) {
    this.usedInProductListing = usedInProductListing;
  }


  public CatalogDataProductAttributeInterface isVisible(Boolean isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Attribute is visible on frontend.
   * @return isVisible
  **/



  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  public CatalogDataProductAttributeInterface scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Attribute scope
   * @return scope
  **/



  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public CatalogDataProductAttributeInterface attributeId(Integer attributeId) {
    
    this.attributeId = attributeId;
    return this;
  }

   /**
   * Id of the attribute.
   * @return attributeId
  **/



  public Integer getAttributeId() {
    return attributeId;
  }


  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }


  public CatalogDataProductAttributeInterface attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Code of the attribute.
   * @return attributeCode
  **/


  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  public CatalogDataProductAttributeInterface frontendInput(String frontendInput) {
    
    this.frontendInput = frontendInput;
    return this;
  }

   /**
   * HTML for input element.
   * @return frontendInput
  **/


  public String getFrontendInput() {
    return frontendInput;
  }


  public void setFrontendInput(String frontendInput) {
    this.frontendInput = frontendInput;
  }


  public CatalogDataProductAttributeInterface entityTypeId(String entityTypeId) {
    
    this.entityTypeId = entityTypeId;
    return this;
  }

   /**
   * Entity type id
   * @return entityTypeId
  **/


  public String getEntityTypeId() {
    return entityTypeId;
  }


  public void setEntityTypeId(String entityTypeId) {
    this.entityTypeId = entityTypeId;
  }


  public CatalogDataProductAttributeInterface isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Attribute is required.
   * @return isRequired
  **/


  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public CatalogDataProductAttributeInterface options(List<EavDataAttributeOptionInterface> options) {
    
    this.options = options;
    return this;
  }

  public CatalogDataProductAttributeInterface addOptionsItem(EavDataAttributeOptionInterface optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<EavDataAttributeOptionInterface>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Options of the attribute (key &#x3D;&gt; value pairs for select)
   * @return options
  **/



  public List<EavDataAttributeOptionInterface> getOptions() {
    return options;
  }


  public void setOptions(List<EavDataAttributeOptionInterface> options) {
    this.options = options;
  }


  public CatalogDataProductAttributeInterface isUserDefined(Boolean isUserDefined) {
    
    this.isUserDefined = isUserDefined;
    return this;
  }

   /**
   * Current attribute has been defined by a user.
   * @return isUserDefined
  **/



  public Boolean getIsUserDefined() {
    return isUserDefined;
  }


  public void setIsUserDefined(Boolean isUserDefined) {
    this.isUserDefined = isUserDefined;
  }


  public CatalogDataProductAttributeInterface defaultFrontendLabel(String defaultFrontendLabel) {
    
    this.defaultFrontendLabel = defaultFrontendLabel;
    return this;
  }

   /**
   * Frontend label for default store
   * @return defaultFrontendLabel
  **/



  public String getDefaultFrontendLabel() {
    return defaultFrontendLabel;
  }


  public void setDefaultFrontendLabel(String defaultFrontendLabel) {
    this.defaultFrontendLabel = defaultFrontendLabel;
  }


  public CatalogDataProductAttributeInterface frontendLabels(List<EavDataAttributeFrontendLabelInterface> frontendLabels) {
    
    this.frontendLabels = frontendLabels;
    return this;
  }

  public CatalogDataProductAttributeInterface addFrontendLabelsItem(EavDataAttributeFrontendLabelInterface frontendLabelsItem) {
    this.frontendLabels.add(frontendLabelsItem);
    return this;
  }

   /**
   * Frontend label for each store
   * @return frontendLabels
  **/


  public List<EavDataAttributeFrontendLabelInterface> getFrontendLabels() {
    return frontendLabels;
  }


  public void setFrontendLabels(List<EavDataAttributeFrontendLabelInterface> frontendLabels) {
    this.frontendLabels = frontendLabels;
  }


  public CatalogDataProductAttributeInterface note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * The note attribute for the element.
   * @return note
  **/



  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public CatalogDataProductAttributeInterface backendType(String backendType) {
    
    this.backendType = backendType;
    return this;
  }

   /**
   * Backend type.
   * @return backendType
  **/



  public String getBackendType() {
    return backendType;
  }


  public void setBackendType(String backendType) {
    this.backendType = backendType;
  }


  public CatalogDataProductAttributeInterface backendModel(String backendModel) {
    
    this.backendModel = backendModel;
    return this;
  }

   /**
   * Backend model
   * @return backendModel
  **/



  public String getBackendModel() {
    return backendModel;
  }


  public void setBackendModel(String backendModel) {
    this.backendModel = backendModel;
  }


  public CatalogDataProductAttributeInterface sourceModel(String sourceModel) {
    
    this.sourceModel = sourceModel;
    return this;
  }

   /**
   * Source model
   * @return sourceModel
  **/



  public String getSourceModel() {
    return sourceModel;
  }


  public void setSourceModel(String sourceModel) {
    this.sourceModel = sourceModel;
  }


  public CatalogDataProductAttributeInterface defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value for the element.
   * @return defaultValue
  **/



  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public CatalogDataProductAttributeInterface isUnique(String isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * This is a unique attribute
   * @return isUnique
  **/



  public String getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(String isUnique) {
    this.isUnique = isUnique;
  }


  public CatalogDataProductAttributeInterface frontendClass(String frontendClass) {
    
    this.frontendClass = frontendClass;
    return this;
  }

   /**
   * Frontend class of attribute
   * @return frontendClass
  **/



  public String getFrontendClass() {
    return frontendClass;
  }


  public void setFrontendClass(String frontendClass) {
    this.frontendClass = frontendClass;
  }


  public CatalogDataProductAttributeInterface validationRules(List<EavDataAttributeValidationRuleInterface> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public CatalogDataProductAttributeInterface addValidationRulesItem(EavDataAttributeValidationRuleInterface validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<EavDataAttributeValidationRuleInterface>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Validation rules.
   * @return validationRules
  **/



  public List<EavDataAttributeValidationRuleInterface> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<EavDataAttributeValidationRuleInterface> validationRules) {
    this.validationRules = validationRules;
  }


  public CatalogDataProductAttributeInterface customAttributes(List<FrameworkAttributeInterface> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public CatalogDataProductAttributeInterface addCustomAttributesItem(FrameworkAttributeInterface customAttributesItem) {
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
    CatalogDataProductAttributeInterface catalogDataProductAttributeInterface = (CatalogDataProductAttributeInterface) o;
    return Objects.equals(this.extensionAttributes, catalogDataProductAttributeInterface.extensionAttributes) &&
        Objects.equals(this.isWysiwygEnabled, catalogDataProductAttributeInterface.isWysiwygEnabled) &&
        Objects.equals(this.isHtmlAllowedOnFront, catalogDataProductAttributeInterface.isHtmlAllowedOnFront) &&
        Objects.equals(this.usedForSortBy, catalogDataProductAttributeInterface.usedForSortBy) &&
        Objects.equals(this.isFilterable, catalogDataProductAttributeInterface.isFilterable) &&
        Objects.equals(this.isFilterableInSearch, catalogDataProductAttributeInterface.isFilterableInSearch) &&
        Objects.equals(this.isUsedInGrid, catalogDataProductAttributeInterface.isUsedInGrid) &&
        Objects.equals(this.isVisibleInGrid, catalogDataProductAttributeInterface.isVisibleInGrid) &&
        Objects.equals(this.isFilterableInGrid, catalogDataProductAttributeInterface.isFilterableInGrid) &&
        Objects.equals(this.position, catalogDataProductAttributeInterface.position) &&
        Objects.equals(this.applyTo, catalogDataProductAttributeInterface.applyTo) &&
        Objects.equals(this.isSearchable, catalogDataProductAttributeInterface.isSearchable) &&
        Objects.equals(this.isVisibleInAdvancedSearch, catalogDataProductAttributeInterface.isVisibleInAdvancedSearch) &&
        Objects.equals(this.isComparable, catalogDataProductAttributeInterface.isComparable) &&
        Objects.equals(this.isUsedForPromoRules, catalogDataProductAttributeInterface.isUsedForPromoRules) &&
        Objects.equals(this.isVisibleOnFront, catalogDataProductAttributeInterface.isVisibleOnFront) &&
        Objects.equals(this.usedInProductListing, catalogDataProductAttributeInterface.usedInProductListing) &&
        Objects.equals(this.isVisible, catalogDataProductAttributeInterface.isVisible) &&
        Objects.equals(this.scope, catalogDataProductAttributeInterface.scope) &&
        Objects.equals(this.attributeId, catalogDataProductAttributeInterface.attributeId) &&
        Objects.equals(this.attributeCode, catalogDataProductAttributeInterface.attributeCode) &&
        Objects.equals(this.frontendInput, catalogDataProductAttributeInterface.frontendInput) &&
        Objects.equals(this.entityTypeId, catalogDataProductAttributeInterface.entityTypeId) &&
        Objects.equals(this.isRequired, catalogDataProductAttributeInterface.isRequired) &&
        Objects.equals(this.options, catalogDataProductAttributeInterface.options) &&
        Objects.equals(this.isUserDefined, catalogDataProductAttributeInterface.isUserDefined) &&
        Objects.equals(this.defaultFrontendLabel, catalogDataProductAttributeInterface.defaultFrontendLabel) &&
        Objects.equals(this.frontendLabels, catalogDataProductAttributeInterface.frontendLabels) &&
        Objects.equals(this.note, catalogDataProductAttributeInterface.note) &&
        Objects.equals(this.backendType, catalogDataProductAttributeInterface.backendType) &&
        Objects.equals(this.backendModel, catalogDataProductAttributeInterface.backendModel) &&
        Objects.equals(this.sourceModel, catalogDataProductAttributeInterface.sourceModel) &&
        Objects.equals(this.defaultValue, catalogDataProductAttributeInterface.defaultValue) &&
        Objects.equals(this.isUnique, catalogDataProductAttributeInterface.isUnique) &&
        Objects.equals(this.frontendClass, catalogDataProductAttributeInterface.frontendClass) &&
        Objects.equals(this.validationRules, catalogDataProductAttributeInterface.validationRules) &&
        Objects.equals(this.customAttributes, catalogDataProductAttributeInterface.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionAttributes, isWysiwygEnabled, isHtmlAllowedOnFront, usedForSortBy, isFilterable, isFilterableInSearch, isUsedInGrid, isVisibleInGrid, isFilterableInGrid, position, applyTo, isSearchable, isVisibleInAdvancedSearch, isComparable, isUsedForPromoRules, isVisibleOnFront, usedInProductListing, isVisible, scope, attributeId, attributeCode, frontendInput, entityTypeId, isRequired, options, isUserDefined, defaultFrontendLabel, frontendLabels, note, backendType, backendModel, sourceModel, defaultValue, isUnique, frontendClass, validationRules, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDataProductAttributeInterface {\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    isWysiwygEnabled: ").append(toIndentedString(isWysiwygEnabled)).append("\n");
    sb.append("    isHtmlAllowedOnFront: ").append(toIndentedString(isHtmlAllowedOnFront)).append("\n");
    sb.append("    usedForSortBy: ").append(toIndentedString(usedForSortBy)).append("\n");
    sb.append("    isFilterable: ").append(toIndentedString(isFilterable)).append("\n");
    sb.append("    isFilterableInSearch: ").append(toIndentedString(isFilterableInSearch)).append("\n");
    sb.append("    isUsedInGrid: ").append(toIndentedString(isUsedInGrid)).append("\n");
    sb.append("    isVisibleInGrid: ").append(toIndentedString(isVisibleInGrid)).append("\n");
    sb.append("    isFilterableInGrid: ").append(toIndentedString(isFilterableInGrid)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    isSearchable: ").append(toIndentedString(isSearchable)).append("\n");
    sb.append("    isVisibleInAdvancedSearch: ").append(toIndentedString(isVisibleInAdvancedSearch)).append("\n");
    sb.append("    isComparable: ").append(toIndentedString(isComparable)).append("\n");
    sb.append("    isUsedForPromoRules: ").append(toIndentedString(isUsedForPromoRules)).append("\n");
    sb.append("    isVisibleOnFront: ").append(toIndentedString(isVisibleOnFront)).append("\n");
    sb.append("    usedInProductListing: ").append(toIndentedString(usedInProductListing)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    frontendInput: ").append(toIndentedString(frontendInput)).append("\n");
    sb.append("    entityTypeId: ").append(toIndentedString(entityTypeId)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    isUserDefined: ").append(toIndentedString(isUserDefined)).append("\n");
    sb.append("    defaultFrontendLabel: ").append(toIndentedString(defaultFrontendLabel)).append("\n");
    sb.append("    frontendLabels: ").append(toIndentedString(frontendLabels)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
    sb.append("    backendModel: ").append(toIndentedString(backendModel)).append("\n");
    sb.append("    sourceModel: ").append(toIndentedString(sourceModel)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    frontendClass: ").append(toIndentedString(frontendClass)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
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

