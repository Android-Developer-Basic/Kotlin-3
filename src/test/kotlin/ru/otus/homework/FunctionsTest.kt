package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun summOfStringsTest() {
        Assertions.assertEquals(
            "str1 str2 str3",
            summOfStrings("str1", "str2", "str3", ch = ' ')
        )
    }

    @Test
    fun summOfStringsTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            summOfStrings("str1", "str2", "str3", ch = ',')
        )
    }


}