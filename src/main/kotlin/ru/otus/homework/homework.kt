package ru.otus.homework

import kotlin.system.measureTimeMillis

fun main() {
    val a = sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(a)




    val result = concatenation(strings = arrayOf("a", "b", "c", "d"))
    val result1 = concatenation(strings = arrayOf("a", "b", "c", "d"))
    val result2 = concatenation( "abo","ba")
    println(result)
    println(result1)
    println(result2)



    val testFunction = {
        for (i in 1..10) {
            println("$i")
            Thread.sleep(100)
        }
    }
    val executionTime = checkTime { testFunction()}
    println("Execution time: $executionTime ms")


}


fun sum(arg: Int, arg1: Int, vararg ints: Int): Int {
    return if (ints.isNotEmpty()) arg + arg1 + ints.sum()
    else arg + arg1
}


fun concatenation(vararg strings: String, char: Char = ' ', ): String {
    return strings.joinToString(separator = char.toString())

}

fun checkTime(action: () -> Unit): Long {
    val executionTime = measureTimeMillis {
        action()
    }
    return executionTime
}

