package ru.otus.homework

fun concatStringWithSeparator(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator = separator.toString())
}