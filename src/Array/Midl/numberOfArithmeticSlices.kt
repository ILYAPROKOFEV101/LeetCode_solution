package Array.Midl



fun numberOfArithmeticSlices(nums: IntArray): Int {
    if (nums.size < 3) return 0
    var count = 0
    var current = 0

    for (i in 1 until nums.size - 1) {
        if (nums[i] - nums[i - 1] == nums[i + 1] - nums[i]) {
            current += 1
            count += current
        } else {
            current = 0
        }
    }
        return count
    }


fun main( ){

    var arr = intArrayOf(1,2,3,4)
    println( numberOfArithmeticSlices(arr) )
}
