package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringsTest {
    @Test
    fun `testcase 1`() {
        val expected = "str1" + " " + "str2" + " " + "str3"
        val actual = getString("str1", "str2", "str3")
        Assertions.assertEquals(expected, actual)
    }
    @Test
    fun `testcase 2`() {
        val expected = "str1" + "," + "str2" + "," + "str3"
        val actual = getString("str1", "str2", "str3", ch = ',')
        Assertions.assertEquals(expected, actual)
    }
}