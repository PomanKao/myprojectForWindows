package com.pomankao

fun main(args: Array<String>) {
//    println("Hello Kotlin")
    val human = Human()
    human.hello()

//    var s = "abcde"
//    s = null  // Null can't be a value
    var s:String? = "abcde"
    s = null
    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))
}


class Human {
    fun hello() {
        println("Hello kotlin")
    }
}