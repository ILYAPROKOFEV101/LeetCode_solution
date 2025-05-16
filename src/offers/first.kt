package offers

fun summaryRanges(nums: IntArray): List<String> {
    val result = mutableListOf<String>()
    var left = 0
    for(i in 1 until nums.size){

        if((nums[i] - 1) != nums[left]){
                result.add("${nums[left]}->${nums[i - 1]}")
        } else {
            while(left != i){
                left++
            }
        }
    }
    return result
}


fun main(){
    val str  = intArrayOf(0,1,2,4,5,7)
    val result = summaryRanges(str)
    println(result)
}
