package com.pomankao

fun main(args: Array<String>) {
//    println("Hello Kotlin")
    val human = Human("Poman",80.5f,1.8f)
    human.hello()

//    var s = "abcde"
//    s = null  // Null can't be a value
    var s:String? = "abcde"
    s = null
    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))
}


class Human(var name: String, var weight: Float, var height: Float) {

    fun bmi(): Float {
        return weight/(height*height)
    }

    fun hello() {
        println("Hello kotlin")
    }
}