package de.daill.services

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Home {
    @GetMapping
    fun home() : String {
        return "available"
    }
}