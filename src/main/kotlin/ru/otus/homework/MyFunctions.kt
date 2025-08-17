package ru.otus.homework

import java.time.LocalDate

fun sum(first: Int, second: Int): Int {
    return first + second
}

fun sum(first: String, second: String, ch: String = " " ): String {
    if (first.isEmpty() == true)
        return second
    return first + ch + second
}

fun FirstFunction(n1: Int, n2: Int, vararg params: Int): Int {
    var nRes = sum(n1, n2)
    params.forEach({nRes = sum(nRes, it)})
    return nRes
}

fun SecondFunction(ch: Char = ' ', vararg params: String): String {
    // Порядок изменить нельзя. vararg всегда должены быть после типизированных параметров.
    var sRes = ""
    params.forEach { sRes = sum(sRes, it, ch.toString() ) }
    return sRes
}

fun MyLoop() {
    for (i in 0 until 10) {
        Thread.sleep(100)
    }
}

fun Meashuring( op: () -> Unit ) {
    println("Begin: ${System.currentTimeMillis().toString()}")
    op()
    println("End: ${System.currentTimeMillis().toString()}")
}

