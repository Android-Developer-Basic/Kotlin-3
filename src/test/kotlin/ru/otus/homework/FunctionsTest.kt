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
    fun sumStringsTest() {
        Assertions.assertEquals(
            "str1 str2 str3",
            sumStrings("str1", "str2", "str3")
        )
    }
    fun sumStringsTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            sumStrings("str1", "str2", "str3", separator = ',')
        )
    }
}