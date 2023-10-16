package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

    @Test
    fun function1TestOne() {
        Assertions.assertEquals(10, function1(2, 2, 2, 2, 2))
    }

    @Test
    fun function1TestTwo() {
        Assertions.assertEquals(4, function1(2, 2))
    }

    @Test
    fun function2TestOne() {
        Assertions.assertEquals("str1 str2 str3", function2("str1", "str2", "str3"))
    }

    @Test
    fun function2TestOTwo() {
        Assertions.assertEquals("str1,str2,str3", function2("str1", "str2", "str3", char = ','))
    }

    @Test
    fun function3TestOne() {
        Assertions.assertTrue(function3("Hello", 500, ::subFunc) > 0)
    }
}