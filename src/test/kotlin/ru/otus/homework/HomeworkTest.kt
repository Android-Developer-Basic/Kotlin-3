package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Задание 3. Тесты для функции из задания 2.
 */
class HomeworkTest {

    @Test
    fun joinWithDefaultSeparator() {
        Assertions.assertEquals(
            "str1 str2 str3",
            join("str1", "str2", "str3")
        )
    }

    @Test
    fun joinWithCommaSeparator() {
        Assertions.assertEquals(
            "str1,str2,str3",
            join("str1", "str2", "str3", separator = ',')
        )
    }

    // Не относится к Заданию 3, но было сделано дополнительно
    @Test
    fun sumTest() {
        Assertions.assertEquals(3, sum(1, 2))
        Assertions.assertEquals(15, sum(1, 2, 3, 4, 5))
    }

    // Не относится к Заданию 3, но было сделано дополнительно
    @Test
    fun benchmarkTest() {
        val time = benchmark { Thread.sleep(50) }
        Assertions.assertTrue(time >= 50) { "Ожидалось не меньше 50 мс, получено $time" }
    }
}
