package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.Thread.sleep

class homeworkFunctionsTest {
    @Test
    fun joinStrWithCharTest() {
        Assertions.assertEquals(
            "str1,str2,str3",
            joinStr("str1","str2","str3", char = ',')
        )
    }

    @Test
    fun joinStrWithoutCharTest(){
        Assertions.assertEquals(
            "str1 str2 str3",
            joinStr("str1","str2","str3")
        )
    }

    @Test
    fun calcSumTest(){
        Assertions.assertEquals(
            10,
            calcSum(3,0,7)
        )
    }

    @Test
    fun printWorkTimeFunTest(){
        Assertions.assertEquals(
            5,
            printWorkTimeFun({sleep(5000)})
        )
    }
}