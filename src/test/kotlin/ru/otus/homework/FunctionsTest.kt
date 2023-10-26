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

    //task 3
    @Test
    fun ifSeparatorIsEmptyTest() {
        Assertions.assertEquals(
            "str1 str2 str3",
            stringsConcatenation("str1", "str2", "str3")
        )
    }

    @Test
    fun ifSeparatorIsFillTest() {
        Assertions.assertEquals(
            "str1,str2,str3",
            stringsConcatenation("str1", "str2", "str3", separator = ',')
        )
    }
}