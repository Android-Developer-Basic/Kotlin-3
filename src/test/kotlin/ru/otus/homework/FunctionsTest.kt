package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun stringConcatenationTest() {

        Assertions.assertEquals(
            "first second third",
            stringConcatenation("first", "second", "third")
        )

        Assertions.assertEquals(
            "first,second,third",
            stringConcatenation("first", "second", "third", concatenation = ',')
        )
    }

    @Test
    fun sumOfNumbersTest() {
        Assertions.assertEquals(
            60,
            sumOfNumbers(10,20,30)
        )
    }
}