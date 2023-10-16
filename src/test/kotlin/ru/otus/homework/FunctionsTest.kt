package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun sumTwoArgsTest() {
        Assertions.assertEquals(
            55,
            sum(50, 5)
        )
    }

    @Test
    fun sumThreeArgsTest() {
        Assertions.assertEquals(
            55,
            sum(40, 5, 10)
        )
    }

    @Test
    fun concatDefaultConnectorText() {
        Assertions.assertEquals(
            "str1 str2 str3",
            concat("str1", "str2", "str3")
        )
    }

    @Test
    fun concatCustomConnectorText() {
        Assertions.assertEquals(
            "str1,str2,str3",
            concat("str1", "str2", "str3", connector = ',')
        )
    }

    @Test
    fun durationExecutionTest() {
        Assertions.assertEquals(
            true, 
            durationExecution(::testDelay) > 0
        )
    }
}
