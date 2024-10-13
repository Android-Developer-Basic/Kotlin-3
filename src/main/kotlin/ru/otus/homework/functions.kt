package ru.otus.homework

import java.util.Calendar

fun main() {

    println("Время работы функции ${measureTime(::testFunc)} миллисекунд")
}

/**
 * 1. Функция с обязательными и необязательными позиционными параметрами
 * */
fun calc(n: Int, m: Int, vararg l: Int): Int {
    if (l.isEmpty()) {
        throw Exception()
    }
    var result = n + m
    for (k in l) {
        result += k
    }
    return result
}

/**
 * 2. Функция с необязательным параметром и позиционными параметрами
 * */
fun concat(vararg v: String, c: Char = ' '): String {
    var result = ""
    for (i in v.indices) {
        result += v[i]
        if (i + 1 < v.size) {
            result += c
        }
    }
    return result
}

/**
 * 4. Функция, измеряющая время выполнения другой функции
 */
fun measureTime(f: () -> Unit): Long {
    val start = Calendar.getInstance().timeInMillis
    f.invoke()
    val end = Calendar.getInstance().timeInMillis
    return end - start
}

fun testFunc() {
    for (i in 0..1_000_000_000) {
        if (i % 100_000_00 == 0) println("Движемся. Сейчас $i")
    }
}