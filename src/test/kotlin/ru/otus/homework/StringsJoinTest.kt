package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringsJoinTest {
    @Test
    fun `test with default separator`() {
        assertEquals("str1 str2 str3", stringsJoin("str1", "str2", "str3"))
    }

    @Test
    fun `test with other separator`() {
        assertEquals("str1,str2,str3", stringsJoin("str1", "str2", "str3", separator = ','))
    }
}