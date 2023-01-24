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

import org.openapitools.server.models.FrameworkMinusAttributeMinusInterface
import org.openapitools.server.models.QuoteMinusDataMinusAddressMinusInterface

/**
 * Interface ShippingInformationInterface
 * @param shippingAddress 
 * @param billingAddress 
 * @param shippingMethodCode Shipping method code
 * @param shippingCarrierCode Carrier code
 * @param extensionAttributes ExtensionInterface class for @see \\Magento\\Checkout\\Api\\Data\\ShippingInformationInterface
 * @param customAttributes Custom attributes values.
 */
data class CheckoutMinusDataMinusShippingMinusInformationMinusInterface (
    var shippingAddress: QuoteMinusDataMinusAddressMinusInterface,
    /* Shipping method code */
    var shippingMethodCode: kotlin.String,
    /* Carrier code */
    var shippingCarrierCode: kotlin.String,
    var billingAddress: QuoteMinusDataMinusAddressMinusInterface? = null,
    /* ExtensionInterface class for @see \\Magento\\Checkout\\Api\\Data\\ShippingInformationInterface */
    var extensionAttributes: kotlin.Any? = null,
    /* Custom attributes values. */
    var customAttributes: kotlin.Array<FrameworkMinusAttributeMinusInterface>? = null
) 

