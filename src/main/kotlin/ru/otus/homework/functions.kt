package ru.otus.homework
import kotlin.system.measureTimeMillis

fun main() {}

fun sumOfNumbers(ab: Int, bc: Int, vararg n: Int): Int {
    return (ab + bc + n.sum())
}

fun sumOfStrings(vararg str: String, ch: Char = ' '): String {
    var strAll: String = str[0]
    var i = 1
    while (i < str.size) {
        strAll += ch + str[i]
        i++
    }
    return (strAll)
}

fun timeForFunction() {
    Thread.sleep(4000)
}

fun timeOfFunction(a: () -> Unit): Long {
    val elapsedTime = measureTimeMillis {
        a()
    }
    return elapsedTime
}