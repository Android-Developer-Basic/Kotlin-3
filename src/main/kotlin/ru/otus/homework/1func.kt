package ru.otus.homework

fun main (){
    print("Какой длинны массив, сумма элементов которого, требует подсчета? (размер 0..Int) - ")
    val n = readln()
    val massive = IntArray(size = n.toInt())
    print("Массив = ")
    for (i in 0..<n.toInt()) {
        massive[i] = (-15..15).random()
        print(massive[i]); print(" ")}
        println(); print("Результат = "); println(calculate(massive[0], massive[1], *massive))
}

fun calculate (a:Int, b:Int, vararg c: Int): Int {
    return c.sum()
}

