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

import com.squareup.moshi.Json;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


/**
 * Getter Class OperationsStatusInterface Instead of OperationInterface this class don&#39;t provide all operation data and not responsive to set any data, just to get operation data without serialized_data and result_serialized_data
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class AsynchronousOperationsDataSummaryOperationStatusInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @Json(name = SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @Json(name = SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_RESULT_MESSAGE = "result_message";
  @Json(name = SERIALIZED_NAME_RESULT_MESSAGE)
  private String resultMessage;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @Json(name = SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;


  public AsynchronousOperationsDataSummaryOperationStatusInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/


  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AsynchronousOperationsDataSummaryOperationStatusInterface status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Operation status
   * @return status
  **/


  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public AsynchronousOperationsDataSummaryOperationStatusInterface resultMessage(String resultMessage) {
    
    this.resultMessage = resultMessage;
    return this;
  }

   /**
   * Result message
   * @return resultMessage
  **/


  public String getResultMessage() {
    return resultMessage;
  }


  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }


  public AsynchronousOperationsDataSummaryOperationStatusInterface errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code
   * @return errorCode
  **/


  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsynchronousOperationsDataSummaryOperationStatusInterface asynchronousOperationsDataSummaryOperationStatusInterface = (AsynchronousOperationsDataSummaryOperationStatusInterface) o;
    return Objects.equals(this.id, asynchronousOperationsDataSummaryOperationStatusInterface.id) &&
        Objects.equals(this.status, asynchronousOperationsDataSummaryOperationStatusInterface.status) &&
        Objects.equals(this.resultMessage, asynchronousOperationsDataSummaryOperationStatusInterface.resultMessage) &&
        Objects.equals(this.errorCode, asynchronousOperationsDataSummaryOperationStatusInterface.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, resultMessage, errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsynchronousOperationsDataSummaryOperationStatusInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

