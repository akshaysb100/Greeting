package com.greting.greeting.repository

import com.greting.greeting.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface GreetingRepository : JpaRepository<User, Long> {

}