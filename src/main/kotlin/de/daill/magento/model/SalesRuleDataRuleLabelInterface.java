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


/**
 * Interface RuleLabelInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesRuleDataRuleLabelInterface {
  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_STORE_LABEL = "store_label";
  @SerializedName(SERIALIZED_NAME_STORE_LABEL)
  private String storeLabel;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public SalesRuleDataRuleLabelInterface storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * StoreId
   * @return storeId
  **/
  

  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public SalesRuleDataRuleLabelInterface storeLabel(String storeLabel) {
    
    this.storeLabel = storeLabel;
    return this;
  }

   /**
   * The label for the store
   * @return storeLabel
  **/
  

  public String getStoreLabel() {
    return storeLabel;
  }


  public void setStoreLabel(String storeLabel) {
    this.storeLabel = storeLabel;
  }


  public SalesRuleDataRuleLabelInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\SalesRule\\Api\\Data\\RuleLabelInterface
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
    SalesRuleDataRuleLabelInterface salesRuleDataRuleLabelInterface = (SalesRuleDataRuleLabelInterface) o;
    return Objects.equals(this.storeId, salesRuleDataRuleLabelInterface.storeId) &&
        Objects.equals(this.storeLabel, salesRuleDataRuleLabelInterface.storeLabel) &&
        Objects.equals(this.extensionAttributes, salesRuleDataRuleLabelInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeLabel, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRuleDataRuleLabelInterface {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeLabel: ").append(toIndentedString(storeLabel)).append("\n");
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
