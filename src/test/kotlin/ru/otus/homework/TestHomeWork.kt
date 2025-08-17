package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestHomeWork {
    @Test
    fun TestMyWork1() {
        Assertions.assertEquals(
            6,
            FirstFunction(1, 2, 3)
        )
    }

    @Test
    fun TestMyWork2() {
        Assertions.assertEquals(
            "1,2,3",
            SecondFunction(',', "1", "2", "3")
        )
    }

    @Test
    fun TestMyWork3() {
        Meashuring(::MyLoop)
    }
}
