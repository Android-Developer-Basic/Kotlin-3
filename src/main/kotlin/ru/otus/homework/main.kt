package ru.otus.homework

fun fun1MandatoryAndOptionalParams(numberOne: Int, numberTwo: Int, vararg additionalNumber: Int): Int {
    var sum = 0
    for(i in additionalNumber)
        sum += i
    return numberOne + numberTwo + sum
}

fun main() {
    println(fun1MandatoryAndOptionalParams(8, 45, 10,20))
}