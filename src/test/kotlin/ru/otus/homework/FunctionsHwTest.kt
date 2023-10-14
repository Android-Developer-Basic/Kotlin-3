package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsHwTest {
    @Test
    fun calculateTwoNumbersTest(){
        Assertions.assertEquals(
            40,
            calculateHw(18, 22)
        )
    }

    @Test
    fun calculateFourNumbersTest(){
        Assertions.assertEquals(
            100,
            calculateHw(25, 25, 25, 25)
        )
    }

    @Test
    fun stringBuilderDefaultSeparatorTest(){
        val expected = "str1 str2 str3"
        val actual = stringBuilder("str1", "str2", "str3")

        Assertions.assertEquals(
            expected,
            actual
        )
    }

    @Test
    fun stringBuilderComaSeparatorTest(){
        val expected = "str1,str2,str3"
        val actual = stringBuilder("str1", "str2", "str3", separator = ',')

        Assertions.assertEquals(
            expected,
            actual
        )
    }

    @Test
    fun testMeasureExecutionTime(){
        val executionTime = measureExecutionTime(::testLoop)
        Assertions.assertTrue(executionTime > 0)
    }
}