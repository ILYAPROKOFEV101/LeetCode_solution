package Two_Pointers

fun reverseWords(s: String): String {
    val words = s.split(" ")
    val result = StringBuilder()

    for (word in words) {
        for (i in word.length - 1 downTo 0) {
            result.append(word[i])
        }
        result.append(' ')
    }

    return result.toString().trimEnd()
}
