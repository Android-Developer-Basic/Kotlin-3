package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun task1Test() {
        val expected = 1 + 10 + 100 + 200 + 300
        val actual = task1(1, 10, 100, 200, 300)
        Assertions.assertEquals(expected,actual)
    }

    @Test
    /*
    ## 3. Тестовая функция для пункта №2
    Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк `str1` и `str2` и `str3`:

    - Если `Char` не передан, ваша функция должна вернуть: `str1 str2 str3`
    - Если `Char` задан как `,`, ваша функция должна вернуть: `str1,str2,str3`
    */
    fun task2Test() {
        var expected = "str1 str2 str3"
        var actual = task2("str1", "str2", "str3")
        Assertions.assertEquals(expected,actual)

        expected = "str1,str2,str3"
        actual = task2("str1", "str2", "str3", separator = ',')
        Assertions.assertEquals(expected,actual)
    }

    @Test
    fun task4Test() {
        println("task4 = ${task4(::sleep1000ms)} ms")
    }

}