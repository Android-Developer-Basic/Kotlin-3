package ru.otus.homework

import java.lang.Thread.sleep
import java.sql.Time
import java.time.LocalDate
import java.time.LocalTime


fun main() {
    var result1: Int = task_1(1,2, 3, 4, 5, 6, 7, 8, 9, 10, 111 )
    println("result1 = $result1")

    var result2 : String = task_2("one","two","three","four","five")
    println("result2 = $result2")

    result2 = task_2("one","two","three","four","five", separ = '$')
    println("result2 = $result2")

    var result4 : Int = task_4(::slowFunc)
    println("duration = $result4 seconds")
}

fun task_1(n1: Int, n2: Int, vararg n3: Int): Int {
    var sum = n1 + n2
    n3.forEach { sum += it }
    return sum
}

fun task_2(vararg str: String, separ: Char = ' '): String {
    var strRes: String = str.joinToString("$separ")
    return strRes
}

fun task_4(paramFunc: () -> Unit) : Int {
    val startTime = LocalTime.now()
    paramFunc()
    val stopTime = LocalTime.now()
    val duration = stopTime.toSecondOfDay() - startTime.toSecondOfDay()
    return duration
}

fun slowFunc(): Unit {
    for(i in 0 until 10) {
        println("Number = $i")
        Thread.sleep(1000)
    }
}