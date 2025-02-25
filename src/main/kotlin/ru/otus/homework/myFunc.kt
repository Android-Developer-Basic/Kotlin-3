package ru.otus.homework
import kotlin.time.*

fun main() {
    println("## 1. Функция с обязательными и необязательными позиционными параметрами")
    println(myCalculate(10, 20, 30, 40))
    println("## 2. Функция с необязательным параметром и позиционными параметрами")
    println(myConcatenate( "str1", "str2", delimiter = ':'))
    println(" ## 3. Тестовая функция для пункта №2")
    println("В файле FunctionsTest.kt")
    println("## 4. Функция, измеряющая время выполнения другой функции")
    println("Run: ${myMeasurement(::simpleLoop)}")

}

fun myCalculate(arg1: Int, arg2: Int, vararg n: Int): Int {
    var sum = arg1 + arg2
    n.forEach { sum += it }
    return sum
}

fun myConcatenate(vararg n: String, delimiter : Char = ' '): String {
    var strRes = ""
    n.forEach { strRes += it + delimiter }
    if (n.size >= 1)
        strRes = strRes.removeRange(strRes.length-1, strRes.length)
    return strRes
}

fun simpleLoop () {
    var sum : Long = 0
    for (i in 1..10000000000)
        ++sum
}

fun myMeasurement(pfunc: ()-> Unit) : Duration {
    val timeSource = TimeSource.Monotonic
    val mark1 = timeSource.markNow()
    pfunc()
    val mark2 = timeSource.markNow()
    return mark2 - mark1
}
