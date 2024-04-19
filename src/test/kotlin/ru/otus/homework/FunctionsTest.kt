package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }
}

class HomeworkTest {
    @Test
    fun makeStringTest1() {
        val expected = "str1 str2 str3"
        val actual: String = makeString("str1", "str2", "str3")
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun makeStringTest2() {
        val expected = "str1,str2,str3"
        val actual: String = makeString("str1", "str2", "str3", divider = ',')
        Assertions.assertEquals(expected, actual)
    }
}