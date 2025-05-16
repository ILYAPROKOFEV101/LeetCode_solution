package Two_Pointers

fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var closestSum = nums[0] + nums[1] + nums[2]
    var left = 1


    for (i in 0 until nums.size - 2) {
        left++
        var right = nums.size - 1
        while (left < right){
            val currentSum = nums[i] + nums[left] + nums[right]

            if (currentSum == target) return currentSum


            // обновляем, если ближе к цели
            if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                closestSum = currentSum
            }

            if(currentSum < target){
                left++
            } else {
                right--
            }
        }

    }
    return closestSum

}


fun main(){
    val arra = intArrayOf(-1,2,1,-4)
    val target = 1
    println(threeSumClosest(arra, target))
}