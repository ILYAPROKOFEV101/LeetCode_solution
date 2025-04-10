package leetcode75.Easy

fun longestSubarray(nums: IntArray): Int {
    var maxvalue = 0
    var left = 0
    var zeroCount = 0


    for(right in nums.indices){

        if (nums[right] == 0) {
            zeroCount++
        }

        zeroCount = nums.slice(left..right).count { it == 0 }

        while (zeroCount > 1){
            if(nums[left] == 0){
                zeroCount--
            }
            left++
        }

        maxvalue = maxOf(maxvalue, right - left + 1 )
        zeroCount = 0
    }

    return maxvalue - 1

}

fun main(){
    val arra = intArrayOf(1,1,1)
    println(longestSubarray(arra))
}
