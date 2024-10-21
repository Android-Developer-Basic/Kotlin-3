package ru.otus.homework

fun stringCombination(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator = separator.toString())
}

fun main() {
    val result1 = stringCombination("Привет", "мир")
    println(result1)

    val result2 = stringCombination("Kotlin", "is", "fun", separator = '-')
    println(result2)
}