package Yandex

fun longestSubarray(nums: IntArray): Int {
       var ZeroCount = 0
        var left = 0
        var maxresult = 0


        for( right in nums.indices){
            if( nums[right] == 0){
                ZeroCount++
            }


            while(ZeroCount > 1) {
                if(nums[left] == 0){
                    ZeroCount--
                }
                left++
            }
            maxresult = maxOf(maxresult, right - left + 1)

        }

    return maxresult - 1
}

fun main(){
    var arr = intArrayOf(0,1,1,1,0,1,1,0,1)
    println(longestSubarray(arr).toString())
}
