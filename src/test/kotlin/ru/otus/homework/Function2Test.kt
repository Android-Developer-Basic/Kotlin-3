package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Function2Test {

    @Test
    fun function2Test_whitespaces() {
        val excepted = "string1 string2 string3"
        val actual = function2("string1", "string2", "string3")

        assertEquals(excepted, actual)
    }

    @ParameterizedTest
    @MethodSource("provideFunction2TestData")
    fun function2Test(strings: Array<String>, separator: Char, expected: String) {
        val actual = function2(*strings, separator = separator)

        assertEquals(expected, actual)
    }

    private fun provideFunction2TestData(): List<Arguments> = listOf(
        Arguments.of(arrayOf("string1", "string2", "string3"), '+', "string1+string2+string3"),
        Arguments.of(arrayOf("string1", "string2", "string3"), ',', "string1,string2,string3"),
    )
}
