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


import java.util.ArrayList;
import java.util.List;

/**
 * Validation results interface.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class CustomerDataValidationResultsInterface {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = new ArrayList<String>();


  public CustomerDataValidationResultsInterface valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * If the provided data is valid.
   * @return valid
  **/


  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public CustomerDataValidationResultsInterface messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public CustomerDataValidationResultsInterface addMessagesItem(String messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Error messages as array in case of validation failure, else return empty array.
   * @return messages
  **/


  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDataValidationResultsInterface customerDataValidationResultsInterface = (CustomerDataValidationResultsInterface) o;
    return Objects.equals(this.valid, customerDataValidationResultsInterface.valid) &&
        Objects.equals(this.messages, customerDataValidationResultsInterface.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDataValidationResultsInterface {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

