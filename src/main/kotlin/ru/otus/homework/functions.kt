package ru.otus.homework

fun main() {

    println(calculate(1, 1, 3, 4))

    val combinedText = combiningStrings("this", "is", "a", "test", char = '-')
    println(combinedText)

}

fun calculate(firstArg: Int, secondArgs: Int, vararg additionalArgs: Int): Int {

    var result = firstArg + secondArgs
    for (arg in additionalArgs) {
        result += arg
    }
    return result
}

fun combiningStrings(vararg strings: String, char: Char = ' '): String {

    val stringResult = strings.joinToString(separator = char.toString())
    return stringResult
}

fun testFun() {
    for (i in 0..30000) {
        println(i)
    }
}