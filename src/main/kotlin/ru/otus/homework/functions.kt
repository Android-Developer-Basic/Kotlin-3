package ru.otus.homework

import java.time.LocalDate

 fun main(){
    val ssum = intArrayOf(2, 3, 2)
    printArg(5, 10, 2, 3)
    printArg(5, 10, 2, 5, 10, 50)
    printArg(5, 10, *ssum) //с использованием оператора *
}


fun printArg(num1: Int, num2: Int, vararg num3: Int) {
    var result = 0
    for (nums in num3)
        result += nums
    //println("Summ element $result")
    val a = result
    val sum = num1 + num2 + a
    println("Sum element $sum")
}
