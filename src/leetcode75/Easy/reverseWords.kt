package leetcode75.Easy

fun reverseWords(s: String): String {
    var word = s.split(" ").map { it.reversed() }.joinToString(" ")
    return word.trim().reversed()
}


fun main(){
    val word = " hello world "
    println(reverseWords(word))
}
