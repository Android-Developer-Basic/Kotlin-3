package ru.otus.homework

//task 1
fun sumOfArguments(argument1: Int, argument2: Int, vararg arguments: Int): Int {
    return argument1 + argument2 + arguments.sum()
}

//task 2
fun stringsConcatenation(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}

//task 4
fun measureTime(function: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    function()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}
fun anotherFunction() {
    for (i in 1..10000000) {
        println(i)
    }
}
fun main () {
    val time = measureTime(::anotherFunction)
    println("Performing time is $time ms")
}