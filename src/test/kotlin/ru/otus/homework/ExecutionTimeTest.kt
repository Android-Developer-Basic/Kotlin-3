package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExecutionTimeTest {
    @Test
    fun executionTimeOfTest() {
        assertTrue(executionTimeOf { Thread.sleep(1000) } >= 1000L)
    }
}