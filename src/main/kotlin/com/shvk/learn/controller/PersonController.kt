package com.shvk.learn.controller

import com.shvk.learn.model.Person
import com.shvk.learn.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class PersonController(
    private val personService: PersonService
) {
    @GetMapping("/persons")
    fun getPerson(): List<Person> {
        return personService.getAllPerson()
    }

    @PostMapping("/person")
    fun savePerson(
        @RequestBody person:Person
    ): Person {
        return personService.savePerson(person)
    }
}