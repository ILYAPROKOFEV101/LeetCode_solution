package WithGPT

fun singleNumber(nums: IntArray): Int {
    var data = mutableMapOf<Int, Int>()
    for( i in nums){
        data[i] = data.getOrDefault(i, 0) + 1
    }
    return data.filter { it.value == 1 }.keys.first()

}
