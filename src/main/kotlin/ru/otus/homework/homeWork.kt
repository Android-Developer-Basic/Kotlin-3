package ru.otus.homework

import java.util.concurrent.TimeUnit

fun varArgsParam(first: Int, second: Int, vararg others: Int = IntArray(0)): Int {

    return others.reduce { acc, i ->  acc + i } + first + second
}

fun secondFunction(divider: Char = ' ', vararg strings: String): String {

    return strings.joinToString(separator = divider.toString())
}

fun highOrderFunction(callback: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    callback.invoke()
    val endTime: Long = System.currentTimeMillis()

    return TimeUnit.MILLISECONDS.toSeconds(endTime - startTime)
}