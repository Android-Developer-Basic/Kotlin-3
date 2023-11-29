package ru.otus.homework

import java.util.Date

fun main() {
    println(getSum(1,2,5,6,7))
    println(getString("asdsd", "tttt", "aaaa", ch ='+'))
    println(getString("asdsd", "tttt", "aaaa"))
    println("Время выполнения функции: " + checkTime(5000, ::loops).toString() + " ms")
}

fun getSum(num1:Int, num2:Int, vararg nums: Int) : Int {
    var sum: Int = num1 + num2
    for (n in nums) {
        sum += n
    }
    return sum
}

fun getString(vararg strings: String, ch:Char = ' '): String {
    var result = ""
    for (str in strings.indices) {
        if(str != strings.size - 1)
        {
            result = result + strings[str] + ch
        }
        else {
            result += strings[str]
        }
    }
    return result
}

fun checkTime(n:Int, ops:(n2:Int) -> Unit): Long {
    val currentTime = Date().time
    ops(n)
    val finalTime = Date().time
    return finalTime - currentTime
}

fun loops(n: Int) {
    if (n > 0)
    {
        for (it in 1..n) {
            println(it)
        }
    }
}