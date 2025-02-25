package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Homework02Test {
    @Test
    fun `haveSomeFun Testcase 1`() {
        Assertions.assertEquals(
            "str1 str2 str3",
            haveSomeFun("str1", "str2", "str3")
        )
    }

    @Test
    fun `haveSomeFun Testcase 2`() {
        Assertions.assertEquals(
            "str1,str2,str3",
            haveSomeFun("str1", "str2", "str3", c = ',')
        )
    }
}