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
 * Attachment files content interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class NegotiableQuoteDataAttachmentContentInterface {
  public static final String SERIALIZED_NAME_BASE64_ENCODED_DATA = "base64_encoded_data";
  @SerializedName(SERIALIZED_NAME_BASE64_ENCODED_DATA)
  private String base64EncodedData;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public NegotiableQuoteDataAttachmentContentInterface base64EncodedData(String base64EncodedData) {
    
    this.base64EncodedData = base64EncodedData;
    return this;
  }

   /**
   * Media data (base64 encoded content).
   * @return base64EncodedData
  **/
  

  public String getBase64EncodedData() {
    return base64EncodedData;
  }


  public void setBase64EncodedData(String base64EncodedData) {
    this.base64EncodedData = base64EncodedData;
  }


  public NegotiableQuoteDataAttachmentContentInterface type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * MIME type.
   * @return type
  **/
  

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public NegotiableQuoteDataAttachmentContentInterface name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * File name.
   * @return name
  **/
  

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NegotiableQuoteDataAttachmentContentInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\NegotiableQuote\\Api\\Data\\AttachmentContentInterface
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
    NegotiableQuoteDataAttachmentContentInterface negotiableQuoteDataAttachmentContentInterface = (NegotiableQuoteDataAttachmentContentInterface) o;
    return Objects.equals(this.base64EncodedData, negotiableQuoteDataAttachmentContentInterface.base64EncodedData) &&
        Objects.equals(this.type, negotiableQuoteDataAttachmentContentInterface.type) &&
        Objects.equals(this.name, negotiableQuoteDataAttachmentContentInterface.name) &&
        Objects.equals(this.extensionAttributes, negotiableQuoteDataAttachmentContentInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64EncodedData, type, name, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiableQuoteDataAttachmentContentInterface {\n");
    sb.append("    base64EncodedData: ").append(toIndentedString(base64EncodedData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

