package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JoinTest {

    @Test
    fun testDefaultJoin() = assertEquals("str1 str2 str3", join("str1", "str2", "str3"))

    @Test
    fun testCommaJoin() = assertEquals("str1,str2,str3", join("str1", "str2", "str3", delimiter = ','))

}