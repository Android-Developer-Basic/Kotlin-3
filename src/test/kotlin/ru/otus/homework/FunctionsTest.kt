package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FunctionsTest {

    @Test
    fun combiningStringsTest() {
        val expectedOneCase = "str1 str2 str3"
        val expectedTwoCase = "str1,str2,str3"

        val caseOne = combiningStrings("str1", "str2", "str3")
        val caseTwo = combiningStrings("str1", "str2", "str3", char = ',')

        assertEquals(expectedOneCase, caseOne)
        assertEquals(expectedTwoCase, caseTwo)
    }
}