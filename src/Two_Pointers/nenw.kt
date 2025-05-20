package Two_Pointers

fun subarraySum(nums: IntArray, k: Int): Int {
    var map = mutableMapOf<Int, Int>()
    map[0] = 1
    var sum = 0
    var count = 0
    for(num in nums){
        sum += num

        count += map.getOrDefault(sum - k, 0)

        map[sum] = map.getOrDefault(sum, 0) + 1
    }


    return count
}
