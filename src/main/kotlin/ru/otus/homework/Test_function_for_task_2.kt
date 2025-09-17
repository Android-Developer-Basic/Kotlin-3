package ru.otus.homework
fun joinStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator = separator.toString())
}

fun testJoinStrings() {
    val str1 = "Hello"
    val str2 = "world"
    val str3 = "Kotlin"

    val result1 = joinStrings(str1, str2, str3)
    val expected1 = "Hello world Kotlin"
    println("Тест 1: $result1")
    println("Ожидалось: $expected1")
    println("Тест пройден: ${result1 == expected1}")
    println()

    val result2 = joinStrings(str1, str2, str3, separator = ',')
    val expected2 = "Hello,world,Kotlin"
    println("Тест 2: $result2")
    println("Ожидалось: $expected2")
    println("Тест пройден: ${result2 == expected2}")
    println()

    val result3 = joinStrings(str1, str2, str3, separator = '-')
    val expected3 = "Hello-world-Kotlin"
    println("Тест 3: $result3")
    println("Ожидалось: $expected3")
    println("Тест пройден: ${result3 == expected3}")
    println()

    val result4 = joinStrings(str1, str2, str3, separator = '/')
    val expected4 = "Hello/world/Kotlin"
    println("Тест 4: $result4")
    println("Ожидалось: $expected4")
    println("Тест пройден: ${result4 == expected4}")
    println()

    val result5 = joinStrings(str1, str2, str3, separator = '*')
    val expected5 = "Hello*world*Kotlin"
    println("Тест 5: $result5")
    println("Ожидалось: $expected5")
    println("Тест пройден: ${result5 == expected5}")
    println()
}

fun main() {
    testJoinStrings()

    println("Примеры вызовов:")
    println(joinStrings("Hello", "world"))
    println(joinStrings("Hello", "world", separator = '-'))
    println(joinStrings("a", "b", "c", "d"))
    println(joinStrings("a", "b", "c", "d", separator = '/'))
    println(joinStrings("Kotlin", "is", "very good", separator = '*'))
}