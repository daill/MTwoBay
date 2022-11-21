package de.daill.model.ebay

enum class EbayEnvironments(var baseUrl: String, var webEndpoint: String, var apiEndpoint: String) {
    PRODUCTION("https://api.ebay.com", "https://auth.ebay.com/oauth2/authorize", "https://api.ebay.com/identity/v1/oauth2/token"),
    SANDBOX("https://api.sandbox.ebay.com", "https://auth.sandbox.ebay.com/oauth2/authorize", "https://api.sandbox.ebay.com/identity/v1/oauth2/token")

}