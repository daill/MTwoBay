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
 * InlineObject17
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject17 {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_RESET_TOKEN = "resetToken";
  @SerializedName(SERIALIZED_NAME_RESET_TOKEN)
  private String resetToken;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;


  public InlineObject17 email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * If empty value given then the customer will be matched by the RP token.
   * @return email
  **/


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InlineObject17 resetToken(String resetToken) {
    
    this.resetToken = resetToken;
    return this;
  }

   /**
   * Get resetToken
   * @return resetToken
  **/


  public String getResetToken() {
    return resetToken;
  }


  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }


  public InlineObject17 newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/


  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject17 inlineObject17 = (InlineObject17) o;
    return Objects.equals(this.email, inlineObject17.email) &&
        Objects.equals(this.resetToken, inlineObject17.resetToken) &&
        Objects.equals(this.newPassword, inlineObject17.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, resetToken, newPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject17 {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

