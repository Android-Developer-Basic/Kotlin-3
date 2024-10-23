package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OtusLesson3KtTest {

    @Test
    fun `joinStrings concatenates strings and returns a result`() {
        assertEquals("Dennis Nikolay Anton Otus", secondTask("Dennis", "Nikolay", "Anton", "Otus"))
    }

}