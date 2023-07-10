package com.shvk.learn.service

import com.shvk.learn.model.Address
import com.shvk.learn.model.Person
import org.springframework.stereotype.Service

@Service
class PersonService {

    fun getAllPerson(): List<Person> {
        return listOf(
            Person(
                id = 1, name = "shouvik", address = listOf(
                    Address(
                        addressLine1 = "kolkata", addressLine2 = "India"
                    )
                )
            )
        )
    }
}