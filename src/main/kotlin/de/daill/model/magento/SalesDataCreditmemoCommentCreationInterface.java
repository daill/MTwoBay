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

import java.util.Objects;


/**
 * Interface CreditmemoCommentCreationInterface
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class SalesDataCreditmemoCommentCreationInterface {
  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_IS_VISIBLE_ON_FRONT = "is_visible_on_front";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE_ON_FRONT)
  private Integer isVisibleOnFront;


  public SalesDataCreditmemoCommentCreationInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Sales\\Api\\Data\\CreditmemoCommentCreationInterface
   * @return extensionAttributes
  **/

  

  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public SalesDataCreditmemoCommentCreationInterface comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment.
   * @return comment
  **/


  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public SalesDataCreditmemoCommentCreationInterface isVisibleOnFront(Integer isVisibleOnFront) {
    
    this.isVisibleOnFront = isVisibleOnFront;
    return this;
  }

   /**
   * Is-visible-on-storefront flag value.
   * @return isVisibleOnFront
  **/


  public Integer getIsVisibleOnFront() {
    return isVisibleOnFront;
  }


  public void setIsVisibleOnFront(Integer isVisibleOnFront) {
    this.isVisibleOnFront = isVisibleOnFront;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDataCreditmemoCommentCreationInterface salesDataCreditmemoCommentCreationInterface = (SalesDataCreditmemoCommentCreationInterface) o;
    return Objects.equals(this.extensionAttributes, salesDataCreditmemoCommentCreationInterface.extensionAttributes) &&
        Objects.equals(this.comment, salesDataCreditmemoCommentCreationInterface.comment) &&
        Objects.equals(this.isVisibleOnFront, salesDataCreditmemoCommentCreationInterface.isVisibleOnFront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionAttributes, comment, isVisibleOnFront);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDataCreditmemoCommentCreationInterface {\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isVisibleOnFront: ").append(toIndentedString(isVisibleOnFront)).append("\n");
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

