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
 * Tax rule interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TaxDataTaxRuleInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @Json(name = SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @Json(name = SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @Json(name = SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_CUSTOMER_TAX_CLASS_IDS = "customer_tax_class_ids";
  @Json(name = SERIALIZED_NAME_CUSTOMER_TAX_CLASS_IDS)
  private List<Integer> customerTaxClassIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_PRODUCT_TAX_CLASS_IDS = "product_tax_class_ids";
  @Json(name = SERIALIZED_NAME_PRODUCT_TAX_CLASS_IDS)
  private List<Integer> productTaxClassIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_TAX_RATE_IDS = "tax_rate_ids";
  @Json(name = SERIALIZED_NAME_TAX_RATE_IDS)
  private List<Integer> taxRateIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_CALCULATE_SUBTOTAL = "calculate_subtotal";
  @Json(name = SERIALIZED_NAME_CALCULATE_SUBTOTAL)
  private Boolean calculateSubtotal;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public TaxDataTaxRuleInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TaxDataTaxRuleInterface code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Tax rule code
   * @return code
  **/


  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TaxDataTaxRuleInterface priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority
   * @return priority
  **/


  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public TaxDataTaxRuleInterface position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Sort order.
   * @return position
  **/


  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public TaxDataTaxRuleInterface customerTaxClassIds(List<Integer> customerTaxClassIds) {
    
    this.customerTaxClassIds = customerTaxClassIds;
    return this;
  }

  public TaxDataTaxRuleInterface addCustomerTaxClassIdsItem(Integer customerTaxClassIdsItem) {
    this.customerTaxClassIds.add(customerTaxClassIdsItem);
    return this;
  }

   /**
   * Customer tax class id
   * @return customerTaxClassIds
  **/


  public List<Integer> getCustomerTaxClassIds() {
    return customerTaxClassIds;
  }


  public void setCustomerTaxClassIds(List<Integer> customerTaxClassIds) {
    this.customerTaxClassIds = customerTaxClassIds;
  }


  public TaxDataTaxRuleInterface productTaxClassIds(List<Integer> productTaxClassIds) {
    
    this.productTaxClassIds = productTaxClassIds;
    return this;
  }

  public TaxDataTaxRuleInterface addProductTaxClassIdsItem(Integer productTaxClassIdsItem) {
    this.productTaxClassIds.add(productTaxClassIdsItem);
    return this;
  }

   /**
   * Product tax class id
   * @return productTaxClassIds
  **/


  public List<Integer> getProductTaxClassIds() {
    return productTaxClassIds;
  }


  public void setProductTaxClassIds(List<Integer> productTaxClassIds) {
    this.productTaxClassIds = productTaxClassIds;
  }


  public TaxDataTaxRuleInterface taxRateIds(List<Integer> taxRateIds) {
    
    this.taxRateIds = taxRateIds;
    return this;
  }

  public TaxDataTaxRuleInterface addTaxRateIdsItem(Integer taxRateIdsItem) {
    this.taxRateIds.add(taxRateIdsItem);
    return this;
  }

   /**
   * Tax rate ids
   * @return taxRateIds
  **/


  public List<Integer> getTaxRateIds() {
    return taxRateIds;
  }


  public void setTaxRateIds(List<Integer> taxRateIds) {
    this.taxRateIds = taxRateIds;
  }


  public TaxDataTaxRuleInterface calculateSubtotal(Boolean calculateSubtotal) {
    
    this.calculateSubtotal = calculateSubtotal;
    return this;
  }

   /**
   * Calculate subtotal.
   * @return calculateSubtotal
  **/



  public Boolean getCalculateSubtotal() {
    return calculateSubtotal;
  }


  public void setCalculateSubtotal(Boolean calculateSubtotal) {
    this.calculateSubtotal = calculateSubtotal;
  }


  public TaxDataTaxRuleInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Tax\\Api\\Data\\TaxRuleInterface
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
    TaxDataTaxRuleInterface taxDataTaxRuleInterface = (TaxDataTaxRuleInterface) o;
    return Objects.equals(this.id, taxDataTaxRuleInterface.id) &&
        Objects.equals(this.code, taxDataTaxRuleInterface.code) &&
        Objects.equals(this.priority, taxDataTaxRuleInterface.priority) &&
        Objects.equals(this.position, taxDataTaxRuleInterface.position) &&
        Objects.equals(this.customerTaxClassIds, taxDataTaxRuleInterface.customerTaxClassIds) &&
        Objects.equals(this.productTaxClassIds, taxDataTaxRuleInterface.productTaxClassIds) &&
        Objects.equals(this.taxRateIds, taxDataTaxRuleInterface.taxRateIds) &&
        Objects.equals(this.calculateSubtotal, taxDataTaxRuleInterface.calculateSubtotal) &&
        Objects.equals(this.extensionAttributes, taxDataTaxRuleInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, priority, position, customerTaxClassIds, productTaxClassIds, taxRateIds, calculateSubtotal, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDataTaxRuleInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    customerTaxClassIds: ").append(toIndentedString(customerTaxClassIds)).append("\n");
    sb.append("    productTaxClassIds: ").append(toIndentedString(productTaxClassIds)).append("\n");
    sb.append("    taxRateIds: ").append(toIndentedString(taxRateIds)).append("\n");
    sb.append("    calculateSubtotal: ").append(toIndentedString(calculateSubtotal)).append("\n");
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

