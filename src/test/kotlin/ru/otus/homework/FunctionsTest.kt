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
    fun dspSeparatedStringsTest() {

        val result_1 = "One Two Three"
        val result_2 = "One,Two,Three"
        Assertions.assertEquals( result_1, dspSeparatedStrings("One","Two","Three") )
        Assertions.assertEquals( result_2, dspSeparatedStrings("One","Two","Three",separ=',') )
    }
}