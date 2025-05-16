package WithGPT

fun twoSum(nums: IntArray, target: Int): Pair<Int, Int> {
    var left = 0
    var right = nums.size - 1

    while(left < right){
        var value = nums[left] + nums[right]
        if(  value== target) return Pair(left, right)

        if( value < target) left++
        else right--
    }
    return Pair(0, 0)

}
