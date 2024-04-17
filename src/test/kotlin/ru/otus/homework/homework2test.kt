package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

//## 3. Тестовая функция для пункта №2
//Напишите функцию-тест для первого пункта. Проверьте следующие условия для строк `str1` и `str2` и `str3`:
//
//- Если `Char` не передан, ваша функция должна вернуть: `str1 str2 str3`
//- Если `Char` задан как `,`, ваша функция должна вернуть: `str1,str2,str3`

class homework2test {
    @Test
    fun join_delim_default_test() {
        Assertions.assertEquals(
            "str1 str2 str3",
            join_stringhw("str1", "str2", "str3"))
    }
    @Test
    fun join_delim_comma_test() {
        Assertions.assertEquals(
            "str1,str2,str3",
            join_stringhw("str1", "str2", "str3", char = ','))
    }
}