package ru.otus.homework

//import java.time.LocalDate

fun main() {
    println(calculate(1,2, 3, 4))
}

fun calculate(num1: Int, num2: Int, vararg nums: Int): String {
    var sum = num1 + num2
    nums.forEach { sum += it }
    return "$num1 + $num2 + ${nums.joinToString(" + ")} = $sum"
}
