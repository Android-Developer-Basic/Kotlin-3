package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Functions_hw2Test {
    @Test
    fun makeLineStringTest() {
        assertEquals(
            "Бендер Остап Ибрагимович",
            makeLineString("Бендер", "Остап", "Ибрагимович")
        )

        assertEquals(
            "Шура Балаганов,Михаил Самуэлевич Паниковский,Адам Казимирович Козлевич,Антилопа Гну",
            makeLineString("Шура Балаганов",
                                   "Михаил Самуэлевич Паниковский",
                                   "Адам Казимирович Козлевич",
                                   "Антилопа Гну", separator = ',')
        )
    }
}