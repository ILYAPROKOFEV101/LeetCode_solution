package HashMap

import com.sun.source.tree.Tree
fun uniqueOccurrences(arr: IntArray): Boolean {
    val frequencyMap = mutableMapOf<Int, Int>()

    for (num in arr) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val frequencies = frequencyMap.values
    return frequencies.toSet().size == frequencies.size
}


fun main ( ){
    val arr = intArrayOf(1,2,2,1,1,3)

    println(uniqueOccurrences(arr))
}
