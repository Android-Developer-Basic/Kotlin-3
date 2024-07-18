package ru.otus.homework

import kotlin.time.Duration
import kotlin.time.measureTime

//import java.time.LocalDate

fun main() {
    println(calculate(1,2, 3, 4))
    println(concatenate("Never", "gonna", "give", "you", "up!"))
    println(executionTime { someFunction() })
}

fun calculate(num1: Int, num2: Int, vararg nums: Int): String {
    var sum = num1 + num2
    nums.forEach { sum += it }
    return "$num1 + $num2 + ${nums.joinToString(" + ")} = $sum"
}

fun concatenate(vararg lines: String, liner: Char = ' '): String {
    return lines.joinToString("$liner")
}

fun executionTime(operation: () -> Unit): Duration {
    return measureTime(operation)
}

fun someFunction() {
    var n: Long = 1
    for (i in 1..10_000_000_000)
        n *= i
}