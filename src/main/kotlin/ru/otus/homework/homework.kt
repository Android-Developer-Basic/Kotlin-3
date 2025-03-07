package ru.otus.homework

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    task1(2,4,5,6)
    task4 {greatLoop(8)}
}

fun task1(int1:Int, int2:Int, vararg ints:Int) : Int{
    val sumOfints = ints.sum()
    val sumOfArgs = int1 + int2 + sumOfints
    println(sumOfArgs)
    return sumOfArgs
}

fun task2(
    vararg strings: String,
    char: Char = ' '
): String {
    var sumStr = ""
    sumStr.run {  }
    for (sum in strings) {
        sumStr += if (sumStr.isEmpty()) {
            sum
        } else {
            char + sum
        }
    }
    return sumStr
}

fun task4(greatLoop: () -> Unit) : Long{
    var timing = measureTimeMillis{
        greatLoop()
    }
    println("Время выполнения : ${timing} ms")
    return timing
}

private fun greatLoop(n: Int) = runBlocking {
    var count = 0
    for (n in 0..n){
        delay(100)
        count += n
    }
    println(count)
}