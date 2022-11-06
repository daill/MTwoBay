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
 * ExtensionInterface class for @see \\Magento\\Customer\\Api\\Data\\CustomerInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CustomerDataCustomerExtensionInterface {
  public static final String SERIALIZED_NAME_COMPANY_ATTRIBUTES = "company_attributes";
  @SerializedName(SERIALIZED_NAME_COMPANY_ATTRIBUTES)
  private CompanyDataCompanyCustomerInterface companyAttributes;

  public static final String SERIALIZED_NAME_ASSISTANCE_ALLOWED = "assistance_allowed";
  @SerializedName(SERIALIZED_NAME_ASSISTANCE_ALLOWED)
  private Integer assistanceAllowed;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED = "is_subscribed";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED)
  private Boolean isSubscribed;


  public CustomerDataCustomerExtensionInterface companyAttributes(CompanyDataCompanyCustomerInterface companyAttributes) {
    
    this.companyAttributes = companyAttributes;
    return this;
  }

   /**
   * Get companyAttributes
   * @return companyAttributes
  **/
  


  public CompanyDataCompanyCustomerInterface getCompanyAttributes() {
    return companyAttributes;
  }


  public void setCompanyAttributes(CompanyDataCompanyCustomerInterface companyAttributes) {
    this.companyAttributes = companyAttributes;
  }


  public CustomerDataCustomerExtensionInterface assistanceAllowed(Integer assistanceAllowed) {
    
    this.assistanceAllowed = assistanceAllowed;
    return this;
  }

   /**
   * Get assistanceAllowed
   * @return assistanceAllowed
  **/
  


  public Integer getAssistanceAllowed() {
    return assistanceAllowed;
  }


  public void setAssistanceAllowed(Integer assistanceAllowed) {
    this.assistanceAllowed = assistanceAllowed;
  }


  public CustomerDataCustomerExtensionInterface isSubscribed(Boolean isSubscribed) {
    
    this.isSubscribed = isSubscribed;
    return this;
  }

   /**
   * Get isSubscribed
   * @return isSubscribed
  **/
  


  public Boolean getIsSubscribed() {
    return isSubscribed;
  }


  public void setIsSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDataCustomerExtensionInterface customerDataCustomerExtensionInterface = (CustomerDataCustomerExtensionInterface) o;
    return Objects.equals(this.companyAttributes, customerDataCustomerExtensionInterface.companyAttributes) &&
        Objects.equals(this.assistanceAllowed, customerDataCustomerExtensionInterface.assistanceAllowed) &&
        Objects.equals(this.isSubscribed, customerDataCustomerExtensionInterface.isSubscribed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAttributes, assistanceAllowed, isSubscribed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDataCustomerExtensionInterface {\n");
    sb.append("    companyAttributes: ").append(toIndentedString(companyAttributes)).append("\n");
    sb.append("    assistanceAllowed: ").append(toIndentedString(assistanceAllowed)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
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

