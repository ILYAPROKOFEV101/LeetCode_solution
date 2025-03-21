package Array


// Взять словао 1 и проходится по нему убера по букв с начал и конца слова пок ипроверя
fun isAnagram(s: String, t: String): Boolean {
       return s.groupingBy{ it}.eachCount() == t.groupingBy { it }.eachCount()
}


fun main() {
    println(isAnagram("анаграмма", "нагарам")) // false
    println(isAnagram("привет", "риве")) // true (пример, где внутри есть совпадение)
    println(isAnagram("книга", "ни")) // true
}
