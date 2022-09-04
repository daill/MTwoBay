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

/**
 * This type is used to define the product details, such as a title, a product description, product aspects/item specifics, and links to images for the product. Optionally, in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, a seller can pass in an eBay Product Identifier (ePID) or a Global Trade Item Number (GTIN) value, such as an EAN, an ISBN, a UPC, to identify a product to be matched with a product in the eBay Catalog. The information in this type is also returned in the &lt;strong&gt;getInventoryItem&lt;/strong&gt;, &lt;strong&gt;getInventoryItems&lt;/strong&gt;, and &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; calls if defined.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class Product {
  public static final String SERIALIZED_NAME_ASPECTS = "aspects";
  @SerializedName(SERIALIZED_NAME_ASPECTS)
  private String aspects;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EAN = "ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private List<String> ean = null;

  public static final String SERIALIZED_NAME_EPID = "epid";
  @SerializedName(SERIALIZED_NAME_EPID)
  private String epid;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "imageUrls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private List<String> imageUrls = null;

  public static final String SERIALIZED_NAME_ISBN = "isbn";
  @SerializedName(SERIALIZED_NAME_ISBN)
  private List<String> isbn = null;

  public static final String SERIALIZED_NAME_MPN = "mpn";
  @SerializedName(SERIALIZED_NAME_MPN)
  private String mpn;

  public static final String SERIALIZED_NAME_SUBTITLE = "subtitle";
  @SerializedName(SERIALIZED_NAME_SUBTITLE)
  private String subtitle;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private List<String> upc = null;

  public static final String SERIALIZED_NAME_VIDEO_IDS = "videoIds";
  @SerializedName(SERIALIZED_NAME_VIDEO_IDS)
  private List<String> videoIds = null;


  public Product aspects(String aspects) {
    
    this.aspects = aspects;
    return this;
  }

   /**
   * This is a collection of item specifics (aka product aspects) name-value pairs that provide more information about the product and might make it easier for buyers to find. To view required/recommended product aspects/item specifics names (and corresponding values) for a specific eBay category, sellers can use the &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategorySpecifics.html\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;GetCategorySpecifics&lt;/a&gt; call of the Trading API. Alternatively, sellers can view similar items on eBay.com in the same category to get an idea of what other sellers are using for product aspects/item specifics.&lt;br/&gt;&lt;br/&gt;Sellers also have the option of specifying an eBay Product ID (ePID) or optionally, a Global Trade Item Number (GTIN) through the corresponding fields in the &lt;strong&gt;product&lt;/strong&gt; container in an attempt to find a product match in the eBay Catalog. If a match is found based on the ePID or GTIN value, the product aspects that are defined for the eBay Catalog product will automatically get picked up by the newly created/updated inventory item. &lt;br/&gt;&lt;br/&gt;Below is an example of the proper JSON syntax to use when manually inputting item specifics. Note that one item specific name, such as &#39;Features&#39;, can have more than one value. If an item specific name has more than one value, each value is delimited with a comma.&lt;br/&gt;&lt;br/&gt; &lt;pre&gt;&lt;code&gt;\&quot;aspects\&quot;: {&lt;br/&gt; \&quot;Brand\&quot;: [\&quot;GoPro\&quot;],&lt;br/&gt; \&quot;Storage Type\&quot;: [\&quot;Removable\&quot;]&lt;br/&gt; }&lt;/code&gt;&lt;/pre&gt;&lt;br/&gt;Note that inventory items that will become part of an inventory item group and multiple-variation listing should have the same attributes that are defined for the inventory item group.&lt;br/&gt;&lt;br/&gt;This container will be returned if one or more item specific pairs are defined for the inventory item.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length for Aspect Name&lt;/strong&gt;: 40&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length for Aspect Value&lt;/strong&gt;: 50
   * @return aspects
  **/
  @javax.annotation.Nullable


  public String getAspects() {
    return aspects;
  }


  public void setAspects(String aspects) {
    this.aspects = aspects;
  }


  public Product brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the product. This field is often paired with the &lt;strong&gt;mpn&lt;/strong&gt; field to identify a specific product by Manufacture Part Number. This field is conditionally required if the eBay category requires a Manufacturer Part Number (MPN) value. If eBay is able to find a product match in the eBay Catalog when an eBay Product ID (ePID) or GTIN value (UPC, ISBN, or EAN) is supplied, all product details of that eBay Catalog product is picked up by the inventory item record (including brand) if the &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call is successful. &lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If a brand was passed in as an item specific name-value pair through the &lt;strong&gt;aspects&lt;/strong&gt; array in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, this value is also picked up by the &lt;strong&gt;brand&lt;/strong&gt; field.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 65
   * @return brand
  **/
  @javax.annotation.Nullable


  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public Product description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the product. The description of an existing inventory item can be added or modified with a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call. The description of an inventory item is automatically populated if the seller specifies an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) and eBay is able to find a matching product in the eBay Catalog.&lt;br/&gt;&lt;br/&gt;Note that this field is optional but recommended. If a &lt;strong&gt;listingDescription&lt;/strong&gt; field is omitted when creating and publishing a single-variation offer, the text in this field will be used instead. If neither the &lt;strong&gt;product.description&lt;/strong&gt; field for the inventory item nor the &lt;strong&gt;listingDescription&lt;/strong&gt; field for the offer exist, the &lt;strong&gt;publishOffer&lt;/strong&gt; call will fail. If the inventory item will be part of an inventory item group/multiple-variation listing, this field should definitely be used to specify how the corresponding product variation is different (e.g. &lt;em&gt;This is the green, extra-large version of the shirt&lt;/em&gt;). However, in the case of an inventory item group, the text in the &lt;strong&gt;description&lt;/strong&gt; field of the inventory item group will become the listing description of the actual eBay listing instead of the text in this field.&lt;br/&gt;&lt;br/&gt;Basic HTML tags are supported, including the following tags:&lt;ul&gt;&lt;li&gt;&amp;lt;b&amp;gt;&lt;/li&gt;&lt;li&gt;&amp;lt;strong&amp;gt;&lt;/li&gt;&lt;li&gt;&amp;lt;br&amp;gt;&lt;/li&gt;&lt;li&gt;&amp;lt;ol&amp;gt;&lt;/li&gt;&lt;li&gt;&amp;lt;ul&amp;gt;&lt;/li&gt;&lt;li&gt;&amp;lt;li&amp;gt;&lt;/li&gt;&lt;li&gt;Table tags including &amp;lt;table&amp;gt;, &amp;lt;tr&amp;gt;, &amp;lt;td&amp;gt;, &amp;lt;th&amp;gt;, &amp;lt;thead&amp;gt;, &amp;lt;tfoot&amp;gt;, &amp;lt;tbody&amp;gt;, &amp;lt;caption&amp;gt;, &amp;lt;colgroup&amp;gt;, and &amp;lt;col&amp;gt;&lt;/li&gt;&lt;/ul&gt;A seller can not use any active content in their listing description. Active content includes animation or video via JavaScript, Flash, plug-ins, or form actions.&lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If one of the GTIN types (e.g. UPC) was passed in when the inventory item was created/modified and a product match was found in the eBay catalog, product description is one of the details that gets picked up from the catalog product.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 4000
   * @return description
  **/
  @javax.annotation.Nullable


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Product ean(List<String> ean) {
    
    this.ean = ean;
    return this;
  }

  public Product addEanItem(String eanItem) {
    if (this.ean == null) {
      this.ean = new ArrayList<String>();
    }
    this.ean.add(eanItem);
    return this;
  }

   /**
   * The European Article Number/International Article Number (EAN) for the product. Although an ePID value is preferred when trying to find a product match in the eBay Catalog, this field can also be used in an attempt to find a product match in the eBay Catalog. If a product match is found in the eBay Catalog, the inventory item is automatically populated with available product details such as a title, a product description, product aspects (including the specified EAN value), and a link to any stock image that exists for the catalog product.&lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If an EAN was passed in as an item specific name-value pair through the &lt;strong&gt;aspects&lt;/strong&gt; array in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, this value is also picked up by the &lt;strong&gt;ean&lt;/strong&gt; field.
   * @return ean
  **/
  @javax.annotation.Nullable


  public List<String> getEan() {
    return ean;
  }


  public void setEan(List<String> ean) {
    this.ean = ean;
  }


  public Product epid(String epid) {
    
    this.epid = epid;
    return this;
  }

   /**
   * The eBay Product Identifier (ePID) for the product. This field can be used to directly identify an eBay Catalog product. Based on its specified ePID value, eBay will search for the product in the eBay Catalog, and if a match is found, the inventory item is automatically populated with available product details such as product title, product description, product aspects, and a link to any stock image that exists for the catalog product.&lt;br/&gt;&lt;br/&gt;In an attempt to find a eBay Catalog product match, an ePID value is always preferred over the other product identifiers, since it is possible that one GTIN value can be associated with multiple eBay Catalog products, and if multiple products are found, product details will not be picked up by the Inventory Item object.&lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item.
   * @return epid
  **/
  @javax.annotation.Nullable


  public String getEpid() {
    return epid;
  }


  public void setEpid(String epid) {
    this.epid = epid;
  }


  public Product imageUrls(List<String> imageUrls) {
    
    this.imageUrls = imageUrls;
    return this;
  }

  public Product addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<String>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * An array of one or more links to images for the product. URLs must use the \&quot;HTTPS\&quot; protocol. Images can be self-hosted by the seller, or sellers can use the &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/UploadSiteHostedPictures.html\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;UploadSiteHostedPictures&lt;/a&gt; call of the Trading API to upload images to an eBay Picture Server. If successful, the response of the &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/UploadSiteHostedPictures.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;UploadSiteHostedPictures&lt;/a&gt; call will contain a full URL to the image on an eBay Picture Server. This is the URL that will be passed in through the &lt;strong&gt;imageUrls&lt;/strong&gt; array. Before an offer can be published, at least one image must exist for the inventory item. Most eBay sites support up to 12 pictures free of charge, and eBay Motors listings can have up to 24 pictures.&lt;br/&gt;&lt;br/&gt;A link to a stock image for a product may automatically be populated for an inventory item if the seller specifies an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) and eBay is able to find a matching product in the eBay Catalog.&lt;br/&gt;&lt;br/&gt;This container will always be returned for an inventory item that is part of a published offer since a published offer will always have at least one picture, but this container will only be returned if defined for inventory items that are not a part of a published offer.
   * @return imageUrls
  **/
  @javax.annotation.Nullable


  public List<String> getImageUrls() {
    return imageUrls;
  }


  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }


  public Product isbn(List<String> isbn) {
    
    this.isbn = isbn;
    return this;
  }

  public Product addIsbnItem(String isbnItem) {
    if (this.isbn == null) {
      this.isbn = new ArrayList<String>();
    }
    this.isbn.add(isbnItem);
    return this;
  }

   /**
   * The International Standard Book Number (ISBN) value for the product. Although an ePID value is preferred when trying to find a product match in the eBay Catalog, this field can also be used in an attempt to find a product match in the eBay Catalog. If a product match is found in the eBay Catalog, the inventory item is automatically populated with available product details such as a title, a product description, product aspects (including the specified ISBN value), and a link to any stock image that exists for the catalog product.&lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If an ISBN was passed in as an item specific name-value pair through the &lt;strong&gt;aspects&lt;/strong&gt; array in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, this value is also picked up by the &lt;strong&gt;isbn&lt;/strong&gt; field.
   * @return isbn
  **/
  @javax.annotation.Nullable


  public List<String> getIsbn() {
    return isbn;
  }


  public void setIsbn(List<String> isbn) {
    this.isbn = isbn;
  }


  public Product mpn(String mpn) {
    
    this.mpn = mpn;
    return this;
  }

   /**
   * The Manufacturer Part Number (MPN) of a product. This field is paired with the &lt;strong&gt;brand&lt;/strong&gt; field to identify a product. Some eBay categories require MPN values. The &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategorySpecifics.html\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;GetCategorySpecifics&lt;/a&gt; call of the Trading API can be used to see if a category requires an MPN. The MPN value for a product may automatically be populated for an inventory item if the seller specifies an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) and eBay is able to find a matching product in the eBay Catalog. &lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If an MPN was passed in as an item specific name-value pair through the &lt;strong&gt;aspects&lt;/strong&gt; array in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, this value is also picked up by the &lt;strong&gt;mpn&lt;/strong&gt; field.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 65
   * @return mpn
  **/
  @javax.annotation.Nullable


  public String getMpn() {
    return mpn;
  }


  public void setMpn(String mpn) {
    this.mpn = mpn;
  }


  public Product subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * A subtitle is an optional listing feature that allows the seller to provide more information about the product, possibly including keywords that may assist with search results. An additional listing fee will be charged to the seller if a subtitle is used. For more information on using listing subtitles on the US site, see the &lt;a href&#x3D;\&quot;https://pages.ebay.com/help/sell/itemsubtitle.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Adding a subtitle to your listings&lt;/a&gt; help page. The subtitle of an existing inventory item can added, modified, or removed with a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call.&lt;br/&gt;&lt;br/&gt;Note that the same &lt;strong&gt;subtitle&lt;/strong&gt; text should be used for each inventory item that will be part of an inventory item group, and ultimately become one product variation within a multiple-variation listing.&lt;br/&gt;&lt;br/&gt;This field will only be returned if set for an inventory item.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 55
   * @return subtitle
  **/
  @javax.annotation.Nullable


  public String getSubtitle() {
    return subtitle;
  }


  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public Product title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of an inventory item can be added or modified with a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call. Although not immediately required, a title will be needed before an offer with the inventory item is published. The title of an inventory item is automatically populated if the seller specifies an eBay Product ID (ePID) or a Global Trade Item Number (GTIN) and eBay is able to find a matching product in the eBay Catalog. If the inventory item will become part of a single-variation offer, and the listing is not a product-based listing, the text in this field will become the actual listing title for the published offer. However, if the inventory item will become part of a multiple-variation offer, the text in &lt;strong&gt;title&lt;/strong&gt; field of the inventory item group entity will actually become the listing title for the published offer instead, although a title can still be provided for the inventory item, and it will actually become the title of the variation.&lt;br/&gt;&lt;br/&gt;This field will always be returned for an inventory item that is part of a published offer since a published offer will always have a listing title, but this field will only be returned if defined for inventory items that are not a part of a published offer.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 80
   * @return title
  **/
  @javax.annotation.Nullable


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Product upc(List<String> upc) {
    
    this.upc = upc;
    return this;
  }

  public Product addUpcItem(String upcItem) {
    if (this.upc == null) {
      this.upc = new ArrayList<String>();
    }
    this.upc.add(upcItem);
    return this;
  }

   /**
   * The Universal Product Code (UPC) value for the product. Although an ePID value is preferred when trying to find a product match in the eBay Catalog, this field can also be used in an attempt to find a product match in the eBay Catalog. If a product match is found in the eBay Catalog, the inventory item is automatically populated with available product details such as a title, a product description, product aspects (including the specified UPC value), and a link to any stock image that exists for the catalog product.&lt;br/&gt;&lt;br/&gt;This field is returned if defined for an inventory item. If a UPC was passed in as an item specific name-value pair through the &lt;strong&gt;aspects&lt;/strong&gt; array in a &lt;strong&gt;createOrReplaceInventoryItem&lt;/strong&gt; call, this value is also picked up by the &lt;strong&gt;upc&lt;/strong&gt; field.
   * @return upc
  **/
  @javax.annotation.Nullable


  public List<String> getUpc() {
    return upc;
  }


  public void setUpc(List<String> upc) {
    this.upc = upc;
  }


  public Product videoIds(List<String> videoIds) {
    
    this.videoIds = videoIds;
    return this;
  }

  public Product addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<String>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * An array of one or more VideoId values for the product. A VideoId is a unique identifier that is automatically created by eBay when a seller successfully uploads a video to eBay using the  &lt;a href&#x3D;\&quot;https://developer.ebay.com/api-docs/commerce/media/resources/video/methods/uploadVideo\&quot; target&#x3D;\&quot;_blank\&quot;&gt;uploadVideo&lt;/a&gt; method of the &lt;a href&#x3D;\&quot;https://developer.ebay.com/api-docs/commerce/media/overview.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Media API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;For information on supported marketplaces and platforms, as well as other requirements and limitations of video support, please refer to &lt;a href&#x3D;\&quot;https://developer.ebay.com/api-docs/sell/static/inventory/managing-video-media.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Managing videos&lt;/a&gt;.
   * @return videoIds
  **/
  @javax.annotation.Nullable


  public List<String> getVideoIds() {
    return videoIds;
  }


  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.aspects, product.aspects) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.ean, product.ean) &&
        Objects.equals(this.epid, product.epid) &&
        Objects.equals(this.imageUrls, product.imageUrls) &&
        Objects.equals(this.isbn, product.isbn) &&
        Objects.equals(this.mpn, product.mpn) &&
        Objects.equals(this.subtitle, product.subtitle) &&
        Objects.equals(this.title, product.title) &&
        Objects.equals(this.upc, product.upc) &&
        Objects.equals(this.videoIds, product.videoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspects, brand, description, ean, epid, imageUrls, isbn, mpn, subtitle, title, upc, videoIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    epid: ").append(toIndentedString(epid)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
