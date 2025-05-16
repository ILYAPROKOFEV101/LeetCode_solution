package Interview

fun first(nums: IntArray): IntArray {
   val n = nums.size
    var left = 0
    var right = n - 1
    val result = IntArray(n)
    var index = n -1


    while(left <= right){
        var rightSquer = nums[right] * nums[right]
        var leftSquer = nums[left] * nums[left]

        if(rightSquer > leftSquer){
            result[index] = rightSquer
            right--
        } else {
            result[index] = leftSquer
            left++
        }
        index--
    }

    return result
}


fun main(){
    val nums = intArrayOf(- 6, -4,-1,0,3,10)
    val result = first(nums)
    println(result.contentToString())
}

