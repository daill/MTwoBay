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

/**
 * This type is used by the request payload of the &lt;strong&gt;publishByInventoryItemGroup&lt;/strong&gt; call. The identifier of the inventory item group to publish and the eBay marketplace where the listing will be published is needed in the request payload.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class PublishByInventoryItemGroupRequest {
  public static final String SERIALIZED_NAME_INVENTORY_ITEM_GROUP_KEY = "inventoryItemGroupKey";
  @SerializedName(SERIALIZED_NAME_INVENTORY_ITEM_GROUP_KEY)
  private String inventoryItemGroupKey;

  public static final String SERIALIZED_NAME_MARKETPLACE_ID = "marketplaceId";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_ID)
  private String marketplaceId;


  public PublishByInventoryItemGroupRequest inventoryItemGroupKey(String inventoryItemGroupKey) {
    
    this.inventoryItemGroupKey = inventoryItemGroupKey;
    return this;
  }

   /**
   * This is the unique identifier of the inventory item group. All unpublished offers associated with this inventory item group will be published as a multiple-variation listing if the &lt;strong&gt;publishByInventoryItemGroup&lt;/strong&gt; call is successful. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; identifier is automatically generated by eBay once an inventory item group is created.&lt;br/&gt;&lt;br/&gt;To retrieve an &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value, you can use the &lt;strong&gt;getInventoryItem&lt;/strong&gt; call to retrieve an inventory item that is known to be in the inventory item group to publish, and then look for the inventory item group identifier under the &lt;strong&gt;groupIds&lt;/strong&gt; container in the response of that call.
   * @return inventoryItemGroupKey
  **/
  


  public String getInventoryItemGroupKey() {
    return inventoryItemGroupKey;
  }


  public void setInventoryItemGroupKey(String inventoryItemGroupKey) {
    this.inventoryItemGroupKey = inventoryItemGroupKey;
  }


  public PublishByInventoryItemGroupRequest marketplaceId(String marketplaceId) {
    
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * This is the unique identifier of the eBay site on which the multiple-variation listing will be published. The &lt;strong&gt;marketPlaceId&lt;/strong&gt; enumeration values are found in &lt;strong&gt;MarketplaceIdEnum&lt;/strong&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return marketplaceId
  **/
  


  public String getMarketplaceId() {
    return marketplaceId;
  }


  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishByInventoryItemGroupRequest publishByInventoryItemGroupRequest = (PublishByInventoryItemGroupRequest) o;
    return Objects.equals(this.inventoryItemGroupKey, publishByInventoryItemGroupRequest.inventoryItemGroupKey) &&
        Objects.equals(this.marketplaceId, publishByInventoryItemGroupRequest.marketplaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemGroupKey, marketplaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishByInventoryItemGroupRequest {\n");
    sb.append("    inventoryItemGroupKey: ").append(toIndentedString(inventoryItemGroupKey)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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

