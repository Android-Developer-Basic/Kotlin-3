package ru.otus.homework

import java.time.LocalDate

fun main() {

    println(sumInts(1, 2, 3, 4))

    println(joinStrings("Hello", "World"))
    println(joinStrings("Hello", "World", separator = ','))

    val time = measureExecutionTime {
        for (i in 1..1000000) { }
    }

    println("Execution time: $time ms")

}

fun sumInts(n1: Int, n2: Int, vararg others: Int): Int {
    var sum = n1 + n2
    for (n in others) {
        sum += n
    }
    return sum
}

fun joinStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}

fun measureExecutionTime(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    return end - start
}