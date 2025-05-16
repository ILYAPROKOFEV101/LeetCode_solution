package BucketSort

fun frequencySort(s: String): String {
    val count = mutableMapOf<Char, Int>()


    for(i in s.indices) {
        count[s[i]] = count.getOrDefault(s[i], 0) + 1
    }

    return count.entries
        .sortedByDescending { it.value }
        .joinToString("") { it.key.toString().repeat(it.value) }
}


