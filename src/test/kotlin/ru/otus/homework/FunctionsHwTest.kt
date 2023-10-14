package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsHwTest {
    @Test
    fun calculateTwoNumbersTest(){
        Assertions.assertEquals(
            40,
            calculateHw(18, 22)
        )
    }

    @Test
    fun calculateFourNumbersTest(){
        Assertions.assertEquals(
            100,
            calculateHw(25, 25, 25, 25)
        )
    }
}