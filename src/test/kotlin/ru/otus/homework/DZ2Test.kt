package ru.otus.homework



import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringCombinationTest {

    @Test
    fun testStringCombinationWithDefaultSeparator() {
        val str1 = "Привет"
        val str2 = "мир"
        val str3 = "Kotlin"
        val expected = "$str1 $str2 $str3"
        val actual = stringCombination(str1, str2, str3)
        assertEquals(expected, actual)
    }

    @Test
    fun testStringCombinationWithCustomSeparator() {
        val str1 = "Привет"
        val str2 = "мир"
        val str3 = "Kotlin"
        val expected = "$str1,$str2,$str3"
        val actual = stringCombination(str1, str2, str3, separator = ',')
        assertEquals(expected, actual)
    }
}