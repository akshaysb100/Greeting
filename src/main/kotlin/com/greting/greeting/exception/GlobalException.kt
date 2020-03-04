package com.greting.greeting.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class GlobalException : ResponseEntityExceptionHandler() {
    @ExceptionHandler(value = [(GreetingNotFound::class)])
    fun handleUserAlreadyExists(ex: GreetingNotFound, request: WebRequest): ResponseEntity<Response> {
        val errorDetails = Response("wrong name pass")
        return ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST)
    }
}