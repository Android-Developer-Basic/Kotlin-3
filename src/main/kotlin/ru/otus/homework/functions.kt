package ru.otus.homework

import java.time.LocalDate

fun main() {
    val s1: String = calculate(10, 20)
    println(s1)

    sign(
        lastName = "Иванов",
        firstName = "Вася"
    )
}

fun sign(firstName: String, lastName: String, date: LocalDate = LocalDate.now()) {
    print("Работу выполнил: $firstName $lastName, ${date.russian()}")
}

internal fun LocalDate.russian(): String {
    return "${this.dayOfMonth}.${monthValue}.${year}"
}

fun calculate(n1: Int, n2: Int): String {
    val s = n1 + n2
    return "$n1 + $n2 = $s"
}