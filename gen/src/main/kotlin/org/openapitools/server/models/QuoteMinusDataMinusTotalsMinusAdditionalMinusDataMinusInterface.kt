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
import org.openapitools.server.models.QuoteMinusDataMinusTotalsMinusAdditionalMinusDataMinusExtensionMinusInterface

/**
 * Additional data for totals collection.
 * @param extensionAttributes 
 * @param customAttributes Custom attributes values.
 */
data class QuoteMinusDataMinusTotalsMinusAdditionalMinusDataMinusInterface (
    var extensionAttributes: QuoteMinusDataMinusTotalsMinusAdditionalMinusDataMinusExtensionMinusInterface? = null,
    /* Custom attributes values. */
    var customAttributes: kotlin.Array<FrameworkMinusAttributeMinusInterface>? = null
) 

