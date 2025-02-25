package ru.otus.homework

import kotlin.system.measureTimeMillis


fun main() {
    // Измеряем время выполнения функции
    val time = TimeCounter(::longFunction)

    // Выводим результат
    println("Время выполнения: ${time}мс")
}
fun test1(a: Int, b:Int, vararg n: Int):Int{
    var sum = a + b
    n.forEach { sum += it }
    return sum
}

fun test2(vararg str:String, c:Char = ' '):String{
    var sum = str[0]
    str.drop(1).forEach { sum+= c + it }
    return sum
}

// Функция, которая принимает другую функцию и возвращает время её выполнения
fun TimeCounter(block: () -> Unit): Long {
    return measureTimeMillis {
        block() // Выполняем переданную функцию
    }
}

// Тестовая функция, которая выполняет долгую операцию (например, цикл с печатью)
fun longFunction() {
    for (i in 1..10_000) {
        println("Iteration $i")
    }
}
