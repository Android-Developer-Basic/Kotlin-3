package ru.otus.homework

/**
 * Объединяет переданные строки в одну строку.
 *
 * @param strings   переменное количество строковых аргументов, подлежащих объединению
 * @param separator необязательный разделительный символ между элементами,
 *                  по умолчанию используется пробел (' ')
 * @return новую строку, состоящую из объединения всех элементов массива strings с указанным разделителем
 *
 * Example usage:
 * ```
 * val result1 = joinStrings("Hello", "world") // Результат: Hello world
 * val result2 = joinStrings("Kotlin", "is", "great", separator = '_') // Результат: Kotlin_is_great
 * ```
 */
fun joinStrings(vararg strings: String, separator: Char = ' ') =
    strings.joinToString(separator.toString())
