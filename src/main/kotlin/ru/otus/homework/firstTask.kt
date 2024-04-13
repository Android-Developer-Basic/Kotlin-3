package ru.otus.homework

fun firstTask (first:Int, second:Int, vararg ints: Int) : Int {
    var sum = 0
    ints.forEach { sum += it }
    return first + second + sum
}

//fun main() {
//    println(firstTask(1,1))
//}


