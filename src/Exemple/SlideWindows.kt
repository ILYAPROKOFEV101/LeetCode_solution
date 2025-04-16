package Exemple

fun main() {
    val nums = listOf(2, 1, 5, 1, 3, 2)
    val k = 3
    val result = maxSumSubarray(nums, k)
    println("Максимальная сумма подмассива длины $k: $result")
}

fun maxSumSubarray(nums: List<Int>, k: Int): Int {
    if (nums.size < k) {
        throw IllegalArgumentException("Размер массива меньше k")
    }

    var maxSum = 0
    var windowSum = 0

    // Вычисляем сумму первых k элементов
    for (i in 0 until k) {
        windowSum += nums[i]
    }
    maxSum = windowSum

    // Сдвигаем окно по массиву
    for (i in k until nums.size) {
        // Вычитаем элемент, выходящий из окна, и добавляем новый элемент
        windowSum += nums[i] - nums[i - k]
        // Обновляем максимальную сумму, если текущая больше
        if (windowSum > maxSum) {
            maxSum = windowSum
        }
    }

    return maxSum
}
