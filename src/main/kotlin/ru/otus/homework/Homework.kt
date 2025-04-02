package ru.otus.homework

fun main() {
    println("Time: " + checkTimeToProceed { longFunction(5) } + " ms")
    println("Time: " + checkTimeToProceed { longFunction(5, 10) } + " ms")
    println("Time: " + checkTimeToProceed { longFunction(5, 1) } + " ms")
}

fun sumTwoOrMoreArgs(first:Int, second:Int, vararg param: Int): Int {
    return first + second + param.sum()
}

fun stringConcatenates(vararg strings: String, char: Char = ' '): String{
    return strings.joinToString(separator = char.toString())
}

fun checkTimeToProceed(f:() -> Unit): Long {
    val firstTime = System.currentTimeMillis()
    f()
    return System.currentTimeMillis() - firstTime
}


fun longFunction(steps:Int, delay:Long = 100) {
    for (i in 0..steps) {
        Thread.sleep(delay)
        println("Now is $i step.")
    }
}