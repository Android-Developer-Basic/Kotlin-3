package ru.otus.homework

import javax.swing.JToolBar.Separator

fun sum(n: Int, m: Int, vararg k: Int): Int {
    var sum = n + m
    k.forEach { sum += it }
    return sum
}

fun concatStringWithSeparator( vararg strings:String,separator: Char= " ".single(),):String{
    var result=""
    if (strings.isEmpty()){
        return result
    }
    result =strings[0]
    for (i in 1 ..< strings.size){
        result += separator.toString() + strings[i]
    }
    return result
}

fun getExecutionTime( op: () -> Unit): String {
    val startTime = System.currentTimeMillis()
    op()
    val endTime = System.currentTimeMillis()
    return "Время выполнения ${endTime-startTime}"
}