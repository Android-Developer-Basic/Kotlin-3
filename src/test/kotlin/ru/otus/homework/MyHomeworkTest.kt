package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
class MyHomeworkTest {
    @Test
    fun test1() {
        Assertions.assertEquals(
            15,
            test1(1, 2, 3,4,5)
        )
    }
    @Test
    fun test2() {
        Assertions.assertEquals(
            "ab,cd,ef",
            test2("ab","cd","ef", c = ',')
        )
        Assertions.assertEquals(
            "ab cd ef",
            test2("ab","cd","ef")
        )
    }
}