package ru.otus.homework

import java.lang.System.nanoTime


fun sumInt (a: Int, b: Int, vararg others: Int) :Int = a+b+others.sum()

fun connect ( vararg stLine:String, ch:Char=' '):String {

    // проверка на пустой массив stLine
    if ( stLine.size == 0 ) {return "" }
    var stRet:String = stLine[0]

    var i=1

    while ( i < stLine.size ) {

        stRet = stRet+ch+stLine[i]

        i++
    }
    return stRet
}

fun calcTimeFun( proc: ()-> Unit):Long {

    val result = nanoTime()
    proc()
    return nanoTime()-result
}



fun longPrint ( ) {

    val n=50
    var i=0
    while ( i < n ){
        println("nebo")
        i++
    }
}



