package ru.otus.homework

fun main() {
    val s1: String = calculate(10, 20)
    println(s1)

    calculate(30, 40)
    calculate(50, 60)
}

fun calculate(n1: Int, n2: Int): String {
    val s = n1 + n2
    return "$n1 + $n2 = $s"
}