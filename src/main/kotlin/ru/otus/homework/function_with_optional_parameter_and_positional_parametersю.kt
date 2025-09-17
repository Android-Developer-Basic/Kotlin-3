fun joinStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator = separator.toString())
}

fun main() {
    println(joinStrings("Hello", "world")) // Hello world
    println(joinStrings("Hello", "world", separator = '-'))
    println(joinStrings("a", "b", "c", "d")) // a b c d
    println(joinStrings("a", "b", "c", "d", separator = '/'))
    println(joinStrings("Kotlin", "is", "very good", separator = '*'))
}