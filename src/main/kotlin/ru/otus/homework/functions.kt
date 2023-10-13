package ru.otus.homework

fun main() {
    val s1: String = calculate(10, 20)
    println(s1)

    sign(
        lastName = "Иванов",
        firstName = "Вася"
    )
}

fun sign(firstName: String, lastName: String) {
    print("Работу выполнил: $firstName $lastName")
}

fun calculate(n1: Int, n2: Int): String {
    val s = n1 + n2
    return "$n1 + $n2 = $s"
}