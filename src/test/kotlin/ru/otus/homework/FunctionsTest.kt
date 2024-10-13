package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class FunctionsTest {

    @Test
    fun calc() {
        val calc = calc(1, 2, 3, 4, 5)
        assertEquals(calc, 15)
    }

    @Test
    fun calcThrow() {
        assertThrows(Exception::class.java) { calc(1, 2) }
    }

    /**
    * 3. Тестовая функция для пункта №2
    * */
    @Test
    fun concat() {
        val concat = concat("Hello", "World", "!", c = ',')
        assertEquals("Hello,World,!", concat)
    }

    /**
     * 3. Тестовая функция для пункта №2
     * */
    @Test
    fun concatWithDefault() {
        val concat = concat("Hello", "World", "!")
        assertEquals("Hello World !", concat)
    }
}