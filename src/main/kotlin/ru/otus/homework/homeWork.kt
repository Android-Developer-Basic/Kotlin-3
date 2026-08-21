package ru.otus.homework

import kotlin.time.Duration
import kotlin.time.Duration.Companion.nanoseconds

fun main() {
    val time = fourthFun {
        (1..5000).toList().forEach {
            println(it)
        }
    }

    println(time)
}

fun firstFun(numb1: Int, numb2: Int, vararg numbs: Int = intArrayOf()): Int = numb1 + numb2 + numbs.sum()

fun secondFun(vararg strings: String, char: Char? = null): String = strings.joinToString((char ?: ' ').toString())

fun fourthFun(someFun: () -> Unit): Duration {
    val start = System.nanoTime()
    someFun()
    return (System.nanoTime() - start).nanoseconds
}