package WithGPT

fun maxSubArray(nums: IntArray): Int {
    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1 until nums.size) {
        currentSum = maxOf(nums[i], currentSum + nums[i])
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}


fun main( ){
    val arr = intArrayOf(-2,  1, -3,  4, -1,  2,  1, -5,  4)
    println(maxSubArray(arr))
}