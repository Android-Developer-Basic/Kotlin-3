package ru.otus.homework

fun calculateSum(first: Int, second: Int, vararg others: Int): Int {
    var sum = first + second
    for (number in others) {
        sum += number
    }
    return sum
}

fun main() {
    val result1 = calculateSum(2, 3)
    println(result1)

    val result2 = calculateSum(1, 4, 5, 6, 7)
    println(result2)
}