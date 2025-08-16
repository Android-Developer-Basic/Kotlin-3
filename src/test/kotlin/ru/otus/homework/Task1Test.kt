package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task1Test {
    @Test
    fun onliExpectedArgs() = assertEquals(5, sum(3, 2))

    @Test
    fun argsAndVarargs() = assertEquals(26, sum(3, 2, 7, 9, 5))


    @Test
    fun argsAndZeroVarargs() = assertEquals(5, sum(3, 2, 0, 0, 0))
}