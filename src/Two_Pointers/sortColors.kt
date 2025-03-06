package Two_Pointers



fun sortColors(nums: IntArray) : Unit {
    for (i in 0 until nums.size - 1){
        var minIndex = i
        for (j in i + 1 until nums.size){
            if( nums[j] < nums[minIndex]){
                minIndex = j
            }
        }
        var temp = nums[i]
        nums[i] = nums[minIndex]
        nums[minIndex] = temp
    }
    println(nums.contentToString())
}




fun main(){
    var nums = intArrayOf(2,0,2,1,3,1,0, 3,3 )
    sortColors(nums)
}