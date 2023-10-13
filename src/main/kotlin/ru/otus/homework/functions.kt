package ru.otus.homework

fun main() {
    calculate(10, 20)
    calculate(30, 40)
    calculate(50, 60)
}

fun calculate(n1: Int, n2: Int) {
    val s = n1 + n2
    println("$n1 + $n2 = $s")
}