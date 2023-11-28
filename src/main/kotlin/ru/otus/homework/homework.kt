package ru.otus.homework

fun main() {
    println(GetSumm(1,2,5,6,7))
    println(getString("asdsd", "tttt", "aaaa", ch ='+'))
    println(getString("asdsd", "tttt", "aaaa"))
}

fun GetSumm(num1:Int, num2:Int, vararg nums: Int) : Int {
    var sum: Int = num1 + num2
    for (n in nums) {
        sum += n
    }
    return sum
}

fun getString(vararg strings: String, ch:Char = ' '): String {
    var result = ""
    for (str in strings.indices) {
        if(str != strings.size - 1)
        {
            result = result + strings[str] + ch
        }
        else {
            result += strings[str]
        }
    }
    return result
}