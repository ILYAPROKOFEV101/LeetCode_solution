package leetcode75.Easy



fun maxOperations(nums: IntArray, k: Int): Int {
    nums.sort() // Сортируем массив
    var left = 0
    var right = nums.size - 1
    var result = 0

    while (left < right) {
        val sum = nums[left] + nums[right]
        when {
            sum == k -> {
                result++
                left++
                right--
            }
            sum < k -> left++
            else -> right--
        }
    }

    return result
}



fun main(){
    var arr = intArrayOf(3,1,3,4,3)
    val k = 3
    println(maxOperations(arr,k))
}
