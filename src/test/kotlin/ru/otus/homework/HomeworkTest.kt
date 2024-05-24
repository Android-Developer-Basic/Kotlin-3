package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HomeworkTest {
    /*3. Тестовая функция для пункта №2
Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк `str1` и `str2` и `str3`:

- Если `Char` не передан, ваша функция должна вернуть: `str1 str2 str3`
- Если `Char` задан как `,`, ваша функция должна вернуть: `str1,str2,str3`*/
    @Test
    fun joinStringTestOne() {
        val actionResult1 = joinString("str1", "str2", "str3")
        val actionResult2 = joinString("str1", "str2", "str3", separator = ',')

        val expectedResult1 = "str1 str2 str3"
        val expectedResult2 = "str1,str2,str3"
        Assertions.assertEquals(expectedResult1, actionResult1)
        Assertions.assertEquals(expectedResult2, actionResult2)
    }

    @Test
    fun checkTimerFunction() {
        val time = funcTimer{ for (i in 1..10_000) println(i) }
        println("function time in ms: $time")
    }
}
