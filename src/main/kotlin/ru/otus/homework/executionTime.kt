package ru.otus.homework


fun executionTimeOf(func: () -> Unit): Long {
    val before = System.currentTimeMillis()
    func()
    return System.currentTimeMillis() - before
}
