package HashTable

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val countMap = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()

    // Считаем, сколько чего в nums1
    for (num in nums1) {
        countMap[num] = countMap.getOrDefault(num, 0) + 1
    }

    // Проходим по nums2 и смотрим, что есть в map
    for (num in nums2) {
        val count = countMap.getOrDefault(num, 0)
        if (count > 0) {
            result.add(num)
            countMap[num] = count - 1  // уменьшаем счётчик
        }
    }

    return result.toIntArray()
}


fun main(){
    val arr1 = intArrayOf(1,2,2,1)
    val arr2 = intArrayOf(2,2)
    println(intersect(arr1, arr2).joinToString(" "))
}

