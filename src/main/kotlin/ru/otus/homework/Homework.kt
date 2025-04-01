package ru.otus.homework

fun main() {
    println("Time: " + checkTimeToProceed { tooLongFunction(5) } + " ms")
    println("Time: " + checkTimeToProceed { notSoLongFunction(5) } + " ms")
    println("Time: " + checkTimeToProceed { fastFunction(5) } + " ms")
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


fun tooLongFunction(n:Int) {
    for (i in 0..n) {
        Thread.sleep(100)
        println("Now is $i step.")
    }
}

fun notSoLongFunction(n:Int){
    for (i in 0..n) {
        Thread.sleep(10)
        println("Now is $i step.")
    }
}

fun fastFunction(n:Int) {
    for (i in 0..n) {
        Thread.sleep(1)
        println("Now is $i step.")
    }
}