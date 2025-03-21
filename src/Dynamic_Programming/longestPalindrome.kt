package Dynamic_Programming

fun longestPalindrome(s: String): String {
    if(s.isEmpty()) return ""

    var start = 0
    var maxLength = 0

    fun expandAroundCenter(left: Int, right: Int) {
        var l = left
        var r = right
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            if (r - l + 1 > maxLength) {
                start = l
                maxLength = r - l + 1
            }
            l--
            r++
        }
    }

    for (i in s.indices) {
        expandAroundCenter(i, i)     // Центр — 1 символ (нечётный палиндром)
        expandAroundCenter(i, i + 1) // Центр — 2 символа (чётный палиндром)
    }

    return s.substring(start, start + maxLength)

}

fun main(){
    println(longestPalindrome("babad"))
}