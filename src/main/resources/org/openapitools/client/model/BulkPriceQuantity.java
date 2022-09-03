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

import com.google.gson.annotations.SerializedName;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This type is used by the base request payload of the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. The &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call allows the seller to update the total &#39;ship-to-home&#39; quantity of one or more inventory items (up to 25) and/or to update the price and/or quantity of one or more specific published offers.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class BulkPriceQuantity {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<PriceQuantity> requests = null;


  public BulkPriceQuantity requests(List<PriceQuantity> requests) {
    
    this.requests = requests;
    return this;
  }

  public BulkPriceQuantity addRequestsItem(PriceQuantity requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<PriceQuantity>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * This container is used by the seller to update the total &#39;ship-to-home&#39; quantity of one or more inventory items (up to 25) and/or to update the price and/or quantity of one or more specific published offers.
   * @return requests
  **/
  


  public List<PriceQuantity> getRequests() {
    return requests;
  }


  public void setRequests(List<PriceQuantity> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPriceQuantity bulkPriceQuantity = (BulkPriceQuantity) o;
    return Objects.equals(this.requests, bulkPriceQuantity.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPriceQuantity {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

