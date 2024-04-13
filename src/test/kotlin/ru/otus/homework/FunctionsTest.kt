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

    @Test
    fun homeworkJoinStringsTest1() {
        Assertions.assertEquals(
            "str1 str2 str3",
            homeworkJoinStrings("str1", "str2", "str3")
        )
    }

    @Test
    fun homeworkJoinStringsTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            homeworkJoinStrings("str1", "str2", "str3", dlm = ',')
        )
    }
}