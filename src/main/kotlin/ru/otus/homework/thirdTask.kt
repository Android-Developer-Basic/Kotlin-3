package ru.otus.homework

fun thirdTask(f:() -> Unit) : String {
    val startTime = System.currentTimeMillis()
    f()
    return "Время выполнения функции составило " +
            "${System.currentTimeMillis()-startTime} миллисекунд"
}

fun someLongGoingFun() {
    var i = 1
    var prints = 1000000
    while (i <= prints) {
        println("Принт номер $i")
        i += 1
    }
}

//fun main() {
//    println(thirdTask(::someLongGoingFun))
//}
