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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Downloadable Option
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T21:04:04.031930900+02:00[Europe/Berlin]")
public class DownloadableDataDownloadableOptionInterface {
  public static final String SERIALIZED_NAME_DOWNLOADABLE_LINKS = "downloadable_links";
  @SerializedName(SERIALIZED_NAME_DOWNLOADABLE_LINKS)
  private List<Integer> downloadableLinks = new ArrayList<Integer>();


  public DownloadableDataDownloadableOptionInterface downloadableLinks(List<Integer> downloadableLinks) {
    
    this.downloadableLinks = downloadableLinks;
    return this;
  }

  public DownloadableDataDownloadableOptionInterface addDownloadableLinksItem(Integer downloadableLinksItem) {
    this.downloadableLinks.add(downloadableLinksItem);
    return this;
  }

   /**
   * The list of downloadable links
   * @return downloadableLinks
  **/
  

  public List<Integer> getDownloadableLinks() {
    return downloadableLinks;
  }


  public void setDownloadableLinks(List<Integer> downloadableLinks) {
    this.downloadableLinks = downloadableLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadableDataDownloadableOptionInterface downloadableDataDownloadableOptionInterface = (DownloadableDataDownloadableOptionInterface) o;
    return Objects.equals(this.downloadableLinks, downloadableDataDownloadableOptionInterface.downloadableLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadableLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadableDataDownloadableOptionInterface {\n");
    sb.append("    downloadableLinks: ").append(toIndentedString(downloadableLinks)).append("\n");
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

