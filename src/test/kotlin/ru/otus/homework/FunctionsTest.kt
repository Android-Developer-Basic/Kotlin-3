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

    @Test
    fun numberTest() {
        Assertions.assertEquals(
            10,
            homeWork1(1,2,3,4)
        )
    }

    @Test
    fun stringTest1() {
        Assertions.assertEquals(
            "str1 str2 str3",
            homeWork2("str1", "str2", "str3")
        )
    }

    @Test
    fun stringTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            homeWork2("str1", "str2", "str3", ch = 't')
        )
    }

  //  Для теста времени
    @Test
    fun timeTest() {
        Assertions.assertEquals(
            10,
            startTimeTest()
        )
    }
}