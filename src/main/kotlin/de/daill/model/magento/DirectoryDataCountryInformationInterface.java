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
 * Country Information interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class DirectoryDataCountryInformationInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TWO_LETTER_ABBREVIATION = "two_letter_abbreviation";
  @SerializedName(SERIALIZED_NAME_TWO_LETTER_ABBREVIATION)
  private String twoLetterAbbreviation;

  public static final String SERIALIZED_NAME_THREE_LETTER_ABBREVIATION = "three_letter_abbreviation";
  @SerializedName(SERIALIZED_NAME_THREE_LETTER_ABBREVIATION)
  private String threeLetterAbbreviation;

  public static final String SERIALIZED_NAME_FULL_NAME_LOCALE = "full_name_locale";
  @SerializedName(SERIALIZED_NAME_FULL_NAME_LOCALE)
  private String fullNameLocale;

  public static final String SERIALIZED_NAME_FULL_NAME_ENGLISH = "full_name_english";
  @SerializedName(SERIALIZED_NAME_FULL_NAME_ENGLISH)
  private String fullNameEnglish;

  public static final String SERIALIZED_NAME_AVAILABLE_REGIONS = "available_regions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REGIONS)
  private List<DirectoryDataRegionInformationInterface> availableRegions = null;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public DirectoryDataCountryInformationInterface id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The country id for the store.
   * @return id
  **/


  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DirectoryDataCountryInformationInterface twoLetterAbbreviation(String twoLetterAbbreviation) {
    
    this.twoLetterAbbreviation = twoLetterAbbreviation;
    return this;
  }

   /**
   * The country 2 letter abbreviation for the store.
   * @return twoLetterAbbreviation
  **/


  public String getTwoLetterAbbreviation() {
    return twoLetterAbbreviation;
  }


  public void setTwoLetterAbbreviation(String twoLetterAbbreviation) {
    this.twoLetterAbbreviation = twoLetterAbbreviation;
  }


  public DirectoryDataCountryInformationInterface threeLetterAbbreviation(String threeLetterAbbreviation) {
    
    this.threeLetterAbbreviation = threeLetterAbbreviation;
    return this;
  }

   /**
   * The country 3 letter abbreviation for the store.
   * @return threeLetterAbbreviation
  **/


  public String getThreeLetterAbbreviation() {
    return threeLetterAbbreviation;
  }


  public void setThreeLetterAbbreviation(String threeLetterAbbreviation) {
    this.threeLetterAbbreviation = threeLetterAbbreviation;
  }


  public DirectoryDataCountryInformationInterface fullNameLocale(String fullNameLocale) {
    
    this.fullNameLocale = fullNameLocale;
    return this;
  }

   /**
   * The country full name (in store locale) for the store.
   * @return fullNameLocale
  **/


  public String getFullNameLocale() {
    return fullNameLocale;
  }


  public void setFullNameLocale(String fullNameLocale) {
    this.fullNameLocale = fullNameLocale;
  }


  public DirectoryDataCountryInformationInterface fullNameEnglish(String fullNameEnglish) {
    
    this.fullNameEnglish = fullNameEnglish;
    return this;
  }

   /**
   * The country full name (in English) for the store.
   * @return fullNameEnglish
  **/


  public String getFullNameEnglish() {
    return fullNameEnglish;
  }


  public void setFullNameEnglish(String fullNameEnglish) {
    this.fullNameEnglish = fullNameEnglish;
  }


  public DirectoryDataCountryInformationInterface availableRegions(List<DirectoryDataRegionInformationInterface> availableRegions) {
    
    this.availableRegions = availableRegions;
    return this;
  }

  public DirectoryDataCountryInformationInterface addAvailableRegionsItem(DirectoryDataRegionInformationInterface availableRegionsItem) {
    if (this.availableRegions == null) {
      this.availableRegions = new ArrayList<DirectoryDataRegionInformationInterface>();
    }
    this.availableRegions.add(availableRegionsItem);
    return this;
  }

   /**
   * The available regions for the store.
   * @return availableRegions
  **/



  public List<DirectoryDataRegionInformationInterface> getAvailableRegions() {
    return availableRegions;
  }


  public void setAvailableRegions(List<DirectoryDataRegionInformationInterface> availableRegions) {
    this.availableRegions = availableRegions;
  }


  public DirectoryDataCountryInformationInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Directory\\Api\\Data\\CountryInformationInterface
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
    DirectoryDataCountryInformationInterface directoryDataCountryInformationInterface = (DirectoryDataCountryInformationInterface) o;
    return Objects.equals(this.id, directoryDataCountryInformationInterface.id) &&
        Objects.equals(this.twoLetterAbbreviation, directoryDataCountryInformationInterface.twoLetterAbbreviation) &&
        Objects.equals(this.threeLetterAbbreviation, directoryDataCountryInformationInterface.threeLetterAbbreviation) &&
        Objects.equals(this.fullNameLocale, directoryDataCountryInformationInterface.fullNameLocale) &&
        Objects.equals(this.fullNameEnglish, directoryDataCountryInformationInterface.fullNameEnglish) &&
        Objects.equals(this.availableRegions, directoryDataCountryInformationInterface.availableRegions) &&
        Objects.equals(this.extensionAttributes, directoryDataCountryInformationInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, twoLetterAbbreviation, threeLetterAbbreviation, fullNameLocale, fullNameEnglish, availableRegions, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryDataCountryInformationInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    twoLetterAbbreviation: ").append(toIndentedString(twoLetterAbbreviation)).append("\n");
    sb.append("    threeLetterAbbreviation: ").append(toIndentedString(threeLetterAbbreviation)).append("\n");
    sb.append("    fullNameLocale: ").append(toIndentedString(fullNameLocale)).append("\n");
    sb.append("    fullNameEnglish: ").append(toIndentedString(fullNameEnglish)).append("\n");
    sb.append("    availableRegions: ").append(toIndentedString(availableRegions)).append("\n");
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
