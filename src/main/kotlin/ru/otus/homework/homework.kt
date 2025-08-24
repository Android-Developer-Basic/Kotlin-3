package ru.otus.homework

import kotlin.system.measureTimeMillis


fun function1(int1: Int, int2: Int, vararg n: Int): Int {
    var sum = int1 + int2

    if (!n.isEmpty()) n.forEach { sum += it } else throw IllegalArgumentException()

    return sum
}

fun function2(vararg s: String, char1: Char = ' '): String {
    val sb = StringBuilder()

    s.forEach { string -> sb.append(string).append(char1) }

    return sb.toString()
}

fun function3(char: Char, list: ArrayList<String>, f: (Char, ArrayList<String>) -> List<String>): String {

    val duration = measureTimeMillis {
        f(char, list)
    }

    return ("Время выполнения = ${duration / 1000} секунд")
}

fun function4(char: Char, list: ArrayList<String>): List<String> {

    val newArray = mutableListOf<String>()

    list.forEach { string ->
        if (string.contains(char)) newArray.add(string)
        Thread.sleep(2000)
    }

    return newArray
}