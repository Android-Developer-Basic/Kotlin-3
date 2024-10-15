package ru.otus.homework

fun main() {

    println(calculate(1, 1, 3, 4))

}

fun calculate(firstArg: Int, secondArgs: Int, vararg additionalArgs: Int): Int {

    var result = firstArg + secondArgs
    for (arg in additionalArgs) {
        result += arg
    }
    return result
}