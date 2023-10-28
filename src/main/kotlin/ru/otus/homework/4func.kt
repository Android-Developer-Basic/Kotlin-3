package ru.otus.homework

fun measTime(action: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    return endTime - startTime}

//1 домашнее заданее
fun main() {
    val actionTime = measTime {
        println("Массив автоматически заполнится случайными числами в диапазоне от -15 до 15")
        print("Введите количество элементов массива numbers: ")
        val n = (1000..2000).random()
        println(n)
        println("Число target = 10 ")
        val t:Int = 10
        val MainMassive = IntArray(size = n)
        println("Сгенерирован такой массив:")
        for (i in 0 until MainMassive.size) {
            MainMassive[i] = (-15..15).random()
            print(MainMassive[i]); print(" ")
        }
        val result = sumOfTwo(MainMassive, t)
        println()
        for (i in 0 until result.size) {
            if ((i + 1) / 16 * 16 == i && i != 0) {
                println()
            }
            if ((i + 1) / 2 * 2 != i + 1) {
                if (i == 0) {
                    println(" ")
                }
                print("\t ■")
            }
            print("num[${result[i]}]=${MainMassive[result[i]]}"); print(" ")
        }
    }
    println()
    println("Время выполнения функции - $actionTime ms")

}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val numIndex = IntArray(size = (100 * numbers.size + 1))
    var b = -1
    for (i in 0 until numIndex.size) {
        numIndex[i] = b
    }
    for (i in 0 until numbers.size - 1) {
        if (numbers[i] <= target) {
            for (a in i + 1 until numbers.size) {
                if (numbers[a] + numbers[i] == target) {
                    b++
                    numIndex[b] = i
                    b++
                    numIndex[b] = a
                }
            }
        }
    }
    if (b == -1) {
        b = 1
        val a = -1
        require(a >= 0) {
            println("Вызов IllegalArgumentException")
        }
    }
    val numIndex2 = IntArray(size = b + 1)
    for (i in 0 until b + 1) {
        numIndex2[i] = numIndex[i]
    }
    return numIndex2
}
