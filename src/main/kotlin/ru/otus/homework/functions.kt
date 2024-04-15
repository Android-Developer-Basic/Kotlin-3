package ru.otus.homework

import java.time.LocalDate
import java.util.concurrent.TimeUnit

fun main() {
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

// ##1

fun myFunction(a: Int, b: Int, vararg c: Int): Int{
    /*if (a == null || b == null){
        throw IllegalArgumentException("Оба обязательных параметра должны быть переданы")
    }
    Закомментил данное условие т.к. Git ругается при коммите, ведь это условие и так выполняется при запуске функции
     */
    var sum = 0
    sum = a + b + c.sum() // Использую метод sum() для подсчета суммы массива
    return sum
}
// ##2
fun myFunctionString(vararg str: String, chr: Char? = ' '): String {
    return str.joinToString(chr.toString())
}

// ##4

fun ExecutionTime(function: () -> Unit): Long {
    val startTime = System.nanoTime()
    function()
    return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime)
}