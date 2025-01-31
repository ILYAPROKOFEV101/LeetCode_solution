package Array

fun searchInsert(nums: IntArray, target: Int): Int {
    val diff =  nums[1] - nums[0]
    var position = 1
    var i = 0

    while (position <= target) {
        position += diff
        i++
    }
    return i
}


fun main(){
   val sum =  searchInsert(intArrayOf(1,3,5,6), 5 )
    println(sum)
}
