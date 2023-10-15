package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConcatStringWithSeparator {
    @Test
    fun `test case 1`() {
        Assertions.assertEquals(
            "str1 str1 str1",
            concatStringWithSeparator("str1", "str1", "str1")
        )
    }

    @Test
    fun `test case 2`() {
        Assertions.assertEquals(
            "str1,str1,str1",
            concatStringWithSeparator("str1", "str1", "str1", separator = ',')
        )
    }
}