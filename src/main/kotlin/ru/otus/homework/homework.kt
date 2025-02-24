package ru.otus.homework

import java.time.LocalDateTime
import java.time.ZoneOffset


//## 1. Функция с обязательными и необязательными позиционными параметрами
//Напишите функцию, которая будет принимать:
//
//- два обязательных аргумента типа `Int`
//- неограниченное число дополнительных аргументов типа `Int`
//
//Функция должна возвращать сумму первого, второго и дополнительных аргументов.
//Если в функцию передано меньше двух аргументов, программа не должна собираться (ошибка компиляции).
fun add(arg1: Int, arg2: Int, vararg args: Int): Int {
    return arg1 + arg2 + args.sum()
}


//## 2. Функция с необязательным параметром и позиционными параметрами
//Напишите функцию, которая будет принимать:
//
//- неограниченное количество строк `String`
//- необязательный параметр типа `Char`
//
//Функция должна возвращать объединение строк.
//
//- по умолчанию, строки объединяется пробелом
//- если передан `Char` параметр, то объединение делается этим символом
fun concatenateString(vararg strings: String, separator: Char = ' '): String {
    var result = ""

    for (i in 0 until strings.size) {
        result += strings[i] + if (i != strings.size - 1) separator else ""
    }

    return result
}

//## 4. Функция, измеряющая время выполнения другой функции
//
//Напишите функцию, которая бы принимала другую функцию в качестве параметра.
//Ваша функция должна запустить функцию, переданную в аргументе, и вернуть время ее выполнения.
//
//Примечание: используйте что-то долгое (например, длинный цикл с печатью) в качестве тестовой функции. Иначе, вы можете
//не заметить, сколько времени прошло
fun timeFunc(func: () -> Unit, funcName: String): Long {
    println(">> Timing func: $funcName")
    val curTime: Long = System.currentTimeMillis()

    func()

    return (System.currentTimeMillis() - curTime)
}

// функции, время работы которых будем замерять
fun sleep(timeInSeconds: Int = 0) {
    val curTime: Long = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
    while (LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) - timeInSeconds.toLong() < curTime) {
        /* no-op */
    }
}

fun longLoop(iterations: Long = 0) {
    var j: Long = 0
    for (i in 0 .. iterations) {
        j += i
    }
    println(j)
}