package ru.otus.homework

import kotlin.time.measureTime

fun exercise1(param1: Int, param2: Int, vararg params: Int): Int {
    var sum = param1 + param2
    params.forEach { sum += it }
    return sum
}

fun exercise2(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}


fun longTimeRunningFun(){
    Thread.sleep(1000)
}

fun exercise3(function: ()-> Unit) {
    println( "fun running duration: ${measureTime {
        function()
    }
    }")
}

fun exercise3b(function: ()-> Unit) {
    val startTime = System.currentTimeMillis()
    function()
    val elapsedTime = System.currentTimeMillis() - startTime
    println("fun running duration: ${elapsedTime/1000.0}s")
}


fun main() {
    println("result of sum (1,2,3,4,5) = ${exercise1(1,2,3, 4, 5)}")

    exercise3 { longTimeRunningFun() }

    exercise3b { longTimeRunningFun() }
}
