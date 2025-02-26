package ru.otus.homework

import java.time.Instant

fun sumFun(n1: Int, n2: Int, vararg n3: Int): Int {
    var sum: Int = n1 + n2

    n3.forEach { sum += it }

    return sum
}

fun stringJoin(vararg s: String, separator: Char = ' '): String =
    s.joinToString(separator.toString())

fun time(func: (Int) -> Unit): Long {
    val beforeTime = Instant.now().toEpochMilli()
    func(500)
    val afterTime = Instant.now().toEpochMilli()
    val timeDiff = afterTime - beforeTime

    println("Функция выполнена за $timeDiff мc")

    return timeDiff
}