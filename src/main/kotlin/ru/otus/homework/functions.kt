package ru.otus.homework

import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    println(sumTwoParameters(5, 5, 5, 5, 5, 5, 5, 5, 5))
    println(secondTask("Dennis", "Nikolay", "Anton", "Otus"))
    val timeToCompile = measureTimeMillis(NameArray()::measurement)
    println("The code took to execute $timeToCompile ms")
}

fun sumTwoParameters(a: Int, b: Int, vararg n: Int): String {
    val result = a + b
    var sum = result
    n.forEach { sum += it }
    return "$result + ${n.joinToString(" + ")} = $sum"
}

fun secondTask(vararg a: String, c: Char = ' ') = a.joinToString("$c")

class NameArray {
    val nameList = arrayOf("", "", "")
    fun measurement() {
        val scanner = Scanner(System.`in`)

        for (i in nameList.indices) {
            println("Введите имя")
            val lName = scanner.nextLine()
            nameList[i] = lName
            println(nameList[i])
        }
        println(nameList.names())
    }
}

fun <T> Array<T>.names(): String {
    return buildString {
        for (i in this@names.indices) {
            append(this@names[i])

            if (i != this@names.size - 1) {
                append(", ")
            }
        }
    }
}
