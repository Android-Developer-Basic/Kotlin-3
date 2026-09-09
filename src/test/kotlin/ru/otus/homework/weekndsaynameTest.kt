package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import kotlin.math.exp

class weekndsaynameTest() {
    fun assertEquals(words: String, separator: Char): String {
        return TODO()
    }
        @Test
        fun weekndsaynameTest() {
            assertEquals(
                /* expected = */ "What,you doing,HERE",
                /* actual = */ assertEquals(
                    "What you doing HERE",','))
            assertEquals(
                /* expected = */ "What you doing HERE",
                /* actual = */ assertEquals(
                    "What you doing HERE", ' '))
        }
    @Test
    fun weekndsaynameTest1() {
        assertEquals(
            "ALICE,ALINA,POLINA",
            assertEquals(
                "ALICE,ALINA,POLINA", separator = ','))
        assertEquals(
            "ALICE,ALINA,POLINA",
            assertEquals(
                "ALICE ALINA POLINA", separator = ' '))
    }
}
