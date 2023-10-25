package ru.otus.homework


fun main(){
    val longPrintFunction = {
        for (i in  0..100000){
            println(i)
        }
    }
    val result = calcTimePerformanceFunction(longPrintFunction)
    println("time = $result ms")
}

fun calc(a:Int, b:Int, vararg c: Int )  :Int{
    var sum = a + b
    c.forEach {
        sum += it
    }
    return sum
}

fun concatInDelimiter(vararg str: String, delimiter: Char = ' '): String{
    var resultString = ""

    str.forEach {
        resultString += "$it$delimiter"
    }

    return resultString.substring(0, resultString.length-1)
}


fun calcTimePerformanceFunction(function: () -> Unit) : Long{
    val timeBegin = System.currentTimeMillis()
    function.invoke()
    return System.currentTimeMillis() - timeBegin
}