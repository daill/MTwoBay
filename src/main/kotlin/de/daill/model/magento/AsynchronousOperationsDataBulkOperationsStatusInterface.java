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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Interface BulkStatusInterface Bulk summary data with list of operations items summary data.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class AsynchronousOperationsDataBulkOperationsStatusInterface {
  public static final String SERIALIZED_NAME_OPERATIONS_LIST = "operations_list";
  @Json(name = SERIALIZED_NAME_OPERATIONS_LIST)
  private List<AsynchronousOperationsDataSummaryOperationStatusInterface> operationsList = new ArrayList<AsynchronousOperationsDataSummaryOperationStatusInterface>();

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @Json(name = SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;

  public static final String SERIALIZED_NAME_USER_TYPE = "user_type";
  @Json(name = SERIALIZED_NAME_USER_TYPE)
  private Integer userType;

  public static final String SERIALIZED_NAME_BULK_ID = "bulk_id";
  @Json(name = SERIALIZED_NAME_BULK_ID)
  private String bulkId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @Json(name = SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @Json(name = SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @Json(name = SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_OPERATION_COUNT = "operation_count";
  @Json(name = SERIALIZED_NAME_OPERATION_COUNT)
  private Integer operationCount;


  public AsynchronousOperationsDataBulkOperationsStatusInterface operationsList(List<AsynchronousOperationsDataSummaryOperationStatusInterface> operationsList) {
    
    this.operationsList = operationsList;
    return this;
  }

  public AsynchronousOperationsDataBulkOperationsStatusInterface addOperationsListItem(AsynchronousOperationsDataSummaryOperationStatusInterface operationsListItem) {
    this.operationsList.add(operationsListItem);
    return this;
  }

   /**
   * List of operation with statuses (short data).
   * @return operationsList
  **/


  public List<AsynchronousOperationsDataSummaryOperationStatusInterface> getOperationsList() {
    return operationsList;
  }


  public void setOperationsList(List<AsynchronousOperationsDataSummaryOperationStatusInterface> operationsList) {
    this.operationsList = operationsList;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\AsynchronousOperations\\Api\\Data\\BulkSummaryInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface userType(Integer userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * User type
   * @return userType
  **/


  public Integer getUserType() {
    return userType;
  }


  public void setUserType(Integer userType) {
    this.userType = userType;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface bulkId(String bulkId) {
    
    this.bulkId = bulkId;
    return this;
  }

   /**
   * Bulk uuid
   * @return bulkId
  **/


  public String getBulkId() {
    return bulkId;
  }


  public void setBulkId(String bulkId) {
    this.bulkId = bulkId;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Bulk description
   * @return description
  **/


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Bulk scheduled time
   * @return startTime
  **/


  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User id
   * @return userId
  **/


  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public AsynchronousOperationsDataBulkOperationsStatusInterface operationCount(Integer operationCount) {
    
    this.operationCount = operationCount;
    return this;
  }

   /**
   * Total number of operations scheduled in scope of this bulk
   * @return operationCount
  **/


  public Integer getOperationCount() {
    return operationCount;
  }


  public void setOperationCount(Integer operationCount) {
    this.operationCount = operationCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsynchronousOperationsDataBulkOperationsStatusInterface asynchronousOperationsDataBulkOperationsStatusInterface = (AsynchronousOperationsDataBulkOperationsStatusInterface) o;
    return Objects.equals(this.operationsList, asynchronousOperationsDataBulkOperationsStatusInterface.operationsList) &&
        Objects.equals(this.extensionAttributes, asynchronousOperationsDataBulkOperationsStatusInterface.extensionAttributes) &&
        Objects.equals(this.userType, asynchronousOperationsDataBulkOperationsStatusInterface.userType) &&
        Objects.equals(this.bulkId, asynchronousOperationsDataBulkOperationsStatusInterface.bulkId) &&
        Objects.equals(this.description, asynchronousOperationsDataBulkOperationsStatusInterface.description) &&
        Objects.equals(this.startTime, asynchronousOperationsDataBulkOperationsStatusInterface.startTime) &&
        Objects.equals(this.userId, asynchronousOperationsDataBulkOperationsStatusInterface.userId) &&
        Objects.equals(this.operationCount, asynchronousOperationsDataBulkOperationsStatusInterface.operationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationsList, extensionAttributes, userType, bulkId, description, startTime, userId, operationCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsynchronousOperationsDataBulkOperationsStatusInterface {\n");
    sb.append("    operationsList: ").append(toIndentedString(operationsList)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    bulkId: ").append(toIndentedString(bulkId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    operationCount: ").append(toIndentedString(operationCount)).append("\n");
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

