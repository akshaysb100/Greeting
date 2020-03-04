package com.greting.greeting.controller

import com.greting.greeting.service.GreetingService
import io.mockk.MockKAnnotations
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class UserControllerTest {

    @InjectMockKs
    lateinit var greetingController: GreetingController

    @MockK
    lateinit var greetingService: GreetingService

    @Before
    internal fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun givenFunction_ShouldReturnHello() {
        val sayHello = greetingController.sayHello()
        Assert.assertEquals("Hello", sayHello.body)
    }

    @Test
    fun giveAkshayAsAParameterToFunction_ShouldReturnHelloAkshay() {
        every { greetingService.greeting("Akshay") } returns "Hello,Akshay"
        val greeting = greetingController.greeting("Akshay")
        verify { greetingService.greeting("Akshay") }
        confirmVerified(greetingService)
        Assert.assertEquals("Hello,Akshay", greeting.body)
    }
}