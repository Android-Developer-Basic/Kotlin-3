package ru.otus.homework

import java.time.LocalDateTime

fun main() {
    sumOfElement(1, 2, 3, 4, 5)
    concantination("sdsd", "dd", "s", divider = '1')
    operationTimer {
        val list = (1..10000).toList()
        list.forEach { it * 2 }
    }
}

// 1. Функция с обязательными и необязательными позиционными параметрами
fun sumOfElement(firstElement: Int, secondElement: Int, vararg otherElements: Int): Int {
    var sum = firstElement + secondElement
    otherElements.forEach { sum += it }
    println(sum)
    return sum
}

// 2. Функция с необязательным параметром и позиционными параметрами
fun concantination(vararg strings: String, divider: Char = ' '): String {
    var concantinatedStr = ""
    strings.forEach {
        concantinatedStr += it;
        if (it != strings.last()) concantinatedStr += divider
    }
    println(concantinatedStr)
    return concantinatedStr
}

// 4. Функция, измеряющая время выполнения другой функции
fun operationTimer(func: () -> Unit): Int {
    val startTime = LocalDateTime.now()
    func
    val finishTime = LocalDateTime.now()
    val operationTime = (finishTime.nano - startTime.nano) / 1000
    println("operation duration is $operationTime microseconds")
    return operationTime

}

