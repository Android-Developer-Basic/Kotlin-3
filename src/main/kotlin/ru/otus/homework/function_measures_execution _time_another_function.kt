package ru.otus.homework

import kotlin.system.measureTimeMillis
fun measureExecutionTime(block: () -> Unit): Long {
    return measureTimeMillis {
        block()
    }
}

fun longRunningFunction() {
    val iterations = 100_000
    var total = 0

    for (i in 1..iterations) {
        if (i % 10_000 == 0) {
            println("Выполнено $i итераций из $iterations")
        }
        total += i
    }
    println("Функция завершена! Итог: $total")
}

fun main() {
    val executionTime = measureExecutionTime { longRunningFunction() }
    println("Время выполнения: $executionTime мс")
}