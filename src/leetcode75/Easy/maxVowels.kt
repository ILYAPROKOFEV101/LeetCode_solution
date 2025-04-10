package leetcode75.Easy

fun maxVowels(s: String, k: Int): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    var maxCount = 0

    // Сначала считаем количество гласных в первом окне
    for (i in 0 until k) {
        if (s[i] in vowels) count++
    }
    maxCount = count

    // Скользящее окно
    for (i in k until s.length) {
        if (s[i] in vowels) count++
        if (s[i - k] in vowels) count--  // Удаляем символ, который вышел из окна
        maxCount = maxOf(maxCount, count)
    }

    return maxCount
}



fun main(){
    var s = "abciiidef"
    var k = 3
    println(maxVowels(s, k))
}
