package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {

    println(calculate(1, 1))

    val combinedText = combiningStrings("this", "is", "a", "test", char = ',')
    println(combinedText)

    val millisecondTime = performanceTest { combiningStrings("this", "is", "a", "test", char = ',') }
    println("task took $millisecondTime ms")
}

fun calculate(firstValue: Int, secondValue: Int, vararg additionalValues: Int): Int {

    var result = firstValue + secondValue

    for (additionalValue in additionalValues) {
        result += additionalValue
    }
    return result
}

fun combiningStrings(vararg strings: String, char: Char = ' '): String {

    val combinedText = strings.joinToString(separator = char.toString())
    return combinedText
}

fun performanceTest(block: ()->Unit): Float {

    val measureTime = measureNanoTime(block)
    val millisecondTime = measureTime / 1000000F
    return millisecondTime
}
