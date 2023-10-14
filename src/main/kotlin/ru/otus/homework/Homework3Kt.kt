package ru.otus.homework

//1. Функция с обязательными и необязательными позиционными параметрами
fun sum(a: Int, b: Int, vararg n: Int): Int {
    return a + b + n.sum()
}

//2. Функция с необязательным параметром и позиционными параметрами
fun delimiterStrings(vararg strings: String, delimiter: Char = ' '): String {
    return strings.joinToString(delimiter.toString())
}

//4. Функция, измеряющая время выполнения другой функции
fun measureExecutionTime(action: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}
fun main() {
    val executionTime = measureExecutionTime {
        for (i in 1..1000000) {
            print(i)
        }
    }
    println("Время выполнения функции: $executionTime миллисекунд")
}

