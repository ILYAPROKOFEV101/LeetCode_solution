package leetcode75.Easy

fun longestOnes(nums: IntArray, k: Int): Int {
    var maxvalue = 0
    var left = 0
    var zeroCount = 0


    for(right in nums.indices){
        if(nums[right] == 0){
            zeroCount++
        }

        while (zeroCount > k){
            if(nums[left] == 0){
                zeroCount--
            }
            left++
        }
        maxvalue = maxOf(maxvalue, right - left + 1 )

    }

    return maxvalue

}

fun main(){
    val arra = intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1)
    val k = 3
    println(longestOnes(arra, k))
}