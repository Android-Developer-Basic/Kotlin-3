package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.otus.homework.concatenateStrings

class FunctionsTest {


    @Test
    fun concatenateStringsTest(){
        Assertions.assertEquals(
            "str1 str2 str3",
            concatenateStrings("str1", "str2", "str3")
        )
    }
}