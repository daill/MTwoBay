package de.daill.services

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthContributorRegistry
import org.springframework.boot.actuate.health.HealthEndpoint
import org.springframework.boot.actuate.health.HealthEndpointGroups

class ProbesEndpoints(registry: HealthContributorRegistry?, groups: HealthEndpointGroups?) :
    HealthEndpoint(registry, groups) {

    override fun health(): Health {
        return Health.up().build()
    }
}