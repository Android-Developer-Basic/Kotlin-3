package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HomeworkTest {
    // ## 3. Тестовая функция для пункта №2
    // Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк `str1` и `str2` и `str3`:
    // - Если `Char` не передан, ваша функция должна вернуть: `str1 str2 str3`
    @Test
    fun calculationTest1() {
        Assertions.assertEquals(
            "str1 str2 str3",
            concatStrings("str1", "str2", "str3")
        )
    }
    // - Если `Char` задан как `,`, ваша функция должна вернуть: `str1,str2,str3`
    @Test
    fun calculationTest2() {
        Assertions.assertEquals(
            "str1,str2,str3",
            concatStrings("str1", "str2", "str3", arg2 = ',')
        )
    }
}