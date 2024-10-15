package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {

    println(calculate(1, 1, 3, 4))

    val combinedText = combiningStrings("this", "is", "a", "test", char = '-')
    println(combinedText)

    performanceTest {calculate(1, 1, 3, 4) }

}

fun calculate(firstArg: Int, secondArgs: Int, vararg additionalArgs: Int): Int {

    var result = firstArg + secondArgs
    for (arg in additionalArgs) {
        result += arg
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
    println("task take $millisecondTime ms")
}

fun testFun() {
    for (i in 0..30000) {
        println(i)
    }
}