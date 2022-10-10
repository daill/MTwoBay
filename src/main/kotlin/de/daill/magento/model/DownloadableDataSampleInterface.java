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
 * DownloadableDataSampleInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class DownloadableDataSampleInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_SAMPLE_TYPE = "sample_type";
  @SerializedName(SERIALIZED_NAME_SAMPLE_TYPE)
  private String sampleType;

  public static final String SERIALIZED_NAME_SAMPLE_FILE = "sample_file";
  @SerializedName(SERIALIZED_NAME_SAMPLE_FILE)
  private String sampleFile;

  public static final String SERIALIZED_NAME_SAMPLE_FILE_CONTENT = "sample_file_content";
  @SerializedName(SERIALIZED_NAME_SAMPLE_FILE_CONTENT)
  private DownloadableDataFileContentInterface sampleFileContent;

  public static final String SERIALIZED_NAME_SAMPLE_URL = "sample_url";
  @SerializedName(SERIALIZED_NAME_SAMPLE_URL)
  private String sampleUrl;

  public static final String SERIALIZED_NAME_EXTENSION_ATTRIBUTES = "extension_attributes";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ATTRIBUTES)
  private Object extensionAttributes;


  public DownloadableDataSampleInterface id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Sample(or link) id
   * @return id
  **/



  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DownloadableDataSampleInterface title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DownloadableDataSampleInterface sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Order index for sample
   * @return sortOrder
  **/


  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public DownloadableDataSampleInterface sampleType(String sampleType) {
    
    this.sampleType = sampleType;
    return this;
  }

   /**
   * Get sampleType
   * @return sampleType
  **/


  public String getSampleType() {
    return sampleType;
  }


  public void setSampleType(String sampleType) {
    this.sampleType = sampleType;
  }


  public DownloadableDataSampleInterface sampleFile(String sampleFile) {
    
    this.sampleFile = sampleFile;
    return this;
  }

   /**
   * relative file path
   * @return sampleFile
  **/



  public String getSampleFile() {
    return sampleFile;
  }


  public void setSampleFile(String sampleFile) {
    this.sampleFile = sampleFile;
  }


  public DownloadableDataSampleInterface sampleFileContent(DownloadableDataFileContentInterface sampleFileContent) {
    
    this.sampleFileContent = sampleFileContent;
    return this;
  }

   /**
   * Get sampleFileContent
   * @return sampleFileContent
  **/



  public DownloadableDataFileContentInterface getSampleFileContent() {
    return sampleFileContent;
  }


  public void setSampleFileContent(DownloadableDataFileContentInterface sampleFileContent) {
    this.sampleFileContent = sampleFileContent;
  }


  public DownloadableDataSampleInterface sampleUrl(String sampleUrl) {
    
    this.sampleUrl = sampleUrl;
    return this;
  }

   /**
   * file URL
   * @return sampleUrl
  **/



  public String getSampleUrl() {
    return sampleUrl;
  }


  public void setSampleUrl(String sampleUrl) {
    this.sampleUrl = sampleUrl;
  }


  public DownloadableDataSampleInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Downloadable\\Api\\Data\\SampleInterface
   * @return extensionAttributes
  **/



  public Object getExtensionAttributes() {
    return extensionAttributes;
  }


  public void setExtensionAttributes(Object extensionAttributes) {
    this.extensionAttributes = extensionAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadableDataSampleInterface downloadableDataSampleInterface = (DownloadableDataSampleInterface) o;
    return Objects.equals(this.id, downloadableDataSampleInterface.id) &&
        Objects.equals(this.title, downloadableDataSampleInterface.title) &&
        Objects.equals(this.sortOrder, downloadableDataSampleInterface.sortOrder) &&
        Objects.equals(this.sampleType, downloadableDataSampleInterface.sampleType) &&
        Objects.equals(this.sampleFile, downloadableDataSampleInterface.sampleFile) &&
        Objects.equals(this.sampleFileContent, downloadableDataSampleInterface.sampleFileContent) &&
        Objects.equals(this.sampleUrl, downloadableDataSampleInterface.sampleUrl) &&
        Objects.equals(this.extensionAttributes, downloadableDataSampleInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, sortOrder, sampleType, sampleFile, sampleFileContent, sampleUrl, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadableDataSampleInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
    sb.append("    sampleFile: ").append(toIndentedString(sampleFile)).append("\n");
    sb.append("    sampleFileContent: ").append(toIndentedString(sampleFileContent)).append("\n");
    sb.append("    sampleUrl: ").append(toIndentedString(sampleUrl)).append("\n");
    sb.append("    extensionAttributes: ").append(toIndentedString(extensionAttributes)).append("\n");
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
