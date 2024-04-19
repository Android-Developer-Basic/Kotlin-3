package ru.otus.homework

import java.time.LocalDate
import kotlin.system.measureNanoTime

fun main() {

    /*  Вызов функции с обязательными и необязательными позиционными параметрами  */
    val ints = Array(6) { i -> (i + 1) }
    val sum = sumOfInts(ints[0], ints[1], ints[2], ints[3], ints[4], ints[5])
    println("сумма чисел от ${ints[0]} до ${ints.last()} равна $sum")

    /*  Вызов функции с необязательным параметром и позиционными параметрами  */
    println(makeString("строка1", "строка2", "строка3", "строка4", "строка5", divider = ';'))

    /*  Вызов функции, измеряющей время выполнения другой функции в наносекундах */
    val timeNano = measureFunExeTimeNanos(::printALotOfText)
    println("Функция выполнена за $timeNano наносекунд (${timeNano/10e5} миллисекунд)")

    println(calculate(10, 20))
    println(calculate(10, 20.5F))
    println(calculate(30.1F, 40.2F, 50.3F, 60.4F))

    println(calculate(3, 2, ::add))
    println(calculate(3, 2, ::subtract))
    println(calculate(3, 2) { n1, n2 -> n1 * n2 })

    sign(
        lastName = "Иванов",
        firstName = "Вася"
    )

    translate(calculate(1.1F, 2.2F, 3.3F)) {
        "In english: ${it.replace("+", "plus").replace("=", "equals")}"
    }
    println(
        calculate(1.1F, 2.2F, 3.3F) {
            "%.4f (с точностью до четырех знаков)".format(this)
        }
    )

    val product = 2 by 2
    println("Произведение: $product")
}

fun printALotOfText()
{
    for (i in 0 until 100000){
        println("Нужно больше текста!")
    }
}

fun measureFunExeTimeNanos(op: () -> Unit): Long
{
    val timeNano = measureNanoTime {
        op()
    }
    return timeNano
}

fun sumOfInts(int1: Int, int2: Int, vararg intN: Int): Int
{
    var sum = int1 + int2
    for (i in intN) { sum += i }
    return sum
}

fun makeString(vararg strings: String, divider: Char = ' '): String
{
    var result = ""
    for (str in strings) {
        result += str
        if (!str.equals(strings.last())){
            result += divider
        }
    }
    return result
}

infix fun Int.by(other: Int): Int = this * other

fun translate(what: String, translator: (String) -> String) {
    println(translator(what))
}

fun sign(firstName: String, lastName: String, date: LocalDate = LocalDate.now()) {
    println("Работу выполнил: $firstName $lastName, ${date.russian()}")
}

internal fun LocalDate.russian(): String {
    return "${this.dayOfMonth}.${monthValue}.${year}"
}

fun what(): String = "Огурцов"

fun calculate(n1: Int, n2: Int): String = "$n1 + $n2 = ${ n1 + n2 } ${ what() }"

fun calculate(n1: Int, n2: Float): String {
    fun add(): String {
        val s: Float

        while (true) {
            // Пример блока. Вычисляем, и сразу выходим
            val s1 = n1 + n2
            s = s1
            break
        }

        return "$n1 + $n2 = $s"
    }
    return "${ add() } ${ what() }"
}

fun Float.formatWithDot(): String = "%.2f".format(this)

fun calculate(vararg n: Float, format: Float.() -> String = Float::formatWithDot): String {
    var sum = 0F
    n.forEach { sum += it }
    return "${n.joinToString(" + ")} = ${sum.format()}"
}

fun calculate(n1: Int, n2: Int, op: (Int, Int) -> Int): String {
    val result = op(n1, n2)
    return "Результат операции $n1 и $n2 равен: $result"
}

fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
