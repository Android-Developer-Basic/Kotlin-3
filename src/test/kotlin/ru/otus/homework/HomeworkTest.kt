package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class HomeworkTest {

    @Test
    fun sumWithOne() {
        Assertions.assertEquals(6, ru.otus.homework.sum(1, 2, 3))
    }

    @Test
    fun sumWithNone() {
        Assertions.assertEquals(3, ru.otus.homework.sum(1, 2))
    }

    @Test
    fun sumWithTwo() {
        Assertions.assertEquals(10, ru.otus.homework.sum(1, 2, 3, 4))
    }

    @Test
    fun concatStringWithoutSeparator() {
        assertEquals("1 2", concatStringWithSeparator( "1","2"))
    }
    @Test
    fun concatStringWithSeparator() {
        assertEquals("1&2", concatStringWithSeparator( "1","2", separator = "&".single()))
    }

    @Test
    fun concatStringWithEmptyStrings() {
        assertEquals("", ru.otus.homework.concatStringWithSeparator())
    }

    @Test
    fun concatStringWithoutSeparatorAndStr() {
        assertEquals("str1 str2 str3", concatStringWithSeparator( "str1","str2","str3"))
    }
    @Test
    fun concatStringWithSeparatorAndSTR() {
        assertEquals("str1,str2,str3", concatStringWithSeparator( "str1","str2","str3", separator = ",".single()))
    }

    @Test
    fun getExecutionTime(){
        println(getExecutionTime (::testFun))
    }

    fun testFun(){
        Thread.sleep(1000)
    }
}