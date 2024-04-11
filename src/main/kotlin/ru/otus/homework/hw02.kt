package ru.otus.homework

import kotlin.time.measureTime

fun main() {
    println(sum(1, 2, 3).withPrefix("Сумма элементов"))

    println(join("Hello", "world"))
    println(join("snake", "case", "style", sep = '_'))

    println(
        getFuncDurationMillis {
            Thread.sleep(500)
        }.formattedAsMillis()
    )
}

/**
 * Задание 1
 * Возвращает сумму двух или более целых чисел
 */
fun sum(n1: Int, n2: Int, vararg n: Int): Int {
    return n1 + n2 + n.sum();
}

/**
 * Задание 2
 * Возвращает объединённую строку из слов, разделённых символом-разделителем
 */
fun join(vararg words: String, sep: Char = ' '): String {
    return words.joinToString(separator = sep.toString())
}

/**
 * Задание 4
 * Возвращает длительность выполнения функции в миллисекундах
 */
fun getFuncDurationMillis(func: () -> Unit): Long {
    return measureTime {
        func.invoke()
    }.inWholeMilliseconds
}

/**
 * Текстовый формат числа с префиксом вида "значение:"
 */
fun Number.withPrefix(prefix: String): String = "%s: %s".format(prefix, this)

/**
 * Текстовый формат длительности в миллисекундах
 */
fun Long.formattedAsMillis(): String = "$this мсек"