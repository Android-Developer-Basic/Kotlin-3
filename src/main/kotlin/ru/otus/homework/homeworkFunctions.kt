package ru.otus.homework

class HomeworkFunctions {

    fun sum(first: Int, second: Int, vararg others: Int): Int {
        return first + second + others.sum()
    }

    fun joinStrings(vararg strings: String, separator: Char = ' '): String {
        return strings.joinToString(separator.toString())
    }

    fun measureExecutionTime(block: () -> Unit): Long {
        val startTime = System.currentTimeMillis()
        block()
        val endTime = System.currentTimeMillis()
        return endTime - startTime
    }

    fun longTask() {
        for (i in 1..5) {
            println("Шаг $i")
            Thread.sleep(500)
        }
    }
}