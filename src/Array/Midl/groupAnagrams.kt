package Array.Midl

import Key

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    var map = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        var count = IntArray(26)

        for (c in str) {
            count[c - 'a']++
        }

        var key = count.joinToString("#") // создаем ключ

        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }

        map[key]!!.add(str)
    }
    return map.values.toList()
}

fun main() {
    val words = arrayOf("bat", "nat", "tan", "ate", "eat", "tea")
    val grouped = groupAnagrams(words)
    println(grouped)
}