package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class HomeworkTest {

    // 3. Тестовые функции

    @Test
    @Disabled("Not compiling")
    fun `sumArgs fun should not compile when only one required argument provided`() {
//        Assertions.assertNotNull(sumArgs(1))
    }

    @Test
    fun `sumArgs fun should sum two required arguments`() {
        Assertions.assertEquals(3, sumArgs(1, 2))
    }

    @Test
    fun `sumArgs fun should sum two required and one variable arguments`() {
        Assertions.assertEquals(6, sumArgs(1, 2, 3))
    }

    @Test
    fun `sumArgs fun should sum two required and two variable arguments`() {
        Assertions.assertEquals(10, sumArgs(1, 2, 3, 4))
    }

    @Test
    fun `concatenate fun should use space as default separator`() {
        Assertions.assertEquals(
            "str1 str2 str3", concatenate("str1", "str2", "str3")
        )
    }

    @Test
    fun `concatenate fun should use provided separator`() {
        Assertions.assertEquals(
            "str1,str2,str3", concatenate("str1", "str2", "str3", separator = ',')
        )
    }

    @Test
    fun `concatenate fun should return empty string when varargs are empty or not provided`() {
        Assertions.assertEquals("", concatenate())
        Assertions.assertEquals("", concatenate(separator = ','))
        Assertions.assertEquals("", concatenate(""))
        Assertions.assertEquals("", concatenate("", separator = ','))
    }

    @Test
    fun `calculateTime fun should return less duration when function execution is quicker`() {
        Assertions.assertTrue(
            calculateTime(1L, 3L, ::type) < calculateTime(10L, 30L, ::type)
        )
    }
}
