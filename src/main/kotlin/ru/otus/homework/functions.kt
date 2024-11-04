package ru.otus.homework


fun main() {
    //println(sumOfAll(2,3))
    //println(concatenateStrings("boba","biba","bebra"))
//    println(
//        functionExecutionTime {
//            for (i in 0..1000000){ println("a")}
//        }
//    )
}

//Задача 1
fun sumOfAll(vararg num: Int):Int {
    if (num.size < 2) throw IllegalArgumentException("Must be 2 or more arguments")
    var sum = 0
    num.forEach{
        sum+=it
    }
    return sum
}


//Задача 2
fun concatenateStrings(vararg words: String, sep: Char = ' '): String {
    return words.joinToString(separator = sep.toString())
}

//Задача 3 выполнена в файле FunctionsTest.kt

//Задача 4
fun functionExecutionTime(func: ()->Unit): Long{
    val startTime = System.currentTimeMillis()
    func()
    return System.currentTimeMillis() - startTime
}

