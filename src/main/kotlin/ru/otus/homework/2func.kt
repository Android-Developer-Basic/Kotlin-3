package ru.otus.homework

fun main (){
    print("Какой длинны массив строк? - ")
    val n = readln()
    val massive = Array<String>(n.toInt()){""}
    for (i in 0..<n.toInt()) {
        massive[i] = readln() }
    print("Введите символ объединяющий строки - ")
    val spaceString = readln()
    val space: Char
    if (spaceString.isEmpty()){
        space = ' ' }
    else {space = spaceString[0]}
    println("Результат объединения: ${sumstring(str = *massive, chr = space)}")
}

fun sumstring (vararg str: String, chr: Char=' '): String {
    var resultstr = ""
        str.forEach {resultstr += "$it$chr"}
    return  resultstr.substring(0, resultstr.length-1)
}
