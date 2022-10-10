/**
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
package de.daill.ebay.models


import com.squareup.moshi.Json

/**
 * This type is used to specify the dimensions (and the unit used to measure those dimensions) of a shipping package. The <strong>dimensions</strong> container is conditionally required if the seller will be offering calculated shipping rates to determine shipping cost. See the <a href=\"https://pages.ebay.com/help/pay/calculated-shipping.html\" target=\"_blank\">Calculated shipping</a> help page for more information on calculated shipping.
 * @param height The actual height (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. <br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height, the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code>
 * @param length The actual length (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. <br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code>
 * @param unit The unit of measurement used to specify the dimensions of a shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. If the English system of measurement is being used, the applicable values for dimension units are <code>FEET</code> and <code>INCH</code>. If the metric system of measurement is being used, the applicable values for weight units are <code>METER</code> and <code>CENTIMETER</code>. The metric system is used by most countries outside of the US. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:LengthUnitOfMeasureEnum'>eBay API documentation</a>
 * @param width The actual width (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified.<br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code>
 */

data class Dimension (
    /* The actual height (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. <br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height, the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code> */
    @Json(name = "height")
    val height: java.math.BigDecimal? = null,
    /* The actual length (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. <br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code> */
    @Json(name = "length")
    val length: java.math.BigDecimal? = null,
    /* The unit of measurement used to specify the dimensions of a shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified. If the English system of measurement is being used, the applicable values for dimension units are <code>FEET</code> and <code>INCH</code>. If the metric system of measurement is being used, the applicable values for weight units are <code>METER</code> and <code>CENTIMETER</code>. The metric system is used by most countries outside of the US. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/inventory/types/slr:LengthUnitOfMeasureEnum'>eBay API documentation</a> */
    @Json(name = "unit")
    val unit: kotlin.String? = null,
    /* The actual width (in the measurement unit specified in the <strong>unit</strong> field) of the shipping package. All fields of the <strong>dimensions</strong> container are required if package dimensions are specified.<br/><br/> If a shipping package measured 21.5 inches in length, 15.0 inches in width, and 12.0 inches in height,  the <strong>dimensions</strong> container would look as follows: <br/> <pre><code>\"dimensions\": {<br/> \"length\": 21.5,<br/> \"width\": 15.0,<br/> \"height\": 12.0,<br/> \"unit\": \"INCH\"<br/> } </pre></code> */
    @Json(name = "width")
    val width: java.math.BigDecimal? = null
)
