package de.daill

import org.springframework.context.ApplicationEvent

class AuthEvent(source: Any, var authCode: String? = null) : ApplicationEvent(source) {
    fun getCode(): String? {
        return authCode
    }
}