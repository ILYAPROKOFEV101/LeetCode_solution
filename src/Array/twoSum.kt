package Array

import Two_Pointers.twoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int, Int>()

        for(i in 0 until nums.size){
            val needed = target - nums[i]
            if(needed in map){
                return intArrayOf(i, map[needed]!!)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}


fun main(){
    var array = intArrayOf(1,2,3,4,5)
   println( twoSum(array, 6))
}
