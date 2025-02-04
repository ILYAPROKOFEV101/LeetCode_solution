package Array

fun missingNumber(nums: IntArray): Int {
    val n = nums.size
    val expectedSum = n * (n + 1) / 2
    val actualSum = nums.sum()
    return expectedSum - actualSum
}

fun main()
{
    var arr = intArrayOf(1)

    print(missingNumber(arr))

}

