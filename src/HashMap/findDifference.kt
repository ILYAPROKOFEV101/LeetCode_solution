package HashMap

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
      var set1 = nums1.toSet()
        var set2 = nums2.toSet()

    val onlyInNums1 = set1.subtract(set2).toMutableList()
    val onlyInNums2 = set2.subtract(set1).toMutableList()

    return listOf(onlyInNums1, onlyInNums2)

}

fun main(){
    val arr1 = intArrayOf(1,2,3)
    val arr2 = intArrayOf(2,4,6)

    println(findDifference(arr1, arr2))

}
