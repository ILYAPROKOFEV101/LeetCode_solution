package Array.Midl

fun findPeakElement(nums: IntArray): Int {
    var count = 0
    val n = nums.size
    for (i in 0 until n) {
        if ((i == 0 || nums[i] > nums[i - 1]) && (i == n - 1 || nums[i] > nums[i + 1])) return count

        count++
    }
    return count
}
fun main(){
    val arr = intArrayOf(1,2,1,3,5,6,4)
    println(findPeakElement(arr))
}
