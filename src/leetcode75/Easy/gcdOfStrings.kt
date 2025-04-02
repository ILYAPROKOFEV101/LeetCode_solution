package leetcode75.Easy

fun gcdOfStrings(str1: String, str2: String): String {

    for (i in 1..str2.length) {
        val prefix = str2.take(i) // Берем префикс длиной i
        val regex = Regex("^($prefix)+$") // Регулярка для проверки, состоит ли строка только из prefix

        if (regex.matches(str1) && regex.matches(str2)) { // Проверяем обе строки
            return prefix
        }

    }
    return ""

}

fun main ( ){
    var string = "ABABABAB"
    var string2 = "ABAB"

    println(gcdOfStrings(string, string2))
}