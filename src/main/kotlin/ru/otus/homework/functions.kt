package ru.otus.homework

fun main() {
    val numbers = calculation(20, 10 ,7, 4)
    println(numbers)

    val strOne = summation("Желание", "Ржавый" ,"Семнадцать", "Рассвет")
    val strTwo = summation("Желание", "Ржавый" ,"Семнадцать", "Рассвет", someChar = ',')

    println (summation(strOne))
    println (summation(strTwo))

    val funcTime1 = timeToDoFunction{ summation(strOne) }
    val funcTime2 = timeToDoFunction{ summation(strTwo) }

    println("Время выполениния функции 1: $funcTime1 мс")
    println("Время выполениния функции 2: $funcTime2 мс")
}

fun calculation(numberOne: Int, numberTwo: Int, vararg numbers: Int): Int {
    var sumVararg = 0
    for (number in numbers) sumVararg += number
    val sumAllNumbers = numberOne + numberTwo + sumVararg
    return sumAllNumbers
}

fun summation(vararg strings: String): String {
    return strings.joinToString(" ")
}

fun summation(vararg strings: String, someChar: Char): String {
    return strings.joinToString("$someChar")
}

fun timeToDoFunction(block: () -> Unit): Double {
    val startTime = System.nanoTime()
    block()
    val endTime = System.nanoTime()
    val result = endTime - startTime
    return result/1000000.0
}