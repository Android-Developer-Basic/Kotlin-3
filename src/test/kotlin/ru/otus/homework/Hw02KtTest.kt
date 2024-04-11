package ru.otus.homework

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class Hw02KtTest {

    @Test
    fun sumOfTwoNumbers() {
        assertEquals(3, sum(1, 2))
        assertNotEquals(4, sum(1, 2))
    }

    @Test
    fun sumOfSeveralNumbers() {
        assertEquals(8, sum(1, 2, 1, 4))
        assertNotEquals(10, sum(1, 2, 1, 4))
    }

    //Не компилируется, как задано по условию
//    @Test
//    fun sumOfOnlyNumber() {
//        assertEquals(1, sum(1))
//        assertNotEquals(1, sum(1))
//    }

    @Test
    fun joinWordsWithDefaultSep() {
        assertEquals("str1 str2 str3", join("str1", "str2", "str3"))

        assertEquals("Hello world", join("Hello", "world"))

        assertNotEquals("Hello_world", join("Hello", "world"))
        assertNotEquals("hello world", join("Hello", "world"))
    }

    @Test
    fun joinWordsWithConcreteSep() {
        assertEquals("str1,str2,str3", join("str1", "str2", "str3", sep = ','))

        assertEquals("Hello world", join("Hello", "world", sep = ' '))

        assertEquals("Hello world _", join("Hello", "world", "_"))
        assertNotEquals("Hello world_", join("Hello", "world", "_"))
        assertNotEquals("Hello world", join("Hello", "world", " "))

        assertEquals("Hello_world", join("Hello", "world", sep = '_'))
        assertNotEquals("Hello world", join("Hello", "world", sep = '_'))
    }


    /**
     * Некоторая длительная функция
     */
    private fun longTimeFunction() {
        for (i in 1 .. 1_000_000) {
            print("")
        }
    }

    @Test
    fun getFuncDurationTest() {
        var millis: Long = getFuncDurationMillis(this::longTimeFunction)
        assert(millis > 10)

        millis = getFuncDurationMillis { Thread.sleep(500) }
        assert(millis > 500)
    }
}