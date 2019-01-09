package com.pomankao.kotlin

import com.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    private val name = "Poman"
    private val english = 60
    private val math = 80
    private val average = (english+math)/2

    @Test
    fun highestTest() {
        val student = Student(name, english, math)
        Assertions.assertEquals(math, student.highest())
    }

    @Test
    fun averageTest() {
        val student = Student(name, english, math)
        Assertions.assertEquals(average, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student(name, english, math)
        Assertions.assertEquals('C', student.grading())
    }
}