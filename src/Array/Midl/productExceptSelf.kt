package Array.Midl

fun productExceptSelf(nums: IntArray): IntArray {
   var result = IntArray(nums.size)
    result[0] = 1

    for(i in 1 until nums.size){
        result[i] = result[i - 1] + nums[i - 1 ]
    }

    var rightProduct = 1
    for (i in nums.size - 1 downTo 0) {
        result[i] *= rightProduct
        rightProduct *= nums[i]
    }

    return result
}

fun main(){
    var arra = intArrayOf(-1,1,0,-3,3)
    println(productExceptSelf(arra).joinToString(", "))  // Это выведет результат
}