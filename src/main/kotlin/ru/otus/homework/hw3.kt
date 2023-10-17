package ru.otus.homework
import kotlin.system.measureTimeMillis

fun main () {
    println("Задание 1")
    val result = sum(1, 2, 3, 4, 5)
    println(result)

    println("Задание 2")
    val res1 = mergeLines("привет", "котлин", sep = '-')
    println(res1)

    println("Задание 4")
    val executionTime = runAndMeasureTime(::testFunction)
    println("Execution time: $executionTime milliseconds")

}

fun sum(first: Int, second: Int, vararg additional: Int): Int {
    return first + second + additional.sum()
}

fun mergeLines(vararg lines: String, sep: Char = ' '): String {
    return lines.joinToString(separator = sep.toString())
}


fun runAndMeasureTime(function: () -> Unit): Long {
    val executionTime = measureTimeMillis {
        function.invoke()
    }
    return executionTime
}
fun testFunction() {
    for (i in 1..100000000) {
        println("Executing testFunction: $i")
    }
}