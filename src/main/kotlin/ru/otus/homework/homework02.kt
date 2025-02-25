package ru.otus.homework

import kotlin.random.Random


fun main() {
    println("Task 1")
    val dummy = haveSomeFun(0, 1, 2, 3, 4, 5)
    haveSomeFun(5, 7)

    println("Task 2")
    haveSomeFun("Have", "Some", "Fun")
    haveSomeFun("Have", "Some", "Fun", "Again", c = '.')
    haveSomeFun("", c = '?')
    haveSomeFun()

    println("Task 4")
    funMeter(::timeConsumingFun)
    funMeter(::timeConsumingFun)
    funMeter(::timeConsumingFun)
    funMeter(::timeConsumingFun)
}


/* 1. Функция с обязательными и необязательными позиционными параметрами*/
fun haveSomeFun(n1: Int, n2: Int, vararg n: Int) : Int {
    var res = n1 + n2

    print("$n1 + $n2")

    n.forEach {
        res += it
        print(" + $it")
    }

    println(" = $res")
    return res
}

/* 2. Функция с необязательным параметром и позиционными параметрами*/
fun haveSomeFun(vararg s: String, c: Char = ' ') : String {
    var res = ""
    s.forEach {
        res += (if (res.isEmpty()) "" else c.toString()) + it
    }

    println(res.ifEmpty { "Empty string" })
    return res
}

/* 3. Тестовая функция для пункта 2 в Homework02Test*/

/* 4. Функция, измеряющая время выполнения другой функции*/
fun funMeter(f: ()->Unit) {
    val begin = System.currentTimeMillis()
    f()
    val end = System.currentTimeMillis() - begin
    println("Execution time: $end msec")
}

fun timeConsumingFun() {
    val to = System.currentTimeMillis() + Random.nextInt(1000, 5000)
    while (System.currentTimeMillis() < to) { Thread.sleep(100) }
}


