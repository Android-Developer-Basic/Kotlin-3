package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class SumNumbersTest {
    @Test
    fun `test sumNumbers with two args`() {
        assertEquals(4, sumNumbers(2, 2))
    }

    @Test
    fun `test sumNumbers with three args`() {
        assertEquals(6, sumNumbers(1, 2, 3))
    }

    @Test
    fun `test sumNumbers with four args`() {
        assertEquals(46, sumNumbers(10, 11, 12, 13))
    }
}