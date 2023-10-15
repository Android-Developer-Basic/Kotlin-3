package ru.otus.homework

import kotlin.random.Random

fun main() {
    var resultInts= makeSumArguments(1,3,5,6,7,8,9)
    println("сумма чисел: $resultInts")

    var resultStrings=makeSumStrings("a","b","c",separator='!')
    println("конечная строка: $resultStrings")

    var resultTime=checkExecTime{waitSomeTime()}
    println("примерное время выполнения вложенной функции: $resultTime секунд")
    }
fun makeSumArguments(x1: Int, x2: Int, vararg xs: Int): Int { //1 задание
    return x1 + x2 + xs.sum()
}
fun makeSumStrings(vararg strings: String, separator: Char = ' '): String{ //2 задание
    return strings.joinToString(separator = separator.toString())
}

fun checkExecTime(mySecondFunction: () -> Long): Double { //4 задание
    val startTime = System.nanoTime()
    mySecondFunction()
    val execTime = System.nanoTime() - startTime
    return execTime / 1_000_000_000.0
}

fun waitSomeTime():Long{
    var waitTime= Random.nextLong(3000,7000)
    Thread.sleep(waitTime)
    println("Time passed: $waitTime milliseconds")
    return waitTime
}
