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
    fun concatenationTest(){
        Assertions.assertEquals(
            "abo-ba",
            concatenation("abo","ba", char = '-')
        )
        Assertions.assertEquals(
            "abo ba",
            concatenation("abo","ba")
        )
    }

}