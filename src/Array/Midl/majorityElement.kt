package Array.Midl


fun majorityElement(nums: IntArray): List<Int> {

    var setMAp = mutableListOf<Int>()
    val appear = Math.floor(nums.size / 3.0).toInt() // Округляем вниз правильно
    println("Appear: $appear")
    for(i in 0 until nums.size) {
        var value = nums.count { it == nums[i] }
        if( value > appear){


            setMAp.add(nums[i])
        }
    }
    return setMAp.toSet().toList()


}


fun main(){
    val nums = intArrayOf(1,2, 2 , 1 , 1 )
    print(majorityElement(nums) )
}