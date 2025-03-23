package Array.Midl

fun productExceptSelf(nums: IntArray): IntArray {
    var solution = mutableListOf<Int>()
    val resultArray = nums.groupBy { it }
        .filter { it.key != 0 }
        .keys
        .toIntArray()

    val product = resultArray.fold(1) { acc, num -> acc * num } // Используем fold для вычисления произведения

    for(i in 0 until nums.size){
        var  value = 0
        if(nums[i] != 0 ) value = product / nums[i]
        solution.add(value)

    }
    return solution.toIntArray()

}

fun main(){
    var arra = intArrayOf(-1,1,0,-3,3)
    println(productExceptSelf(arra).joinToString(", "))  // Это выведет результат
}