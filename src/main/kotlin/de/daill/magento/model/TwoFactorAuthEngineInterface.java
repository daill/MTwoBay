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
 * 2FA engine interface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class TwoFactorAuthEngineInterface {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;


  public TwoFactorAuthEngineInterface enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * True if this provider has been enabled by admin
   * @return enabled
  **/


  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoFactorAuthEngineInterface twoFactorAuthEngineInterface = (TwoFactorAuthEngineInterface) o;
    return Objects.equals(this.enabled, twoFactorAuthEngineInterface.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoFactorAuthEngineInterface {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

