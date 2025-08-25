package ru.otus.homework

fun main() {
    println(sumAll(null, null))
    println(concatAll("arg1", "arg2", "arg3", separator = '+'))
    println("duration is ${duration { Thread.sleep(1100) }}")
}

// ## 1. Функция с обязательными и необязательными позиционными параметрами
internal fun sumAll(field1: Int?, field2: Int?, vararg fields: Int?): Int {
    var sum: Int = (field1 ?: 0) + (field2 ?: 0)
    for(field in fields){
        sum += (field ?: 0)
    }

    return sum
}

//## 2. Функция с необязательным параметром и позиционными параметрами
internal fun concatAll(vararg args: String, separator: Char = ' ') : String {
    var concatenation = ""
    args.forEach { v -> concatenation += v + separator.toString() }

    return concatenation.substring(0, concatenation.length - 1)
}

//## 4. Функция, измеряющая время выполнения другой функции
fun duration( callback: () -> Unit): Long {
    val before = System.currentTimeMillis()
    callback()
    val after = System.currentTimeMillis()

    return after - before
}