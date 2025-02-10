package Array.Midl

fun searchRange(nums: IntArray, target: Int): IntArray {
    val indices = mutableListOf<Int>()
    for ( i in 0 until nums.size){
        if( nums[i] == target){
            indices.add(i)
        }
    }
    // Если найдено больше одного элемента, возвращаем [первый_индекс, последний_индекс]
    if (indices.size >= 2) {
        return intArrayOf(indices.first(), indices.last())
    }
    // Если найден только один элемент, возвращаем [индекс, индекс]
    else if (indices.size == 1) {
        return intArrayOf(indices[0], indices[0])
    }
    // Если ничего не найдено, возвращаем [-1, -1]
    else {
        return intArrayOf(-1, -1)
    }
}

fun main( ) {
    val nums = intArrayOf(0)
    var target = 0
    val result = searchRange(nums, target)
    println(result.contentToString())
}
