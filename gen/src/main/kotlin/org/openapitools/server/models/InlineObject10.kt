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

import org.openapitools.server.models.QuoteMinusDataMinusPaymentMinusInterface
import org.openapitools.server.models.QuoteMinusDataMinusTotalsMinusAdditionalMinusDataMinusInterface

/**
 * 
 * @param paymentMethod 
 * @param shippingCarrierCode The carrier code.
 * @param shippingMethodCode The shipping method code.
 * @param additionalData 
 */
data class InlineObject10 (
    var paymentMethod: QuoteMinusDataMinusPaymentMinusInterface,
    /* The carrier code. */
    var shippingCarrierCode: kotlin.String? = null,
    /* The shipping method code. */
    var shippingMethodCode: kotlin.String? = null,
    var additionalData: QuoteMinusDataMinusTotalsMinusAdditionalMinusDataMinusInterface? = null
) 
