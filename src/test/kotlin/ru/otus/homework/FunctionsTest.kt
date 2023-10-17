package ru.otus.homework


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlinx.coroutines.*


class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

/*
3. Тестовая функция для пункта №1

Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк str1 и str2 и str3:

Если Char не передан, ваша функция должна вернуть: str1 str2 str3
Если Char задан как ,, ваша функция должна вернуть: str1,str2,str3

 */
    @Test
    fun function_2_test01() {
        Assertions.assertEquals(
            "str1 str2 str3",
            function_2("str1","str2","str3")
        )
        Assertions.assertEquals(
            "str1,str2,str3",
            function_2("str1","str2","str3", c=','))
    }

    @Test
    fun function_1_test01() {
        Assertions.assertEquals(
            15,
            function_1(1,2,3,4,5)
        )
    }

    @Test
    fun function_3_test01() {
        Assertions.assertTrue(
            timer(){
                runBlocking {
                    delay(1000L)
                }
            } >= 1000L
        )
    }
}