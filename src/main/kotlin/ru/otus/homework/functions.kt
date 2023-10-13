package ru.otus.homework

import java.time.LocalDate

fun main() {
    println(calculate(10, 20))
    println(calculate(10, 20.5F))
    println(calculate(30.1F, 40.2F, 50.3F, 60.4F))

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

val what = "Огурцов"

fun calculate(n1: Int, n2: Int): String = "$n1 + $n2 = ${ n1 + n2 } $what"

fun calculate(n1: Int, n2: Float): String {
    val s = n1 + n2
    return "$n1 + $n2 = $s $what"
}

fun calculate(vararg n: Float): String {
    var sum = 0F
    n.forEach { sum += it }
    return "${n.joinToString(" + ")} = $sum"
}
