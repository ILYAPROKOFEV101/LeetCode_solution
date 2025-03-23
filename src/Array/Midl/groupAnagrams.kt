package Array.Midl

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return strs.groupBy{ it.toCharArray().sorted().joinToString("") }.values.toList()
}

fun main() {
    val words = arrayOf("bat", "nat", "tan", "ate", "eat", "tea")
    val grouped = groupAnagrams(words)
    println(grouped)
}