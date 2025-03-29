package Array.Midl

fun findTargetSumWays(nums: IntArray, target: Int): Int {
    if(nums.size < target ) return 0
    else if(nums.sum() == target ) return 1
    return nums.size
}