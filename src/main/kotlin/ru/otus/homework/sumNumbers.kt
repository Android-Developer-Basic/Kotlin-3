package ru.otus.homework

fun sumNumbers(a: Int, b: Int, vararg anyNumbers: Int): Int {
    return a + b + anyNumbers.sum()
}
