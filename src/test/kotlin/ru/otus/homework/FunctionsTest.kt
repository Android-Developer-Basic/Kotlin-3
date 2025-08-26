package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FunctionsTest {
    @Test
    fun task2Test() {

        Assertions.assertEquals(
            "str1 str2 str3",
            task_2("str1", "str2", "str3")
        )

        Assertions.assertEquals(
            "str1,str2,str3",
            task_2("str1", "str2", "str3", separ = ',')
        )
    }
}