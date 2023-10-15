package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() { //3 задание
        Assertions.assertEquals("str1 str2 str3", makeSumStrings("str1", "str2", "str3"))
        Assertions.assertEquals("str1,str2,str3", makeSumStrings("str1", "str2", "str3", separator=','))
    }
}