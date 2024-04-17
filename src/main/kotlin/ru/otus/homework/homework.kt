package ru.otus.homework

import kotlin.random.Random
import kotlin.time.Duration
import kotlin.time.measureTime

// 1. Функция с обязательными и необязательными позиционными параметрами
fun sumArgs(first: Int, second: Int, vararg others: Int) = first + second + others.sum()

// 2. Функция с необязательным параметром и позиционными параметрами
fun concatenate(vararg str: String, separator: Char = ' ') = str.joinToString(separator.toString())

// 4. Функция, измеряющая время выполнения другой функции
// Реализовано для функций типа type, чтобы не дублировать библиотечную measureTime
fun calculateTime(min: Long, max: Long, function: (Long, Long) -> Unit): Duration {
    return measureTime { function.invoke(min, max) }
}

/**
 * Type numbers from 0 to 9 with input rate between min and max.
 */
fun type(min: Long, max: Long) {
    for (i in 0..9) {
        print("$i ")
        Thread.sleep(Random.nextLong(min, max))
    }
    println()
}

fun main() {
    // Print numbers from 0 to 9, then on next line execution time
    println("Fast: ${calculateTime(1L, 3L, ::type)}\n")
    println("Average: ${calculateTime(50L, 100L) { min, max -> type(min, max) }}\n")
    println("Slow: ${measureTime { type(150L, 350L) }}")
}
