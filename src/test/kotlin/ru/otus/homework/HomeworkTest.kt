package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HomeworkTest {
    @Test
    fun passOptPositional() {
        Assertions.assertEquals(
            45,
            positionalWithOptPositional(1, 2, 3, 4, 5, 6, 7, 8, 9)
        )
    }

    @Test
    fun passCharNone() {
        Assertions.assertEquals(
            "str1 str2 str3",
            optPositionalWithDefault("str1", "str2", "str3")
        )
    }

    @Test
    fun passCharComma() {
        Assertions.assertEquals(
            "str1,str2,str3",
            optPositionalWithDefault("str1", "str2", "str3", sep = ',')
        )
    }

    @Test
    fun measureSorting() {
        Assertions.assertTrue(
            measureFunExecutionTime { toMeasure() } > 1_000
        )
    }
}