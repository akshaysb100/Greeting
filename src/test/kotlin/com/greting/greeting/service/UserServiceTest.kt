package com.greting.greeting.service

import io.mockk.impl.annotations.InjectMockKs
import org.junit.Assert
import org.junit.Test
import org.junit.Before

class UserServiceTest {

    @InjectMockKs
    var greetingService = GreetingService()

    @Before
    fun setUp() {
    }

    @Test
    fun giveAkshayAsAParameterToFunction_ShouldReturnHelloAkshay() {
        val greeting = greetingService.greeting("Akshay")
        Assert.assertEquals("Hello,Akshay",greeting)
    }
}