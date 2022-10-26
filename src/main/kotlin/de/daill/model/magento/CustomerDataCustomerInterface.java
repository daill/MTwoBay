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
 * Customer entity interface for API handling.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CustomerDataCustomerInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_DEFAULT_BILLING = "default_billing";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BILLING)
  private String defaultBilling;

  public static final String SERIALIZED_NAME_DEFAULT_SHIPPING = "default_shipping";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SHIPPING)
  private String defaultShipping;

  public static final String SERIALIZED_NAME_CONFIRMATION = "confirmation";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION)
  private String confirmation;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_CREATED_IN = "created_in";
  @SerializedName(SERIALIZED_NAME_CREATED_IN)
  private String createdIn;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_MIDDLENAME = "middlename";
  @SerializedName(SERIALIZED_NAME_MIDDLENAME)
  private String middlename;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Integer gender;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Integer storeId;

  public static final String SERIALIZED_NAME_TAXVAT = "taxvat";
  @SerializedName(SERIALIZED_NAME_TAXVAT)
  private String taxvat;

  public static final String SERIALIZED_NAME_WEBSITE_ID = "website_id";
  @SerializedName(SERIALIZED_NAME_WEBSITE_ID)
  private Integer websiteId;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<CustomerDataAddressInterface> addresses = null;

  public static final String SERIALIZED_NAME_DISABLE_AUTO_GROUP_CHANGE = "disable_auto_group_change";
  @SerializedName(SERIALIZED_NAME_DISABLE_AUTO_GROUP_CHANGE)
  private Integer disableAutoGroupChange;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private CustomerDataCustomerExtensionInterface extensionAttributes;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<FrameworkAttributeInterface> customAttributes = null;


  public CustomerDataCustomerInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Customer id
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CustomerDataCustomerInterface groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Group id
   * @return groupId
  **/



  public Integer getGroupId() {
    return groupId;
  }


  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public CustomerDataCustomerInterface defaultBilling(String defaultBilling) {
    
    this.defaultBilling = defaultBilling;
    return this;
  }

   /**
   * Default billing address id
   * @return defaultBilling
  **/



  public String getDefaultBilling() {
    return defaultBilling;
  }


  public void setDefaultBilling(String defaultBilling) {
    this.defaultBilling = defaultBilling;
  }


  public CustomerDataCustomerInterface defaultShipping(String defaultShipping) {
    
    this.defaultShipping = defaultShipping;
    return this;
  }

   /**
   * Default shipping address id
   * @return defaultShipping
  **/



  public String getDefaultShipping() {
    return defaultShipping;
  }


  public void setDefaultShipping(String defaultShipping) {
    this.defaultShipping = defaultShipping;
  }


  public CustomerDataCustomerInterface confirmation(String confirmation) {
    
    this.confirmation = confirmation;
    return this;
  }

   /**
   * Confirmation
   * @return confirmation
  **/



  public String getConfirmation() {
    return confirmation;
  }


  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }


  public CustomerDataCustomerInterface createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created at time
   * @return createdAt
  **/



  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerDataCustomerInterface updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Updated at time
   * @return updatedAt
  **/



  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CustomerDataCustomerInterface createdIn(String createdIn) {
    
    this.createdIn = createdIn;
    return this;
  }

   /**
   * Created in area
   * @return createdIn
  **/



  public String getCreatedIn() {
    return createdIn;
  }


  public void setCreatedIn(String createdIn) {
    this.createdIn = createdIn;
  }


  public CustomerDataCustomerInterface dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * In keeping with current security and privacy best practices, be sure you are aware of any potential legal and security risks associated with the storage of customers’ full date of birth (month, day, year) along with other personal identifiers (e.g., full name) before collecting or processing such data.
   * @return dob
  **/



  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public CustomerDataCustomerInterface email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerDataCustomerInterface firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * First name
   * @return firstname
  **/


  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public CustomerDataCustomerInterface lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Last name
   * @return lastname
  **/


  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public CustomerDataCustomerInterface middlename(String middlename) {
    
    this.middlename = middlename;
    return this;
  }

   /**
   * Middle name
   * @return middlename
  **/



  public String getMiddlename() {
    return middlename;
  }


  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }


  public CustomerDataCustomerInterface prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix
   * @return prefix
  **/



  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public CustomerDataCustomerInterface suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix
   * @return suffix
  **/



  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public CustomerDataCustomerInterface gender(Integer gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Gender
   * @return gender
  **/



  public Integer getGender() {
    return gender;
  }


  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public CustomerDataCustomerInterface storeId(Integer storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Store id
   * @return storeId
  **/



  public Integer getStoreId() {
    return storeId;
  }


  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public CustomerDataCustomerInterface taxvat(String taxvat) {
    
    this.taxvat = taxvat;
    return this;
  }

   /**
   * Tax Vat
   * @return taxvat
  **/



  public String getTaxvat() {
    return taxvat;
  }


  public void setTaxvat(String taxvat) {
    this.taxvat = taxvat;
  }


  public CustomerDataCustomerInterface websiteId(Integer websiteId) {
    
    this.websiteId = websiteId;
    return this;
  }

   /**
   * Website id
   * @return websiteId
  **/



  public Integer getWebsiteId() {
    return websiteId;
  }


  public void setWebsiteId(Integer websiteId) {
    this.websiteId = websiteId;
  }


  public CustomerDataCustomerInterface addresses(List<CustomerDataAddressInterface> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CustomerDataCustomerInterface addAddressesItem(CustomerDataAddressInterface addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<CustomerDataAddressInterface>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Customer addresses.
   * @return addresses
  **/



  public List<CustomerDataAddressInterface> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<CustomerDataAddressInterface> addresses) {
    this.addresses = addresses;
  }


  public CustomerDataCustomerInterface disableAutoGroupChange(Integer disableAutoGroupChange) {
    
    this.disableAutoGroupChange = disableAutoGroupChange;
    return this;
  }

   /**
   * Disable auto group change flag.
   * @return disableAutoGroupChange
  **/



  public Integer getDisableAutoGroupChange() {
    return disableAutoGroupChange;
  }


  public void setDisableAutoGroupChange(Integer disableAutoGroupChange) {
    this.disableAutoGroupChange = disableAutoGroupChange;
  }


  public CustomerDataCustomerInterface extensionAttributes(CustomerDataCustomerExtensionInterface extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * Get extensionAttributes
   * @return extensionAttributes
  **/



  public CustomerDataCustomerExtensionInterface getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(CustomerDataCustomerExtensionInterface extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public CustomerDataCustomerInterface customAttributes(List<FrameworkAttributeInterface> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public CustomerDataCustomerInterface addCustomAttributesItem(FrameworkAttributeInterface customAttributesItem) {
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
    CustomerDataCustomerInterface customerDataCustomerInterface = (CustomerDataCustomerInterface) o;
    return Objects.equals(this.id, customerDataCustomerInterface.id) &&
        Objects.equals(this.groupId, customerDataCustomerInterface.groupId) &&
        Objects.equals(this.defaultBilling, customerDataCustomerInterface.defaultBilling) &&
        Objects.equals(this.defaultShipping, customerDataCustomerInterface.defaultShipping) &&
        Objects.equals(this.confirmation, customerDataCustomerInterface.confirmation) &&
        Objects.equals(this.createdAt, customerDataCustomerInterface.createdAt) &&
        Objects.equals(this.updatedAt, customerDataCustomerInterface.updatedAt) &&
        Objects.equals(this.createdIn, customerDataCustomerInterface.createdIn) &&
        Objects.equals(this.dob, customerDataCustomerInterface.dob) &&
        Objects.equals(this.email, customerDataCustomerInterface.email) &&
        Objects.equals(this.firstname, customerDataCustomerInterface.firstname) &&
        Objects.equals(this.lastname, customerDataCustomerInterface.lastname) &&
        Objects.equals(this.middlename, customerDataCustomerInterface.middlename) &&
        Objects.equals(this.prefix, customerDataCustomerInterface.prefix) &&
        Objects.equals(this.suffix, customerDataCustomerInterface.suffix) &&
        Objects.equals(this.gender, customerDataCustomerInterface.gender) &&
        Objects.equals(this.storeId, customerDataCustomerInterface.storeId) &&
        Objects.equals(this.taxvat, customerDataCustomerInterface.taxvat) &&
        Objects.equals(this.websiteId, customerDataCustomerInterface.websiteId) &&
        Objects.equals(this.addresses, customerDataCustomerInterface.addresses) &&
        Objects.equals(this.disableAutoGroupChange, customerDataCustomerInterface.disableAutoGroupChange) &&
        Objects.equals(this.extensionAttributes, customerDataCustomerInterface.extensionAttributes) &&
        Objects.equals(this.customAttributes, customerDataCustomerInterface.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, defaultBilling, defaultShipping, confirmation, createdAt, updatedAt, createdIn, dob, email, firstname, lastname, middlename, prefix, suffix, gender, storeId, taxvat, websiteId, addresses, disableAutoGroupChange, extensionAttributes, customAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDataCustomerInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    defaultBilling: ").append(toIndentedString(defaultBilling)).append("\n");
    sb.append("    defaultShipping: ").append(toIndentedString(defaultShipping)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdIn: ").append(toIndentedString(createdIn)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    taxvat: ").append(toIndentedString(taxvat)).append("\n");
    sb.append("    websiteId: ").append(toIndentedString(websiteId)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    disableAutoGroupChange: ").append(toIndentedString(disableAutoGroupChange)).append("\n");
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
