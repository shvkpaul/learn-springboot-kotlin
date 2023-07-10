package com.shvk.learn.model

data class Person(
    val id: Long,
    val name: String,
    val address: List<Address>
)
data class Address(
    val addressLine1: String,
    val addressLine2: String
)