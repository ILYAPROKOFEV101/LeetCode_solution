package leetcode75.Easy





//было //[4,2,4,0,0,3,0,5,1,0]
//стало // [4,2,4,3,5,1,0,0,0,0]
fun moveZeroes(nums: IntArray): Unit {
    var index = 0

    for( i in nums.indices){
        if(nums[i] != 0 ){
            nums[index] = nums[i]
            index++
        }
    }

    for( i in index until nums.size){
        nums[i] = 0
    }

    println(nums.contentToString())

}

fun main (){
    val nums = intArrayOf(0,1,0,3,12)
    moveZeroes(nums)
}