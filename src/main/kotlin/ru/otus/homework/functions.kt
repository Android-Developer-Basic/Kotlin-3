package ru.otus.homework

import java.time.LocalDate

fun con(vararg string: String, ch: Char = ' '): String {
    val ch1: String = ch.toString()
    var result = ""
    string.forEach { result = result.plus(it).plus(ch1) }
    println(result)
    return result
}

fun main() {
    con("Hello", "Privet", "Ciao", ch='+')
    con("Hello", "Privet", "Ciao")

}
