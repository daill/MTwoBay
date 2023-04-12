/**
* Magento Community
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 2.4
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * Price interface.
 * @param msrpPrice 
 * @param isApplicable 
 * @param isShownPriceOnGesture 
 * @param msrpMessage 
 * @param explanationMessage 
 * @param extensionAttributes ExtensionInterface class for @see \\Magento\\Msrp\\Api\\Data\\ProductRender\\MsrpPriceInfoInterface
 */
data class MsrpMinusDataMinusProductMinusRenderMinusMsrpMinusPriceMinusInfoMinusInterface (
    var msrpPrice: kotlin.String,
    var isApplicable: kotlin.String,
    var isShownPriceOnGesture: kotlin.String,
    var msrpMessage: kotlin.String,
    var explanationMessage: kotlin.String,
    /* ExtensionInterface class for @see \\Magento\\Msrp\\Api\\Data\\ProductRender\\MsrpPriceInfoInterface */
    var extensionAttributes: kotlin.Any? = null
) 
