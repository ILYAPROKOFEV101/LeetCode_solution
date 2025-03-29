package String

fun validPalindrome(s: String): Boolean {
    fun isPalindrome(str: String, left: Int, right: Int): Boolean {
        var l = left
        var r = right
        while (l < r) {
            if (str[l] != str[r]) return false
            l++
            r--
        }
        return true
    }

    var left = 0
    var right = s.length - 1

    while (left < right) {
        if (s[left] != s[right]) {
            // Пробуем удалить один символ слева или справа
            return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)
        }
        left++
        right--
    }
    return true
}

fun main (){
    val s = "abca"
    println(validPalindrome(s))
}
