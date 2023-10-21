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

    // Тестовая функция для пункта №1
    @Test
    fun calcSummary() {
        // check 2 values
        Assertions.assertEquals(
            7,
            summary(3, 4)
        )
        // check more 2 values
        Assertions.assertEquals(
            15,
            summary(1,3,7,0,4)
        )
        // compile error
        // summary(1)
    }

    // 3. Тестовая функция для пункта №2
    @Test
    fun checkJoinString() {
        // only string
        Assertions.assertEquals(
            "str1 str2 str3",
            joinString("str1", "str2", "str3")
        )
        // string with separator
        Assertions.assertEquals(
            "str1,str2,str3",
            joinString("str1", "str2", "str3", ch = ',')
        )
    }
}