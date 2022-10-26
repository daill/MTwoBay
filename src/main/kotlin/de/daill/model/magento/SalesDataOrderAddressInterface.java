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
 * Order address interface. An order is a document that a web store issues to a customer. Magento generates a sales order that lists the product items, billing and shipping addresses, and shipping and payment methods. A corresponding external document, known as a purchase order, is emailed to the customer.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataOrderAddressInterface {
  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "address_type";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "country_id";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_CUSTOMER_ADDRESS_ID = "customer_address_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ADDRESS_ID)
  private Integer customerAddressId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Integer customerId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private Integer entityId;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_MIDDLENAME = "middlename";
  @SerializedName(SERIALIZED_NAME_MIDDLENAME)
  private String middlename;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGION_CODE = "region_code";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_REGION_ID = "region_id";
  @SerializedName(SERIALIZED_NAME_REGION_ID)
  private Integer regionId;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private List<String> street = null;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_VAT_ID = "vat_id";
  @SerializedName(SERIALIZED_NAME_VAT_ID)
  private String vatId;

  public static final String SERIALIZED_NAME_VAT_IS_VALID = "vat_is_valid";
  @SerializedName(SERIALIZED_NAME_VAT_IS_VALID)
  private Integer vatIsValid;

  public static final String SERIALIZED_NAME_VAT_REQUEST_DATE = "vat_request_date";
  @SerializedName(SERIALIZED_NAME_VAT_REQUEST_DATE)
  private String vatRequestDate;

  public static final String SERIALIZED_NAME_VAT_REQUEST_ID = "vat_request_id";
  @SerializedName(SERIALIZED_NAME_VAT_REQUEST_ID)
  private String vatRequestId;

  public static final String SERIALIZED_NAME_VAT_REQUEST_SUCCESS = "vat_request_success";
  @SerializedName(SERIALIZED_NAME_VAT_REQUEST_SUCCESS)
  private Integer vatRequestSuccess;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public SalesDataOrderAddressInterface addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Address type.
   * @return addressType
  **/
  

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public SalesDataOrderAddressInterface city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public SalesDataOrderAddressInterface company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Company.
   * @return company
  **/
  
  

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public SalesDataOrderAddressInterface countryId(String countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Country ID.
   * @return countryId
  **/
  

  public String getCountryId() {
    return countryId;
  }


  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public SalesDataOrderAddressInterface customerAddressId(Integer customerAddressId) {
    
    this.customerAddressId = customerAddressId;
    return this;
  }

   /**
   * Country address ID.
   * @return customerAddressId
  **/
  
  

  public Integer getCustomerAddressId() {
    return customerAddressId;
  }


  public void setCustomerAddressId(Integer customerAddressId) {
    this.customerAddressId = customerAddressId;
  }


  public SalesDataOrderAddressInterface customerId(Integer customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer ID.
   * @return customerId
  **/
  
  

  public Integer getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public SalesDataOrderAddressInterface email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address.
   * @return email
  **/
  
  

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SalesDataOrderAddressInterface entityId(Integer entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Order address ID.
   * @return entityId
  **/
  
  

  public Integer getEntityId() {
    return entityId;
  }


  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }


  public SalesDataOrderAddressInterface fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Fax number.
   * @return fax
  **/
  
  

  public String getFax() {
    return fax;
  }


  public void setFax(String fax) {
    this.fax = fax;
  }


  public SalesDataOrderAddressInterface firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * First name.
   * @return firstname
  **/
  

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public SalesDataOrderAddressInterface lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Last name.
   * @return lastname
  **/
  

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public SalesDataOrderAddressInterface middlename(String middlename) {
    
    this.middlename = middlename;
    return this;
  }

   /**
   * Middle name.
   * @return middlename
  **/
  
  

  public String getMiddlename() {
    return middlename;
  }


  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }


  public SalesDataOrderAddressInterface parentId(Integer parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent ID.
   * @return parentId
  **/
  
  

  public Integer getParentId() {
    return parentId;
  }


  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public SalesDataOrderAddressInterface postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Postal code.
   * @return postcode
  **/
  

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public SalesDataOrderAddressInterface prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix.
   * @return prefix
  **/
  
  

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public SalesDataOrderAddressInterface region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region.
   * @return region
  **/
  
  

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public SalesDataOrderAddressInterface regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Region code.
   * @return regionCode
  **/
  
  

  public String getRegionCode() {
    return regionCode;
  }


  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public SalesDataOrderAddressInterface regionId(Integer regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * Region ID.
   * @return regionId
  **/
  
  

  public Integer getRegionId() {
    return regionId;
  }


  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public SalesDataOrderAddressInterface street(List<String> street) {
    
    this.street = street;
    return this;
  }

  public SalesDataOrderAddressInterface addStreetItem(String streetItem) {
    if (this.street == null) {
      this.street = new ArrayList<String>();
    }
    this.street.add(streetItem);
    return this;
  }

   /**
   * Array of any street values. Otherwise, null.
   * @return street
  **/
  
  

  public List<String> getStreet() {
    return street;
  }


  public void setStreet(List<String> street) {
    this.street = street;
  }


  public SalesDataOrderAddressInterface suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix.
   * @return suffix
  **/
  
  

  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public SalesDataOrderAddressInterface telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * Telephone number.
   * @return telephone
  **/
  

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public SalesDataOrderAddressInterface vatId(String vatId) {
    
    this.vatId = vatId;
    return this;
  }

   /**
   * VAT ID.
   * @return vatId
  **/
  
  

  public String getVatId() {
    return vatId;
  }


  public void setVatId(String vatId) {
    this.vatId = vatId;
  }


  public SalesDataOrderAddressInterface vatIsValid(Integer vatIsValid) {
    
    this.vatIsValid = vatIsValid;
    return this;
  }

   /**
   * VAT-is-valid flag value.
   * @return vatIsValid
  **/
  
  

  public Integer getVatIsValid() {
    return vatIsValid;
  }


  public void setVatIsValid(Integer vatIsValid) {
    this.vatIsValid = vatIsValid;
  }


  public SalesDataOrderAddressInterface vatRequestDate(String vatRequestDate) {
    
    this.vatRequestDate = vatRequestDate;
    return this;
  }

   /**
   * VAT request date.
   * @return vatRequestDate
  **/
  
  

  public String getVatRequestDate() {
    return vatRequestDate;
  }


  public void setVatRequestDate(String vatRequestDate) {
    this.vatRequestDate = vatRequestDate;
  }


  public SalesDataOrderAddressInterface vatRequestId(String vatRequestId) {
    
    this.vatRequestId = vatRequestId;
    return this;
  }

   /**
   * VAT request ID.
   * @return vatRequestId
  **/
  
  

  public String getVatRequestId() {
    return vatRequestId;
  }


  public void setVatRequestId(String vatRequestId) {
    this.vatRequestId = vatRequestId;
  }


  public SalesDataOrderAddressInterface vatRequestSuccess(Integer vatRequestSuccess) {
    
    this.vatRequestSuccess = vatRequestSuccess;
    return this;
  }

   /**
   * VAT-request-success flag value.
   * @return vatRequestSuccess
  **/
  
  

  public Integer getVatRequestSuccess() {
    return vatRequestSuccess;
  }


  public void setVatRequestSuccess(Integer vatRequestSuccess) {
    this.vatRequestSuccess = vatRequestSuccess;
  }


  public SalesDataOrderAddressInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\OrderAddressInterface
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
    SalesDataOrderAddressInterface salesDataOrderAddressInterface = (SalesDataOrderAddressInterface) o;
    return Objects.equals(this.addressType, salesDataOrderAddressInterface.addressType) &&
        Objects.equals(this.city, salesDataOrderAddressInterface.city) &&
        Objects.equals(this.company, salesDataOrderAddressInterface.company) &&
        Objects.equals(this.countryId, salesDataOrderAddressInterface.countryId) &&
        Objects.equals(this.customerAddressId, salesDataOrderAddressInterface.customerAddressId) &&
        Objects.equals(this.customerId, salesDataOrderAddressInterface.customerId) &&
        Objects.equals(this.email, salesDataOrderAddressInterface.email) &&
        Objects.equals(this.entityId, salesDataOrderAddressInterface.entityId) &&
        Objects.equals(this.fax, salesDataOrderAddressInterface.fax) &&
        Objects.equals(this.firstname, salesDataOrderAddressInterface.firstname) &&
        Objects.equals(this.lastname, salesDataOrderAddressInterface.lastname) &&
        Objects.equals(this.middlename, salesDataOrderAddressInterface.middlename) &&
        Objects.equals(this.parentId, salesDataOrderAddressInterface.parentId) &&
        Objects.equals(this.postcode, salesDataOrderAddressInterface.postcode) &&
        Objects.equals(this.prefix, salesDataOrderAddressInterface.prefix) &&
        Objects.equals(this.region, salesDataOrderAddressInterface.region) &&
        Objects.equals(this.regionCode, salesDataOrderAddressInterface.regionCode) &&
        Objects.equals(this.regionId, salesDataOrderAddressInterface.regionId) &&
        Objects.equals(this.street, salesDataOrderAddressInterface.street) &&
        Objects.equals(this.suffix, salesDataOrderAddressInterface.suffix) &&
        Objects.equals(this.telephone, salesDataOrderAddressInterface.telephone) &&
        Objects.equals(this.vatId, salesDataOrderAddressInterface.vatId) &&
        Objects.equals(this.vatIsValid, salesDataOrderAddressInterface.vatIsValid) &&
        Objects.equals(this.vatRequestDate, salesDataOrderAddressInterface.vatRequestDate) &&
        Objects.equals(this.vatRequestId, salesDataOrderAddressInterface.vatRequestId) &&
        Objects.equals(this.vatRequestSuccess, salesDataOrderAddressInterface.vatRequestSuccess) &&
        Objects.equals(this.extensionAttributes, salesDataOrderAddressInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, city, company, countryId, customerAddressId, customerId, email, entityId, fax, firstname, lastname, middlename, parentId, postcode, prefix, region, regionCode, regionId, street, suffix, telephone, vatId, vatIsValid, vatRequestDate, vatRequestId, vatRequestSuccess, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataOrderAddressInterface {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    customerAddressId: ").append(toIndentedString(customerAddressId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    vatIsValid: ").append(toIndentedString(vatIsValid)).append("\n");
    sb.append("    vatRequestDate: ").append(toIndentedString(vatRequestDate)).append("\n");
    sb.append("    vatRequestId: ").append(toIndentedString(vatRequestId)).append("\n");
    sb.append("    vatRequestSuccess: ").append(toIndentedString(vatRequestSuccess)).append("\n");
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
