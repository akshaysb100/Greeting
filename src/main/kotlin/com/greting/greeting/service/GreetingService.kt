package com.greting.greeting.service

import com.greting.greeting.exception.GreetingNotFound
import com.greting.greeting.model.User
import com.greting.greeting.repository.GreetingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingService {

    @Autowired
    lateinit var greetingRepository : GreetingRepository

    fun greeting(name: String): String {
        val greeting = User(name)
        if (greeting.name == "Akshay"){
            var sayHello = "Hello,${greeting.name}"
            greetingRepository.save(greeting)
            return sayHello
        }
        throw GreetingNotFound("pass wrong name")
    }
}
