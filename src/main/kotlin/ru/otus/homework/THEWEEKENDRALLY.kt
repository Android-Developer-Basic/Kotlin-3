package ru.otus.homework

import ru.otus.homework.weekndsum
import java.awt.image.renderable.ParameterBlock

fun main(){
    println (weekndsum(10, 20))
    println(weekndsum(20, 40 ))

    println(weekndsayname("What","you doing","HERE",separator = ','))
    println(weekndsayname1("ALICE","ALINA","POLINA",separator = ' '))

    val timeW = weekndMeasureTime {
        heavyTask()
    }
    println(">>> HeavyTASKTIME: $timeW ms")
    }

fun weekndsum(first: Int, second: Int,vararg num:Int ):Int{
    var total = first + second
    for (number in num) {
        total += number
    }
    return total
}

fun weekndsayname (vararg words: String, separator: Char = ','): String{
    return words.joinToString(separator=separator.toString())
}
fun weekndsayname1 (vararg words: String, separator: Char = ' '): String {
    return words.joinToString(separator=separator.toString())
}
fun weekndMeasureTime(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    return end - start
}
fun heavyTask() {
    var count = 0
    for (i in 1..500_000) {
        if (i % 100_000 == 0) {
            count++
            println(" FAZ: $i")
        }
    }
    println("VSEGO FAZ: $count")
}
