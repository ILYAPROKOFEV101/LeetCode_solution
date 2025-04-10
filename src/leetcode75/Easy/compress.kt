package leetcode75.Easy

fun compress(chars: CharArray): Int {
    var mutableMap : MutableMap<Char,Int> = mutableMapOf()

    for (char in chars ) {
        mutableMap[char] = mutableMap.getOrDefault(char, 0) + 1
    }
    var result = 0
    for ((key, value) in mutableMap) {
        result += 1 // за каждый ключ (символ) добавляем 1
        if (value > 1) {
            result += value.toString().length // добавляем длину числа (если больше 1)
        }
    }
    return result
}

fun main(){
    val array = charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b')
    println(compress(array))
}
