package com.pomankao

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkinglot = HashMap<String, Car?>()
    var enter = LocalDateTime.of(2018,12,25,
        8,0,0)
    var car:Car? = Car("AA-0001", enter)
    parkinglot.put(car!!.id, car)
    car = Car("BB-0002", enter.plusMinutes(15))
    parkinglot.put(car.id, car)
    // Car AA-0001 leaving
    var leave = LocalDateTime.of(2018,12,25,
        9,0,0)
    car = parkinglot.get("AA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkinglot.remove(car?.id)
    println(parkinglot.size)
    // Car BB-0002 leaving
    car = parkinglot.get("BB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkinglot.remove(car?.id)
    println(parkinglot.size)
    /*val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(68, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)*/
}