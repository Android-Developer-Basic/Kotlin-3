package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class fun2OptionalAndPositionalParamsTest {
    @Test
    fun `testcase 1`() {
        val expected : String = "str1 str2 str3"
        val actual = fun2OptionalAndPositionalParams("str1","str2","str3")
        assertEquals(expected, actual)
    }

    @Test
    fun `testcase 2`() {
        val expected : String = "str1,str2,str3"
        val actual = fun2OptionalAndPositionalParams("str1","str2","str3",ch=',')
        assertEquals(expected, actual)
    }
}
