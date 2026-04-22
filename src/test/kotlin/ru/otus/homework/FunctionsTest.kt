package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumTest {

    @Test
    fun `2 obligatory parameters only`() {
        val actual = sum(5, 3)
        val expected = 8


        assertEquals(actual, expected)
    }

    @Test
    fun `more then 2 arguments`(){
        val actual = sum(5, 3, 2, 4)
        val expected = 14

        assertEquals(actual, expected)
    }
}

class JoinToStringTest{
    @Test
    fun `default separator`(){
        val actual = joinStrings("str1", "str2", "str3")
        val expected = "str1 str2 str3"

        assertEquals(actual, expected)
    }

    @Test
    fun `comma separator`(){
        val actual = joinStrings("str1", "str2", "str3", separator = ',')
        val expected = "str1,str2,str3"

        assertEquals(actual, expected)
    }

    @Test
    fun `call testJoinString function`(){
        val actual = testJoinString()
        val expected = true

        assertEquals(actual, expected)
    }
}

class ExecutionTimeTest{
    @Test
    fun `100_000 println`(){
        println("Duration time: ${executionTime(op = ::longTimeDuration)} ms")
    }
}