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

import org.openapitools.server.models.FrameworkMinusSearchMinusBucketMinusInterface

/**
 * Interface Aggregation to get faceted data
 * @param buckets All Document fields
 * @param bucketNames Document field names
 */
data class FrameworkMinusSearchMinusAggregationMinusInterface (
    /* All Document fields */
    var buckets: kotlin.Array<FrameworkMinusSearchMinusBucketMinusInterface>,
    /* Document field names */
    var bucketNames: kotlin.Array<kotlin.String>
) 

