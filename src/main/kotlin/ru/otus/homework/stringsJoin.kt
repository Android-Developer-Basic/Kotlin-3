package ru.otus.homework

fun stringsJoin(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator = separator.toString())
}