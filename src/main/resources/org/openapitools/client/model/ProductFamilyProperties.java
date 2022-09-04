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
 * This type is used to specify the details of a motor vehicle that is compatible with the inventory item specified through the SKU value in the call URI.
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-02T16:14:13.966768200+02:00[Europe/Berlin]")
public class ProductFamilyProperties {
  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_MAKE = "make";
  @SerializedName(SERIALIZED_NAME_MAKE)
  private String make;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_TRIM = "trim";
  @SerializedName(SERIALIZED_NAME_TRIM)
  private String trim;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;


  public ProductFamilyProperties engine(String engine) {
    
    this.engine = engine;
    return this;
  }

   /**
   * This field indicates the specifications of the engine, including its size, block type, and fuel type. An example is &lt;code&gt;2.7L V6 gas DOHC naturally aspirated&lt;/code&gt;. This field is conditionally required, but should be supplied if known/applicable.
   * @return engine
  **/
  


  public String getEngine() {
    return engine;
  }


  public void setEngine(String engine) {
    this.engine = engine;
  }


  public ProductFamilyProperties make(String make) {
    
    this.make = make;
    return this;
  }

   /**
   * This field indicates the make of the vehicle (e.g. &lt;code&gt;Toyota&lt;/code&gt;). This field is always required to identify a motor vehicle.
   * @return make
  **/
  


  public String getMake() {
    return make;
  }


  public void setMake(String make) {
    this.make = make;
  }


  public ProductFamilyProperties model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * This field indicates the model of the vehicle (e.g. &lt;code&gt;Camry&lt;/code&gt;). This field is always required to identify a motor vehicle.
   * @return model
  **/
  


  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public ProductFamilyProperties trim(String trim) {
    
    this.trim = trim;
    return this;
  }

   /**
   * This field indicates the trim of the vehicle (e.g. &lt;code&gt;2-door Coupe&lt;/code&gt;). This field is conditionally required, but should be supplied if known/applicable.
   * @return trim
  **/
  


  public String getTrim() {
    return trim;
  }


  public void setTrim(String trim) {
    this.trim = trim;
  }


  public ProductFamilyProperties year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * This field indicates the year of the vehicle (e.g. &lt;code&gt;2016&lt;/code&gt;). This field is always required to identify a motor vehicle.
   * @return year
  **/
  


  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFamilyProperties productFamilyProperties = (ProductFamilyProperties) o;
    return Objects.equals(this.engine, productFamilyProperties.engine) &&
        Objects.equals(this.make, productFamilyProperties.make) &&
        Objects.equals(this.model, productFamilyProperties.model) &&
        Objects.equals(this.trim, productFamilyProperties.trim) &&
        Objects.equals(this.year, productFamilyProperties.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, make, model, trim, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFamilyProperties {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    trim: ").append(toIndentedString(trim)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
