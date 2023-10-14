package ru.otus.homework

import kotlinx.datetime.Clock
import kotlin.time.Duration

fun sum(m1: Int, m2: Int, vararg n: Int): Int = m1 + m2 + n.sum()

fun join(vararg args: String, delimiter: Char = ' '): String = args.joinToString(separator = delimiter.toString())

fun profileTime(block: () -> Any?): Duration {
    val start = Clock.System.now()
    block()
    return Clock.System.now() - start
}

fun main() {
    val duration: Duration = profileTime {
        (0 until 1_000_000).forEach { print(it) }
    }
    println()
    println("Время выполнения: ${duration.inWholeNanoseconds} нс")
    println("Сумма 1: ${sum(1, 2)}")
    println("Сумма 2: ${sum(1, 2, 3, 4, 5)}")
    println("Объединение по умолчанию: ${join("str1", "str2", "str3")}")
    println("Объединение через запятую: ${join("str1", "str2", "str3", delimiter = ',')}")
}