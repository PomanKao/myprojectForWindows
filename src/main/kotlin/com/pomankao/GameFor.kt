package com.pomankao

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..4) {
        print("Please enter a number (${1}/4): ")
        var number = scanner.nextInt()
        println("第${i}次$number")
        if (number > secret) {
            println("lower")
        } else if (number < secret) {
            println("higher")
        } else {
            println("Great! the number is $secret")
            break
        }
    }
}