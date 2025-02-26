package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun funWithUnlimitedParametersTest() {
        Assertions.assertEquals(
            6,
            funWithUnlimitedParameters(1, 2, 3)
        )
    }

}