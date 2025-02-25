package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun concatenationTest1() {
        Assertions.assertEquals(
            "str1 str2 str3",
            myConcatenate("str1", "str2", "str3")
        )
    }
    @Test
    fun concatenationTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            myConcatenate("str1", "str2", "str3", delimiter = ',')
        )
    }
}