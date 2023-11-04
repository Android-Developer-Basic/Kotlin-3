// в параметры передаем сообщение, данные картотеки клиента и блок функции. Определяем начало запуска и конец жизни функции, 
// делаем вычитание и получаем милисекунды функции
fun <T> timeIt(message: String = "", p1: Int, p2: String, p3: Int, p4: Long, p5: String, p6: Int, p7: Int, block: (Int,String,Int,Long,String,Int,Int) -> T): T {
    val start = System.currentTimeMillis()
    val r = block(p1,p2,p3,p4,p5,p6,p7)
    val end = System.currentTimeMillis()
    println("$message: ${end - start} ms")
    return r
}
//функция картотеки пациента в ветклинике
fun animals(idA: Int, ownerName: String, mapPatient: Int, phone: Long, nameAnimals: String, ageAnimals: Int, bonus: Int) {
    var i=0
    var n=0
    //бонусы перемножаем на количество idA клиентов до текущего, суммируем результат и делим на 1 000 000
    //не продуктивное решение, но время выполнения задачи записывает
    while (i<=idA) {
        val res = bonus*i
        n += res
        val bontop = n/1000000
        //если убрать println время выполнения станет 1-2ms, а с ним > 2000ms
        println(bontop)
        i++
    }
}

fun main() {
    //вводим данные клиента и вызываем в функции функцию с расчетом бонусов
    val result = timeIt("note about the code", 2111134, "Igor", 556677, 79886677888, "Bonya", 12, 15, ::animals)

}