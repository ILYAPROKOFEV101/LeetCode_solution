package Two_Pointers

fun countBinarySubstrings(s: String): Int {
    val groups = mutableListOf<Int>()
    var count = 1

    for (i in 1 until s.length) {
        if (s[i] == s[i - 1]) {
            count++
        } else {
            groups.add(count)
            count = 1
        }
    }
    groups.add(count)

    var result = 0
    for (i in 1 until groups.size) {
        result += minOf(groups[i - 1], groups[i])
    }

    return result
}
