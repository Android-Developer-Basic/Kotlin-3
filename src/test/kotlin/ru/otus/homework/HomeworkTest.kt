package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HomeworkTest {

    @Test
    fun sumTwoOrMoreArgs_test(){
        Assertions.assertEquals(
            5,
            sumTwoOrMoreArgs(1,2,2)
        )
        Assertions.assertEquals(
            5,
            sumTwoOrMoreArgs(1, 1, 1, 1, 1)
        )
        Assertions.assertEquals(
            3,
            sumTwoOrMoreArgs(1,2)
        )
    }

    @Test
    fun stringConcatenates_test(){
        Assertions.assertEquals(
            "str1 str2 str3",
            stringConcatenates("str1", "str2", "str3")
        )
        Assertions.assertEquals(
            "str1,str2,str3",
            stringConcatenates("str1", "str2", "str3", char = ',')
        )
        Assertions.assertEquals(
            "str1%str2%str3",
            stringConcatenates("str1", "str2", "str3", char = '%')
        )
    }
}