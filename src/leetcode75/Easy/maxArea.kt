package leetcode75.Easy

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var  maxvalue = 0

    while (left < right){
        var widgh = right - left
        var value  = minOf(height[left], height[right]) * widgh

        maxvalue = maxOf(maxvalue, value)

        if(height[left] < height[right]){
            left++
        } else {
            right--
        }

    }
    return maxvalue
}

fun main(){
    val arra = intArrayOf(8,7,2,1)
    println(maxArea(arra))
}
