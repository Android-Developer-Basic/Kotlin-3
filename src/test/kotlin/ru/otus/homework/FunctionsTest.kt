package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

    /**
     * ## 3. Тестовая функция для пункта №2
     * Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк `str1` и `str2` и `str3`:
     *
     * - Если `Char` не передан, ваша функция должна вернуть: `str1 str2 str3`
     * - Если `Char` задан как `,`, ваша функция должна вернуть: `str1,str2,str3`
     * */
    @Test
    fun forNumberTwo() {
        Assertions.assertEquals(
            "str1 str2 str3",
            numberTwo("str1", "str2", "str3")
        )
        Assertions.assertEquals(
            "str1,str2,str3",
            numberTwo("str1", "str2", "str3", c = ',')
        )
    }
}