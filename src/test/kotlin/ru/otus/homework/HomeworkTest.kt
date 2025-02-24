package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.math.sin

class HomeworkTest {
    fun Long.ms() {
        println(">> Func call took $this ms")
    }

    @Test
    fun fun1_onlTwoArgs() {
        Assertions.assertEquals(
            11, add(5, 6)
        )
    }

    @Test
    fun fun1_extraArgs() {
        Assertions.assertEquals(
            15, add(1, 2, 3, 4, 5)
        )
    }

// can't be compiled
//    @Test
//    fun task1_notEnoughArgs() {
//        Assertions.assertEquals(
//            15,
//            add(1)
//        )
//    }

    @Test
    fun fun2_defaultSeparator() {
        Assertions.assertEquals(
            "str1 str2 str3", concatenateString("str1", "str2", "str3")
        )
    }

    @Test
    fun fun2_specifiedSeparator() {
        Assertions.assertEquals(
            "str1,str2,str3", concatenateString("str1", "str2", "str3", separator = ',')
        )
    }

    @Test
    fun fun2_emptyString() {
        Assertions.assertEquals(
            "", concatenateString("")
        )
    }

    @Test
    fun fun4_timerDuration() {
        timeFunc({ sleep(2) }, "sleep(2)").ms()
    }

    @Test
    fun fun4_timerDefault() {
        timeFunc({ sleep() }, "sleep()").ms()
    }

    @Test
    fun fun4_loopMillions() {
        timeFunc({ longLoop(10000000000) }, "longLoop(10000000000)").ms()
    }

    @Test
    fun fun4_lambda() {
        val time: Long =
            timeFunc(
                {
                    var j = 0.0
                    for (i in 1 until 100000000) {
                        j += sin(i.toDouble())
                    }
                    println(j)
                }, "lambda"
            )
        time.ms()
    }
}