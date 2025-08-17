package ru.otus.homework

import java.lang.System.nanoTime

/**
 * Функция, принимающая другую функцию в качестве аргумента и возвращающий
 * время её выполнения в наносекундах.
 *
 * @param function Лямбда-функция, выполнение которой нужно замерить
 * @return Время выполнения функции в наносекундах
 */
fun measureExecutionTime(function: () -> Any): Long {
    val startTime = nanoTime()
    function.invoke()
    return nanoTime() - startTime
}

fun main() {
    fun testFunction() {
        var sum = 0L
        for (i in 1..10_000) {
            sum += i
            print(" $sum")
        }
    }

    val executionTime = measureExecutionTime(::testFunction)
    println("\n" + "*".repeat(10))
    println("Время выполнения функции: ${executionTime / 1_000_000.0} миллисекунд")
    println("*".repeat(10))
}