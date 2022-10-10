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
 * ExtensionInterface class for @see \\Magento\\SalesRule\\Api\\Data\\RuleInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesRuleDataRuleExtensionInterface {
  public static final String SERIALIZED_NAME_REWARD_POINTS_DELTA = "reward_points_delta";
  @SerializedName(SERIALIZED_NAME_REWARD_POINTS_DELTA)
  private Integer rewardPointsDelta;


  public SalesRuleDataRuleExtensionInterface rewardPointsDelta(Integer rewardPointsDelta) {
    
    this.rewardPointsDelta = rewardPointsDelta;
    return this;
  }

   /**
   * Get rewardPointsDelta
   * @return rewardPointsDelta
  **/



  public Integer getRewardPointsDelta() {
    return rewardPointsDelta;
  }


  public void setRewardPointsDelta(Integer rewardPointsDelta) {
    this.rewardPointsDelta = rewardPointsDelta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesRuleDataRuleExtensionInterface salesRuleDataRuleExtensionInterface = (SalesRuleDataRuleExtensionInterface) o;
    return Objects.equals(this.rewardPointsDelta, salesRuleDataRuleExtensionInterface.rewardPointsDelta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardPointsDelta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRuleDataRuleExtensionInterface {\n");
    sb.append("    rewardPointsDelta: ").append(toIndentedString(rewardPointsDelta)).append("\n");
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
