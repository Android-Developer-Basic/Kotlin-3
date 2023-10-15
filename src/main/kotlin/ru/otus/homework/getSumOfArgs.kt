package ru.otus.homework

fun getSumOfArgs(a1: Int, a2: Int, vararg a: Int): Int {
    return a1 + a2 + a.sum()
}