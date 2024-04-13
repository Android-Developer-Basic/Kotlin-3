package ru.otus.homework

fun secondTask(vararg strings : String, char: Char = ' '): String {
    return strings.joinToString(separator = "$char")
}
