package ru.otus.homework

import kotlin.random.Random
import kotlin.time.measureTime

fun task1(n1: Int, n2: Int, vararg numbers: Int): Int {
    return numbers.sum() + n1 +n2
}

fun task2(vararg words: String, separator: Char = ' '): String {
    return words.joinToString(separator.toString())
}

fun task4(timedFun: () -> Unit) {
    val time = measureTime { timedFun() }
    println("|-------------------------------|")
    println("  function duration was ${time.inWholeMilliseconds} ms")
    println("|-------------------------------|")
}

fun task4Example() {
    task4 {
        val time = Random.nextLong(1L, 3_000L)
        Thread.sleep(time)
    }
}

fun main() {
    task4Example()
}