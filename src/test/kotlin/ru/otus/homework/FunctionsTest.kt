package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

    @Test
    fun joinStringsTest() {
        val hmFun = HomeworkFunctions()
        assertEquals(
            "str1 str2 str3",
            hmFun.joinStrings("str1", "str2", "str3")
        )
        assertEquals(
            "str1,str2,str3",
            hmFun.joinStrings("str1", "str2", "str3", separator = ',')
        )
    }
}