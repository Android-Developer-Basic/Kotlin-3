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
    fun sumOfIntTest() {
        Assertions.assertEquals(10, sumOfInt(3, 7))
        Assertions.assertEquals(20, sumOfInt(3, 7, 10))
        Assertions.assertEquals(40, sumOfInt(3, 7, 11, 19))
        Assertions.assertEquals(-19, sumOfInt(3, 7, -10, -19))
    }

    @Test
    fun stringCombineTest() {
        Assertions.assertEquals("a b c", stringCombine("a", "b", "c"))
        Assertions.assertEquals("a,b,c", stringCombine("a", "b", "c", delimiter = ','))
        Assertions.assertEquals("a:b:c", stringCombine("a", "b", "c", delimiter = ':'))
    }

    @Test
    fun getExecutionTimeMillisTest() {
        Assertions.assertTrue { 100 < getExecutionTimeMillis { longFunc() } }
        Assertions.assertTrue { 200 < getExecutionTimeMillis { longFunc(200) } }
        Assertions.assertTrue { 200 > getExecutionTimeMillis { longFunc(100) } }
    }
}
