package com.greting.greeting.exception

class GreetingNotFound : RuntimeException {
    override val message: String?

    constructor(message: String) : super(message) {
        this.message = message
    }
}