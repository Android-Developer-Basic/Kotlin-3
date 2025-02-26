package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun stringJoinTest() {
        val firstResult = stringJoin("str1","str2","str3")
        val secondResult = stringJoin("str1","str2","str3", separator = ',')

        Assertions.assertEquals(firstResult, "str1 str2 str3")
        Assertions.assertEquals(secondResult, "str1,str2,str3")
    }

    @Test
    fun timeFunTest() {
        fun tempFun(n: Int) {
            for (i in 0..n) {
                println(1111 * i)
            }
        }

        val result = time(func = ::tempFun)

        Assertions.assertEquals(result,9)
    }
}