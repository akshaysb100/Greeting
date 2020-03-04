package com.greting.greeting.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User {
    @Id
    @GeneratedValue(generator = "seq_generator", strategy = GenerationType.SEQUENCE)
    var id: Long = 0
    var name: String = ""

    constructor()
    constructor(name: String) {
        this.name = name
    }
}


