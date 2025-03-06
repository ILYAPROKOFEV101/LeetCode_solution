package Two_Pointers

fun removeDuplicates(nums: IntArray): Int {
    var count = 0
    for (num in nums) {
        if (count < 2 || num != nums[count - 2]) {
            nums[count] = num
            count++
        }
    }
    return count
}


fun main() {
    val arr =  intArrayOf(1, 1, 1 , 2, 2, 3)
    println(removeDuplicates(arr))
}