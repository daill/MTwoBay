package de.daill.model.ebay

interface EbayEnvironmentalInterface<T> {
    fun byEnvironment(environment: EbayEnvironments): T
}