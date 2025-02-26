package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.time.measureTime

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }
    @Test
    fun fun2Test(){
        Assertions.assertEquals(
            "str1 str2 str3",
            fun2("str1", "str2", "str3")
        )
        Assertions.assertEquals(
            "str1,str2,str3",
            fun2("str1", "str2", "str3", symbol = ',')
        )
    }
}