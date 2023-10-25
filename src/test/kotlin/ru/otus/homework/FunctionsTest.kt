package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
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
    @DisplayName("test for vararg function without additional params")
    fun varArgFunctionTest1() {
        Assertions.assertEquals(3, varArgsParam(1, 2))
    }

    @Test
    @DisplayName("test for vararg function with additional params")
    fun varArgFunctionWithParams2() {
        Assertions.assertEquals(10, varArgsParam(1, 2, 3, 4))
    }

    @Test
    @DisplayName("test for str join function without separator")
    fun secondFunctionTest1() {
        Assertions.assertEquals(
            "str1 str2 str3",
            secondFunction(strings = arrayOf("str1", "str2", "str3"))
        )
    }

    @Test
    @DisplayName("test for str join function with separator")
    fun secondFunctionTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            secondFunction(strings = arrayOf("str1", "str2", "str3"), divider = ',')
        )
    }

    @Test
    @DisplayName("test for high order function")
    fun timeTrackingTest() {
        Assertions.assertTrue(highOrderFunction { Thread.sleep(3000) } >= 3)
    }
}