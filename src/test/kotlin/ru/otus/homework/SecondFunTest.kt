package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SecondFunTest {

    @Test
    fun secondFun() {

        assertEquals(
            "str1 str2 str3",
            secondFun("str1", "str2", "str3")
        )

        assertEquals(
            "str1,str2,str3",
            secondFun("str1", "str2", "str3", char = ',')
        )
    }

}