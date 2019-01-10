package com.kotlin

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    Student.pass = 50
    var stu = Student("Poman", 50, 88)
    var stu1 = Student("Jane", 44, 68)
    var stu2 = Student("Eric", 20, 48)
    stu.print()
    stu1.print()
    stu2.print()
    println("High score: ${stu.highest()}")
}

class Student(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }

    fun print() {
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when(getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage() = (english+math)/2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() =  println(name?.length)
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()
    print("Please enter student's math: ")
    var math = scanner.nextInt()
    var stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}
