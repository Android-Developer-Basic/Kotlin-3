package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskTest {
    @Test
    fun task1() {
        Assertions.assertEquals(
            10,
            task1(1,2,3,4)
        )
    }

    @Test
    fun task2() {
        Assertions.assertEquals(
            "str1 str2 str3",
            task2("str1", "str2", "str3")
        )
        Assertions.assertEquals(
            "str1,str2,str3",
            task2("str1", "str2", "str3", separator = ',')
        )
    }
}