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
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.put
import io.ktor.routing.route

import org.openapitools.server.Paths
import org.openapitools.server.infrastructure.ApiPrincipal


import org.openapitools.server.models.ErrorMinusResponse
import org.openapitools.server.models.QuoteMinusDataMinusShippingMinusMethodMinusInterface

@KtorExperimentalLocationsAPI
fun Route.QuoteGuestShippingMethodManagementV1Api() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.getV1GuestcartsCartIdShippingmethods> {  _: Paths.getV1GuestcartsCartIdShippingmethods ->
        val exampleContentType = "application/json"
val exampleContentString = """{
          "error_message" : "error_message",
          "price_excl_tax" : 1.4658129805029452,
          "amount" : 0.8008281904610115,
          "price_incl_tax" : 5.962133916683182,
          "carrier_title" : "carrier_title",
          "available" : true,
          "base_amount" : 6.027456183070403,
          "extension_attributes" : "{}",
          "method_code" : "method_code",
          "method_title" : "method_title",
          "carrier_code" : "carrier_code"
        }"""

when(exampleContentType) {
    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
    else -> call.respondText(exampleContentString)
}

    }

}
