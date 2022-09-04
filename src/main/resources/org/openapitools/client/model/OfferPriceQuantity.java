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
 * This type is used by the &lt;strong&gt;offers&lt;/strong&gt; container in a &lt;strong&gt;Bulk Update Price and Quantity&lt;/strong&gt; call to update the current price and/or quantity of one or more offers associated with a specific inventory item.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class OfferPriceQuantity {
  public static final String SERIALIZED_NAME_AVAILABLE_QUANTITY = "availableQuantity";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_QUANTITY)
  private Integer availableQuantity;

  public static final String SERIALIZED_NAME_OFFER_ID = "offerId";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Amount price;


  public OfferPriceQuantity availableQuantity(Integer availableQuantity) {
    
    this.availableQuantity = availableQuantity;
    return this;
  }

   /**
   * This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value). Either the &lt;strong&gt;availableQuantity&lt;/strong&gt; field or the &lt;strong&gt;price&lt;/strong&gt; container is required, but not necessarily both.
   * @return availableQuantity
  **/
  


  public Integer getAvailableQuantity() {
    return availableQuantity;
  }


  public void setAvailableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
  }


  public OfferPriceQuantity offerId(String offerId) {
    
    this.offerId = offerId;
    return this;
  }

   /**
   * This field is the unique identifier of the offer. If an &lt;strong&gt;offers&lt;/strong&gt; container is used to update one or more offers associated to a specific inventory item, the &lt;strong&gt;offerId&lt;/strong&gt; value is required in order to identify the offer to update with a modified price and/or quantity.&lt;br/&gt;&lt;br/&gt;The seller can run a &lt;strong&gt;getOffers&lt;/strong&gt; call (passing in the correct SKU value as a query parameter) to retrieve &lt;strong&gt;offerId&lt;/strong&gt; values for offers associated with the SKU.
   * @return offerId
  **/
  


  public String getOfferId() {
    return offerId;
  }


  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  public OfferPriceQuantity price(Amount price) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceQuantity offerPriceQuantity = (OfferPriceQuantity) o;
    return Objects.equals(this.availableQuantity, offerPriceQuantity.availableQuantity) &&
        Objects.equals(this.offerId, offerPriceQuantity.offerId) &&
        Objects.equals(this.price, offerPriceQuantity.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableQuantity, offerId, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceQuantity {\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
