package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }
    //3. Тестовая функция для пункта №2
    //Check Если Char не передан, ваша функция должна вернуть: str1 str2 str3 Если Char задан как ,, ваша функция должна вернуть: str1,str2,str3
    @Test
    fun joinStringsTest() {

        var str1 = "This"
        var str2 = "is"
        var str3 = "test"

        var result = joinStrings(str1, str2, str3)

        assertEquals("This is test", result)

        var separator = ','

        result = joinStrings(str1, str2, str3, separator = separator)

        assertEquals("This,is,test", result)
    }
    @Test
    fun measureExecutionTimeTest() {
        val totalIterations = 100_000_000L
        var sum = 0L
        val durationMs = measureExecutionTime {
            println("Старт цикла: $totalIterations итераций...")

            for (i in 0L until totalIterations) {
                sum += i // Критично: используем переменную, чтобы компилятор не удалил цикл

                // Печать статуса каждые 10 миллионов итераций
                if (i % 10_000_000 == 0L) {
                    println("Прогресс: обработано $i итераций")
                }
            }

            println("Цикл завершен. Итоговая сумма: $sum")
        }
        println("Замеренное время: $durationMs мс")
        assertTrue(durationMs > 0, "Время должно быть больше 0")
        assertTrue(
            durationMs < 2000,
            "100 млн простых операций не должны занимать больше 2 секунд. Текущее время: $durationMs"
        )
    }
}