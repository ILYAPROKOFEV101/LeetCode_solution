package Array

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        val complement = target - num
        if (numMap.containsKey(complement)) {
            return intArrayOf(numMap[complement]!!, index)
        }
        numMap[num] = index
    }

    return intArrayOf()
}


fun main(){
    var array = intArrayOf(1,2,3,4,5)
   println( twoSum(array, 6))
}
