package ru.otus.homework
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HomefunctionsTest {
    @Test
    fun `testcase 1`() {
        val expected = "str1 str2 str3"
        val actual = joinWords("str1", "str2", "str3")
        assertEquals(expected,actual)
    }

    @Test
    fun `testcase 2`() {
        val expected = "str1,str2,str3"
        val actual = joinWords("str1", "str2", "str3", wordSeparator = ',')
        assertEquals(expected,actual)
    }
}