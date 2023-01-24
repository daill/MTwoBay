package org.openapitools.server

import com.codahale.metrics.Slf4jReporter
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.application.ApplicationStopping
import io.ktor.application.install
import io.ktor.application.log
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.features.HSTS
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Locations
import io.ktor.metrics.Metrics
import io.ktor.routing.Routing
import java.util.concurrent.TimeUnit
import io.ktor.util.KtorExperimentalAPI
import io.ktor.auth.Authentication
import io.ktor.auth.oauth
import org.openapitools.server.infrastructure.ApiKeyCredential
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.infrastructure.apiKeyAuth
import org.openapitools.server.apis.AmazonPayCheckoutSessionManagementV1Api
import org.openapitools.server.apis.CatalogProductRenderListV1Api
import org.openapitools.server.apis.CheckoutGuestPaymentInformationManagementV1Api
import org.openapitools.server.apis.CheckoutGuestShippingInformationManagementV1Api
import org.openapitools.server.apis.CheckoutGuestTotalsInformationManagementV1Api
import org.openapitools.server.apis.CustomerAccountManagementV1Api
import org.openapitools.server.apis.DirectoryCountryInformationAcquirerV1Api
import org.openapitools.server.apis.DirectoryCurrencyInformationAcquirerV1Api
import org.openapitools.server.apis.GiftMessageGuestCartRepositoryV1Api
import org.openapitools.server.apis.GiftMessageGuestItemRepositoryV1Api
import org.openapitools.server.apis.IntegrationAdminTokenServiceV1Api
import org.openapitools.server.apis.IntegrationCustomerTokenServiceV1Api
import org.openapitools.server.apis.InventoryInStorePickupApiGetPickupLocationsV1Api
import org.openapitools.server.apis.MageplazaSmtpCheckoutManagementV1Api
import org.openapitools.server.apis.QuoteGuestBillingAddressManagementV1Api
import org.openapitools.server.apis.QuoteGuestCartItemRepositoryV1Api
import org.openapitools.server.apis.QuoteGuestCartManagementV1Api
import org.openapitools.server.apis.QuoteGuestCartRepositoryV1Api
import org.openapitools.server.apis.QuoteGuestCartTotalManagementV1Api
import org.openapitools.server.apis.QuoteGuestCartTotalRepositoryV1Api
import org.openapitools.server.apis.QuoteGuestCouponManagementV1Api
import org.openapitools.server.apis.QuoteGuestPaymentMethodManagementV1Api
import org.openapitools.server.apis.QuoteGuestShipmentEstimationV1Api
import org.openapitools.server.apis.QuoteGuestShippingMethodManagementV1Api
import org.openapitools.server.apis.SearchV1Api


@KtorExperimentalAPI
internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(Metrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
                .outputTo(log)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see http://ktor.io/features/autoheadresponse.html
    install(HSTS, ApplicationHstsConfiguration()) // see http://ktor.io/features/hsts.html
    install(Compression, ApplicationCompressionConfiguration()) // see http://ktor.io/features/compression.html
    install(Locations) // see http://ktor.io/features/locations.html
    install(Authentication) {
        // "Implement API key auth (api_key) for parameter name 'api_key'."
        apiKeyAuth("api_key") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
    }
    install(Routing) {
        AmazonPayCheckoutSessionManagementV1Api()
        CatalogProductRenderListV1Api()
        CheckoutGuestPaymentInformationManagementV1Api()
        CheckoutGuestShippingInformationManagementV1Api()
        CheckoutGuestTotalsInformationManagementV1Api()
        CustomerAccountManagementV1Api()
        DirectoryCountryInformationAcquirerV1Api()
        DirectoryCurrencyInformationAcquirerV1Api()
        GiftMessageGuestCartRepositoryV1Api()
        GiftMessageGuestItemRepositoryV1Api()
        IntegrationAdminTokenServiceV1Api()
        IntegrationCustomerTokenServiceV1Api()
        InventoryInStorePickupApiGetPickupLocationsV1Api()
        MageplazaSmtpCheckoutManagementV1Api()
        QuoteGuestBillingAddressManagementV1Api()
        QuoteGuestCartItemRepositoryV1Api()
        QuoteGuestCartManagementV1Api()
        QuoteGuestCartRepositoryV1Api()
        QuoteGuestCartTotalManagementV1Api()
        QuoteGuestCartTotalRepositoryV1Api()
        QuoteGuestCouponManagementV1Api()
        QuoteGuestPaymentMethodManagementV1Api()
        QuoteGuestShipmentEstimationV1Api()
        QuoteGuestShippingMethodManagementV1Api()
        SearchV1Api()
    }


    environment.monitor.subscribe(ApplicationStopping)
    {
        HTTP.client.close()
    }
}
