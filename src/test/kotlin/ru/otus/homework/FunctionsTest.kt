package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun conTest() {
        assertEquals(
            "Hello Privet Ciao ",
            con("Hello", "Privet", "Ciao", ch=' ')
        )
    }
}