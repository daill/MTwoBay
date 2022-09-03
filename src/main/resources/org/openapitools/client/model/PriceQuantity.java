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
import org.openapitools.client.model.OfferPriceQuantity;
import org.openapitools.client.model.ShipToLocationAvailability;

/**
 * This type is used to update the total \&quot;ship-to-home\&quot;  quantity for one or more inventory items and/or to update the price and/or quantity of one or more specific offers associated with one or more inventory items.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class PriceQuantity {
  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<OfferPriceQuantity> offers = null;

  public static final String SERIALIZED_NAME_SHIP_TO_LOCATION_AVAILABILITY = "shipToLocationAvailability";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_LOCATION_AVAILABILITY)
  private ShipToLocationAvailability shipToLocationAvailability;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;


  public PriceQuantity offers(List<OfferPriceQuantity> offers) {
    
    this.offers = offers;
    return this;
  }

  public PriceQuantity addOffersItem(OfferPriceQuantity offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<OfferPriceQuantity>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * This container is needed if the seller is updating the price and/or quantity of one or more published offers, and a successful call will actually update the active eBay listing with the revised price and/or available quantity.&lt;br/&gt;&lt;br/&gt;This call is not designed to work with unpublished offers. For unpublished offers, the seller should use the &lt;strong&gt;updateOffer&lt;/strong&gt; call to update the available quantity and/or price.&lt;br/&gt;&lt;br/&gt; If the seller is also using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container and &lt;strong&gt;sku&lt;/strong&gt; field to update the total &#39;ship-to-home&#39; quantity of the inventory item, the SKU value associated with the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br/&gt;&lt;br/&gt;A separate (&lt;strong&gt;OfferPriceQuantity&lt;/strong&gt;) node is required for each offer being updated.
   * @return offers
  **/
  


  public List<OfferPriceQuantity> getOffers() {
    return offers;
  }


  public void setOffers(List<OfferPriceQuantity> offers) {
    this.offers = offers;
  }


  public PriceQuantity shipToLocationAvailability(ShipToLocationAvailability shipToLocationAvailability) {
    
    this.shipToLocationAvailability = shipToLocationAvailability;
    return this;
  }

   /**
   * Get shipToLocationAvailability
   * @return shipToLocationAvailability
  **/
  


  public ShipToLocationAvailability getShipToLocationAvailability() {
    return shipToLocationAvailability;
  }


  public void setShipToLocationAvailability(ShipToLocationAvailability shipToLocationAvailability) {
    this.shipToLocationAvailability = shipToLocationAvailability;
  }


  public PriceQuantity sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * This is the seller-defined SKU value of the inventory item whose total &#39;ship-to-home&#39; quantity will be updated. This field is only required when the seller is updating the total quantity of an inventory item using the &lt;strong&gt;shipToLocationAvailability&lt;/strong&gt; container. If the seller is updating the price and/or quantity of one or more specific offers, one or more &lt;strong&gt;offerId&lt;/strong&gt; values are used instead, and the &lt;strong&gt;sku&lt;/strong&gt; value is not needed.&lt;br/&gt;&lt;br/&gt;If the seller wants to update the price and/or quantity of one or more offers, and also wants to update the total &#39;ship-to-home&#39; quantity of the corresponding inventory item, the SKU value associated with the &lt;strong&gt;offerId&lt;/strong&gt; value(s) must be the same as the corresponding &lt;strong&gt;sku&lt;/strong&gt; value that is passed in, or an error will occur.&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Length&lt;/strong&gt;: 50&lt;br/&gt;
   * @return sku
  **/
  


  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceQuantity priceQuantity = (PriceQuantity) o;
    return Objects.equals(this.offers, priceQuantity.offers) &&
        Objects.equals(this.shipToLocationAvailability, priceQuantity.shipToLocationAvailability) &&
        Objects.equals(this.sku, priceQuantity.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, shipToLocationAvailability, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceQuantity {\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    shipToLocationAvailability: ").append(toIndentedString(shipToLocationAvailability)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

