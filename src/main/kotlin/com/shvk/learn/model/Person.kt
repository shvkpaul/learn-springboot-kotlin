package com.shvk.learn.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Person(
    @Id
    val id: Long = 0,
    val name: String = ""
)