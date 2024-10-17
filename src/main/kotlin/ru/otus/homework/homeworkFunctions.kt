package ru.otus.homework


fun calcSum(summandFirst: Int, summandSecond: Int, vararg summandArray: Int): Int{
    var sum = summandFirst + summandSecond
    summandArray.forEach { sum += it }
    return sum
}

fun joinStr(vararg strArray: String, char: Char? = null): String{
    return strArray.joinToString("${char ?: " "}")
}

fun printWorkTimeFun(foo: ()->Unit): Int{
    val startTime = System.nanoTime()
    foo()
    val endTime = System.nanoTime()
    val duration = (endTime - startTime)/ 1_000_000_000

    println("Execution time: $duration sec")
    return duration.toInt()
}
