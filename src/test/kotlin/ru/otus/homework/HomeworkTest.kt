package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HomeworkTest {
    /*3. Тестовая функция для пункта №2
    Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк str1 и str2 и str3:

    Если Char не передан, ваша функция должна вернуть: str1 str2 str3
    Если Char задан как ,, ваша функция должна вернуть: str1,str2,str3
    */

    @Test
    fun joinStringsFunTestWithoutCharTest() {
        val expectedString = "str1 str2 str3"
        val actualString = joinStrings("str1", "str2", "str3")
        Assertions.assertEquals(expectedString, actualString)
    }

    @Test
    fun joinStringsFunTestWithCharTest() {
        val expectedString = "str1,str2,str3"
        val actualString = joinStrings("str1", "str2", "str3", separator = ',')
        Assertions.assertEquals(expectedString, actualString)
    }

    @Test
    fun getTimeOfFunctionTest() {
        val expectedSecond = 5
        val actualTime = getTimeOfFunction {
            Thread.sleep(5_000)
        }
        Assertions.assertEquals(expectedSecond,actualTime)
    }
}