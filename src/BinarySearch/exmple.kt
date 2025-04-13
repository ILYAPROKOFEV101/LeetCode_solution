package BinarySearch

fun binarysearch(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
        if(nums[mid] == target ){
            return mid
        } else if( nums[mid] <= target){
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return -1
}

fun main (){
    val arra = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val target = 5
    println(binarysearch(arra, target))
}
