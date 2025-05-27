package Prime

import java.lang.StringBuilder


fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        map[0] = 1

        var count = 0
        var sum = 0

        for( i in 0 until nums.size){
            var sum =+ nums[i]

            count += map.getOrDefault(sum - k, 0)

            map[sum] = map.getOrDefault(sum, 1) + 1

        }

        return count

    }


