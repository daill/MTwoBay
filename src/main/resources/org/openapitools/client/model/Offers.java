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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EbayOfferDetailsWithAll;

/**
 * This type is used by the base response of the &lt;strong&gt;getOffers&lt;/strong&gt; call, and it is an array of one or more of the seller&#39;s offers, along with pagination data.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class Offers {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<EbayOfferDetailsWithAll> offers = null;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public Offers href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * This is the URL to the current page of offers.
   * @return href
  **/
  


  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public Offers limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * This integer value is the number of offers that will be displayed on each results page.
   * @return limit
  **/
  


  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Offers next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * This is the URL to the next page of offers. This field will only be returned if there are additional offers to view.
   * @return next
  **/
  


  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public Offers offers(List<EbayOfferDetailsWithAll> offers) {
    
    this.offers = offers;
    return this;
  }

  public Offers addOffersItem(EbayOfferDetailsWithAll offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<EbayOfferDetailsWithAll>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * This container is an array of one or more of the seller&#39;s offers for the SKU value that is passed in through the required &lt;strong&gt;sku&lt;/strong&gt; query parameter.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;getOffers&lt;/strong&gt; call will only return one offer.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Occurs:&lt;/strong&gt; 25
   * @return offers
  **/
  


  public List<EbayOfferDetailsWithAll> getOffers() {
    return offers;
  }


  public void setOffers(List<EbayOfferDetailsWithAll> offers) {
    this.offers = offers;
  }


  public Offers prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * This is the URL to the previous page of offers. This field will only be returned if there are previous offers to view.
   * @return prev
  **/
  


  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public Offers size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * This integer value indicates the number of offers being displayed on the current page of results. This number will generally be the same as the &lt;strong&gt;limit&lt;/strong&gt; value if there are additional pages of results to view.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;Get Offers&lt;/strong&gt; call will only return one offer, so this value should always be &lt;code&gt;1&lt;/code&gt;.&lt;/span&gt;
   * @return size
  **/
  


  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public Offers total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * This integer value is the total number of offers that exist for the specified SKU value. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all offers.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;Get Offers&lt;/strong&gt; call will only return one offer, so this value should always be &lt;code&gt;1&lt;/code&gt;.&lt;/span&gt;
   * @return total
  **/
  


  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offers offers = (Offers) o;
    return Objects.equals(this.href, offers.href) &&
        Objects.equals(this.limit, offers.limit) &&
        Objects.equals(this.next, offers.next) &&
        Objects.equals(this.offers, offers.offers) &&
        Objects.equals(this.prev, offers.prev) &&
        Objects.equals(this.size, offers.size) &&
        Objects.equals(this.total, offers.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offers, prev, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offers {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
