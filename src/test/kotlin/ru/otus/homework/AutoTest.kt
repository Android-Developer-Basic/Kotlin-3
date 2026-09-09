package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AutoTest {

    fun auto(str1: String, str2: String, str3: String, separator: Char = ','): String {
        return "$str1$separator$str2$separator$str3"

    }

    @Test
    fun autoTest1() {
        Assertions.assertEquals(
            "Ford Lada Fiat",
            autoOne("Ford", "Lada", "Fiat", separator = ' ')

        )

    }

    @Test
    fun autoTest2(){
        Assertions.assertEquals(
            "Kia,Opel,JMS",
            autoTwo("Kia","Opel","JMS", separator = ',')
        )
    }
}