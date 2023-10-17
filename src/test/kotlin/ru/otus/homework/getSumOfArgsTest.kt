package ru.otus.homework


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GetSumOfArgs {
    @Test
    fun `test case 1`() {
        Assertions.assertEquals(
            7,
            getSumOfArgs(1, 2, 3, 1)
        )
    }

    @Test
    fun `test case 2`() {
        Assertions.assertEquals(
            10,
            getSumOfArgs(4, 1, 3, 1, 1)
        )
    }
}