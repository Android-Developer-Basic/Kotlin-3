package ru.otus.homework

fun main(){
    println(calculate(2,6))
    println(calculate(5,7))

    println(car1("Honda","Civic"))
    println(car2("Honda","Civic"))


    println(autoOne("Ford","Lada","Fiat", separator = ','))
    println(autoTwo("Kia","Opel","JMS", separator = ' '))

    val time = stopwatch {
        engine()
    }
    println("operating hours  $time в ms")
}

fun calculate (first:Int, second:Int, vararg numbers:Int):Int {
    var total = first + second
    for (number in numbers) {
        total += number
    }
    return total
}
fun car1(vararg string: String,separator: Char = ' '): String{
    return string.joinToString(separator.toString())
}
fun car2(vararg string: String,separator: Char = ','): String {
    return string.joinToString(separator.toString())
}


fun autoOne(str1: String, str2: String, str3: String, separator: Char = ','): String {
    return "$str1$separator$str2$separator$str3"
}
fun autoTwo(str1: String, str2: String, str3: String, separator: Char = ' '): String {
    return "$str1$separator$str2$separator$str3"
}

fun stopwatch(runMe:()-> Unit): Long{
    val start = System.currentTimeMillis()
    runMe()
    val end = System.currentTimeMillis()
    return end-start
}
fun engine() {
    var total = 0
    for (i in 1..500_000) {
        total += i
    }
    println("Lets GO $total")
}



