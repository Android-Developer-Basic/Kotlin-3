package ru.otus.homework

fun fun1MandatoryAndOptionalParams(numberOne: Int, numberTwo: Int, vararg additionalNumber: Int): Int {
    var sum = 0
    for(i in additionalNumber)
        sum += i
    return numberOne + numberTwo + sum
}

fun fun2OptionalAndPositionalParams(vararg additionalStr: String, ch: Char=' '): String {
    var result: String= ""
    for(str in additionalStr)
        result += str + ch
    return result.dropLast(1)
}

fun main() {
    println(fun1MandatoryAndOptionalParams(8, 45, 10,20))
    println(fun2OptionalAndPositionalParams("one", "two", "free", "four", "five", ch= '*'))
}