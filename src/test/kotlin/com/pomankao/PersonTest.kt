package com.pomankao.kotlin

import com.pomankao.Human
import com.pomankao.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    private val name = "Poman"
    private val weight = 66.5f
    private val height = 1.7f
    private val bmi = weight/(height*height)

    @Test
    fun humanBmiTest() {
        val human = Human(name, weight, height)
        Assertions.assertEquals(bmi, human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person(name, weight, height)
        Assertions.assertEquals(bmi, person.bmi())
    }
}