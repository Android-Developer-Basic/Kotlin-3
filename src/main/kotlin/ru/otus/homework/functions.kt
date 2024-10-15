package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {

    println(calculate(1, 1, 3, 4))

    val combinedText = combiningStrings("this", "is", "a", "test", char = ',')
    println(combinedText)

    performanceTest { combiningStrings("this", "is", "a", "test", char = ',') }
}

fun calculate(firstValue: Int, secondValue: Int, vararg additionalValues: Int): Int {

    var result = firstValue + secondValue

    for (additionalValue in additionalValues) {
        result += additionalValue
    }
    return result
}

fun combiningStrings(vararg strings: String, char: Char = ' '): String {

    val stringResult = strings.joinToString(separator = char.toString())
    return stringResult
}

fun performanceTest(block: ()->Unit) {

    val measureTime = measureNanoTime(block)
    val millisecondTime = measureTime / 1000000F
    println("task took $millisecondTime ms")
}
