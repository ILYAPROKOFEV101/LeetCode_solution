package Array

fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()


    return false
}


fun main() {
    val arr = intArrayOf(1,2,3,0, 5 ,6 )
    println(containsDuplicate(arr))
}