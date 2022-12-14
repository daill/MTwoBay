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
 * Interface CompanyQuoteConfigInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class NegotiableQuoteDataCompanyQuoteConfigInterface {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @Json(name = SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_IS_QUOTE_ENABLED = "is_quote_enabled";
  @Json(name = SERIALIZED_NAME_IS_QUOTE_ENABLED)
  private Boolean isQuoteEnabled;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public NegotiableQuoteDataCompanyQuoteConfigInterface companyId(String companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company id
   * @return companyId
  **/

  

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public NegotiableQuoteDataCompanyQuoteConfigInterface isQuoteEnabled(Boolean isQuoteEnabled) {
    
    this.isQuoteEnabled = isQuoteEnabled;
    return this;
  }

   /**
   * Quote enabled for company
   * @return isQuoteEnabled
  **/


  public Boolean getIsQuoteEnabled() {
    return isQuoteEnabled;
  }


  public void setIsQuoteEnabled(Boolean isQuoteEnabled) {
    this.isQuoteEnabled = isQuoteEnabled;
  }


  public NegotiableQuoteDataCompanyQuoteConfigInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\NegotiableQuote\\Api\\Data\\CompanyQuoteConfigInterface
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
    NegotiableQuoteDataCompanyQuoteConfigInterface negotiableQuoteDataCompanyQuoteConfigInterface = (NegotiableQuoteDataCompanyQuoteConfigInterface) o;
    return Objects.equals(this.companyId, negotiableQuoteDataCompanyQuoteConfigInterface.companyId) &&
        Objects.equals(this.isQuoteEnabled, negotiableQuoteDataCompanyQuoteConfigInterface.isQuoteEnabled) &&
        Objects.equals(this.extensionAttributes, negotiableQuoteDataCompanyQuoteConfigInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, isQuoteEnabled, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiableQuoteDataCompanyQuoteConfigInterface {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    isQuoteEnabled: ").append(toIndentedString(isQuoteEnabled)).append("\n");
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

