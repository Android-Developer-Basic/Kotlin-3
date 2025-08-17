package ru.otus.homework

import kotlin.system.measureTimeMillis

fun fun1MandatoryAndOptionalParams(numberOne: Int, numberTwo: Int, vararg additionalNumber: Int): Int {
    var sum = 0
    for(i in additionalNumber)
        sum += i
    return numberOne + numberTwo + sum
}

fun fun2OptionalAndPositionalParams(vararg additionalStr: String, ch: Char=' '): String {
    var result: String= ""
    for(str in additionalStr)
        result += str + ch
    return result.dropLast(1)
}

fun sum(a: Int, b: Int){
    var sum : Long = 0
    repeat(a) {
        repeat(b) {
            sum += a+b
        }
    }
}

fun fun4Time(numberOne: Int, numberTwo: Int, myFunction: (Int, Int)->Unit): Long {
    val time = measureTimeMillis {
        myFunction(numberOne, numberTwo)
    }
    return time
}

fun main() {
    println(fun1MandatoryAndOptionalParams(8, 45, 10,20))
    println(fun2OptionalAndPositionalParams("one", "two", "free", "four", "five", ch= '*'))
    println(fun4Time(100000,200000, :: sum))
}