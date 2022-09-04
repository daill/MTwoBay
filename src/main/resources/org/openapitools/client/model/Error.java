/*
 * Inventory API
 * The Inventory API is used to create and manage inventory, and then to publish and manage this inventory on an eBay marketplace. There are also methods in this API that will convert eligible, active eBay listings into the Inventory API model.
 *
 * The version of the OpenAPI document: 1.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This type is used to express detailed information on errors and warnings that may occur with a call request.
 */
@ApiModel(description = "This type is used to express detailed information on errors and warnings that may occur with a call request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class Error {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ERROR_ID = "errorId";
  @SerializedName(SERIALIZED_NAME_ERROR_ID)
  private Integer errorId;

  public static final String SERIALIZED_NAME_INPUT_REF_IDS = "inputRefIds";
  @SerializedName(SERIALIZED_NAME_INPUT_REF_IDS)
  private List<String> inputRefIds = null;

  public static final String SERIALIZED_NAME_LONG_MESSAGE = "longMessage";
  @SerializedName(SERIALIZED_NAME_LONG_MESSAGE)
  private String longMessage;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OUTPUT_REF_IDS = "outputRefIds";
  @SerializedName(SERIALIZED_NAME_OUTPUT_REF_IDS)
  private List<String> outputRefIds = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ErrorParameter> parameters = null;

  public static final String SERIALIZED_NAME_SUBDOMAIN = "subdomain";
  @SerializedName(SERIALIZED_NAME_SUBDOMAIN)
  private String subdomain;


  public Error category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * This string value indicates the error category. There are three categories of errors: request errors, application errors, and system errors. 
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This string value indicates the error category. There are three categories of errors: request errors, application errors, and system errors. ")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Error domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The name of the domain in which the error or warning occurred.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the domain in which the error or warning occurred.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Error errorId(Integer errorId) {
    
    this.errorId = errorId;
    return this;
  }

   /**
   * A unique code that identifies the particular error or warning that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
   * @return errorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique code that identifies the particular error or warning that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.")

  public Integer getErrorId() {
    return errorId;
  }


  public void setErrorId(Integer errorId) {
    this.errorId = errorId;
  }


  public Error inputRefIds(List<String> inputRefIds) {
    
    this.inputRefIds = inputRefIds;
    return this;
  }

  public Error addInputRefIdsItem(String inputRefIdsItem) {
    if (this.inputRefIds == null) {
      this.inputRefIds = new ArrayList<String>();
    }
    this.inputRefIds.add(inputRefIdsItem);
    return this;
  }

   /**
   * An array of one or more reference IDs which identify the specific request element(s) most closely associated to the error or warning, if any.
   * @return inputRefIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of one or more reference IDs which identify the specific request element(s) most closely associated to the error or warning, if any.")

  public List<String> getInputRefIds() {
    return inputRefIds;
  }


  public void setInputRefIds(List<String> inputRefIds) {
    this.inputRefIds = inputRefIds;
  }


  public Error longMessage(String longMessage) {
    
    this.longMessage = longMessage;
    return this;
  }

   /**
   * A detailed description of the condition that caused the error or warning, and information on what to do to correct the problem.
   * @return longMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the condition that caused the error or warning, and information on what to do to correct the problem.")

  public String getLongMessage() {
    return longMessage;
  }


  public void setLongMessage(String longMessage) {
    this.longMessage = longMessage;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A description of the condition that caused the error or warning.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the condition that caused the error or warning.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error outputRefIds(List<String> outputRefIds) {
    
    this.outputRefIds = outputRefIds;
    return this;
  }

  public Error addOutputRefIdsItem(String outputRefIdsItem) {
    if (this.outputRefIds == null) {
      this.outputRefIds = new ArrayList<String>();
    }
    this.outputRefIds.add(outputRefIdsItem);
    return this;
  }

   /**
   * An array of one or more reference IDs which identify the specific response element(s) most closely associated to the error or warning, if any.
   * @return outputRefIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of one or more reference IDs which identify the specific response element(s) most closely associated to the error or warning, if any.")

  public List<String> getOutputRefIds() {
    return outputRefIds;
  }


  public void setOutputRefIds(List<String> outputRefIds) {
    this.outputRefIds = outputRefIds;
  }


  public Error parameters(List<ErrorParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Error addParametersItem(ErrorParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ErrorParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Various warning and error messages return one or more variables that contain contextual information about the error or waring. This is often the field or value that triggered the error or warning.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Various warning and error messages return one or more variables that contain contextual information about the error or waring. This is often the field or value that triggered the error or warning.")

  public List<ErrorParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<ErrorParameter> parameters) {
    this.parameters = parameters;
  }


  public Error subdomain(String subdomain) {
    
    this.subdomain = subdomain;
    return this;
  }

   /**
   * The name of the subdomain in which the error or warning occurred.
   * @return subdomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the subdomain in which the error or warning occurred.")

  public String getSubdomain() {
    return subdomain;
  }


  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.category, error.category) &&
        Objects.equals(this.domain, error.domain) &&
        Objects.equals(this.errorId, error.errorId) &&
        Objects.equals(this.inputRefIds, error.inputRefIds) &&
        Objects.equals(this.longMessage, error.longMessage) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.outputRefIds, error.outputRefIds) &&
        Objects.equals(this.parameters, error.parameters) &&
        Objects.equals(this.subdomain, error.subdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, domain, errorId, inputRefIds, longMessage, message, outputRefIds, parameters, subdomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    inputRefIds: ").append(toIndentedString(inputRefIds)).append("\n");
    sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    outputRefIds: ").append(toIndentedString(outputRefIds)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
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
