package ru.otus.homework
fun main() {
    println("Примеры вызовов:")
    println("sumWithVararg(1, 2) = ${sumWithVararg(1, 2)}")
    println("sumWithVararg(1, 2, 3) = ${sumWithVararg(1, 2, 3)}")
    println("sumWithVararg(1, 2, 3, 4, 5, 6) = ${sumWithVararg(1, 2, 3, 4, 5, 6)}")

    println("\nТеперь попробуйте сами!")
    println("Введите числа через пробел:")

    val inputNumbers = readln().split(' ').map { it.toInt() }

    if (inputNumbers.size < 2) {
        println("ОШИБКА компиляции: нужно ввести как минимум два числа!")
    }

    val first = inputNumbers[0]
    val second = inputNumbers[1]
    val additionalNumbers = inputNumbers.drop(2).toIntArray()

    val result = sumWithVararg(first, second, *additionalNumbers)
    println("Результат: $result")
}

fun sumWithVararg(first: Int, second: Int, vararg numbers: Int): Int {
    var sum = first + second
    numbers.forEach { sum += it }
    return sum
}