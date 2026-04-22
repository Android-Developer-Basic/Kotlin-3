package ru.otus.homework

import java.time.LocalDateTime
import java.time.Duration

fun main() {

}

fun sum(n1: Int, n2: Int, vararg params: Int): Int{
    return n1 + n2 + params.sum()
}

fun joinStrings(vararg strings: String, separator: Char = ' '): String{
    return strings.joinToString(separator = separator.toString())
}

fun testJoinString(): Boolean{
    var actual = joinStrings("str1", "str2", "str3")
    var expected = "str1 str2 str3"

    if(actual != expected){
        return false
    }

    actual = joinStrings("str1", "str2", "str3", separator = ',')
    expected = "str1,str2,str3"

    if(actual != expected){
        return false
    }

    return true
}

fun executionTime(op: ()->Unit): Long{
    val start = LocalDateTime.now()
    op()
    val end = LocalDateTime.now()

    return Duration.between(start, end).toMillis()
}

fun longTimeDuration() {
    for(i in 0..100000){
        println(i)
    }
}