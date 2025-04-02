package leetcode75.Easy

fun mergeAlternately(word1: String, word2: String): String {
    val global = StringBuilder()

    val minLength = minOf(word1.length, word2.length)

    for ( i in 0 until minLength ) {
        global.append(word1[i])
        global.append(word2[i])
    }

    if (word1.length > word2.length) {
        global.append(word1.substring(minLength))
    } else if (word2.length > word1.length) {
        global.append(word2.substring(minLength))
    }

    return global.toString()
}

fun main() {
    println(mergeAlternately("abc", "pqr"))  // "apbqcr"
    println(mergeAlternately("ab", "pqrs"))  // "apbqrs"
    println(mergeAlternately("abcd", "pq"))  // "apbqcd"
}



