package ru.otus.homework

import org.junit.jupiter.api.Test

class FourthFunTest {

    @Test
    fun fourthFun() {
        val time = fourthFun {
            (1..5000).toList().forEach {
                println(it)
            }
        }

        println(time)
    }

}