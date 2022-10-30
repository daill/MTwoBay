package de.daill.services

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(
    basePackages= ["de.daill.services"],
    basePackageClasses=[SyncTask::class])
class SyncTaskConfig {
    
}