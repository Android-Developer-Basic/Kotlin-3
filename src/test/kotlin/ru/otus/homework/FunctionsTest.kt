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
    fun sumAddsRequiredAndOptionalArguments() {
        Assertions.assertEquals(3, sum(1, 2))
        Assertions.assertEquals(10, sum(1, 2, 3, 4))
    }

    @Test
    fun joinStringsUsesSpaceByDefault() {
        Assertions.assertEquals("str1 str2 str3", joinStrings("str1", "str2", "str3"))
    }

    @Test
    fun joinStringsUsesProvidedSeparator() {
        Assertions.assertEquals(
            "str1,str2,str3",
            joinStrings("str1", "str2", "str3", separator = ',')
        )
    }

    @Test
    fun measureExecutionTimeNanosRunsTheProvidedBlock() {
        var wasRun = false

        val duration = measureExecutionTimeNanos {
            wasRun = true
            Thread.sleep(10)
        }

        Assertions.assertTrue(wasRun)
        Assertions.assertTrue(duration > 0)
    }
}
