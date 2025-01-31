package Array

fun removeDuplicates(nums: IntArray): Int {
     nums.distinct().let {
         it.forEachIndexed { index , value ->
             nums[index] = value
         }
         return it.size
     }

}