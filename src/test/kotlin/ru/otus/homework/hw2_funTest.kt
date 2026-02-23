package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test



class hw2_funTest {

    @Test
    fun sumIntTest() {

        Assertions.assertEquals(
            14,
            sumInt(2,3,4,5)
        )
    }

    @Test
    fun connectTest() {

        Assertions.assertEquals(
            "a-b-c",
            connect("a","b","c", ch='-')
        )
    }

}