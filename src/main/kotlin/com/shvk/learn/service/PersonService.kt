package com.shvk.learn.service

import com.shvk.learn.model.Person
import com.shvk.learn.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val personRepository: PersonRepository) {

    fun getAllPerson(): List<Person> {
        return personRepository.findAll()
    }

    fun savePerson(person: Person): Person {
        return personRepository.save(person)
    }
}