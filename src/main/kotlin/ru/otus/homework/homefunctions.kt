package ru.otus.homework

import kotlin.system.measureTimeMillis

fun main() {
    println(sum(20, 20, 30, 50, 60 ))
    println(joinWords("Привет", "мир", wordSeparator = '+'))
    println(countTime (:: printNumbers))
}

fun sum (n1:Int, n2:Int, vararg n3:Int): Int {
    return  n1 + n2 + n3.sum()
}

fun joinWords (vararg str1: String, wordSeparator: Char = ' '): String {
    return str1.joinToString(wordSeparator.toString())
}

fun countTime (func: () -> Unit): Long {
    return measureTimeMillis(func)
}

fun printNumbers ()  {
    for (i in 0 until 1000000) {
        println(i)
    }
}




