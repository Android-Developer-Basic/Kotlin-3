
package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionsTest {

    @Test
    fun joinStringsTest() {

        val str1 = "str1"
        val str2 = "str2"
        val str3 = "str3"

        Assertions.assertEquals(
            "str1 str2 str3",
            joinStrings(str1, str2, str3)
        )

        Assertions.assertEquals(
            "str1,str2,str3",
            joinStrings(str1, str2, str3, separator = ',')
        )
    }
}