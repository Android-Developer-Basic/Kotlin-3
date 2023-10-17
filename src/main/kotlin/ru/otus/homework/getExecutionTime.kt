package ru.otus.homework

fun getExecutionTime(testFunction: () -> Any): String {
    val startTime = System.currentTimeMillis()
    testFunction()
    val endTime = System.currentTimeMillis()

    return "Execution time is ${endTime - startTime} milliseconds"
}
