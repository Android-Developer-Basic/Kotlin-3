package ru.otus.homework


fun sumIntValues(val1: Int, val2: Int, vararg valOthers: Int): Int
{
    var result = val1 + val2
    for (value in valOthers) {
        result += value
    }
    return result
}

fun makeLineString(vararg strs: String, separator: Char = ' '): String
{
    return strs.joinToString(separator.toString())
}

fun measureSorting()
{
    val time = measureExecutionTime(::prepareRandomArrayAndSort)
    println("Время выполнения: $time мс")
}

fun measureExecutionTime(function: () -> Unit): Long
{
    val start = System.currentTimeMillis()

    function()

    val end = System.currentTimeMillis()

    return end - start
}

fun prepareRandomArrayAndSort()
{
    var data = IntArray(50000)
    {
        (-1000..1000).random()
    }

    for (i in 0 until data.size - 1) {
        var exchanged: Boolean = false
        for (j in 0 until data.size - 1 - i) {
            if (data[j] > data[j + 1]) {
                val temp = data[j]
                data[j] = data[j + 1]
                data[j + 1] = temp
                exchanged = true
            }
        }
        if (!exchanged) {
            break
        }
    }
}

fun foundMinBetweenValues2to5(val1: Int, val2: Int,
                              val3 : Int = Int.MAX_VALUE, val4 : Int = Int.MAX_VALUE, val5 : Int = Int.MAX_VALUE): Int
{
    var result: Int = val1
    if (val2 < result) {
        result = val2
    }
    if (val3 < result) {
        result = val3
    }
    if (val4 < result) {
        result = val4
    }
    if (val5 < result) {
        result = val5
    }
    return result
}

fun foundMinBetweenValues2to5(val1: Float, val2: Float,
                              val3 : Float = Float.MAX_VALUE, val4 : Float = Float.MAX_VALUE, val5 : Float = Float.MAX_VALUE): Float
{
    var result: Float = val1
    if (val2 < result) {
        result = val2
    }
    if (val3 < result) {
        result = val3
    }
    if (val4 < result) {
        result = val4
    }
    if (val5 < result) {
        result = val5
    }
    return result
}

fun <T : Comparable<T>> foundMinBetweenAnyValues2to5(val1: T, val2: T,
                                                     val3: T? = null, val4: T? = null, val5: T? = null): T
{
    var result = val1

    if (val2 < result) result = val2

    if (val3 != null && val3 < result)
        result = val3
    if (val4 != null && val4 < result)
        result = val4
    if (val5 != null && val5 < result)
        result = val5

    return result
}