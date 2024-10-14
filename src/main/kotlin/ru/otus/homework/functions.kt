package ru.otus.homework

import kotlin.random.Random
import kotlin.time.Duration
import kotlin.time.measureTime


fun main() {
    println(getFunExecutionTime(3000,97..122, ::generateAndPrintRandomCharArray))
}

fun sumOfNumbers(first: Int, second: Int, vararg additional: Int): Int = first + second + additional.sum()

fun stringConcatenation(vararg strings: String, concatenation: Char = ' ') = strings
    .joinToString(concatenation.toString())

fun getFunExecutionTime(arraySize: Int, charRange: IntRange, op: (Int,IntRange) -> Unit): Duration =
    measureTime { op(arraySize,charRange) }

fun generateAndPrintRandomCharArray(arraySize: Int, charRange: IntRange) {
    CharArray(arraySize)
        .map{
    Random.nextInt(charRange.first, charRange.last).toChar()
}
        .forEach{ println(it) }
}
