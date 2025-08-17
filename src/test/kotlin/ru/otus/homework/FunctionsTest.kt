package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }
    @Test
    fun `test of sumOfValues with OK result`() {
        Assertions.assertEquals(
            15,
            sumOfValues(1, 2, 3, 4, 5)
        )
    }

    @Test
    fun `test of sumOfValues with throw exceptions result`() {
        assertThrows<IllegalArgumentException> {
            sumOfValues(1)
        }
    }

    @Test
    fun `test of concatWithSep with NON separator`() {
        Assertions.assertEquals(
            "str1 str2 str3",
            concatWithSep("str1", "str2", "str3")
        )
    }

    @Test
    fun `test of concatWithSep with separator`() {
        Assertions.assertEquals(
            "str1,str2,str3",
            concatWithSep("str1", "str2", "str3", c=',')
        )
    }
}