package Array


fun moveZeroes(nums: IntArray): Unit {
    var insertpozition = 0
    for (i in nums.indices) {
        if(nums[i] != 0) {
            nums[insertpozition] = nums[i]
            insertpozition++
        }
    }
    while (insertpozition < nums.size) {
        nums[insertpozition] = 0
        insertpozition++
    }
    println(nums.contentToString())

}

fun main(){
    val arr = intArrayOf(1,0,2,0,3,4,5)
    moveZeroes(arr)
}
