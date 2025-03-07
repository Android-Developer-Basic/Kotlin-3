package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HomeworkTest {
    @Test
    fun task2Test(){
        Assertions.assertEquals("str1 str2 str3", task2("str1","str2","str3"))
    }
}