package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsTest {
        @Test
        fun summationTest() {
            val testResultOne = "Желание Ржавый Семнадцать Рассвет"
            val testResultTwo = "Желание,Ржавый,Семнадцать,Рассвет"
            val testOne = summation("Желание", "Ржавый", "Семнадцать", "Рассвет")
            val testTwo = summation("Желание", "Ржавый", "Семнадцать", "Рассвет", someChar = ',')
            assertEquals(testResultOne, testOne)
            assertEquals(testResultTwo, testTwo)
        }
    }