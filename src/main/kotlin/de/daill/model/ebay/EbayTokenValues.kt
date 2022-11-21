package de.daill.model.ebay

import java.time.LocalDateTime

class EbayTokenValues {
    var accessToken: String = ""
    var accessTokenExpirationDate: LocalDateTime? = null
    var refreshToken: String = ""
    var refreshTokenExpirationDate: LocalDateTime? = null
}