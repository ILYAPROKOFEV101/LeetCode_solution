package Two_Pointers

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val n = numbers.size
    var left = 0
    var right = n -1
    val result = mutableListOf<Int>()

    while(left <= right){
            if((numbers[left] +  numbers[right]) == target){
                result.add(left + 1 )
                result.add(right + 1)
                left++
                right--
            }
            if((numbers[left] + numbers[right]) < target){
                left++
            } else {
                right--
            }
    }
    return result.toIntArray().slice(0..1).toIntArray()
}

fun main(){
    var arr = intArrayOf(-1,0)
    val target = -1
    val result = twoSum(arr, target)
    println(result.contentToString())
}

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        if(s.isEmpty()) return 0
        val  set = mutableSetOf<Char>()

        var left = 0
        var maxCount = 0


        for(i in 0 until s.length){
            while(s[i] in set){
                set.remove(s[left])
                left++
            }
            maxCount = maxOf(maxCount, i - left +1 )

            set.add(s[i])
        }

        return maxCount

    }
}