package ru.otus.homework

import java.time.LocalTime
import java.time.temporal.ChronoUnit

/*1. Функция с обязательными и необязательными позиционными параметрами
Напишите функцию, которая будет принимать:

 - два обязательных аргумента типа Int
 - неограниченное число дополнительных аргументов типа Int
Функция должна возвращать сумму первого, второго и дополнительных аргументов.
Если в функцию передано меньше двух аргументов, программа не должна собираться (ошибка компиляции).
*/

fun intSum (firstArg: Int, secondArg: Int, vararg elseInt: Int) = firstArg + secondArg + elseInt.sum()

/*2. Функция с необязательным параметром и позиционными параметрами
Напишите функцию, которая будет принимать:

неограниченное количество строк String
необязательный параметр типа Char
Функция должна возвращать объединение строк.

по умолчанию, строки объединяется пробелом
если передан Char параметр, то объединение делается этим символом
*/

fun joinStrings(vararg strings: String, separator: Char = ' ') = strings.joinToString(separator.toString())

/*4. Функция, измеряющая время выполнения другой функции
Напишите функцию, которая бы принимала другую функцию в качестве параметра. Ваша функция должна запустить функцию,
переданную в аргументе, и вернуть время ее выполнения.

Примечание: используйте что-то долгое (например, длинный цикл с печатью) в качестве тестовой функции.
Иначе, вы можете не заметить, сколько времени прошло
*/

fun getTimeOfFunction(function: () -> Unit): Int {
    val start = LocalTime.now()
    function()
    val end = LocalTime.now()
    val duration = ChronoUnit.MILLIS.between(start, end).toInt()/1000
    return duration
}

fun main() {
    println(joinStrings("str1", "str2", "str3"))
    println(joinStrings("str1", "str2", "str3", separator = ','))


}


