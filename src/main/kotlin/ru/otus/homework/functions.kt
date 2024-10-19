package ru.otus.homework

fun main() {
    println("task1 = ${task1(1, 10, 100, 200, 300).toString()}")
    println("task2 = \"${task2("str1", "str2", "str3")}\"")
    println("task2 = \"${task2("str1", "str2", "str3", separator = ',')}\"")
    println("task4 = ${task4(::sleep1000ms)} ms")
}

/*
## 1. Функция с обязательными и необязательными позиционными параметрами
Напишите функцию, которая будет принимать:

- два обязательных аргумента типа `Int`
- неограниченное число дополнительных аргументов типа `Int`

Функция должна возвращать сумму первого, второго и дополнительных аргументов.
Если в функцию передано меньше двух аргументов, программа не должна собираться (ошибка компиляции).
 */
fun task1(arg1: Int, arg2: Int, vararg args: Int): Int {
    var result = arg1 + arg2
    for( i in args ){
        result += i
    }
    return result
}

/*
## 2. Функция с необязательным параметром и позиционными параметрами
Напишите функцию, которая будет принимать:

- неограниченное количество строк `String`
- необязательный параметр типа `Char`

Функция должна возвращать объединение строк.

- по умолчанию, строки объединяется пробелом
- если передан `Char` параметр, то объединение делается этим символом
 */
fun task2(vararg strings: String, separator: Char = ' '): String {
    var result = ""
    for( s in strings ){
        result += s + separator
    }
    if(result.isNotEmpty()) {
        result = result.substring(0, result.length - 1)
    }
    return result
}

fun sleep1000ms() {
    Thread.sleep(1000L)
}

/*
## 4. Функция, измеряющая время выполнения другой функции

Напишите функцию, которая бы принимала другую функцию в качестве параметра.
Ваша функция должна запустить функцию, переданную в аргументе, и вернуть время ее выполнения.

Примечание: используйте что-то долгое (например, длинный цикл с печатью) в качестве тестовой функции. Иначе, вы можете
не заметить, сколько времени прошло
 */
fun task4(whatToMeasure: ()->Unit ): String {
    val startTime = System.currentTimeMillis()
    whatToMeasure()
    return (System.currentTimeMillis() - startTime).toString()
}