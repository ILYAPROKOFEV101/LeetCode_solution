package Array

fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.isEmpty()) return false
    return nums.toList().groupingBy { it }.eachCount().any { it.value > 1 }
}

fun main() {
    val arr = intArrayOf(1,2,3,1)
    println(containsDuplicate(arr))
}