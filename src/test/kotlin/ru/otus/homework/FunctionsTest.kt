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

    @Test
    fun sumOfNumbersTest() {
        Assertions.assertEquals(15
            , sumOfNumbers(1, 2, 3, 4, 5)
            , "Сумма должна быть равна 15")
        Assertions.assertEquals(30
            , sumOfNumbers(10, 20)
            , "Сумма должна быть равна 30")
        Assertions.assertEquals(0
            , sumOfNumbers(-5, 5, -10, 10)
            , "Сумма должна быть равна 0")
        Assertions.assertEquals(-1
            , sumOfNumbers(Int.MAX_VALUE, -1, 1, Int.MIN_VALUE)
            , "Сумма должна быть равна -1")
    }

    @Test
    fun joinStringsWithDefaultSeparatorTest() {
        Assertions.assertEquals("str1 str2 str3"
            , joinStrings("str1", "str2", "str3")
            , "По умолчанию строки должны соединяться пробелом")
    }

    @Test
    fun joinStringsWithCustomSeparatorTest() {
        Assertions.assertEquals("str1,str2,str3"
            , joinStrings("str1", "str2", "str3", separator = ',')
            , "Строки должны быть соединены пользовательским разделителем")
    }

    private fun testConcatenationPerformance(iterations: Int) {
        val stringConcatTime = measureExecutionTime {
            var result = ""
            for (i in 1..iterations) {
                result += "Test"
            }
        }
        println("Время, затраченное на объединение строк для $iterations " +
                "итераций $stringConcatTime мс.")
        val stringBufferConcatTime = measureExecutionTime {
            val stringBuffer = StringBuffer()
            for (i in 1..iterations) {
                stringBuffer.append("Test")
            }
        }
        println("Время, затраченное StringBuffer на объединение строк для $iterations " +
                "итераций: $stringBufferConcatTime мс.")
    }

    @Test
    fun testConcatenationPerformanceWithDifferentSizes() {
        val testSizes = listOf(10, 100, 300, 500, 800, 1_000
            , 10_000, 30_000, 50_000, 80_000, 100_000, 200_000)
        for (size in testSizes) {
            testConcatenationPerformance(size)
        }
    }

}