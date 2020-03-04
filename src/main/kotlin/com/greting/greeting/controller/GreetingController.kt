package com.greting.greeting.controller

import com.greting.greeting.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class GreetingController {
    @Autowired
    lateinit var greetingService: GreetingService

    @GetMapping("/sayHello")
    fun sayHello(): ResponseEntity<String> {
        var sayHello = "Hello";
        return ResponseEntity.ok(sayHello)
    }

    @GetMapping("/hello")
    fun greeting(name: String): ResponseEntity<String> {
        val greeting = greetingService.greeting(name)
        return ResponseEntity.ok(greeting)
    }
}