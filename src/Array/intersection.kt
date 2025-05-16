package Array


fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val fetchMap = mutableMapOf<Int, Int>()

        for ( num in nums1){
            fetchMap[num] = fetchMap.getOrDefault(num, 0) + 1
        }

    val result = mutableListOf<Int>()

    for ( num in nums2){
        val count = fetchMap.getOrDefault(num, 0)
        if (count > 0){
            result.add(num)
            fetchMap[num] = count - 1
        }
    }
    return result.toIntArray()
}

fun main(){
    val arr = intArrayOf(1,2,2,1)
    val arr2 = intArrayOf(2,2)
    println(intersection(arr, arr2).contentToString())
}
