package ru.otus.homework

//region Задание 1
fun calc(n1: Int, n2: Int, vararg other: Int): Int {
    val sum = n1 + n2 + other.sum()
    return sum
}
//endregion

//region Задание 2
fun join(vararg string: String, separator: Char = ' '): String =
    string.joinToString(separator = separator.toString())
//endregion

//region Задание 4
fun main() {
    val ms = runTime { longFunction() }
    println("Время выполнения — $ms милисекунд")
}

fun runTime(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    val time = end - start
    return time
}

fun longFunction() {
    repeat(1000000000) { i ->
        if (i % 500000000 == 0) println("$i")
    }
}
//endregion