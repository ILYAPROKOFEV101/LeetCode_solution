package leetcode75.Easy
//[-1,1,0,-3,3]
//Вывод: [0,0,9,0,0]


fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n) { 1 }

    var prefix = 1
    for (i in 0 until n) {
        result[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for (i in n - 1 downTo 0) {
        result[i] *= postfix
        postfix *= nums[i]
    }

    return result
}


fun main ( ){
    var arra = intArrayOf(0,0)
    println(productExceptSelf(arra).joinToString(" "))
}