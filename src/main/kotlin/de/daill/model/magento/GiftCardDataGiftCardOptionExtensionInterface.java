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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ExtensionInterface class for @see \\Magento\\GiftCard\\Api\\Data\\GiftCardOptionInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class GiftCardDataGiftCardOptionExtensionInterface {
  public static final String SERIALIZED_NAME_GIFTCARD_CREATED_CODES = "giftcard_created_codes";
  @SerializedName(SERIALIZED_NAME_GIFTCARD_CREATED_CODES)
  private List<String> giftcardCreatedCodes = null;


  public GiftCardDataGiftCardOptionExtensionInterface giftcardCreatedCodes(List<String> giftcardCreatedCodes) {
    
    this.giftcardCreatedCodes = giftcardCreatedCodes;
    return this;
  }

  public GiftCardDataGiftCardOptionExtensionInterface addGiftcardCreatedCodesItem(String giftcardCreatedCodesItem) {
    if (this.giftcardCreatedCodes == null) {
      this.giftcardCreatedCodes = new ArrayList<String>();
    }
    this.giftcardCreatedCodes.add(giftcardCreatedCodesItem);
    return this;
  }

   /**
   * Get giftcardCreatedCodes
   * @return giftcardCreatedCodes
  **/



  public List<String> getGiftcardCreatedCodes() {
    return giftcardCreatedCodes;
  }


  public void setGiftcardCreatedCodes(List<String> giftcardCreatedCodes) {
    this.giftcardCreatedCodes = giftcardCreatedCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCardDataGiftCardOptionExtensionInterface giftCardDataGiftCardOptionExtensionInterface = (GiftCardDataGiftCardOptionExtensionInterface) o;
    return Objects.equals(this.giftcardCreatedCodes, giftCardDataGiftCardOptionExtensionInterface.giftcardCreatedCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftcardCreatedCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCardDataGiftCardOptionExtensionInterface {\n");
    sb.append("    giftcardCreatedCodes: ").append(toIndentedString(giftcardCreatedCodes)).append("\n");
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

