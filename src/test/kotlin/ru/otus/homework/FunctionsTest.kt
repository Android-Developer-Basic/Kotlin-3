package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun joinTest() {
        Assertions.assertEquals(
            "str1 str2 str3",
            join("str1", "str2", "str3")
        )
    }

    @Test
    fun joinWithSeparatorTest() {
        Assertions.assertEquals(
            "str1,str2,str3",
            join("str1", "str2", "str3", separator = ',')
        )
    }
}