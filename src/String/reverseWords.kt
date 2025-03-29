package String

import jdk.internal.org.jline.utils.Colors.s

fun reverseWords(s: String): String {
    var word = s.split(" ").map { it.reversed() }.joinToString(" ")
    return word
}

fun main(){
    val s = "Let's take LeetCode contest"
    println(reverseWords(s))
}