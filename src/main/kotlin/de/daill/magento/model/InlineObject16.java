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
 * InlineObject16
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject16 {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_WEBSITE_ID = "websiteId";
  @SerializedName(SERIALIZED_NAME_WEBSITE_ID)
  private Integer websiteId;


  public InlineObject16 email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InlineObject16 template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/


  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public InlineObject16 websiteId(Integer websiteId) {
    
    this.websiteId = websiteId;
    return this;
  }

   /**
   * Get websiteId
   * @return websiteId
  **/



  public Integer getWebsiteId() {
    return websiteId;
  }


  public void setWebsiteId(Integer websiteId) {
    this.websiteId = websiteId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject16 inlineObject16 = (InlineObject16) o;
    return Objects.equals(this.email, inlineObject16.email) &&
        Objects.equals(this.template, inlineObject16.template) &&
        Objects.equals(this.websiteId, inlineObject16.websiteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, template, websiteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject16 {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    websiteId: ").append(toIndentedString(websiteId)).append("\n");
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

