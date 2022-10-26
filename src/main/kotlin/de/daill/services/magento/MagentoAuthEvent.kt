package de.daill.services.magento

import org.springframework.context.ApplicationEvent

class MagentoAuthEvent(source: Any, var authCode: String? = null) : ApplicationEvent(source) {
    fun getCode(): String? {
        return authCode
    }
}