package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class HomeworkTest {
    //region Тест для задания 1
    @Test
    fun calcTest1() {
        val actual = calc(1, 2)
        val expected = 3
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun calcTest2() {
        val actual = calc(1, 2, 3, 4)
        val expected = 10
        Assertions.assertEquals(expected, actual)
    }
    //endregion

    //region Задание 3
    @Test
    fun `no separator - use default`() {
        val actual = join("Я – инженер","и моя голова сразу забывает бесполезные слова. Хуяк-хуяк", "и в продакшн.")
        val expected = "Я – инженер и моя голова сразу забывает бесполезные слова. Хуяк-хуяк и в продакшн."
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun `has separator - use the separator`() {
        val actual = join("Я – инженер","и моя голова сразу забывает бесполезные слова. Хуяк-хуяк", "и в продакшн.", separator =',')
        val expected = "Я – инженер,и моя голова сразу забывает бесполезные слова. Хуяк-хуяк,и в продакшн."
        Assertions.assertEquals(expected, actual)
    }
    //endregion
}
