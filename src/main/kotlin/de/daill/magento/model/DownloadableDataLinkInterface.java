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


import java.math.BigDecimal;

/**
 * DownloadableDataLinkInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class DownloadableDataLinkInterface {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_IS_SHAREABLE = "is_shareable";
  @SerializedName(SERIALIZED_NAME_IS_SHAREABLE)
  private Integer isShareable;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_NUMBER_OF_DOWNLOADS = "number_of_downloads";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DOWNLOADS)
  private Integer numberOfDownloads;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType;

  public static final String SERIALIZED_NAME_LINK_FILE = "link_file";
  @SerializedName(SERIALIZED_NAME_LINK_FILE)
  private String linkFile;

  public static final String SERIALIZED_NAME_LINK_FILE_CONTENT = "link_file_content";
  @SerializedName(SERIALIZED_NAME_LINK_FILE_CONTENT)
  private DownloadableDataFileContentInterface linkFileContent;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

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


  public DownloadableDataLinkInterface id(Integer id) {
    
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


  public DownloadableDataLinkInterface title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/



  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DownloadableDataLinkInterface sortOrder(Integer sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/


  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public DownloadableDataLinkInterface isShareable(Integer isShareable) {
    
    this.isShareable = isShareable;
    return this;
  }

   /**
   * Shareable status
   * @return isShareable
  **/


  public Integer getIsShareable() {
    return isShareable;
  }


  public void setIsShareable(Integer isShareable) {
    this.isShareable = isShareable;
  }


  public DownloadableDataLinkInterface price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price
   * @return price
  **/


  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public DownloadableDataLinkInterface numberOfDownloads(Integer numberOfDownloads) {
    
    this.numberOfDownloads = numberOfDownloads;
    return this;
  }

   /**
   * Of downloads per user
   * @return numberOfDownloads
  **/



  public Integer getNumberOfDownloads() {
    return numberOfDownloads;
  }


  public void setNumberOfDownloads(Integer numberOfDownloads) {
    this.numberOfDownloads = numberOfDownloads;
  }


  public DownloadableDataLinkInterface linkType(String linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/


  public String getLinkType() {
    return linkType;
  }


  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public DownloadableDataLinkInterface linkFile(String linkFile) {
    
    this.linkFile = linkFile;
    return this;
  }

   /**
   * relative file path
   * @return linkFile
  **/



  public String getLinkFile() {
    return linkFile;
  }


  public void setLinkFile(String linkFile) {
    this.linkFile = linkFile;
  }


  public DownloadableDataLinkInterface linkFileContent(DownloadableDataFileContentInterface linkFileContent) {
    
    this.linkFileContent = linkFileContent;
    return this;
  }

   /**
   * Get linkFileContent
   * @return linkFileContent
  **/



  public DownloadableDataFileContentInterface getLinkFileContent() {
    return linkFileContent;
  }


  public void setLinkFileContent(DownloadableDataFileContentInterface linkFileContent) {
    this.linkFileContent = linkFileContent;
  }


  public DownloadableDataLinkInterface linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * Link url or null when type is &#39;file&#39;
   * @return linkUrl
  **/



  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public DownloadableDataLinkInterface sampleType(String sampleType) {
    
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


  public DownloadableDataLinkInterface sampleFile(String sampleFile) {
    
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


  public DownloadableDataLinkInterface sampleFileContent(DownloadableDataFileContentInterface sampleFileContent) {
    
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


  public DownloadableDataLinkInterface sampleUrl(String sampleUrl) {
    
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


  public DownloadableDataLinkInterface extensionAttributes(Object extensionAttributes) {
    
    this.extensionAttributes = extensionAttributes;
    return this;
  }

   /**
   * ExtensionInterface class for @see \\Magento\\Downloadable\\Api\\Data\\LinkInterface
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
    DownloadableDataLinkInterface downloadableDataLinkInterface = (DownloadableDataLinkInterface) o;
    return Objects.equals(this.id, downloadableDataLinkInterface.id) &&
        Objects.equals(this.title, downloadableDataLinkInterface.title) &&
        Objects.equals(this.sortOrder, downloadableDataLinkInterface.sortOrder) &&
        Objects.equals(this.isShareable, downloadableDataLinkInterface.isShareable) &&
        Objects.equals(this.price, downloadableDataLinkInterface.price) &&
        Objects.equals(this.numberOfDownloads, downloadableDataLinkInterface.numberOfDownloads) &&
        Objects.equals(this.linkType, downloadableDataLinkInterface.linkType) &&
        Objects.equals(this.linkFile, downloadableDataLinkInterface.linkFile) &&
        Objects.equals(this.linkFileContent, downloadableDataLinkInterface.linkFileContent) &&
        Objects.equals(this.linkUrl, downloadableDataLinkInterface.linkUrl) &&
        Objects.equals(this.sampleType, downloadableDataLinkInterface.sampleType) &&
        Objects.equals(this.sampleFile, downloadableDataLinkInterface.sampleFile) &&
        Objects.equals(this.sampleFileContent, downloadableDataLinkInterface.sampleFileContent) &&
        Objects.equals(this.sampleUrl, downloadableDataLinkInterface.sampleUrl) &&
        Objects.equals(this.extensionAttributes, downloadableDataLinkInterface.extensionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, sortOrder, isShareable, price, numberOfDownloads, linkType, linkFile, linkFileContent, linkUrl, sampleType, sampleFile, sampleFileContent, sampleUrl, extensionAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadableDataLinkInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    isShareable: ").append(toIndentedString(isShareable)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    numberOfDownloads: ").append(toIndentedString(numberOfDownloads)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkFile: ").append(toIndentedString(linkFile)).append("\n");
    sb.append("    linkFileContent: ").append(toIndentedString(linkFileContent)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
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

