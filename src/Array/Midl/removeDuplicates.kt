package Array.Midl

fun removeDuplicates(nums: IntArray): Int {
    nums.sort()
    var data = mutableListOf<Int>()
    val n = nums.size
    for ( i in 0 until n ) {
        if((i == 0 || nums[i] ==  nums[i - 1]) && nums[i + 1] == nums[i]) {
            i + 1
        } else data.add(nums[i])

    }
    return data.size
}

fun main(){
    var arra = intArrayOf(1,1,1,2,2,3)
    println(removeDuplicates(arra))
}
