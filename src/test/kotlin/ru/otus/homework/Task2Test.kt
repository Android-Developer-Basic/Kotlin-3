package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task2Test {

    /**
     * Проверка случая, когда дополнительный разделитель не указан.
     * Ожидается объединение строк пробелом.
     */
    @Test
    fun testDefaultSeparator() {
        val expectedResult = "str1 str2 str3"
        val actualResult = joinStrings("str1", "str2", "str3")

        assertEquals(expectedResult, actualResult)
    }

    /**
     * Проверка случая, когда задан специальный разделитель ','
     * Ожидается объединение строк запятыми.
     */
    @Test
    fun testCustomCommaSeparator() {
        val expectedResult = "str1,str2,str3"
        val actualResult = joinStrings("str1", "str2", "str3", separator = ',')

        assertEquals(expectedResult, actualResult)
    }

}