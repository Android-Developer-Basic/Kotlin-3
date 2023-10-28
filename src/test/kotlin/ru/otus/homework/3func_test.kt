package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Func3Test {
    @Test
    fun sumstringTest() {
        Assertions.assertEquals(
            "str1 str2 str3",
            sumstring("str1", "str2", "str3")
        )
    Assertions.assertEquals(
        "str1,str2,str3",
        sumstring("str1","str2","str3", chr =','))
    }
}