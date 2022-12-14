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
 * Customer attribute metadata interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CustomerDataAttributeMetadataInterface {
  public static final String SERIALIZED_NAME_FRONTEND_INPUT = "frontend_input";
  @Json(name = SERIALIZED_NAME_FRONTEND_INPUT)
  private String frontendInput;

  public static final String SERIALIZED_NAME_INPUT_FILTER = "input_filter";
  @Json(name = SERIALIZED_NAME_INPUT_FILTER)
  private String inputFilter;

  public static final String SERIALIZED_NAME_STORE_LABEL = "store_label";
  @Json(name = SERIALIZED_NAME_STORE_LABEL)
  private String storeLabel;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @Json(name = SERIALIZED_NAME_VALIDATION_RULES)
  private List<CustomerDataValidationRuleInterface> validationRules = new ArrayList<CustomerDataValidationRuleInterface>();

  public static final String SERIALIZED_NAME_MULTILINE_COUNT = "multiline_count";
  @Json(name = SERIALIZED_NAME_MULTILINE_COUNT)
  private Integer multilineCount;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @Json(name = SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @Json(name = SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_DATA_MODEL = "data_model";
  @Json(name = SERIALIZED_NAME_DATA_MODEL)
  private String dataModel;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @Json(name = SERIALIZED_NAME_OPTIONS)
  private List<CustomerDataOptionInterface> options = new ArrayList<CustomerDataOptionInterface>();

  public static final String SERIALIZED_NAME_FRONTEND_CLASS = "frontend_class";
  @Json(name = SERIALIZED_NAME_FRONTEND_CLASS)
  private String frontendClass;

  public static final String SERIALIZED_NAME_USER_DEFINED = "user_defined";
  @Json(name = SERIALIZED_NAME_USER_DEFINED)
  private Boolean userDefined;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @Json(name = SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_FRONTEND_LABEL = "frontend_label";
  @Json(name = SERIALIZED_NAME_FRONTEND_LABEL)
  private String frontendLabel;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @Json(name = SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @Json(name = SERIALIZED_NAME_SYSTEM)
  private Boolean system;

  public static final String SERIALIZED_NAME_BACKEND_TYPE = "backend_type";
  @Json(name = SERIALIZED_NAME_BACKEND_TYPE)
  private String backendType;

  public static final String SERIALIZED_NAME_IS_USED_IN_GRID = "is_used_in_grid";
  @Json(name = SERIALIZED_NAME_IS_USED_IN_GRID)
  private Boolean isUsedInGrid;

  public static final String SERIALIZED_NAME_IS_VISIBLE_IN_GRID = "is_visible_in_grid";
  @Json(name = SERIALIZED_NAME_IS_VISIBLE_IN_GRID)
  private Boolean isVisibleInGrid;

  public static final String SERIALIZED_NAME_IS_FILTERABLE_IN_GRID = "is_filterable_in_grid";
  @Json(name = SERIALIZED_NAME_IS_FILTERABLE_IN_GRID)
  private Boolean isFilterableInGrid;

  public static final String SERIALIZED_NAME_IS_SEARCHABLE_IN_GRID = "is_searchable_in_grid";
  @Json(name = SERIALIZED_NAME_IS_SEARCHABLE_IN_GRID)
  private Boolean isSearchableInGrid;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attribute_code";
  @Json(name = SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;


  public CustomerDataAttributeMetadataInterface frontendInput(String frontendInput) {
    
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


  public CustomerDataAttributeMetadataInterface inputFilter(String inputFilter) {
    
    this.inputFilter = inputFilter;
    return this;
  }

   /**
   * Template used for input (e.g. \&quot;date\&quot;)
   * @return inputFilter
  **/
  

  public String getInputFilter() {
    return inputFilter;
  }


  public void setInputFilter(String inputFilter) {
    this.inputFilter = inputFilter;
  }


  public CustomerDataAttributeMetadataInterface storeLabel(String storeLabel) {
    
    this.storeLabel = storeLabel;
    return this;
  }

   /**
   * Label of the store.
   * @return storeLabel
  **/
  

  public String getStoreLabel() {
    return storeLabel;
  }


  public void setStoreLabel(String storeLabel) {
    this.storeLabel = storeLabel;
  }


  public CustomerDataAttributeMetadataInterface validationRules(List<CustomerDataValidationRuleInterface> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public CustomerDataAttributeMetadataInterface addValidationRulesItem(CustomerDataValidationRuleInterface validationRulesItem) {
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Validation rules.
   * @return validationRules
  **/
  

  public List<CustomerDataValidationRuleInterface> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<CustomerDataValidationRuleInterface> validationRules) {
    this.validationRules = validationRules;
  }


  public CustomerDataAttributeMetadataInterface multilineCount(Integer multilineCount) {
    
    this.multilineCount = multilineCount;
    return this;
  }

   /**
   * Of lines of the attribute value.
   * @return multilineCount
  **/
  

  public Integer getMultilineCount() {
    return multilineCount;
  }


  public void setMultilineCount(Integer multilineCount) {
    this.multilineCount = multilineCount;
  }


  public CustomerDataAttributeMetadataInterface visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Attribute is visible on frontend.
   * @return visible
  **/
  

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public CustomerDataAttributeMetadataInterface required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Attribute is required.
   * @return required
  **/
  

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public CustomerDataAttributeMetadataInterface dataModel(String dataModel) {
    
    this.dataModel = dataModel;
    return this;
  }

   /**
   * Data model for attribute.
   * @return dataModel
  **/
  

  public String getDataModel() {
    return dataModel;
  }


  public void setDataModel(String dataModel) {
    this.dataModel = dataModel;
  }


  public CustomerDataAttributeMetadataInterface options(List<CustomerDataOptionInterface> options) {
    
    this.options = options;
    return this;
  }

  public CustomerDataAttributeMetadataInterface addOptionsItem(CustomerDataOptionInterface optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Options of the attribute (key &#x3D;&gt; value pairs for select)
   * @return options
  **/
  

  public List<CustomerDataOptionInterface> getOptions() {
    return options;
  }


  public void setOptions(List<CustomerDataOptionInterface> options) {
    this.options = options;
  }


  public CustomerDataAttributeMetadataInterface frontendClass(String frontendClass) {
    
    this.frontendClass = frontendClass;
    return this;
  }

   /**
   * Class which is used to display the attribute on frontend.
   * @return frontendClass
  **/
  

  public String getFrontendClass() {
    return frontendClass;
  }


  public void setFrontendClass(String frontendClass) {
    this.frontendClass = frontendClass;
  }


  public CustomerDataAttributeMetadataInterface userDefined(Boolean userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * Current attribute has been defined by a user.
   * @return userDefined
  **/
  

  public Boolean getUserDefined() {
    return userDefined;
  }


  public void setUserDefined(Boolean userDefined) {
    this.userDefined = userDefined;
  }


  public CustomerDataAttributeMetadataInterface sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Attributes sort order.
   * @return sortOrder
  **/
  

  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public CustomerDataAttributeMetadataInterface frontendLabel(String frontendLabel) {
    
    this.frontendLabel = frontendLabel;
    return this;
  }

   /**
   * Label which supposed to be displayed on frontend.
   * @return frontendLabel
  **/
  

  public String getFrontendLabel() {
    return frontendLabel;
  }


  public void setFrontendLabel(String frontendLabel) {
    this.frontendLabel = frontendLabel;
  }


  public CustomerDataAttributeMetadataInterface note(String note) {
    
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


  public CustomerDataAttributeMetadataInterface system(Boolean system) {
    
    this.system = system;
    return this;
  }

   /**
   * This is a system attribute.
   * @return system
  **/
  

  public Boolean getSystem() {
    return system;
  }


  public void setSystem(Boolean system) {
    this.system = system;
  }


  public CustomerDataAttributeMetadataInterface backendType(String backendType) {
    
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


  public CustomerDataAttributeMetadataInterface isUsedInGrid(Boolean isUsedInGrid) {
    
    this.isUsedInGrid = isUsedInGrid;
    return this;
  }

   /**
   * It is used in customer grid
   * @return isUsedInGrid
  **/
  
  

  public Boolean getIsUsedInGrid() {
    return isUsedInGrid;
  }


  public void setIsUsedInGrid(Boolean isUsedInGrid) {
    this.isUsedInGrid = isUsedInGrid;
  }


  public CustomerDataAttributeMetadataInterface isVisibleInGrid(Boolean isVisibleInGrid) {
    
    this.isVisibleInGrid = isVisibleInGrid;
    return this;
  }

   /**
   * It is visible in customer grid
   * @return isVisibleInGrid
  **/
  
  

  public Boolean getIsVisibleInGrid() {
    return isVisibleInGrid;
  }


  public void setIsVisibleInGrid(Boolean isVisibleInGrid) {
    this.isVisibleInGrid = isVisibleInGrid;
  }


  public CustomerDataAttributeMetadataInterface isFilterableInGrid(Boolean isFilterableInGrid) {
    
    this.isFilterableInGrid = isFilterableInGrid;
    return this;
  }

   /**
   * It is filterable in customer grid
   * @return isFilterableInGrid
  **/
  
  

  public Boolean getIsFilterableInGrid() {
    return isFilterableInGrid;
  }


  public void setIsFilterableInGrid(Boolean isFilterableInGrid) {
    this.isFilterableInGrid = isFilterableInGrid;
  }


  public CustomerDataAttributeMetadataInterface isSearchableInGrid(Boolean isSearchableInGrid) {
    
    this.isSearchableInGrid = isSearchableInGrid;
    return this;
  }

   /**
   * It is searchable in customer grid
   * @return isSearchableInGrid
  **/
  
  

  public Boolean getIsSearchableInGrid() {
    return isSearchableInGrid;
  }


  public void setIsSearchableInGrid(Boolean isSearchableInGrid) {
    this.isSearchableInGrid = isSearchableInGrid;
  }


  public CustomerDataAttributeMetadataInterface attributeCode(String attributeCode) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDataAttributeMetadataInterface customerDataAttributeMetadataInterface = (CustomerDataAttributeMetadataInterface) o;
    return Objects.equals(this.frontendInput, customerDataAttributeMetadataInterface.frontendInput) &&
        Objects.equals(this.inputFilter, customerDataAttributeMetadataInterface.inputFilter) &&
        Objects.equals(this.storeLabel, customerDataAttributeMetadataInterface.storeLabel) &&
        Objects.equals(this.validationRules, customerDataAttributeMetadataInterface.validationRules) &&
        Objects.equals(this.multilineCount, customerDataAttributeMetadataInterface.multilineCount) &&
        Objects.equals(this.visible, customerDataAttributeMetadataInterface.visible) &&
        Objects.equals(this.required, customerDataAttributeMetadataInterface.required) &&
        Objects.equals(this.dataModel, customerDataAttributeMetadataInterface.dataModel) &&
        Objects.equals(this.options, customerDataAttributeMetadataInterface.options) &&
        Objects.equals(this.frontendClass, customerDataAttributeMetadataInterface.frontendClass) &&
        Objects.equals(this.userDefined, customerDataAttributeMetadataInterface.userDefined) &&
        Objects.equals(this.sortOrder, customerDataAttributeMetadataInterface.sortOrder) &&
        Objects.equals(this.frontendLabel, customerDataAttributeMetadataInterface.frontendLabel) &&
        Objects.equals(this.note, customerDataAttributeMetadataInterface.note) &&
        Objects.equals(this.system, customerDataAttributeMetadataInterface.system) &&
        Objects.equals(this.backendType, customerDataAttributeMetadataInterface.backendType) &&
        Objects.equals(this.isUsedInGrid, customerDataAttributeMetadataInterface.isUsedInGrid) &&
        Objects.equals(this.isVisibleInGrid, customerDataAttributeMetadataInterface.isVisibleInGrid) &&
        Objects.equals(this.isFilterableInGrid, customerDataAttributeMetadataInterface.isFilterableInGrid) &&
        Objects.equals(this.isSearchableInGrid, customerDataAttributeMetadataInterface.isSearchableInGrid) &&
        Objects.equals(this.attributeCode, customerDataAttributeMetadataInterface.attributeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontendInput, inputFilter, storeLabel, validationRules, multilineCount, visible, required, dataModel, options, frontendClass, userDefined, sortOrder, frontendLabel, note, system, backendType, isUsedInGrid, isVisibleInGrid, isFilterableInGrid, isSearchableInGrid, attributeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDataAttributeMetadataInterface {\n");
    sb.append("    frontendInput: ").append(toIndentedString(frontendInput)).append("\n");
    sb.append("    inputFilter: ").append(toIndentedString(inputFilter)).append("\n");
    sb.append("    storeLabel: ").append(toIndentedString(storeLabel)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
    sb.append("    multilineCount: ").append(toIndentedString(multilineCount)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    dataModel: ").append(toIndentedString(dataModel)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    frontendClass: ").append(toIndentedString(frontendClass)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    frontendLabel: ").append(toIndentedString(frontendLabel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
    sb.append("    isUsedInGrid: ").append(toIndentedString(isUsedInGrid)).append("\n");
    sb.append("    isVisibleInGrid: ").append(toIndentedString(isVisibleInGrid)).append("\n");
    sb.append("    isFilterableInGrid: ").append(toIndentedString(isFilterableInGrid)).append("\n");
    sb.append("    isSearchableInGrid: ").append(toIndentedString(isSearchableInGrid)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
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

