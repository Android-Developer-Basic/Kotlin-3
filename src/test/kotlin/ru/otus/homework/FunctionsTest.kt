package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

    fun dzTest1(){
        Assertions.assertEquals(
            "str1 str2 str3",
            myFunctionString("str1", "str2", "str3")
        )
    }

    fun dzTest2(){
        Assertions.assertEquals(
            "str1,str2,str3",
            myFunctionString("str1", "str2", "str3", chr = ',')
        )
    }
}