package de.daill.services.ebay

import org.springframework.context.ApplicationEvent

class EbayAuthEvent(source: Any, var authCode: String? = null) : ApplicationEvent(source) {
    fun getCode(): String? {
        return authCode
    }
}