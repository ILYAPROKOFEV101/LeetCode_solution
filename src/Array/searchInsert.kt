fun searchInsert(nums: IntArray, target: Int): Int {
    for ( i in 0 until nums.size) {
        if( nums[i] >= target) return i
    }
    return nums.size
}


fun main(){
    val arr = intArrayOf( 1,3,5,6)
    val target = 5
    val result = searchInsert(arr, target)
    println(result)
}