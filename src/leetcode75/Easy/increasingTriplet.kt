package leetcode75.Easy

fun increasingTriplet(nums: IntArray): Boolean
{
    for(i in 1 until nums.size -1 ) {
        if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
            return true
        }

    }
    return false
}


fun main(){
    val arr = intArrayOf(1,2 , 4 ,5,6)
    println(increasingTriplet(arr))
}

