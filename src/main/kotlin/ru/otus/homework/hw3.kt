package ru.otus.homework
fun main () {
    println("Задание 1")
    val result = sum(1, 2, 3, 4, 5)
    println(result)

    println("Задание 2")
    val res1 = mergeLines("привет", "котлин", sep = '-')
    println(res1)

    println("Задание 3")


}

fun sum(first: Int, second: Int, vararg additional: Int): Int {
    return first + second + additional.sum()
}

fun mergeLines(vararg lines: String, sep: Char = ' '): String {
    return lines.joinToString(separator = sep.toString())
}
