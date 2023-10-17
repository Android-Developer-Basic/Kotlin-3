package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeLinesTest {
    @Test
    fun testMergeLinesWithDefaultSeparator() {
        val str1 = "Hello"
        val str2 = "world"
        val str3 = "How are you?"

        val expectedResult = "Hello world How are you?"
        val actualResult = mergeLines(str1, str2, str3)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testMergeLinesWithCustomSeparator() {
        val str1 = "Hello"
        val str2 = "world"
        val str3 = "How are you?"

        val expectedResult = "Hello,world,How are you?"
        val actualResult = mergeLines(str1, str2, str3, sep = ',')

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testMergeLinesWithEmptyStrings() {
        val str1 = ""
        val str2 = "Hello"
        val str3 = ""

        val expectedResult = " Hello "
        val actualResult = mergeLines(str1, str2, str3)

        assertEquals(expectedResult, actualResult)
    }
}