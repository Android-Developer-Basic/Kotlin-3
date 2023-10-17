package ru.otus.homework
fun main () {
    println("Задание 1")
    val result = sum(1, 2, 3, 4, 5)
    println(result)


}

fun sum(first: Int, second: Int, vararg additional: Int): Int {
    return first + second + additional.sum()
}