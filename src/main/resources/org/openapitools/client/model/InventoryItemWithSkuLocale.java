/*
 * Inventory API
 * The Inventory API is used to create and manage inventory, and then to publish and manage this inventory on an eBay marketplace. There are also methods in this API that will convert eligible, active eBay listings into the Inventory API model.
 *
 * The version of the OpenAPI document: 1.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.io.IOException;
import org.openapitools.client.model.Availability;
import org.openapitools.client.model.PackageWeightAndSize;
import org.openapitools.client.model.Product;

/**
 * This type is used to define/modify each inventory item record that is being created and/or updated with the &lt;strong&gt;bulkCreateOrReplaceInventoryItem&lt;/strong&gt; method. Up to 25 inventory item records can be created and/or updated with one call.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class InventoryItemWithSkuLocale {
  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private Availability availability;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_CONDITION_DESCRIPTION = "conditionDescription";
  @SerializedName(SERIALIZED_NAME_CONDITION_DESCRIPTION)
  private String conditionDescription;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PACKAGE_WEIGHT_AND_SIZE = "packageWeightAndSize";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WEIGHT_AND_SIZE)
  private PackageWeightAndSize packageWeightAndSize;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private Product product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;


  public InventoryItemWithSkuLocale availability(Availability availability) {
    
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  


  public Availability getAvailability() {
    return availability;
  }


  public void setAvailability(Availability availability) {
    this.availability = availability;
  }


  public InventoryItemWithSkuLocale condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * This enumeration value indicates the condition of the item. Supported item condition values will vary by eBay site and category. To see which item condition values that a particular eBay category supports, use the &lt;a href&#x3D;\&quot;/api-docs/sell/metadata/resources/marketplace/methods/getItemConditionPolicies\&quot;&gt;getItemConditionPolicies&lt;/a&gt; method of the &lt;strong&gt;Metadata API&lt;/strong&gt;. This method returns condition ID values that map to the enumeration values defined in the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/types/slr:ConditionEnum\&quot;&gt;ConditionEnum&lt;/a&gt; type. The &lt;a href&#x3D;\&quot;/api-docs/sell/static/metadata/condition-id-values.html\&quot;&gt;Item condition ID and name values&lt;/a&gt; topic in the &lt;strong&gt;Selling Integration Guide&lt;/strong&gt; has a table that maps condition ID values to &lt;strong&gt;ConditionEnum&lt;/strong&gt; values. The &lt;strong&gt;getItemConditionPolicies&lt;/strong&gt; call reference page has more information.&lt;br&gt;&lt;br&gt; A &lt;strong&gt;condition&lt;/strong&gt; value is optional up until the seller is ready to publish an offer with the SKU, at which time it becomes required for most eBay categories. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ConditionEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return condition
  **/
  


  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public InventoryItemWithSkuLocale conditionDescription(String conditionDescription) {
    
    this.conditionDescription = conditionDescription;
    return this;
  }

   /**
   * This string field is used by the seller to more clearly describe the condition of a used inventory item, or an inventory item whose &lt;strong&gt;condition&lt;/strong&gt; value is not &lt;code&gt;NEW&lt;/code&gt;, &lt;code&gt;LIKE_NEW&lt;/code&gt;, &lt;code&gt;NEW_OTHER&lt;/code&gt;, or &lt;code&gt;NEW_WITH_DEFECTS&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt; The &lt;strong&gt;conditionDescription&lt;/strong&gt; field is available for all eBay categories. If the &lt;strong&gt;conditionDescription&lt;/strong&gt; field is used with an item in one of the new conditions (mentioned in previous paragraph), eBay will simply ignore this field if included, and eBay will return a warning message to the user. &lt;br/&gt;&lt;br/&gt; This field should only be used to further clarify the condition of the used item. It should not be used for branding, promotions, shipping, returns, payment or other information unrelated to the condition of the used item. Make sure that the &lt;strong&gt;condition&lt;/strong&gt; value, condition description, listing description, and the item&#39;s pictures do not contradict one another. &lt;br /&gt;&lt;br /&gt; This field is not always required, but is required if an inventory item is being updated and a condition description already exists for that inventory item. &lt;br /&gt;&lt;br /&gt; This field is returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt;, and &lt;strong&gt;getInventoryItems&lt;/strong&gt; calls if a condition description was provided for a used inventory item.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 1000.
   * @return conditionDescription
  **/
  


  public String getConditionDescription() {
    return conditionDescription;
  }


  public void setConditionDescription(String conditionDescription) {
    this.conditionDescription = conditionDescription;
  }


  public InventoryItemWithSkuLocale locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * This field is for future use only. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:LocaleEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return locale
  **/
  


  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public InventoryItemWithSkuLocale packageWeightAndSize(PackageWeightAndSize packageWeightAndSize) {
    
    this.packageWeightAndSize = packageWeightAndSize;
    return this;
  }

   /**
   * Get packageWeightAndSize
   * @return packageWeightAndSize
  **/
  


  public PackageWeightAndSize getPackageWeightAndSize() {
    return packageWeightAndSize;
  }


  public void setPackageWeightAndSize(PackageWeightAndSize packageWeightAndSize) {
    this.packageWeightAndSize = packageWeightAndSize;
  }


  public InventoryItemWithSkuLocale product(Product product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  


  public Product getProduct() {
    return product;
  }


  public void setProduct(Product product) {
    this.product = product;
  }


  public InventoryItemWithSkuLocale sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * This is the seller-defined SKU value of the product that will be listed on the eBay site (specified in the &lt;strong&gt;marketplaceId&lt;/strong&gt; field). Only one offer (in unpublished or published state) may exist for each &lt;strong&gt;sku&lt;/strong&gt;/&lt;strong&gt;marketplaceId&lt;/strong&gt;/&lt;strong&gt;format&lt;/strong&gt; combination. This field is required.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br/&gt;
   * @return sku
  **/
  


  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItemWithSkuLocale inventoryItemWithSkuLocale = (InventoryItemWithSkuLocale) o;
    return Objects.equals(this.availability, inventoryItemWithSkuLocale.availability) &&
        Objects.equals(this.condition, inventoryItemWithSkuLocale.condition) &&
        Objects.equals(this.conditionDescription, inventoryItemWithSkuLocale.conditionDescription) &&
        Objects.equals(this.locale, inventoryItemWithSkuLocale.locale) &&
        Objects.equals(this.packageWeightAndSize, inventoryItemWithSkuLocale.packageWeightAndSize) &&
        Objects.equals(this.product, inventoryItemWithSkuLocale.product) &&
        Objects.equals(this.sku, inventoryItemWithSkuLocale.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, condition, conditionDescription, locale, packageWeightAndSize, product, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItemWithSkuLocale {\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    packageWeightAndSize: ").append(toIndentedString(packageWeightAndSize)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

