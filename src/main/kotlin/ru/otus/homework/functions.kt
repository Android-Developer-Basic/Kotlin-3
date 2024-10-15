package ru.otus.homework

fun main() {

    val combinedText = combiningStrings("this", "is", "a", "test", char = '-')
    println(combinedText)
}

fun combiningStrings(vararg strings: String, char: Char = ' '): String {

    val stringResult = strings.joinToString(separator = char.toString())
    return stringResult
}