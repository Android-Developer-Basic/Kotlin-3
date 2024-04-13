package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun secondTaskTest_1() {
        val str1 = "Меня"
        val str2 = "зовут"
        val str3 = "Николай"
        Assertions.assertEquals("$str1 $str2 $str3",
            secondTask(str1, str2, str3))


    }

    @Test
    fun secondTaskTest_2() {
        val str1 = "Меня"
        val str2 = "зовут"
        val str3 = "Николай"
        Assertions.assertEquals("$str1,$str2,$str3",
            secondTask(str1, str2, str3, char = ','))


    }
}