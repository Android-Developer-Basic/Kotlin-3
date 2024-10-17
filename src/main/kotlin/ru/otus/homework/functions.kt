package ru.otus.homework

import java.time.Duration
import java.time.LocalTime

fun main() {
    println("Calculate execution time: ${calculateExecutionTime(::veryHeavyFun)} ms")

    println("Sum with 2 args:  ${sum(1, 3)}")
    println("Sum with 5 args:  ${sum(1, 3, 4,56,6)}")

    println("Join some strings: ${join("happy", "pizza", "up", separator = '-')}" )
}

fun sum(n1: Int, n2: Int, vararg nums: Int): Int {
    val varargSum = if (nums.isNotEmpty()) nums.reduce { acc, int -> acc + int } else 0
    return n1 + n2 + varargSum
}

fun join(vararg strings: String, separator: Char = ' '): String {
    return strings.reduce{ acc, s -> acc + separator + s }
}

fun calculateExecutionTime(callingFun: () -> Unit): Long {
    val startTime = LocalTime.now()
    callingFun()
    val endTime  = LocalTime.now()
    return Duration.between(startTime, endTime).toMillis()
}

fun veryHeavyFun() {
    var i = 10000
    while (i > 0) {
        println("i - $i")
        i --
    }
}