package ru.otus.homework

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HomeWorkKtTest {

    @Test
    fun simpleCalcValid(){
        assertEquals(2, calc(1,1))
    }

    @Test
    fun CalcValid(){
        assertEquals(12, calc(1,1,1, 2 , 3, 4))
    }


    @Test
    fun simpleExample() {
        val resultStr = concatInDelimiter("Hello", "world")
        assertEquals("Hello world", resultStr)
    }

    @Test
    fun simpleExampleFromHomeWork() {
        val resultStr = concatInDelimiter("str1", "str2", "str3")
        assertEquals("str1 str2 str3", resultStr)
    }

    @Test
    fun `delimiter!`() {
        val resultStr = concatInDelimiter("Hello", "world", delimiter = '!')
        assertEquals("Hello!world", resultStr)
    }

    @Test
    fun delimiterFromHomeWork() {
        val resultStr = concatInDelimiter("str1", "str2", "str3", delimiter = ',')
        assertEquals("str1,str2,str3", resultStr)
    }
}