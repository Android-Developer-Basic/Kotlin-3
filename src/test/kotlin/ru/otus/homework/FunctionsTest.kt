package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
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
    fun testFunction2(){
        val expected = "Hello/World/Nice/Day/"
        assertEquals(expected, function2("Hello", "World", "Nice", "Day", char1 = '/'))
    }
}