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

import org.openapitools.server.models.TaxMinusDataMinusGrandMinusTotalMinusRatesMinusInterface

/**
 * Interface GrandTotalDetailsInterface
 * @param amount Tax amount value
 * @param rates Tax rates info
 * @param groupId Group identifier
 */
data class TaxMinusDataMinusGrandMinusTotalMinusDetailsMinusInterface (
    /* Tax amount value */
    var amount: java.math.BigDecimal,
    /* Tax rates info */
    var rates: kotlin.Array<TaxMinusDataMinusGrandMinusTotalMinusRatesMinusInterface>,
    /* Group identifier */
    var groupId: kotlin.Int
) 
