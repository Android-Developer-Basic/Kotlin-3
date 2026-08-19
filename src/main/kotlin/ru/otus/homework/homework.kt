package ru.otus.homework

/**
 * Задание 1.
 * Два обязательных позиционных аргумента + неограниченное число дополнительных.
 * Вызов с менее чем двумя аргументами не скомпилируется.
 */
fun sum(first: Int, second: Int, vararg others: Int): Int = first + second + others.sum()

/**
 * Задание 2.
 * Неограниченное количество строк + необязательный разделитель.
 * По умолчанию строки объединяются пробелом.
 */
fun join(vararg parts: String, separator: Char = ' '): String = parts.joinToString(separator.toString())

/**
 * Задание 4.
 * Запускает переданную функцию и возвращает время её выполнения в миллисекундах.
 */
fun benchmark(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

fun main() {
    // Задание 1:
    println(sum(1, 2))
    println(sum(1, 2, 3, 4, 5))
    //println(sum(1)) // не компилируется: нет второго обязательного аргумента

    // Задание 2:
    println(join("str1", "str2", "str3"))
    println(join("str1", "str2", "str3", separator = ','))

    // Задание 4:
    val time = benchmark {
        for (i in 1..100_000) {
            println("Итерация $i")
        }
    }
    println("Время выполнения: $time мс")
}
