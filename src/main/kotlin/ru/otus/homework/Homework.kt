package ru.otus.homework

import kotlin.system.measureTimeMillis

fun main() {
    val a = sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val b = alternativeSum(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(a)
    println(b)


    val result = concatenation(strings = arrayOf("a", "b", "c", "d"), char = '!')
    val result1 = concatenation(strings = arrayOf("a", "b", "c", "d"))
    println(result)
    println(result1)

    val testFunction = {
        for (i in 1..10) {
            println("$i")
            Thread.sleep(100)
        }
    }
    val executionTime = checkTime { testFunction() }
    println("Execution time: $executionTime ms")

}


fun sum(arg: Int, arg1: Int, vararg ints: Int): Int {
    return if (ints.isNotEmpty()) arg + arg1 + ints.sum()
    else arg + arg1
}

fun alternativeSum(arg: Int, arg1: Int, vararg ints: Int): Int {
    var result: Int = arg + arg1
    if (ints.isNotEmpty()) {
        for (int in ints) {
            result += int
        }
    }
    return result
}


fun concatenation(vararg strings: String, char: Char = ' '): String {
    return strings.joinToString(separator = char.toString())

}

fun checkTime(action: () -> Unit): Long {
    val executionTime = measureTimeMillis {
        action()
    }
    return executionTime
}

