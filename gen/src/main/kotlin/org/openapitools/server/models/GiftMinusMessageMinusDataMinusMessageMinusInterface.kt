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

import org.openapitools.server.models.GiftMinusMessageMinusDataMinusMessageMinusExtensionMinusInterface

/**
 * Interface MessageInterface
 * @param giftMessageId Gift message ID. Otherwise, null.
 * @param customerId Customer ID. Otherwise, null.
 * @param sender Sender name.
 * @param recipient Recipient name.
 * @param message Message text.
 * @param extensionAttributes 
 */
data class GiftMinusMessageMinusDataMinusMessageMinusInterface (
    /* Sender name. */
    var sender: kotlin.String,
    /* Recipient name. */
    var recipient: kotlin.String,
    /* Message text. */
    var message: kotlin.String,
    /* Gift message ID. Otherwise, null. */
    var giftMessageId: kotlin.Int? = null,
    /* Customer ID. Otherwise, null. */
    var customerId: kotlin.Int? = null,
    var extensionAttributes: GiftMinusMessageMinusDataMinusMessageMinusExtensionMinusInterface? = null
) 
