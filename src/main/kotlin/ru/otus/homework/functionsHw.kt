package ru.otus.homework

fun calculateHw(
    n1: Int, n2: Int, vararg numbers: Int = intArrayOf(0)
) : Int {
    var sum = n1 + n2
    numbers.forEach { sum += it }

    return sum
}