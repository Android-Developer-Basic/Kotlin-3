package ru.otus.homework

fun main() {
 /* 1. Функция с обязательными и необязательными позиционными параметрами.
    Напишите функцию, которая будет принимать:
        - два обязательных аргумента типа Int
        - неограниченное число дополнительных аргументов типа Int
*/

    println("1. Функции с обязательными и необязательными позиционными параметрами.")
    println(funWithUnlimitedParameters(1,2,3,4,6))
    println("-----------------------------------------------------------------------")

/* 2. Функция с необязательным параметром и позиционными параметрами.
Напишите функцию, которая будет принимать:
    - неограниченное количество строк String
    - необязательный параметр типа Char
Функция должна возвращать объединение строк.
    - по умолчанию, строки объединяется пробелом
    - если передан Char параметр, то объединение делается этим символом
*/
    println("2. Функция с необязательным параметром и позиционными параметрами.")
    println(funWithUnlimitedStrings("1", "2", "3", "4", "5"))
    println(funWithUnlimitedStrings("1", "2", "3", "4", "5", separator = '#'))
    println("-----------------------------------------------------------------------")


/* 4. Функция, измеряющая время выполнения другой функции.
Напишите функцию, которая бы принимала другую функцию в качестве параметра.
Ваша функция должна запустить функцию, переданную в аргументе, и вернуть время ее выполнения.
*/
    println("4. Функция, измеряющая время выполнения другой функции.")
    val time = calculateTime(200000, ::longCalculatingFunction)
    println("Время выполнения функции - $time сек")

}


fun funWithUnlimitedParameters(param1: Int, param2: Int, vararg param3: Int): Int {
    println("param1 - $param1, param2 - $param2, vararg - ${param3.joinToString(", ")}")
    return param1 + param2 + param3.sum()
}

fun funWithUnlimitedStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}


fun calculateTime(iterationCount: Long, function: (Long) -> Any): Long {
    val start = System.currentTimeMillis()
    function(iterationCount)
    val end = System.currentTimeMillis()
    return (end - start) / 1000
}

fun longCalculatingFunction(iterationCount: Long): Long {
    var res = 0L
    for (i in 1..iterationCount) {
        for (j in 1..iterationCount) {
            res = i + j
        }
    }
    return res
}