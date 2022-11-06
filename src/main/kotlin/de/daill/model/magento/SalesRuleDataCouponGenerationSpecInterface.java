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

import java.util.Objects;


/**
 * CouponGenerationSpecInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesRuleDataCouponGenerationSpecInterface {
  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Integer ruleId;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_DELIMITER_AT_EVERY = "delimiter_at_every";
  @SerializedName(SERIALIZED_NAME_DELIMITER_AT_EVERY)
  private Integer delimiterAtEvery;

  public static final String SERIALIZED_NAME_DELIMITER = "delimiter";
  @SerializedName(SERIALIZED_NAME_DELIMITER)
  private String delimiter;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public SalesRuleDataCouponGenerationSpecInterface ruleId(Integer ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The id of the rule associated with the coupon
   * @return ruleId
  **/


  public Integer getRuleId() {
    return ruleId;
  }


  public void setRuleId(Integer ruleId) {
    this.ruleId = ruleId;
  }


  public SalesRuleDataCouponGenerationSpecInterface format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format of generated coupon code
   * @return format
  **/


  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public SalesRuleDataCouponGenerationSpecInterface quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Of coupons to generate
   * @return quantity
  **/


  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public SalesRuleDataCouponGenerationSpecInterface length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Length of coupon code
   * @return length
  **/


  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public SalesRuleDataCouponGenerationSpecInterface prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * The prefix
   * @return prefix
  **/



  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public SalesRuleDataCouponGenerationSpecInterface suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * The suffix
   * @return suffix
  **/



  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public SalesRuleDataCouponGenerationSpecInterface delimiterAtEvery(Integer delimiterAtEvery) {
    
    this.delimiterAtEvery = delimiterAtEvery;
    return this;
  }

   /**
   * The spacing where the delimiter should exist
   * @return delimiterAtEvery
  **/



  public Integer getDelimiterAtEvery() {
    return delimiterAtEvery;
  }


  public void setDelimiterAtEvery(Integer delimiterAtEvery) {
    this.delimiterAtEvery = delimiterAtEvery;
  }


  public SalesRuleDataCouponGenerationSpecInterface delimiter(String delimiter) {
    
    this.delimiter = delimiter;
    return this;
  }

   /**
   * The delimiter
   * @return delimiter
  **/



  public String getDelimiter() {
    return delimiter;
  }


  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }


  public SalesRuleDataCouponGenerationSpecInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\SalesRule\\Api\\Data\\CouponGenerationSpecInterface
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
    SalesRuleDataCouponGenerationSpecInterface salesRuleDataCouponGenerationSpecInterface = (SalesRuleDataCouponGenerationSpecInterface) o;
    return Objects.equals(this.ruleId, salesRuleDataCouponGenerationSpecInterface.ruleId) &&
        Objects.equals(this.format, salesRuleDataCouponGenerationSpecInterface.format) &&
        Objects.equals(this.quantity, salesRuleDataCouponGenerationSpecInterface.quantity) &&
        Objects.equals(this.length, salesRuleDataCouponGenerationSpecInterface.length) &&
        Objects.equals(this.prefix, salesRuleDataCouponGenerationSpecInterface.prefix) &&
        Objects.equals(this.suffix, salesRuleDataCouponGenerationSpecInterface.suffix) &&
        Objects.equals(this.delimiterAtEvery, salesRuleDataCouponGenerationSpecInterface.delimiterAtEvery) &&
        Objects.equals(this.delimiter, salesRuleDataCouponGenerationSpecInterface.delimiter) &&
        Objects.equals(this.extensionAttributes, salesRuleDataCouponGenerationSpecInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, format, quantity, length, prefix, suffix, delimiterAtEvery, delimiter, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRuleDataCouponGenerationSpecInterface {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    delimiterAtEvery: ").append(toIndentedString(delimiterAtEvery)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
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

