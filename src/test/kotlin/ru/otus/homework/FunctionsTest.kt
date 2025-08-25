package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
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
    @DisplayName("## 3. Тестовая функция для пункта №2")
    fun concatenationVarargsBySeparatorTest(){
        Assertions.assertEquals("str1 str2 str3", concatAll("str1", "str2", "str3"))
        Assertions.assertEquals("str1,str2,str3", concatAll("str1", "str2", "str3", separator = ','))
    }
}