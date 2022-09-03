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
import org.openapitools.client.model.Amount;

/**
 * This type is used to specify the listing price for the product and settings for the Minimum Advertised Price and Strikethrough Pricing features. The &lt;strong&gt;price&lt;/strong&gt; field must be supplied before an offer is published, but a seller may create an offer without supplying a price initially. The Minimum Advertised Price feature is only available on the US site. Strikethrough Pricing is available on the US, eBay Motors, UK, Germany, Canada (English and French), France, Italy, and Spain sites.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class PricingSummary {
  public static final String SERIALIZED_NAME_AUCTION_RESERVE_PRICE = "auctionReservePrice";
  @SerializedName(SERIALIZED_NAME_AUCTION_RESERVE_PRICE)
  private Amount auctionReservePrice;

  public static final String SERIALIZED_NAME_AUCTION_START_PRICE = "auctionStartPrice";
  @SerializedName(SERIALIZED_NAME_AUCTION_START_PRICE)
  private Amount auctionStartPrice;

  public static final String SERIALIZED_NAME_MINIMUM_ADVERTISED_PRICE = "minimumAdvertisedPrice";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ADVERTISED_PRICE)
  private Amount minimumAdvertisedPrice;

  public static final String SERIALIZED_NAME_ORIGINALLY_SOLD_FOR_RETAIL_PRICE_ON = "originallySoldForRetailPriceOn";
  @SerializedName(SERIALIZED_NAME_ORIGINALLY_SOLD_FOR_RETAIL_PRICE_ON)
  private String originallySoldForRetailPriceOn;

  public static final String SERIALIZED_NAME_ORIGINAL_RETAIL_PRICE = "originalRetailPrice";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_RETAIL_PRICE)
  private Amount originalRetailPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Amount price;

  public static final String SERIALIZED_NAME_PRICING_VISIBILITY = "pricingVisibility";
  @SerializedName(SERIALIZED_NAME_PRICING_VISIBILITY)
  private String pricingVisibility;


  public PricingSummary auctionReservePrice(Amount auctionReservePrice) {
    
    this.auctionReservePrice = auctionReservePrice;
    return this;
  }

   /**
   * Get auctionReservePrice
   * @return auctionReservePrice
  **/
  


  public Amount getAuctionReservePrice() {
    return auctionReservePrice;
  }


  public void setAuctionReservePrice(Amount auctionReservePrice) {
    this.auctionReservePrice = auctionReservePrice;
  }


  public PricingSummary auctionStartPrice(Amount auctionStartPrice) {
    
    this.auctionStartPrice = auctionStartPrice;
    return this;
  }

   /**
   * Get auctionStartPrice
   * @return auctionStartPrice
  **/
  


  public Amount getAuctionStartPrice() {
    return auctionStartPrice;
  }


  public void setAuctionStartPrice(Amount auctionStartPrice) {
    this.auctionStartPrice = auctionStartPrice;
  }


  public PricingSummary minimumAdvertisedPrice(Amount minimumAdvertisedPrice) {
    
    this.minimumAdvertisedPrice = minimumAdvertisedPrice;
    return this;
  }

   /**
   * Get minimumAdvertisedPrice
   * @return minimumAdvertisedPrice
  **/
  


  public Amount getMinimumAdvertisedPrice() {
    return minimumAdvertisedPrice;
  }


  public void setMinimumAdvertisedPrice(Amount minimumAdvertisedPrice) {
    this.minimumAdvertisedPrice = minimumAdvertisedPrice;
  }


  public PricingSummary originallySoldForRetailPriceOn(String originallySoldForRetailPriceOn) {
    
    this.originallySoldForRetailPriceOn = originallySoldForRetailPriceOn;
    return this;
  }

   /**
   * This field is needed if the Strikethrough Pricing (STP) feature will be used in the offer. This field indicates that the product was sold for the price in the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field on an eBay site, or sold for that price by a third-party retailer. When using the &lt;strong&gt;createOffer&lt;/strong&gt; or &lt;strong&gt;updateOffer&lt;/strong&gt; calls, the seller will pass in a value of &lt;code&gt;ON_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; on an eBay site, or the seller will pass in a value of &lt;code&gt;OFF_EBAY&lt;/code&gt; to indicate that the product was sold for the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; through a third-party retailer. This field and the &lt;strong&gt;originalRetailPrice&lt;/strong&gt; field are only applicable if the seller and listing are eligible to use the Strikethrough Pricing feature, a feature which is limited to the US (core site and Motors), UK, Germany, Canada (English and French versions), France, Italy, and Spain sites.&lt;br/&gt;&lt;br/&gt;This field will be returned if set for the offer. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:SoldOnEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return originallySoldForRetailPriceOn
  **/
  


  public String getOriginallySoldForRetailPriceOn() {
    return originallySoldForRetailPriceOn;
  }


  public void setOriginallySoldForRetailPriceOn(String originallySoldForRetailPriceOn) {
    this.originallySoldForRetailPriceOn = originallySoldForRetailPriceOn;
  }


  public PricingSummary originalRetailPrice(Amount originalRetailPrice) {
    
    this.originalRetailPrice = originalRetailPrice;
    return this;
  }

   /**
   * Get originalRetailPrice
   * @return originalRetailPrice
  **/
  


  public Amount getOriginalRetailPrice() {
    return originalRetailPrice;
  }


  public void setOriginalRetailPrice(Amount originalRetailPrice) {
    this.originalRetailPrice = originalRetailPrice;
  }


  public PricingSummary price(Amount price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  


  public Amount getPrice() {
    return price;
  }


  public void setPrice(Amount price) {
    this.price = price;
  }


  public PricingSummary pricingVisibility(String pricingVisibility) {
    
    this.pricingVisibility = pricingVisibility;
    return this;
  }

   /**
   * This field is needed if the Minimum Advertised Price (MAP) feature will be used in the offer. This field is only applicable if an eligible US seller is using the Minimum Advertised Price (MAP) feature and a &lt;strong&gt;minimumAdvertisedPrice&lt;/strong&gt; has been specified. The value set in this field will determine whether the MAP price is shown to a prospective buyer prior to checkout through a pop-up window accessed from the View Item page, or if the MAP price is not shown until the checkout flow after the buyer has already committed to buying the item. To show the MAP price prior to checkout, the seller will set this value to &lt;code&gt;PRE_CHECKOUT&lt;/code&gt;. To show the MAP price after the buyer already commits to buy the item, the seller will set this value to &lt;code&gt;DURING_CHECKOUT&lt;/code&gt;. This field will be ignored if the seller and/or the listing is not eligible for the MAP feature.&lt;br/&gt;&lt;br/&gt;This field will be returned if set for the offer. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MinimumAdvertisedPriceHandlingEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return pricingVisibility
  **/
  


  public String getPricingVisibility() {
    return pricingVisibility;
  }


  public void setPricingVisibility(String pricingVisibility) {
    this.pricingVisibility = pricingVisibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingSummary pricingSummary = (PricingSummary) o;
    return Objects.equals(this.auctionReservePrice, pricingSummary.auctionReservePrice) &&
        Objects.equals(this.auctionStartPrice, pricingSummary.auctionStartPrice) &&
        Objects.equals(this.minimumAdvertisedPrice, pricingSummary.minimumAdvertisedPrice) &&
        Objects.equals(this.originallySoldForRetailPriceOn, pricingSummary.originallySoldForRetailPriceOn) &&
        Objects.equals(this.originalRetailPrice, pricingSummary.originalRetailPrice) &&
        Objects.equals(this.price, pricingSummary.price) &&
        Objects.equals(this.pricingVisibility, pricingSummary.pricingVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auctionReservePrice, auctionStartPrice, minimumAdvertisedPrice, originallySoldForRetailPriceOn, originalRetailPrice, price, pricingVisibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingSummary {\n");
    sb.append("    auctionReservePrice: ").append(toIndentedString(auctionReservePrice)).append("\n");
    sb.append("    auctionStartPrice: ").append(toIndentedString(auctionStartPrice)).append("\n");
    sb.append("    minimumAdvertisedPrice: ").append(toIndentedString(minimumAdvertisedPrice)).append("\n");
    sb.append("    originallySoldForRetailPriceOn: ").append(toIndentedString(originallySoldForRetailPriceOn)).append("\n");
    sb.append("    originalRetailPrice: ").append(toIndentedString(originalRetailPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingVisibility: ").append(toIndentedString(pricingVisibility)).append("\n");
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

