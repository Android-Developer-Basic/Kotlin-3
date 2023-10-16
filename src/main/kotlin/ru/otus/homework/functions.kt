package ru.otus.homework

import java.time.LocalDate

fun main() {}

fun sum(arg1: Int, arg2: Int, vararg args: Int): Int = arg1 + arg2 + args.sum()

fun concat(vararg args: String, connector: Char = ' '): String = args.joinToString(separator = connector.toString())

fun testDelay() {
    Thread.sleep(999_999L)
}

fun durationExecution(callback: () -> Unit): Long {
    val beginTime = System.nanoTime()
    callback()
    val endTime = System.nanoTime()
    val diff = endTime - beginTime
    return diff
}
