package ru.otus.homework
import kotlin.system.measureTimeMillis

fun main() {}

fun summOfNumbers(ab: Int, bc: Int, vararg n: Int): Int {
    return (ab + bc + n.sum())
}

fun summOfStrings(vararg str: String, ch: Char = ' '): String {
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
    val x = elapsedTime
    return x
}