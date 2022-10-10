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
 * InlineObject34
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class InlineObject34 {
  public static final String SERIALIZED_NAME_CAPTURE = "capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SalesDataInvoiceItemCreationInterface> items = null;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private Boolean notify;

  public static final String SERIALIZED_NAME_APPEND_COMMENT = "appendComment";
  @SerializedName(SERIALIZED_NAME_APPEND_COMMENT)
  private Boolean appendComment;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private SalesDataInvoiceCommentCreationInterface comment;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private SalesDataInvoiceCreationArgumentsInterface arguments;


  public InlineObject34 capture(Boolean capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  
  

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public InlineObject34 items(List<SalesDataInvoiceItemCreationInterface> items) {
    
    this.items = items;
    return this;
  }

  public InlineObject34 addItemsItem(SalesDataInvoiceItemCreationInterface itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SalesDataInvoiceItemCreationInterface>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  
  

  public List<SalesDataInvoiceItemCreationInterface> getItems() {
    return items;
  }


  public void setItems(List<SalesDataInvoiceItemCreationInterface> items) {
    this.items = items;
  }


  public InlineObject34 notify(Boolean notify) {
    
    this.notify = notify;
    return this;
  }

   /**
   * Get notify
   * @return notify
  **/
  
  

  public Boolean getNotify() {
    return notify;
  }


  public void setNotify(Boolean notify) {
    this.notify = notify;
  }


  public InlineObject34 appendComment(Boolean appendComment) {
    
    this.appendComment = appendComment;
    return this;
  }

   /**
   * Get appendComment
   * @return appendComment
  **/
  
  

  public Boolean getAppendComment() {
    return appendComment;
  }


  public void setAppendComment(Boolean appendComment) {
    this.appendComment = appendComment;
  }


  public InlineObject34 comment(SalesDataInvoiceCommentCreationInterface comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  
  

  public SalesDataInvoiceCommentCreationInterface getComment() {
    return comment;
  }


  public void setComment(SalesDataInvoiceCommentCreationInterface comment) {
    this.comment = comment;
  }


  public InlineObject34 arguments(SalesDataInvoiceCreationArgumentsInterface arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  
  

  public SalesDataInvoiceCreationArgumentsInterface getArguments() {
    return arguments;
  }


  public void setArguments(SalesDataInvoiceCreationArgumentsInterface arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject34 inlineObject34 = (InlineObject34) o;
    return Objects.equals(this.capture, inlineObject34.capture) &&
        Objects.equals(this.items, inlineObject34.items) &&
        Objects.equals(this.notify, inlineObject34.notify) &&
        Objects.equals(this.appendComment, inlineObject34.appendComment) &&
        Objects.equals(this.comment, inlineObject34.comment) &&
        Objects.equals(this.arguments, inlineObject34.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capture, items, notify, appendComment, comment, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject34 {\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    appendComment: ").append(toIndentedString(appendComment)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

